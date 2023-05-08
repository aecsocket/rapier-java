// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union pthread_barrier_t {
 *     char __size[32];
 *     long __align;
 * };
 * }
 */
public class pthread_barrier_t {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("__size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("__align")
    ).withName("pthread_barrier_t");
    public static MemoryLayout $LAYOUT() {
        return pthread_barrier_t.$union$LAYOUT;
    }
    public static MemorySegment __size$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    static final VarHandle __align$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    public static VarHandle __align$VH() {
        return pthread_barrier_t.__align$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long __align;
     * }
     */
    public static long __align$get(MemorySegment seg) {
        return (long)pthread_barrier_t.__align$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long __align;
     * }
     */
    public static void __align$set(MemorySegment seg, long x) {
        pthread_barrier_t.__align$VH.set(seg, x);
    }
    public static long __align$get(MemorySegment seg, long index) {
        return (long)pthread_barrier_t.__align$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, long x) {
        pthread_barrier_t.__align$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

