// Generated by jextract

package rapier.headers_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct timespec {
 *     long tv_sec;
 *     long tv_nsec;
 * };
 * }
 */
public class timespec {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("tv_sec"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("tv_nsec")
    ).withName("timespec");
    public static MemoryLayout $LAYOUT() {
        return timespec.$struct$LAYOUT;
    }
    static final VarHandle tv_sec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tv_sec"));
    public static VarHandle tv_sec$VH() {
        return timespec.tv_sec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long tv_sec;
     * }
     */
    public static long tv_sec$get(MemorySegment seg) {
        return (long)timespec.tv_sec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long tv_sec;
     * }
     */
    public static void tv_sec$set(MemorySegment seg, long x) {
        timespec.tv_sec$VH.set(seg, x);
    }
    public static long tv_sec$get(MemorySegment seg, long index) {
        return (long)timespec.tv_sec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_sec$set(MemorySegment seg, long index, long x) {
        timespec.tv_sec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tv_nsec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tv_nsec"));
    public static VarHandle tv_nsec$VH() {
        return timespec.tv_nsec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long tv_nsec;
     * }
     */
    public static long tv_nsec$get(MemorySegment seg) {
        return (long)timespec.tv_nsec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long tv_nsec;
     * }
     */
    public static void tv_nsec$set(MemorySegment seg, long x) {
        timespec.tv_nsec$VH.set(seg, x);
    }
    public static long tv_nsec$get(MemorySegment seg, long index) {
        return (long)timespec.tv_nsec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_nsec$set(MemorySegment seg, long index, long x) {
        timespec.tv_nsec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


