// Generated by jextract

package rapier.headers_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1() {}
    static final FunctionDescriptor strtof$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strtof$MH = RuntimeHelper.downcallHandle(
        "strtof",
        constants$1.strtof$FUNC
    );
    static final FunctionDescriptor strtol$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtol$MH = RuntimeHelper.downcallHandle(
        "strtol",
        constants$1.strtol$FUNC
    );
    static final FunctionDescriptor strtoul$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtoul$MH = RuntimeHelper.downcallHandle(
        "strtoul",
        constants$1.strtoul$FUNC
    );
    static final FunctionDescriptor strtoq$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtoq$MH = RuntimeHelper.downcallHandle(
        "strtoq",
        constants$1.strtoq$FUNC
    );
    static final FunctionDescriptor strtouq$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtouq$MH = RuntimeHelper.downcallHandle(
        "strtouq",
        constants$1.strtouq$FUNC
    );
    static final FunctionDescriptor strtoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtoll$MH = RuntimeHelper.downcallHandle(
        "strtoll",
        constants$1.strtoll$FUNC
    );
}


