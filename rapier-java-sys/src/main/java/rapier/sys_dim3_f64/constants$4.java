// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4() {}
    static final FunctionDescriptor setstate_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle setstate_r$MH = RuntimeHelper.downcallHandle(
        "setstate_r",
        constants$4.setstate_r$FUNC
    );
    static final FunctionDescriptor rand$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle rand$MH = RuntimeHelper.downcallHandle(
        "rand",
        constants$4.rand$FUNC
    );
    static final FunctionDescriptor srand$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle srand$MH = RuntimeHelper.downcallHandle(
        "srand",
        constants$4.srand$FUNC
    );
    static final FunctionDescriptor rand_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rand_r$MH = RuntimeHelper.downcallHandle(
        "rand_r",
        constants$4.rand_r$FUNC
    );
    static final FunctionDescriptor drand48$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT);
    static final MethodHandle drand48$MH = RuntimeHelper.downcallHandle(
        "drand48",
        constants$4.drand48$FUNC
    );
    static final FunctionDescriptor erand48$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle erand48$MH = RuntimeHelper.downcallHandle(
        "erand48",
        constants$4.erand48$FUNC
    );
}


