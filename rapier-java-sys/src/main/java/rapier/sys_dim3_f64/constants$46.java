// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$46 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$46() {}
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("RprRotation")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_rotation",
        constants$46.RprRigidBody_set_next_kinematic_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_next_kinematic_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBody_set_next_kinematic_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_next_kinematic_translation",
        constants$46.RprRigidBody_set_next_kinematic_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(4, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(3, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
            ).withName("translation")
        ).withName("RprIsometry"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_position",
        constants$46.RprRigidBody_set_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("RprRotation"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_rotation",
        constants$46.RprRigidBody_set_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_translation",
        constants$46.RprRigidBody_set_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_sleep",
        constants$46.RprRigidBody_sleep$FUNC
    );
}


