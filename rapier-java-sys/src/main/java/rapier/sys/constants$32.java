// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$32 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$32() {}
    static final FunctionDescriptor RprRigidBodyBuilder_additional_mass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_additional_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_additional_mass",
        constants$32.RprRigidBodyBuilder_additional_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_angular_damping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_angular_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_angular_damping",
        constants$32.RprRigidBodyBuilder_angular_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_angvel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(1, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("RprAngVector")
    );
    static final MethodHandle RprRigidBodyBuilder_angvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_angvel",
        constants$32.RprRigidBodyBuilder_angvel$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_build$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_build$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_build",
        constants$32.RprRigidBodyBuilder_build$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_can_sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_can_sleep$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_can_sleep",
        constants$32.RprRigidBodyBuilder_can_sleep$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_ccd_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_ccd_enabled$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_ccd_enabled",
        constants$32.RprRigidBodyBuilder_ccd_enabled$FUNC
    );
}


