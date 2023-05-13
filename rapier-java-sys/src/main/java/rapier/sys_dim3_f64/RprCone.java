// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprCone {
 *     double half_height;
 *     double radius;
 * };
 * }
 */
public class RprCone {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("half_height"),
        Constants$root.C_DOUBLE$LAYOUT.withName("radius")
    ).withName("RprCone");
    public static MemoryLayout $LAYOUT() {
        return RprCone.$struct$LAYOUT;
    }
    static final VarHandle half_height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("half_height"));
    public static VarHandle half_height$VH() {
        return RprCone.half_height$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double half_height;
     * }
     */
    public static double half_height$get(MemorySegment seg) {
        return (double)RprCone.half_height$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double half_height;
     * }
     */
    public static void half_height$set(MemorySegment seg, double x) {
        RprCone.half_height$VH.set(seg, x);
    }
    public static double half_height$get(MemorySegment seg, long index) {
        return (double)RprCone.half_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void half_height$set(MemorySegment seg, long index, double x) {
        RprCone.half_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle radius$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("radius"));
    public static VarHandle radius$VH() {
        return RprCone.radius$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double radius;
     * }
     */
    public static double radius$get(MemorySegment seg) {
        return (double)RprCone.radius$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double radius;
     * }
     */
    public static void radius$set(MemorySegment seg, double x) {
        RprCone.radius$VH.set(seg, x);
    }
    public static double radius$get(MemorySegment seg, long index) {
        return (double)RprCone.radius$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void radius$set(MemorySegment seg, long index, double x) {
        RprCone.radius$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


