// Generated by jextract

package rapier.headers_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$9 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$9() {}
    static final FunctionDescriptor alloca$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle alloca$MH = RuntimeHelper.downcallHandle(
        "alloca",
        constants$9.alloca$FUNC
    );
    static final FunctionDescriptor valloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle valloc$MH = RuntimeHelper.downcallHandle(
        "valloc",
        constants$9.valloc$FUNC
    );
    static final FunctionDescriptor posix_memalign$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle posix_memalign$MH = RuntimeHelper.downcallHandle(
        "posix_memalign",
        constants$9.posix_memalign$FUNC
    );
    static final FunctionDescriptor aligned_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle aligned_alloc$MH = RuntimeHelper.downcallHandle(
        "aligned_alloc",
        constants$9.aligned_alloc$FUNC
    );
    static final FunctionDescriptor abort$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle abort$MH = RuntimeHelper.downcallHandle(
        "abort",
        constants$9.abort$FUNC
    );
    static final FunctionDescriptor atexit$__func$FUNC = FunctionDescriptor.ofVoid();
}


