package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class l13 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f7162e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f7163f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f7164g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ float f7165h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ p13 f7166i;

    l13(p13 p13Var, int i2, int i3, int i4, float f2) {
        this.f7166i = p13Var;
        this.f7162e = i2;
        this.f7163f = i3;
        this.f7164g = i4;
        this.f7165h = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7166i.f8063b.c(this.f7162e, this.f7163f, this.f7164g, this.f7165h);
    }
}