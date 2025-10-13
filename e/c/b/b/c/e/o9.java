package e.c.b.b.c.e;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class o9 {
    private static final o9 a = new o9();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, s9<?>> f14754c = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final r9 f14753b = new n8();

    private o9() {
    }

    public static o9 a() {
        return a;
    }

    public final <T> s9<T> b(Class<T> cls) {
        r7.f(cls, "messageType");
        s9<T> s9Var = (s9) this.f14754c.get(cls);
        if (s9Var != null) {
            return s9Var;
        }
        s9<T> s9VarA = this.f14753b.a(cls);
        r7.f(cls, "messageType");
        r7.f(s9VarA, "schema");
        s9<T> s9Var2 = (s9) this.f14754c.putIfAbsent(cls, s9VarA);
        return s9Var2 != null ? s9Var2 : s9VarA;
    }

    public final <T> s9<T> c(T t) {
        return b(t.getClass());
    }
}