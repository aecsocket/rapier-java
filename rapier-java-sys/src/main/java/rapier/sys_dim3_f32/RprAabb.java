// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprAabb {
 *     struct RprVector min;
 *     struct RprVector max;
 * };
 * }
 */
public class RprAabb {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("min"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
        ).withName("max")
    ).withName("RprAabb");
    public static MemoryLayout $LAYOUT() {
        return RprAabb.$struct$LAYOUT;
    }
    public static MemorySegment min$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }
    public static MemorySegment max$slice(MemorySegment seg) {
        return seg.asSlice(12, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


