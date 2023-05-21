// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$46 {

    static final FunctionDescriptor RprRigidBody_set_next_kinematic_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
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
                Constants$root.C_DOUBLE$LAYOUT.withName("re"),
                Constants$root.C_DOUBLE$LAYOUT.withName("im")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
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
            Constants$root.C_DOUBLE$LAYOUT.withName("re"),
            Constants$root.C_DOUBLE$LAYOUT.withName("im")
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
            Constants$root.C_DOUBLE$LAYOUT.withName("x"),
            Constants$root.C_DOUBLE$LAYOUT.withName("y")
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
    static final FunctionDescriptor RprRigidBody_translation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_translation",
        constants$46.RprRigidBody_translation$FUNC
    );
}


