// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$27 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$27() {}
    static final FunctionDescriptor RprCollider_set_friction_combine_rule$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprCollider_set_friction_combine_rule$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_friction_combine_rule",
        constants$27.RprCollider_set_friction_combine_rule$FUNC
    );
    static final FunctionDescriptor RprCollider_set_mass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprCollider_set_mass$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_mass",
        constants$27.RprCollider_set_mass$FUNC
    );
    static final FunctionDescriptor RprCollider_set_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("_0")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprCollider_set_position$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_position",
        constants$27.RprCollider_set_position$FUNC
    );
    static final FunctionDescriptor RprCollider_set_position_wrt_parent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("_0")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
            ).withName("translation")
        ).withName("RprIsometry")
    );
    static final MethodHandle RprCollider_set_position_wrt_parent$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_position_wrt_parent",
        constants$27.RprCollider_set_position_wrt_parent$FUNC
    );
    static final FunctionDescriptor RprCollider_set_restitution$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle RprCollider_set_restitution$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_restitution",
        constants$27.RprCollider_set_restitution$FUNC
    );
    static final FunctionDescriptor RprCollider_set_restitution_combine_rule$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle RprCollider_set_restitution_combine_rule$MH = RuntimeHelper.downcallHandle(
        "RprCollider_set_restitution_combine_rule",
        constants$27.RprCollider_set_restitution_combine_rule$FUNC
    );
}


