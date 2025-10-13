package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public class b7 {
    private static volatile b7 a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile b7 f14407b;

    /* renamed from: c, reason: collision with root package name */
    private static final b7 f14408c = new b7(true);

    /* renamed from: d, reason: collision with root package name */
    private final Map<a, o7.f<?, ?>> f14409d;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    private static final class a {
        private final Object a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14410b;

        a(Object obj, int i2) {
            this.a = obj;
            this.f14410b = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.f14410b == aVar.f14410b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f14410b;
        }
    }

    b7() {
        this.f14409d = new HashMap();
    }

    public static b7 a() {
        b7 b7Var = a;
        if (b7Var == null) {
            synchronized (b7.class) {
                b7Var = a;
                if (b7Var == null) {
                    b7Var = f14408c;
                    a = b7Var;
                }
            }
        }
        return b7Var;
    }

    public static b7 c() {
        b7 b7Var = f14407b;
        if (b7Var != null) {
            return b7Var;
        }
        synchronized (b7.class) {
            b7 b7Var2 = f14407b;
            if (b7Var2 != null) {
                return b7Var2;
            }
            b7 b7VarB = m7.b(b7.class);
            f14407b = b7VarB;
            return b7VarB;
        }
    }

    public final <ContainingType extends b9> o7.f<ContainingType, ?> b(ContainingType containingtype, int i2) {
        return (o7.f) this.f14409d.get(new a(containingtype, i2));
    }

    private b7(boolean z) {
        this.f14409d = Collections.emptyMap();
    }
}