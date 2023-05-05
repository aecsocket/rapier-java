// Generated by jextract

package rapier.headers_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union pthread_barrierattr_t {
 *     char __size[4];
 *     int __align;
 * };
 * }
 */
public class pthread_barrierattr_t {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("__size"),
        Constants$root.C_INT$LAYOUT.withName("__align")
    ).withName("pthread_barrierattr_t");
    public static MemoryLayout $LAYOUT() {
        return pthread_barrierattr_t.$union$LAYOUT;
    }
    public static MemorySegment __size$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    static final VarHandle __align$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    public static VarHandle __align$VH() {
        return pthread_barrierattr_t.__align$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __align;
     * }
     */
    public static int __align$get(MemorySegment seg) {
        return (int)pthread_barrierattr_t.__align$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __align;
     * }
     */
    public static void __align$set(MemorySegment seg, int x) {
        pthread_barrierattr_t.__align$VH.set(seg, x);
    }
    public static int __align$get(MemorySegment seg, long index) {
        return (int)pthread_barrierattr_t.__align$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, int x) {
        pthread_barrierattr_t.__align$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


