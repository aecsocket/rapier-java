// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$41 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$41() {}
    static final FunctionDescriptor RprRigidBody_is_rotation_locked$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_rotation_locked$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_rotation_locked",
        constants$41.RprRigidBody_is_rotation_locked$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_sleeping$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_sleeping",
        constants$41.RprRigidBody_is_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_is_translation_locked$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_is_translation_locked$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_is_translation_locked",
        constants$41.RprRigidBody_is_translation_locked$FUNC
    );
    static final FunctionDescriptor RprRigidBody_kinetic_energy$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_kinetic_energy$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_kinetic_energy",
        constants$41.RprRigidBody_kinetic_energy$FUNC
    );
    static final FunctionDescriptor RprRigidBody_linear_damping$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_linear_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_linear_damping",
        constants$41.RprRigidBody_linear_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_linvel$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_FLOAT$LAYOUT).withName("_0")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_linvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_linvel",
        constants$41.RprRigidBody_linvel$FUNC
    );
}


