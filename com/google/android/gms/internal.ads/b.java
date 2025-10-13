package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f5037e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f5038f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d1 f5039g;

    b(d1 d1Var, String str, long j2) {
        this.f5039g = d1Var;
        this.f5037e = str;
        this.f5038f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5039g.zza.a(this.f5037e, this.f5038f);
        this.f5039g.zza.b(this.f5039g.toString());
    }
}