// Generated by jextract

package rapier.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*atexit$__func)();
 * }
 */
public interface atexit$__func {

    void apply();
    static MemorySegment allocate(atexit$__func fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(atexit$__func.class, fi, constants$9.atexit$__func$FUNC, scope);
    }
    static atexit$__func ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return () -> {
            try {
                constants$10.atexit$__func$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


