// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$29 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$29() {}
    static final FunctionDescriptor RprCollider_shape$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_shape$MH = RuntimeHelper.downcallHandle(
        "RprCollider_shape",
        constants$29.RprCollider_shape$FUNC
    );
    static final FunctionDescriptor RprCollider_translation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(3, Constants$root.C_FLOAT$LAYOUT).withName("_0")
    ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_translation$MH = RuntimeHelper.downcallHandle(
        "RprCollider_translation",
        constants$29.RprCollider_translation$FUNC
    );
    static final FunctionDescriptor RprCollider_volume$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_volume$MH = RuntimeHelper.downcallHandle(
        "RprCollider_volume",
        constants$29.RprCollider_volume$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointSet_drop$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_drop",
        constants$29.RprImpulseJointSet_drop$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprImpulseJointSet_new$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_new",
        constants$29.RprImpulseJointSet_new$FUNC
    );
    static final FunctionDescriptor RprIntegrationParametersDesc_default$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("dt"),
        Constants$root.C_FLOAT$LAYOUT.withName("min_ccd_dt"),
        Constants$root.C_FLOAT$LAYOUT.withName("erp"),
        Constants$root.C_FLOAT$LAYOUT.withName("damping_ratio"),
        Constants$root.C_FLOAT$LAYOUT.withName("joint_erp"),
        Constants$root.C_FLOAT$LAYOUT.withName("joint_damping_ratio"),
        Constants$root.C_FLOAT$LAYOUT.withName("allowed_linear_error"),
        Constants$root.C_FLOAT$LAYOUT.withName("max_penetration_correction"),
        Constants$root.C_FLOAT$LAYOUT.withName("prediction_distance"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("max_velocity_iterations"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("max_velocity_friction_iterations"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("max_stabilization_iterations"),
        Constants$root.C_BOOL$LAYOUT.withName("interleave_restitution_and_friction_resolution"),
        MemoryLayout.paddingLayout(56),
        Constants$root.C_LONG_LONG$LAYOUT.withName("min_island_size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("max_ccd_substeps")
    ).withName("RprIntegrationParametersDesc"));
    static final MethodHandle RprIntegrationParametersDesc_default$MH = RuntimeHelper.downcallHandle(
        "RprIntegrationParametersDesc_default",
        constants$29.RprIntegrationParametersDesc_default$FUNC
    );
}


