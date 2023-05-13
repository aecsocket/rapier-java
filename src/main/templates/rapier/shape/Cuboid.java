package rapier.shape;

import rapier.math.*;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Cuboid extends Shape {
    protected Cuboid(MemorySegment memory) {
        super(memory);
    }

    public static Cuboid at(MemorySegment memory) {
        return new Cuboid(memory);
    }

    public static Cuboid of(SegmentAllocator alloc, {{ realVec }} halfExtents) {
        var memory = {{ sys }}.RprCuboid.allocate(alloc);
        {{ sys }}.RprCuboid.half_extents$slice(memory).copyFrom(halfExtents.memory());
        return at(memory);
    }

    public {{ realVec }} getHalfExtents() {
        return {{ realVec }}.at({{ sys }}.RprCuboid.half_extents$slice(self));
    }

    public void setHalfExtents({{ realVec }} halfExtents) {
        {{ sys }}.RprCuboid.half_extents$slice(self).copyFrom(halfExtents.memory());
    }
}