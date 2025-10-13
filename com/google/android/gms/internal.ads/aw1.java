package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class aw1 {
    private static aw1 a;

    /* renamed from: b, reason: collision with root package name */
    private float f5007b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    private final sv1 f5008c;

    /* renamed from: d, reason: collision with root package name */
    private final qv1 f5009d;

    /* renamed from: e, reason: collision with root package name */
    private rv1 f5010e;

    /* renamed from: f, reason: collision with root package name */
    private tv1 f5011f;

    public aw1(sv1 sv1Var, qv1 qv1Var) {
        this.f5008c = sv1Var;
        this.f5009d = qv1Var;
    }

    public static aw1 a() {
        if (a == null) {
            a = new aw1(new sv1(), new qv1());
        }
        return a;
    }

    public final void b(Context context) {
        this.f5010e = new rv1(new Handler(), context, new ov1(), this, null);
    }

    public final void c() {
        vv1.a().g(this);
        vv1.a().c();
        if (vv1.a().e()) {
            xw1.b().c();
        }
        this.f5010e.a();
    }

    public final void d() {
        xw1.b().d();
        vv1.a().d();
        this.f5010e.b();
    }

    public final void e(float f2) {
        this.f5007b = f2;
        if (this.f5011f == null) {
            this.f5011f = tv1.a();
        }
        Iterator<hv1> it = this.f5011f.f().iterator();
        while (it.hasNext()) {
            it.next().h().j(f2);
        }
    }

    public final float f() {
        return this.f5007b;
    }
}