// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$22 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$22() {}
    static final FunctionDescriptor RprCollider_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprCollider_drop$MH = RuntimeHelper.downcallHandle(
        "RprCollider_drop",
        constants$22.RprCollider_drop$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprImpulseJointSet_drop$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_drop",
        constants$22.RprImpulseJointSet_drop$FUNC
    );
    static final FunctionDescriptor RprImpulseJointSet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprImpulseJointSet_new$MH = RuntimeHelper.downcallHandle(
        "RprImpulseJointSet_new",
        constants$22.RprImpulseJointSet_new$FUNC
    );
    static final FunctionDescriptor RprIntegrationParameters_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprIntegrationParameters_default$MH = RuntimeHelper.downcallHandle(
        "RprIntegrationParameters_default",
        constants$22.RprIntegrationParameters_default$FUNC
    );
    static final FunctionDescriptor RprIntegrationParameters_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIntegrationParameters_drop$MH = RuntimeHelper.downcallHandle(
        "RprIntegrationParameters_drop",
        constants$22.RprIntegrationParameters_drop$FUNC
    );
    static final FunctionDescriptor RprIntegrationParameters_dt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprIntegrationParameters_dt$MH = RuntimeHelper.downcallHandle(
        "RprIntegrationParameters_dt",
        constants$22.RprIntegrationParameters_dt$FUNC
    );
}


