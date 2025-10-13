package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzr;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class nt implements Runnable {

    /* renamed from: e */
    private final bt f7796e;

    /* renamed from: f */
    private boolean f7797f = false;

    nt(bt btVar) {
        this.f7796e = btVar;
    }

    private final void c() {
        l02 l02Var = zzr.zza;
        l02Var.removeCallbacks(this);
        l02Var.postDelayed(this, 250L);
    }

    public final void a() {
        this.f7797f = true;
        this.f7796e.g();
    }

    public final void b() {
        this.f7797f = false;
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7797f) {
            return;
        }
        this.f7796e.g();
        c();
    }
}