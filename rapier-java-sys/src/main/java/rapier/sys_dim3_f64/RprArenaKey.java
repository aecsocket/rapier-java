// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprArenaKey {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey");
    public static MemoryLayout $LAYOUT() {
        return RprArenaKey.$struct$LAYOUT;
    }
    static final VarHandle index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("index"));
    public static VarHandle index$VH() {
        return RprArenaKey.index$VH;
    }
    public static int index$get(MemorySegment seg) {
        return (int)RprArenaKey.index$VH.get(seg);
    }
    public static void index$set( MemorySegment seg, int x) {
        RprArenaKey.index$VH.set(seg, x);
    }
    public static int index$get(MemorySegment seg, long index) {
        return (int)RprArenaKey.index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void index$set(MemorySegment seg, long index, int x) {
        RprArenaKey.index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle generation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("generation"));
    public static VarHandle generation$VH() {
        return RprArenaKey.generation$VH;
    }
    public static int generation$get(MemorySegment seg) {
        return (int)RprArenaKey.generation$VH.get(seg);
    }
    public static void generation$set( MemorySegment seg, int x) {
        RprArenaKey.generation$VH.set(seg, x);
    }
    public static int generation$get(MemorySegment seg, long index) {
        return (int)RprArenaKey.generation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void generation$set(MemorySegment seg, long index, int x) {
        RprArenaKey.generation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


