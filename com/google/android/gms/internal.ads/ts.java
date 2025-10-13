package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(14)
/* loaded from: classes.dex */
public abstract class ts extends TextureView implements ot {

    /* renamed from: e, reason: collision with root package name */
    protected final ft f9238e;

    /* renamed from: f, reason: collision with root package name */
    protected final pt f9239f;

    public ts(Context context) {
        super(context);
        this.f9238e = new ft();
        this.f9239f = new pt(context, this);
    }

    public void A(int i2) {
    }

    public abstract String a();

    public abstract void g(ss ssVar);

    public abstract void h(String str);

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract int l();

    public abstract int m();

    public abstract void n(int i2);

    public abstract void o(float f2, float f3);

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract long s();

    public abstract long t();

    public abstract int u();

    public void v(String str, String[] strArr) {
        h(str);
    }

    public void w(int i2) {
    }

    public void x(int i2) {
    }

    public void y(int i2) {
    }

    public void z(int i2) {
    }

    public abstract void zzq();
}