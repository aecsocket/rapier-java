// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprCuboid {
 *     struct RprVector half_extents;
 * };
 * }
 */
public class RprCuboid {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("half_extents")
    ).withName("RprCuboid");
    public static MemoryLayout $LAYOUT() {
        return RprCuboid.$struct$LAYOUT;
    }
    public static MemorySegment half_extents$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


