// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$12 {

    static final FunctionDescriptor on_exit$__func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle on_exit$__func$MH = RuntimeHelper.downcallHandle(
        constants$12.on_exit$__func$FUNC
    );
    static final FunctionDescriptor on_exit$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle on_exit$MH = RuntimeHelper.downcallHandle(
        "on_exit",
        constants$12.on_exit$FUNC
    );
    static final FunctionDescriptor exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle exit$MH = RuntimeHelper.downcallHandle(
        "exit",
        constants$12.exit$FUNC
    );
    static final FunctionDescriptor quick_exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle quick_exit$MH = RuntimeHelper.downcallHandle(
        "quick_exit",
        constants$12.quick_exit$FUNC
    );
    static final FunctionDescriptor _Exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle _Exit$MH = RuntimeHelper.downcallHandle(
        "_Exit",
        constants$12._Exit$FUNC
    );
    static final FunctionDescriptor getenv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getenv$MH = RuntimeHelper.downcallHandle(
        "getenv",
        constants$12.getenv$FUNC
    );
}


