// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$43 {

    static final FunctionDescriptor RprRigidBodyBuilder_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_new$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_new",
        constants$43.RprRigidBodyBuilder_new$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("re"),
                Constants$root.C_FLOAT$LAYOUT.withName("im")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprRigidBodyBuilder_position$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_position",
        constants$43.RprRigidBodyBuilder_position$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_rotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x")
        ).withName("RprAngVector")
    );
    static final MethodHandle RprRigidBodyBuilder_rotation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_rotation",
        constants$43.RprRigidBodyBuilder_rotation$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_sleeping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_sleeping$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_sleeping",
        constants$43.RprRigidBodyBuilder_sleeping$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector")
    );
    static final MethodHandle RprRigidBodyBuilder_translation$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_translation",
        constants$43.RprRigidBodyBuilder_translation$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_contains$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprRigidBodySet_contains$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_contains",
        constants$43.RprRigidBodySet_contains$FUNC
    );
}


