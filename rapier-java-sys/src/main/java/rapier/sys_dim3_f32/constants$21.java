// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$21 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$21() {}
    static final FunctionDescriptor RprColliderBuilder_sensor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprColliderBuilder_sensor$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_sensor",
        constants$21.RprColliderBuilder_sensor$FUNC
    );
    static final FunctionDescriptor RprColliderBuilder_translation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y"),
            Constants$root.C_FLOAT$LAYOUT.withName("z")
        ).withName("RprVector")
    );
    static final MethodHandle RprColliderBuilder_translation$MH = RuntimeHelper.downcallHandle(
        "RprColliderBuilder_translation",
        constants$21.RprColliderBuilder_translation$FUNC
    );
    static final FunctionDescriptor RprColliderSet_contains$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprColliderSet_contains$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_contains",
        constants$21.RprColliderSet_contains$FUNC
    );
    static final FunctionDescriptor RprColliderSet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprColliderSet_drop$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_drop",
        constants$21.RprColliderSet_drop$FUNC
    );
    static final FunctionDescriptor RprColliderSet_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprColliderSet_get$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_get",
        constants$21.RprColliderSet_get$FUNC
    );
    static final FunctionDescriptor RprColliderSet_get_mut$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprColliderSet_get_mut$MH = RuntimeHelper.downcallHandle(
        "RprColliderSet_get_mut",
        constants$21.RprColliderSet_get_mut$FUNC
    );
}


