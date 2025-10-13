package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class by2 implements fy2, ey2 {

    /* renamed from: e, reason: collision with root package name */
    private final Uri f5218e;

    /* renamed from: f, reason: collision with root package name */
    private final oz2 f5219f;

    /* renamed from: g, reason: collision with root package name */
    private final cv2 f5220g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5221h;

    /* renamed from: i, reason: collision with root package name */
    private final Handler f5222i;

    /* renamed from: j, reason: collision with root package name */
    private final ay2 f5223j;

    /* renamed from: k, reason: collision with root package name */
    private final ht2 f5224k = new ht2();

    /* renamed from: l, reason: collision with root package name */
    private final int f5225l;

    /* renamed from: m, reason: collision with root package name */
    private ey2 f5226m;
    private jt2 n;
    private boolean o;

    public by2(Uri uri, oz2 oz2Var, cv2 cv2Var, int i2, Handler handler, ay2 ay2Var, String str, int i3) {
        this.f5218e = uri;
        this.f5219f = oz2Var;
        this.f5220g = cv2Var;
        this.f5221h = i2;
        this.f5222i = handler;
        this.f5223j = ay2Var;
        this.f5225l = i3;
    }

    @Override // com.google.android.gms.internal.ads.fy2
    public final dy2 a(int i2, sz2 sz2Var) {
        f03.a(i2 == 0);
        return new zx2(this.f5218e, this.f5219f.zza(), this.f5220g.zza(), this.f5221h, this.f5222i, this.f5223j, this, sz2Var, null, this.f5225l, null);
    }

    @Override // com.google.android.gms.internal.ads.fy2
    public final void b(ns2 ns2Var, boolean z, ey2 ey2Var) {
        this.f5226m = ey2Var;
        ty2 ty2Var = new ty2(-9223372036854775807L, false);
        this.n = ty2Var;
        ey2Var.c(ty2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.ey2
    public final void c(jt2 jt2Var, Object obj) {
        ht2 ht2Var = this.f5224k;
        jt2Var.d(0, ht2Var, false);
        boolean z = ht2Var.f6382c != -9223372036854775807L;
        if (!this.o || z) {
            this.n = jt2Var;
            this.o = z;
            this.f5226m.c(jt2Var, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.fy2
    public final void d(dy2 dy2Var) {
        ((zx2) dy2Var).s();
    }

    @Override // com.google.android.gms.internal.ads.fy2
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.fy2
    public final void zzd() {
        this.f5226m = null;
    }
}