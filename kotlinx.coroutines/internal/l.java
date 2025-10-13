package kotlinx.coroutines.internal;

import java.util.Objects;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes3.dex */
public final class l {
    private static final Object a = new x("CONDITION_FALSE");

    /* renamed from: b, reason: collision with root package name */
    private static final Object f16981b = new x("LIST_EMPTY");

    public static final Object a() {
        return a;
    }

    public static final m b(Object obj) {
        m mVar;
        u uVar = (u) (!(obj instanceof u) ? null : obj);
        if (uVar != null && (mVar = uVar.a) != null) {
            return mVar;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        return (m) obj;
    }
}