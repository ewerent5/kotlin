package androidx.room;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlinx.coroutines.g1;

/* compiled from: CoroutinesRoom.kt */
/* loaded from: classes.dex */
public final class a0 {
    public static final kotlinx.coroutines.d0 a(q0 q0Var) {
        i.y.d.l.d(q0Var, "$this$queryDispatcher");
        Map<String, Object> mapI = q0Var.i();
        i.y.d.l.c(mapI, "backingFieldMap");
        Object objA = mapI.get("QueryDispatcher");
        if (objA == null) {
            Executor executorM = q0Var.m();
            i.y.d.l.c(executorM, "queryExecutor");
            objA = g1.a(executorM);
            mapI.put("QueryDispatcher", objA);
        }
        Objects.requireNonNull(objA, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kotlinx.coroutines.d0) objA;
    }

    public static final kotlinx.coroutines.d0 b(q0 q0Var) {
        i.y.d.l.d(q0Var, "$this$transactionDispatcher");
        Map<String, Object> mapI = q0Var.i();
        i.y.d.l.c(mapI, "backingFieldMap");
        Object objA = mapI.get("TransactionDispatcher");
        if (objA == null) {
            Executor executorP = q0Var.p();
            i.y.d.l.c(executorP, "transactionExecutor");
            objA = g1.a(executorP);
            mapI.put("TransactionDispatcher", objA);
        }
        Objects.requireNonNull(objA, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kotlinx.coroutines.d0) objA;
    }
}