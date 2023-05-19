// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$47 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$47() {}
    static final FunctionDescriptor RprRigidBody_velocity_at_point$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBody_velocity_at_point$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_velocity_at_point",
        constants$47.RprRigidBody_velocity_at_point$FUNC
    );
    static final FunctionDescriptor RprRigidBody_wake_up$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_wake_up$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_wake_up",
        constants$47.RprRigidBody_wake_up$FUNC
    );
    static final FunctionDescriptor RprSharedShape_acquire$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_acquire$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_acquire",
        constants$47.RprSharedShape_acquire$FUNC
    );
    static final FunctionDescriptor RprSharedShape_ball$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("radius")
        ).withName("RprBall")
    );
    static final MethodHandle RprSharedShape_ball$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_ball",
        constants$47.RprSharedShape_ball$FUNC
    );
    static final FunctionDescriptor RprSharedShape_capsule$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("x"),
                    Constants$root.C_FLOAT$LAYOUT.withName("y")
                ).withName("a"),
                MemoryLayout.structLayout(
                    Constants$root.C_FLOAT$LAYOUT.withName("x"),
                    Constants$root.C_FLOAT$LAYOUT.withName("y")
                ).withName("b")
            ).withName("segment"),
            Constants$root.C_FLOAT$LAYOUT.withName("radius")
        ).withName("RprCapsule")
    );
    static final MethodHandle RprSharedShape_capsule$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_capsule",
        constants$47.RprSharedShape_capsule$FUNC
    );
    static final FunctionDescriptor RprSharedShape_cuboid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("half_extents")
        ).withName("RprCuboid")
    );
    static final MethodHandle RprSharedShape_cuboid$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cuboid",
        constants$47.RprSharedShape_cuboid$FUNC
    );
}


