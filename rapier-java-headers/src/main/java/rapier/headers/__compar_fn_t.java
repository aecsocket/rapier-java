// Generated by jextract

package rapier.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*__compar_fn_t)(void*,void*);
 * }
 */
public interface __compar_fn_t {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
    static MemorySegment allocate(__compar_fn_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(__compar_fn_t.class, fi, constants$13.__compar_fn_t$FUNC, scope);
    }
    static __compar_fn_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
            try {
                return (int)constants$13.__compar_fn_t$MH.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


