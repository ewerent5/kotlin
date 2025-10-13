package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class w1 {
    private static final kotlinx.coroutines.internal.x a = new kotlinx.coroutines.internal.x("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.x f17171b = new kotlinx.coroutines.internal.x("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final kotlinx.coroutines.internal.x f17172c = new kotlinx.coroutines.internal.x("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final kotlinx.coroutines.internal.x f17173d = new kotlinx.coroutines.internal.x("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final kotlinx.coroutines.internal.x f17174e = new kotlinx.coroutines.internal.x("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final w0 f17175f = new w0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final w0 f17176g = new w0(true);

    public static final Object g(Object obj) {
        return obj instanceof j1 ? new k1((j1) obj) : obj;
    }

    public static final Object h(Object obj) {
        j1 j1Var;
        k1 k1Var = (k1) (!(obj instanceof k1) ? null : obj);
        return (k1Var == null || (j1Var = k1Var.a) == null) ? obj : j1Var;
    }
}