// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$27 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$27() {}
    static final FunctionDescriptor RprRigidBodyBuilder_gravity_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_gravity_scale$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_gravity_scale",
        constants$27.RprRigidBodyBuilder_gravity_scale$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_kinematic_position_based$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodyBuilder_kinematic_position_based$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_kinematic_position_based",
        constants$27.RprRigidBodyBuilder_kinematic_position_based$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_kinematic_velocity_based$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodyBuilder_kinematic_velocity_based$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_kinematic_velocity_based",
        constants$27.RprRigidBodyBuilder_kinematic_velocity_based$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_linear_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_linear_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_linear_damping",
        constants$27.RprRigidBodyBuilder_linear_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_linvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprVec")
    );
    static final MethodHandle RprRigidBodyBuilder_linvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_linvel",
        constants$27.RprRigidBodyBuilder_linvel$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("_0")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
            ).withName("translation")
        ).withName("RprIso")
    );
    static final MethodHandle RprRigidBodyBuilder_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_position",
        constants$27.RprRigidBodyBuilder_position$FUNC
    );
}

