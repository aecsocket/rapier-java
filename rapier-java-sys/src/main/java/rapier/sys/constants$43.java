// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$43 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$43() {}
    static final FunctionDescriptor RprRigidBody_position$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_position",
        constants$43.RprRigidBody_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_predict_position_using_velocity_and_forces$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBody_predict_position_using_velocity_and_forces$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_predict_position_using_velocity_and_forces",
        constants$43.RprRigidBody_predict_position_using_velocity_and_forces$FUNC
    );
    static final FunctionDescriptor RprRigidBody_recompute_mass_properties_from_colliders$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_recompute_mass_properties_from_colliders$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_recompute_mass_properties_from_colliders",
        constants$43.RprRigidBody_recompute_mass_properties_from_colliders$FUNC
    );
    static final FunctionDescriptor RprRigidBody_reset_forces$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_reset_forces$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_reset_forces",
        constants$43.RprRigidBody_reset_forces$FUNC
    );
    static final FunctionDescriptor RprRigidBody_reset_torques$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_reset_torques$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_reset_torques",
        constants$43.RprRigidBody_reset_torques$FUNC
    );
    static final FunctionDescriptor RprRigidBody_rotation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
    ).withName("RprRotation"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_rotation",
        constants$43.RprRigidBody_rotation$FUNC
    );
}


