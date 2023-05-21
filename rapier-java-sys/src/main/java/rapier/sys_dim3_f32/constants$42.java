// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$42 {

    static final FunctionDescriptor RprRigidBody_linear_damping$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_linear_damping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_linear_damping",
        constants$42.RprRigidBody_linear_damping$FUNC
    );
    static final FunctionDescriptor RprRigidBody_linvel$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_linvel$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_linvel",
        constants$42.RprRigidBody_linvel$FUNC
    );
    static final FunctionDescriptor RprRigidBody_lock_translations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBody_lock_translations$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_lock_translations",
        constants$42.RprRigidBody_lock_translations$FUNC
    );
    static final FunctionDescriptor RprRigidBody_mass$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_mass$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_mass",
        constants$42.RprRigidBody_mass$FUNC
    );
    static final FunctionDescriptor RprRigidBody_next_position$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z"),
            Constants$root.C_FLOAT$LAYOUT.withName("w")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_next_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_next_position",
        constants$42.RprRigidBody_next_position$FUNC
    );
    static final FunctionDescriptor RprRigidBody_position$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z"),
            Constants$root.C_FLOAT$LAYOUT.withName("w")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBody_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBody_position",
        constants$42.RprRigidBody_position$FUNC
    );
}


