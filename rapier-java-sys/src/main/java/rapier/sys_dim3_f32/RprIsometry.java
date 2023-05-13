// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprIsometry {
 *     struct RprRotation rotation;
 *     struct RprVector translation;
 * };
 * }
 */
public class RprIsometry {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("translation")
    ).withName("RprIsometry");
    public static MemoryLayout $LAYOUT() {
        return RprIsometry.$struct$LAYOUT;
    }
    public static MemorySegment rotation$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment translation$slice(MemorySegment seg) {
        return seg.asSlice(16, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


