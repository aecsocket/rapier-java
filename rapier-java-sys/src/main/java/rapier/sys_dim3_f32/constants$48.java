// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$48 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$48() {}
    static final FunctionDescriptor RprSharedShape_ball$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("radius")
        ).withName("RprBall")
    );
    static final MethodHandle RprSharedShape_ball$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_ball",
        constants$48.RprSharedShape_ball$FUNC
    );
    static final FunctionDescriptor RprSharedShape_capsule$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
                ).withName("a"),
                MemoryLayout.structLayout(
                    MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
                ).withName("b")
            ).withName("segment"),
            Constants$root.C_FLOAT$LAYOUT.withName("radius")
        ).withName("RprCapsule")
    );
    static final MethodHandle RprSharedShape_capsule$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_capsule",
        constants$48.RprSharedShape_capsule$FUNC
    );
    static final FunctionDescriptor RprSharedShape_cone$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("half_height"),
            Constants$root.C_FLOAT$LAYOUT.withName("radius")
        ).withName("RprCone")
    );
    static final MethodHandle RprSharedShape_cone$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cone",
        constants$48.RprSharedShape_cone$FUNC
    );
    static final FunctionDescriptor RprSharedShape_cuboid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
            ).withName("half_extents")
        ).withName("RprCuboid")
    );
    static final MethodHandle RprSharedShape_cuboid$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cuboid",
        constants$48.RprSharedShape_cuboid$FUNC
    );
    static final FunctionDescriptor RprSharedShape_cylinder$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("half_height"),
            Constants$root.C_FLOAT$LAYOUT.withName("radius")
        ).withName("RprCylinder")
    );
    static final MethodHandle RprSharedShape_cylinder$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_cylinder",
        constants$48.RprSharedShape_cylinder$FUNC
    );
    static final FunctionDescriptor RprSharedShape_release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprSharedShape_release$MH = RuntimeHelper.downcallHandle(
        "RprSharedShape_release",
        constants$48.RprSharedShape_release$FUNC
    );
}


