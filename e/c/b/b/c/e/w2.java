package e.c.b.b.c.e;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public abstract class w2<T> {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static volatile e3 f14904b;

    /* renamed from: f, reason: collision with root package name */
    private final b3 f14908f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14909g;

    /* renamed from: h, reason: collision with root package name */
    private final T f14910h;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f14911i;

    /* renamed from: j, reason: collision with root package name */
    private volatile T f14912j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f14913k;
    private static final Object a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference<Collection<w2<?>>> f14905c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    private static f3 f14906d = new f3(y2.a);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicInteger f14907e = new AtomicInteger();

    private w2(b3 b3Var, String str, T t, boolean z) {
        this.f14911i = -1;
        if (b3Var.f14388b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f14908f = b3Var;
        this.f14909g = str;
        this.f14910h = t;
        this.f14913k = z;
    }

    private final String f(String str) {
        if (str != null && str.isEmpty()) {
            return this.f14909g;
        }
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(this.f14909g);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    static void g() {
        f14907e.incrementAndGet();
    }

    @Deprecated
    public static void h(final Context context) {
        synchronized (a) {
            e3 e3Var = f14904b;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (e3Var == null || e3Var.a() != context) {
                h2.d();
                d3.b();
                m2.b();
                f14904b = new e2(context, u3.a(new r3(context) { // from class: e.c.b.b.c.e.v2

                    /* renamed from: e, reason: collision with root package name */
                    private final Context f14883e;

                    {
                        this.f14883e = context;
                    }

                    @Override // e.c.b.b.c.e.r3
                    public final Object zza() {
                        return w2.m(this.f14883e);
                    }
                }));
                f14907e.incrementAndGet();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w2<Double> i(b3 b3Var, String str, double d2, boolean z) {
        return new z2(b3Var, str, Double.valueOf(-3.0d), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w2<Long> j(b3 b3Var, String str, long j2, boolean z) {
        return new x2(b3Var, str, Long.valueOf(j2), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w2<String> k(b3 b3Var, String str, String str2, boolean z) {
        return new c3(b3Var, str, str2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w2<Boolean> l(b3 b3Var, String str, boolean z, boolean z2) {
        return new a3(b3Var, str, Boolean.valueOf(z), true);
    }

    static final /* synthetic */ n3 m(Context context) {
        new r2();
        return r2.b(context);
    }

    static final /* synthetic */ boolean p() {
        return true;
    }

    abstract T e(Object obj);

    public final String n() {
        return f(this.f14908f.f14390d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[Catch: all -> 0x0110, TryCatch #0 {, blocks: (B:8:0x001c, B:10:0x0020, B:14:0x0029, B:16:0x0040, B:22:0x0051, B:24:0x0057, B:26:0x0065, B:30:0x0082, B:32:0x008c, B:50:0x00df, B:52:0x00ef, B:54:0x0103, B:55:0x0106, B:56:0x010a, B:43:0x00be, B:45:0x00d4, B:49:0x00dd, B:28:0x0078, B:33:0x0091, B:35:0x009a, B:37:0x00ac, B:39:0x00b7, B:38:0x00b1, B:57:0x010e), top: B:64:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef A[Catch: all -> 0x0110, TryCatch #0 {, blocks: (B:8:0x001c, B:10:0x0020, B:14:0x0029, B:16:0x0040, B:22:0x0051, B:24:0x0057, B:26:0x0065, B:30:0x0082, B:32:0x008c, B:50:0x00df, B:52:0x00ef, B:54:0x0103, B:55:0x0106, B:56:0x010a, B:43:0x00be, B:45:0x00d4, B:49:0x00dd, B:28:0x0078, B:33:0x0091, B:35:0x009a, B:37:0x00ac, B:39:0x00b7, B:38:0x00b1, B:57:0x010e), top: B:64:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T o() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.w2.o():java.lang.Object");
    }

    /* synthetic */ w2(b3 b3Var, String str, Object obj, boolean z, x2 x2Var) {
        this(b3Var, str, obj, z);
    }
}