package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class e01 {
    private final h52 a;

    /* renamed from: b */
    private final nz0 f5557b;

    /* renamed from: c */
    private final go2<v01> f5558c;

    public e01(h52 h52Var, nz0 nz0Var, go2<v01> go2Var) {
        this.a = h52Var;
        this.f5557b = nz0Var;
        this.f5558c = go2Var;
    }

    private final <RetT> g52<RetT> g(final ql qlVar, d01<InputStream> d01Var, final d01<InputStream> d01Var2, final e42<InputStream, RetT> e42Var) {
        String str = qlVar.f8404h;
        zzs.zzc();
        return y42.f(y42.h(p42.D(zzr.zzE(str) ? y42.b(new uz0(1)) : y42.f(d01Var.a(qlVar), ExecutionException.class, vz0.a, this.a)), e42Var, this.a), uz0.class, new e42(this, d01Var2, qlVar, e42Var) { // from class: com.google.android.gms.internal.ads.wz0
            private final e01 a;

            /* renamed from: b, reason: collision with root package name */
            private final d01 f10089b;

            /* renamed from: c, reason: collision with root package name */
            private final ql f10090c;

            /* renamed from: d, reason: collision with root package name */
            private final e42 f10091d;

            {
                this.a = this;
                this.f10089b = d01Var2;
                this.f10090c = qlVar;
                this.f10091d = e42Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.f(this.f10089b, this.f10090c, this.f10091d, (uz0) obj);
            }
        }, this.a);
    }

    public final g52<ql> a(final ql qlVar) {
        return g(qlVar, yz0.b(this.f5557b), new d01(this) { // from class: com.google.android.gms.internal.ads.zz0
            private final e01 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.d01
            public final g52 a(ql qlVar2) {
                return this.a.e(qlVar2);
            }
        }, new e42(qlVar) { // from class: com.google.android.gms.internal.ads.xz0
            private final ql a;

            {
                this.a = qlVar;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                ql qlVar2 = this.a;
                qlVar2.n = new String(a32.a((InputStream) obj), u02.f9331c);
                return y42.a(qlVar2);
            }
        });
    }

    public final g52<Void> b(ql qlVar) {
        if (jq2.c(qlVar.n)) {
            return y42.b(new tx0(2, "Pool key missing from removeUrl call."));
        }
        return g(qlVar, new d01(this) { // from class: com.google.android.gms.internal.ads.b01
            private final e01 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.d01
            public final g52 a(ql qlVar2) {
                return this.a.d(qlVar2);
            }
        }, new d01(this) { // from class: com.google.android.gms.internal.ads.c01
            private final e01 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.d01
            public final g52 a(ql qlVar2) {
                return this.a.c(qlVar2);
            }
        }, a01.a);
    }

    final /* synthetic */ g52 c(ql qlVar) {
        return this.f5558c.zzb().K4(qlVar.n);
    }

    final /* synthetic */ g52 d(ql qlVar) {
        return this.f5557b.c(qlVar.n);
    }

    final /* synthetic */ g52 e(ql qlVar) {
        return this.f5558c.zzb().J4(qlVar, Binder.getCallingUid());
    }

    final /* synthetic */ g52 f(d01 d01Var, ql qlVar, e42 e42Var, uz0 uz0Var) {
        return y42.h(d01Var.a(qlVar), e42Var, this.a);
    }
}