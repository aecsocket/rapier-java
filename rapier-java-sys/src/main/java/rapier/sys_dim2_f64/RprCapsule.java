// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprCapsule {
 *     struct RprSegment segment;
 *     double radius;
 * };
 * }
 */
public class RprCapsule {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
            ).withName("a"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y")
            ).withName("b")
        ).withName("segment"),
        Constants$root.C_DOUBLE$LAYOUT.withName("radius")
    ).withName("RprCapsule");
    public static MemoryLayout $LAYOUT() {
        return RprCapsule.$struct$LAYOUT;
    }
    public static MemorySegment segment$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    static final VarHandle radius$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("radius"));
    public static VarHandle radius$VH() {
        return RprCapsule.radius$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double radius;
     * }
     */
    public static double radius$get(MemorySegment seg) {
        return (double)RprCapsule.radius$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double radius;
     * }
     */
    public static void radius$set(MemorySegment seg, double x) {
        RprCapsule.radius$VH.set(seg, x);
    }
    public static double radius$get(MemorySegment seg, long index) {
        return (double)RprCapsule.radius$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void radius$set(MemorySegment seg, long index, double x) {
        RprCapsule.radius$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


