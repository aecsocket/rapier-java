// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$38 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$38() {}
    static final FunctionDescriptor RprRigidBody_set_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("RprRot"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_rotation",
        constants$38.RprRigidBody_set_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("RprVec"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_translation",
        constants$38.RprRigidBody_set_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_sleep",
        constants$38.RprRigidBody_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBody_translation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(3, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
    ).withName("RprVec"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_translation",
        constants$38.RprRigidBody_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_user_force$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(3, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
    ).withName("RprVec"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_user_force$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_user_force",
        constants$38.RprRigidBody_user_force$FUNC
    );
    static final FunctionDescriptor RprRigidBody_user_torque$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(3, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
    ).withName("RprAngVec"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_user_torque$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_user_torque",
        constants$38.RprRigidBody_user_torque$FUNC
    );
}

