// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$25 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$25() {}
    static final FunctionDescriptor RprCollider_is_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_is_enabled$MH = RuntimeHelper.downcallHandle(
        "RprCollider_is_enabled",
        constants$25.RprCollider_is_enabled$FUNC
    );
    static final FunctionDescriptor RprCollider_is_sensor$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_is_sensor$MH = RuntimeHelper.downcallHandle(
        "RprCollider_is_sensor",
        constants$25.RprCollider_is_sensor$FUNC
    );
    static final FunctionDescriptor RprCollider_mass$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_mass$MH = RuntimeHelper.downcallHandle(
        "RprCollider_mass",
        constants$25.RprCollider_mass$FUNC
    );
    static final FunctionDescriptor RprCollider_parent$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprRigidBodyHandle"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_parent$MH = RuntimeHelper.downcallHandle(
        "RprCollider_parent",
        constants$25.RprCollider_parent$FUNC
    );
    static final FunctionDescriptor RprCollider_position$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("rotation"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, Constants$root.C_DOUBLE$LAYOUT).withName("_0")
        ).withName("translation")
    ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_position$MH = RuntimeHelper.downcallHandle(
        "RprCollider_position",
        constants$25.RprCollider_position$FUNC
    );
    static final FunctionDescriptor RprCollider_restitution$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_restitution$MH = RuntimeHelper.downcallHandle(
        "RprCollider_restitution",
        constants$25.RprCollider_restitution$FUNC
    );
}


