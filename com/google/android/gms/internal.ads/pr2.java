package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class pr2 implements Callable {
    protected final String a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    protected final gq2 f8253b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f8254c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f8255d;

    /* renamed from: e, reason: collision with root package name */
    protected final eu0 f8256e;

    /* renamed from: f, reason: collision with root package name */
    protected Method f8257f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f8258g;

    /* renamed from: h, reason: collision with root package name */
    protected final int f8259h;

    public pr2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        this.f8253b = gq2Var;
        this.f8254c = str;
        this.f8255d = str2;
        this.f8256e = eu0Var;
        this.f8258g = i2;
        this.f8259h = i3;
    }

    protected abstract void a();

    public Void b() {
        long jNanoTime;
        Method methodP;
        int i2;
        try {
            jNanoTime = System.nanoTime();
            methodP = this.f8253b.p(this.f8254c, this.f8255d);
            this.f8257f = methodP;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (methodP == null) {
            return null;
        }
        a();
        yl2 yl2VarI = this.f8253b.i();
        if (yl2VarI != null && (i2 = this.f8258g) != Integer.MIN_VALUE) {
            yl2VarI.a(this.f8259h, i2, (System.nanoTime() - jNanoTime) / 1000, null, null);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}