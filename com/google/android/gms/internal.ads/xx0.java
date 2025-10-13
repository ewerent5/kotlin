package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xx0 {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final h52 f10300b;

    /* renamed from: c, reason: collision with root package name */
    private final ez0 f10301c;

    /* renamed from: d, reason: collision with root package name */
    private final go2<v01> f10302d;

    public xx0(h52 h52Var, h52 h52Var2, ez0 ez0Var, go2<v01> go2Var) {
        this.a = h52Var;
        this.f10300b = h52Var2;
        this.f10301c = ez0Var;
        this.f10302d = go2Var;
    }

    public final g52<InputStream> a(final ql qlVar) {
        String str = qlVar.f8404h;
        zzs.zzc();
        g52 g52VarB = zzr.zzE(str) ? y42.b(new uz0(1)) : y42.f(this.a.N(new Callable(this, qlVar) { // from class: com.google.android.gms.internal.ads.ux0
            private final xx0 a;

            /* renamed from: b, reason: collision with root package name */
            private final ql f9585b;

            {
                this.a = this;
                this.f9585b = qlVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c(this.f9585b);
            }
        }), ExecutionException.class, vx0.a, this.f10300b);
        final int callingUid = Binder.getCallingUid();
        return y42.f(g52VarB, uz0.class, new e42(this, qlVar, callingUid) { // from class: com.google.android.gms.internal.ads.wx0
            private final xx0 a;

            /* renamed from: b, reason: collision with root package name */
            private final ql f10069b;

            /* renamed from: c, reason: collision with root package name */
            private final int f10070c;

            {
                this.a = this;
                this.f10069b = qlVar;
                this.f10070c = callingUid;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.b(this.f10069b, this.f10070c, (uz0) obj);
            }
        }, this.f10300b);
    }

    final /* synthetic */ g52 b(ql qlVar, int i2, uz0 uz0Var) {
        return this.f10302d.zzb().I4(qlVar, i2);
    }

    final /* synthetic */ InputStream c(ql qlVar) {
        wr<InputStream> wrVar;
        final ez0 ez0Var = this.f10301c;
        synchronized (ez0Var.f6247b) {
            if (ez0Var.f6248c) {
                wrVar = ez0Var.a;
            } else {
                ez0Var.f6248c = true;
                ez0Var.f6250e = qlVar;
                ez0Var.f6251f.checkAvailabilityAndConnect();
                ez0Var.a.zze(new Runnable(ez0Var) { // from class: com.google.android.gms.internal.ads.dz0

                    /* renamed from: e, reason: collision with root package name */
                    private final ez0 f5540e;

                    {
                        this.f5540e = ez0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5540e.a();
                    }
                }, qr.f8451f);
                wrVar = ez0Var.a;
            }
        }
        return wrVar.get(((Integer) c.c().b(w3.H3)).intValue(), TimeUnit.SECONDS);
    }
}