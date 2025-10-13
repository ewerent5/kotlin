package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ae extends ds<he> {

    /* renamed from: c, reason: collision with root package name */
    private final Object f4901c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final fe f4902d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4903e;

    public ae(fe feVar) {
        this.f4902d = feVar;
    }

    public final void f() {
        synchronized (this.f4901c) {
            if (this.f4903e) {
                return;
            }
            this.f4903e = true;
            a(new xd(this), new zr());
            a(new yd(this), new zd(this));
        }
    }
}