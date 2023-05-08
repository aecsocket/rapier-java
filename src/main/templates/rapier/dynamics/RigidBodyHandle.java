package rapier.dynamics;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public final class RigidBodyHandle {
    private RigidBodyHandle() {}

    public static long pack(MemorySegment memory) {
        return memory.getAtIndex(ValueLayout.JAVA_LONG, 0);
    }

    public static MemorySegment unpack(SegmentAllocator alloc, long handle) {
        return alloc.allocate(ValueLayout.JAVA_LONG, handle);
    }
}