// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$12 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$12() {}
    static final FunctionDescriptor putenv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle putenv$MH = RuntimeHelper.downcallHandle(
        "putenv",
        constants$12.putenv$FUNC
    );
    static final FunctionDescriptor setenv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setenv$MH = RuntimeHelper.downcallHandle(
        "setenv",
        constants$12.setenv$FUNC
    );
    static final FunctionDescriptor unsetenv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle unsetenv$MH = RuntimeHelper.downcallHandle(
        "unsetenv",
        constants$12.unsetenv$FUNC
    );
    static final FunctionDescriptor clearenv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle clearenv$MH = RuntimeHelper.downcallHandle(
        "clearenv",
        constants$12.clearenv$FUNC
    );
    static final FunctionDescriptor mktemp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mktemp$MH = RuntimeHelper.downcallHandle(
        "mktemp",
        constants$12.mktemp$FUNC
    );
    static final FunctionDescriptor mkstemp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mkstemp$MH = RuntimeHelper.downcallHandle(
        "mkstemp",
        constants$12.mkstemp$FUNC
    );
}


