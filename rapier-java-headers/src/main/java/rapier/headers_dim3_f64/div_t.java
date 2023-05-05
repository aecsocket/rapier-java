// Generated by jextract

package rapier.headers_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct div_t {
 *     int quot;
 *     int rem;
 * };
 * }
 */
public class div_t {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("quot"),
        Constants$root.C_INT$LAYOUT.withName("rem")
    ).withName("div_t");
    public static MemoryLayout $LAYOUT() {
        return div_t.$struct$LAYOUT;
    }
    static final VarHandle quot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("quot"));
    public static VarHandle quot$VH() {
        return div_t.quot$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int quot;
     * }
     */
    public static int quot$get(MemorySegment seg) {
        return (int)div_t.quot$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int quot;
     * }
     */
    public static void quot$set(MemorySegment seg, int x) {
        div_t.quot$VH.set(seg, x);
    }
    public static int quot$get(MemorySegment seg, long index) {
        return (int)div_t.quot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void quot$set(MemorySegment seg, long index, int x) {
        div_t.quot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rem"));
    public static VarHandle rem$VH() {
        return div_t.rem$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int rem;
     * }
     */
    public static int rem$get(MemorySegment seg) {
        return (int)div_t.rem$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int rem;
     * }
     */
    public static void rem$set(MemorySegment seg, int x) {
        div_t.rem$VH.set(seg, x);
    }
    public static int rem$get(MemorySegment seg, long index) {
        return (int)div_t.rem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rem$set(MemorySegment seg, long index, int x) {
        div_t.rem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


