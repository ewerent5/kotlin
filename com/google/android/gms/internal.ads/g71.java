package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class g71<AdT> implements e42<kp1, AdT> {
    private final st1 a;

    /* renamed from: b */
    private final sa0 f6073b;

    /* renamed from: c */
    private final su1 f6074c;

    /* renamed from: d */
    private final vu1 f6075d;

    /* renamed from: e */
    private final Executor f6076e;

    /* renamed from: f */
    private final ScheduledExecutorService f6077f;

    /* renamed from: g */
    private final v60<AdT> f6078g;

    /* renamed from: h */
    private final b71 f6079h;

    /* renamed from: i */
    private final p31 f6080i;

    public g71(st1 st1Var, b71 b71Var, sa0 sa0Var, su1 su1Var, vu1 vu1Var, v60<AdT> v60Var, Executor executor, ScheduledExecutorService scheduledExecutorService, p31 p31Var) {
        this.a = st1Var;
        this.f6079h = b71Var;
        this.f6073b = sa0Var;
        this.f6074c = su1Var;
        this.f6075d = vu1Var;
        this.f6078g = v60Var;
        this.f6076e = executor;
        this.f6077f = scheduledExecutorService;
        this.f6080i = p31Var;
    }

    final /* synthetic */ g52 a(kp1 kp1Var, xo1 xo1Var, j31 j31Var, Throwable th) {
        b71 b71Var = this.f6079h;
        ap1 ap1Var = kp1Var.f7035b.f6562b;
        g52 g52VarG = y42.g(j31Var.a(kp1Var, xo1Var), xo1Var.M, TimeUnit.MILLISECONDS, this.f6077f);
        b71Var.a(ap1Var, xo1Var, g52VarG);
        return g52VarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0044  */
    @Override // com.google.android.gms.internal.ads.e42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.g52 zza(com.google.android.gms.internal.ads.kp1 r9) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g71.zza(java.lang.Object):com.google.android.gms.internal.ads.g52");
    }
}