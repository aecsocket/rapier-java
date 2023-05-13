// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$39 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$39() {}
    static final FunctionDescriptor RprSharedShape_ball$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_DOUBLE$LAYOUT.withName("radius")
        ).withName("RprBall")
    );
    static final MethodHandle RprSharedShape_ball$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_ball",
        constants$39.RprSharedShape_ball$FUNC
    );
    static final FunctionDescriptor RprSharedShape_capsule$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
                ).withName("a"),
                MemoryLayout.structLayout(
                    MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
                ).withName("b")
            ).withName("segment"),
            Constants$root.C_DOUBLE$LAYOUT.withName("radius")
        ).withName("RprCapsule")
    );
    static final MethodHandle RprSharedShape_capsule$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_capsule",
        constants$39.RprSharedShape_capsule$FUNC
    );
    static final FunctionDescriptor RprSharedShape_cuboid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
            ).withName("half_extents")
        ).withName("RprCuboid")
    );
    static final MethodHandle RprSharedShape_cuboid$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cuboid",
        constants$39.RprSharedShape_cuboid$FUNC
    );
    static final FunctionDescriptor RprSharedShape_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_drop$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_drop",
        constants$39.RprSharedShape_drop$FUNC
    );
    static final FunctionDescriptor RprSharedShape_segment$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
            ).withName("a"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
            ).withName("b")
        ).withName("RprSegment")
    );
    static final MethodHandle RprSharedShape_segment$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_segment",
        constants$39.RprSharedShape_segment$FUNC
    );
    static final FunctionDescriptor RprSharedShape_triangle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
            ).withName("a"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
            ).withName("b"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(2, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
            ).withName("c")
        ).withName("RprTriangle")
    );
    static final MethodHandle RprSharedShape_triangle$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_triangle",
        constants$39.RprSharedShape_triangle$FUNC
    );
}


