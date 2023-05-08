// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union __atomic_wide_counter {
 *     unsigned long long __value64;
 *     struct struct (unnamed at /usr/include/bits/atomic_wide_counter.h:28:3) __value32;
 * };
 * }
 */
public class __atomic_wide_counter {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("__value64"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("__low"),
            Constants$root.C_INT$LAYOUT.withName("__high")
        ).withName("__value32")
    ).withName("__atomic_wide_counter");
    public static MemoryLayout $LAYOUT() {
        return __atomic_wide_counter.$union$LAYOUT;
    }
    static final VarHandle __value64$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__value64"));
    public static VarHandle __value64$VH() {
        return __atomic_wide_counter.__value64$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long __value64;
     * }
     */
    public static long __value64$get(MemorySegment seg) {
        return (long)__atomic_wide_counter.__value64$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long __value64;
     * }
     */
    public static void __value64$set(MemorySegment seg, long x) {
        __atomic_wide_counter.__value64$VH.set(seg, x);
    }
    public static long __value64$get(MemorySegment seg, long index) {
        return (long)__atomic_wide_counter.__value64$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __value64$set(MemorySegment seg, long index, long x) {
        __atomic_wide_counter.__value64$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


