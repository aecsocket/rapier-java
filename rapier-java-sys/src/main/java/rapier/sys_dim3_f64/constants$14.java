// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$14 {

    static final FunctionDescriptor mkstemps$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mkstemps$MH = RuntimeHelper.downcallHandle(
        "mkstemps",
        constants$14.mkstemps$FUNC
    );
    static final FunctionDescriptor mkdtemp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mkdtemp$MH = RuntimeHelper.downcallHandle(
        "mkdtemp",
        constants$14.mkdtemp$FUNC
    );
    static final FunctionDescriptor system$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle system$MH = RuntimeHelper.downcallHandle(
        "system",
        constants$14.system$FUNC
    );
    static final FunctionDescriptor realpath$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle realpath$MH = RuntimeHelper.downcallHandle(
        "realpath",
        constants$14.realpath$FUNC
    );
    static final FunctionDescriptor __compar_fn_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __compar_fn_t$MH = RuntimeHelper.downcallHandle(
        constants$14.__compar_fn_t$FUNC
    );
}


