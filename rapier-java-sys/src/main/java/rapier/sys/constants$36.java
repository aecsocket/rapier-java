// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$36 {

    static final FunctionDescriptor RprRigidBodySet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_drop$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_drop",
        constants$36.RprRigidBodySet_drop$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprRigidBodySet_get$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_get",
        constants$36.RprRigidBodySet_get$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_get_mut$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprRigidBodySet_get_mut$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_get_mut",
        constants$36.RprRigidBodySet_get_mut$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprRigidBodySet_index$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_index",
        constants$36.RprRigidBodySet_index$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_index_mut$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprRigidBodySet_index_mut$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_index_mut",
        constants$36.RprRigidBodySet_index_mut$FUNC
    );
    static final FunctionDescriptor RprRigidBodySet_insert$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("generation")
    ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprRigidBodySet_insert$MH = RuntimeHelper.downcallHandle(
        "RprRigidBodySet_insert",
        constants$36.RprRigidBodySet_insert$FUNC
    );
}


