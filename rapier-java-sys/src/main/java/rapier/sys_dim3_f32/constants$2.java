// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2() {}
    static final FunctionDescriptor strtoull$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtoull$MH = RuntimeHelper.downcallHandle(
        "strtoull",
        constants$2.strtoull$FUNC
    );
    static final FunctionDescriptor l64a$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle l64a$MH = RuntimeHelper.downcallHandle(
        "l64a",
        constants$2.l64a$FUNC
    );
    static final FunctionDescriptor a64l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle a64l$MH = RuntimeHelper.downcallHandle(
        "a64l",
        constants$2.a64l$FUNC
    );
    static final FunctionDescriptor select$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle select$MH = RuntimeHelper.downcallHandle(
        "select",
        constants$2.select$FUNC
    );
    static final FunctionDescriptor pselect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pselect$MH = RuntimeHelper.downcallHandle(
        "pselect",
        constants$2.pselect$FUNC
    );
    static final FunctionDescriptor random$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle random$MH = RuntimeHelper.downcallHandle(
        "random",
        constants$2.random$FUNC
    );
}


