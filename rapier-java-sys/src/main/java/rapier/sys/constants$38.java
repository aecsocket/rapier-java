// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$38 {

    static final FunctionDescriptor RprMultibodyJointSet_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_drop$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_drop",
        constants$38.RprMultibodyJointSet_drop$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_insert$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_insert$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_insert",
        constants$38.RprMultibodyJointSet_insert$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RprMultibodyJointSet_new$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_new",
        constants$38.RprMultibodyJointSet_new$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_remove$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_remove",
        constants$38.RprMultibodyJointSet_remove$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_remove_joints_attached_to_rigid_body$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprMultibodyJointSet_remove_joints_attached_to_rigid_body$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_remove_joints_attached_to_rigid_body",
        constants$38.RprMultibodyJointSet_remove_joints_attached_to_rigid_body$FUNC
    );
    static final FunctionDescriptor RprMultibodyJointSet_remove_multibody_articulations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle RprMultibodyJointSet_remove_multibody_articulations$MH = RuntimeHelper.downcallHandle(
        "RprMultibodyJointSet_remove_multibody_articulations",
        constants$38.RprMultibodyJointSet_remove_multibody_articulations$FUNC
    );
}


