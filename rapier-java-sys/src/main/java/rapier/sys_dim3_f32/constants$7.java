// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$7 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$7() {}
    static final FunctionDescriptor jrand48_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle jrand48_r$MH = RuntimeHelper.downcallHandle(
        "jrand48_r",
        constants$7.jrand48_r$FUNC
    );
    static final FunctionDescriptor srand48_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle srand48_r$MH = RuntimeHelper.downcallHandle(
        "srand48_r",
        constants$7.srand48_r$FUNC
    );
    static final FunctionDescriptor seed48_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle seed48_r$MH = RuntimeHelper.downcallHandle(
        "seed48_r",
        constants$7.seed48_r$FUNC
    );
    static final FunctionDescriptor lcong48_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lcong48_r$MH = RuntimeHelper.downcallHandle(
        "lcong48_r",
        constants$7.lcong48_r$FUNC
    );
    static final FunctionDescriptor arc4random$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle arc4random$MH = RuntimeHelper.downcallHandle(
        "arc4random",
        constants$7.arc4random$FUNC
    );
    static final FunctionDescriptor arc4random_buf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle arc4random_buf$MH = RuntimeHelper.downcallHandle(
        "arc4random_buf",
        constants$7.arc4random_buf$FUNC
    );
}


