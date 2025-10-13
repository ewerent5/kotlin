package androidx.work.impl.k.f;

import android.content.Context;

/* compiled from: Trackers.java */
/* loaded from: classes.dex */
public class g {
    private static g a;

    /* renamed from: b, reason: collision with root package name */
    private a f2286b;

    /* renamed from: c, reason: collision with root package name */
    private b f2287c;

    /* renamed from: d, reason: collision with root package name */
    private e f2288d;

    /* renamed from: e, reason: collision with root package name */
    private f f2289e;

    private g(Context context, androidx.work.impl.utils.k.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2286b = new a(applicationContext, aVar);
        this.f2287c = new b(applicationContext, aVar);
        this.f2288d = new e(applicationContext, aVar);
        this.f2289e = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, androidx.work.impl.utils.k.a aVar) {
        if (a == null) {
            a = new g(context, aVar);
        }
        return a;
    }

    public a a() {
        return this.f2286b;
    }

    public b b() {
        return this.f2287c;
    }

    public e d() {
        return this.f2288d;
    }

    public f e() {
        return this.f2289e;
    }
}