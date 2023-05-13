package rapier;

import org.junit.jupiter.api.Test;
import rapier.dynamics.*;
import rapier.geometry.*;
import rapier.math.Vec3;
import rapier.pipeline.PhysicsPipeline;
import rapier.shape.Ball;
import rapier.shape.Cuboid;
import rapier.shape.SharedShape;

import java.lang.foreign.Arena;

public final class HelloRapier {
    @Test
    public void helloRapier() {
        Rapier.load();

        try (var arena = Arena.openConfined()) {
            var rigidBodySet = RigidBodySet.create();
            var colliderSet = ColliderSet.create();

            var floorShape = SharedShape.of(Cuboid.of(arena, Vec3.of(arena, 100.0, 0.1, 100.0)));
            var floorCollider = ColliderBuilder.of(floorShape).build();
            colliderSet.insert(floorCollider);

            var rigidBody = RigidBodyBuilder.dynamic()
                    .translation(Vec3.of(arena, 0.0, 10.0, 0.0))
                    .build();
            var ballShape = SharedShape.of(Ball.of(arena, 0.5));
            var ballCollider = ColliderBuilder.of(ballShape).restitution(0.7).build();
            long ballBodyHandle = rigidBodySet.insert(rigidBody);
            colliderSet.insertWithParent(ballCollider, ballBodyHandle, rigidBodySet);

            var gravity = Vec3.of(arena, 0.0, -9.81, 0.0);
            var integrationParameters = IntegrationParameters.ofDefault();
            var islandManager = IslandManager.create();
            var broadPhase = BroadPhase.create();
            var narrowPhase = NarrowPhase.create();
            var impulseJointSet = ImpulseJointSet.create();
            var multibodyJointSet = MultibodyJointSet.create();
            var ccdSolver = CCDSolver.create();
            var physicsPipeline = PhysicsPipeline.create();

            for (int i = 0; i < 200; i++) {
                physicsPipeline.step(
                        gravity,
                        integrationParameters,
                        islandManager,
                        broadPhase,
                        narrowPhase,
                        rigidBodySet,
                        colliderSet,
                        impulseJointSet,
                        multibodyJointSet,
                        ccdSolver,
                        null
                );

                Vec3 translation = rigidBodySet.get(ballBodyHandle).getTranslation(arena);
                System.out.printf("Ball altitude: %f\n", translation.getY());
            }
            
            physicsPipeline.drop();
            ccdSolver.drop();
            multibodyJointSet.drop();
            impulseJointSet.drop();
            narrowPhase.drop();
            broadPhase.drop();
            islandManager.drop();
            integrationParameters.drop();

            // will automatically drop its contents
            colliderSet.drop();
            rigidBody.drop();
            // gravity is allocated on the Java side, not the native side
            // so it gets deallocated when we exit the arena's scope
        }
    }
}
