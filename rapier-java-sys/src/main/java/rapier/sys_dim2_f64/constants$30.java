// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$30 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$30() {}
    static final FunctionDescriptor RprRigidBody_apply_impulse_at_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("RprVec"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("RprVec"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_apply_impulse_at_point$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_apply_impulse_at_point",
        constants$30.RprRigidBody_apply_impulse_at_point$FUNC
    );
    static final FunctionDescriptor RprRigidBody_apply_torque_impulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(1, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("RprAngVec"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_apply_torque_impulse$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_apply_torque_impulse",
        constants$30.RprRigidBody_apply_torque_impulse$FUNC
    );
    static final FunctionDescriptor RprRigidBody_body_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_body_type$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_body_type",
        constants$30.RprRigidBody_body_type$FUNC
    );
    static final FunctionDescriptor RprRigidBody_center_of_mass$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
    ).withName("RprVec"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_center_of_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_center_of_mass",
        constants$30.RprRigidBody_center_of_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBody_dominance_group$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_dominance_group$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_dominance_group",
        constants$30.RprRigidBody_dominance_group$FUNC
    );
    static final FunctionDescriptor RprRigidBody_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_drop",
        constants$30.RprRigidBody_drop$FUNC
    );
}

