// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$0 {

    static final FunctionDescriptor __ctype_get_mb_cur_max$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle __ctype_get_mb_cur_max$MH = RuntimeHelper.downcallHandle(
        "__ctype_get_mb_cur_max",
        constants$0.__ctype_get_mb_cur_max$FUNC
    );
    static final FunctionDescriptor atof$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atof$MH = RuntimeHelper.downcallHandle(
        "atof",
        constants$0.atof$FUNC
    );
    static final FunctionDescriptor atoi$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atoi$MH = RuntimeHelper.downcallHandle(
        "atoi",
        constants$0.atoi$FUNC
    );
    static final FunctionDescriptor atol$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atol$MH = RuntimeHelper.downcallHandle(
        "atol",
        constants$0.atol$FUNC
    );
    static final FunctionDescriptor atoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atoll$MH = RuntimeHelper.downcallHandle(
        "atoll",
        constants$0.atoll$FUNC
    );
    static final FunctionDescriptor strtod$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strtod$MH = RuntimeHelper.downcallHandle(
        "strtod",
        constants$0.strtod$FUNC
    );
}


