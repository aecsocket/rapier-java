// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$51 {

    static final FunctionDescriptor RprRigidBody_reset_forces$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_reset_forces$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_reset_forces",
        constants$51.RprRigidBody_reset_forces$FUNC
    );
    static final FunctionDescriptor RprRigidBody_reset_torques$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_reset_torques$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_reset_torques",
        constants$51.RprRigidBody_reset_torques$FUNC
    );
    static final FunctionDescriptor RprRigidBody_rotation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("re"),
        Constants$root.C_FLOAT$LAYOUT.withName("im")
    ).withName("RprRotation"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_rotation",
        constants$51.RprRigidBody_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_additional_mass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_additional_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_additional_mass",
        constants$51.RprRigidBody_set_additional_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_angular_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_angular_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_angular_damping",
        constants$51.RprRigidBody_set_angular_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_set_angvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_set_angvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_set_angvel",
        constants$51.RprRigidBody_set_angvel$FUNC
    );
}


