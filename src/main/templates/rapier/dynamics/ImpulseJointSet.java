package rapier.dynamics;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class ImpulseJointSet extends BaseNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprImpulseJointSet_drop(self));
    }

    protected ImpulseJointSet(MemorySegment memory) {
        super(memory);
    }

    public static ImpulseJointSet at(MemorySegment memory) {
        return new ImpulseJointSet(memory);
    }

    public static ImpulseJointSet create() {
        return at(RprImpulseJointSet_new());
    }
}
