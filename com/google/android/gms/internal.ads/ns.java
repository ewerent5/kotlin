package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ns implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f7792e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f7793f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ rs f7794g;

    ns(rs rsVar, int i2, int i3) {
        this.f7794g = rsVar;
        this.f7792e = i2;
        this.f7793f = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7794g.w != null) {
            this.f7794g.w.a(this.f7792e, this.f7793f);
        }
    }
}