// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$23 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$23() {}
    static final FunctionDescriptor RprPhysicsPipeline_step$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprPhysicsPipeline_step$MH = RuntimeHelper.downcallHandle(
        "RprPhysicsPipeline_step",
        constants$23.RprPhysicsPipeline_step$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_drop$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_drop",
        constants$23.RprQueryPipeline_drop$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprQueryPipeline_new$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_new",
        constants$23.RprQueryPipeline_new$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_build$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_build$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_build",
        constants$23.RprRigidBodyBuilder_build$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodyBuilder_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_drop",
        constants$23.RprRigidBodyBuilder_drop$FUNC
    );
    static final FunctionDescriptor RprRigidBodyBuilder_dynamic$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprRigidBodyBuilder_dynamic$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodyBuilder_dynamic",
        constants$23.RprRigidBodyBuilder_dynamic$FUNC
    );
}


