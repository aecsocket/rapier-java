package rapier.shape;

import rapier.Native;

import java.lang.foreign.MemorySegment;

public sealed class Shape extends Native
        permits Segment, Cuboid, Triangle, Ball, Capsule {
    protected Shape(MemorySegment memory) {
        super(memory);
    }

    public static Shape at(MemorySegment memory) {
        return new Shape(memory);
    }
}