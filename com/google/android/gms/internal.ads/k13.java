package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class k13 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f6925e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f6926f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ p13 f6927g;

    k13(p13 p13Var, int i2, long j2) {
        this.f6927g = p13Var;
        this.f6925e = i2;
        this.f6926f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6927g.f8063b.l(this.f6925e, this.f6926f);
    }
}