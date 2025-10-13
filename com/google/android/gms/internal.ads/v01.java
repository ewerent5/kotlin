package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class v01 extends gl {

    /* renamed from: e, reason: collision with root package name */
    private final Context f9606e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f9607f;

    /* renamed from: g, reason: collision with root package name */
    private final bm f9608g;

    /* renamed from: h, reason: collision with root package name */
    private final q10 f9609h;

    /* renamed from: i, reason: collision with root package name */
    private final HashMap<String, s01> f9610i;

    /* renamed from: j, reason: collision with root package name */
    private final cm f9611j;

    /* renamed from: k, reason: collision with root package name */
    private final a11 f9612k;

    /* JADX WARN: Multi-variable type inference failed */
    public v01(Context context, Context context2, Executor executor, cm cmVar, q10 q10Var, bm bmVar, HashMap<String, s01> map, a11 a11Var) {
        w3.a(context);
        this.f9606e = context;
        this.f9607f = context2;
        this.f9611j = executor;
        this.f9608g = q10Var;
        this.f9609h = cmVar;
        this.f9610i = bmVar;
        this.f9612k = map;
    }

    private static g52<JSONObject> N4(ql qlVar, st1 st1Var, final th1 th1Var) {
        e42 e42Var = new e42(th1Var) { // from class: com.google.android.gms.internal.ads.i01
            private final th1 a;

            {
                this.a = th1Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.a().a(zzs.zzc().zzh((Bundle) obj));
            }
        };
        return st1Var.a(lt1.GMS_SIGNALS, y42.a(qlVar.f8401e)).c(e42Var).b(j01.a).i();
    }

    private static g52<tl> O4(g52<JSONObject> g52Var, st1 st1Var, ve veVar) {
        return st1Var.a(lt1.BUILD_URL, g52Var).c(veVar.a("AFMA_getAdDictionary", se.f8855b, l01.a)).i();
    }

    private final void P4(g52<InputStream> g52Var, ll llVar) {
        y42.o(y42.h(g52Var, new e42(this) { // from class: com.google.android.gms.internal.ads.p01
            private final v01 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return y42.a(lq1.a((InputStream) obj));
            }
        }, qr.a), new r01(this, llVar), qr.f8451f);
    }

    public final g52<InputStream> I4(ql qlVar, int i2) {
        ve veVarA = zzs.zzp().a(this.f9606e, kr.c());
        th1 th1VarA = this.f9609h.a(qlVar, i2);
        ke keVarA = veVarA.a("google.afma.response.normalize", u01.a, se.f8856c);
        c11 c11Var = new c11(qlVar.f8407k);
        z01 z01Var = new z01(this.f9606e, qlVar.f8402f.f7054e, this.f9611j, i2, null);
        st1 st1VarC = th1VarA.c();
        s01 s01Var = null;
        if (p5.a.e().booleanValue()) {
            String str = qlVar.n;
            if (str != null && !str.isEmpty()) {
                s01 s01VarRemove = this.f9610i.remove(qlVar.n);
                if (s01VarRemove == null) {
                    zze.zza("Request contained a PoolKey but no matching parameters were found.");
                } else {
                    s01Var = s01VarRemove;
                }
            }
        } else {
            String str2 = qlVar.n;
            if (str2 != null && !str2.isEmpty()) {
                zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        if (s01Var != null) {
            final xs1 xs1VarI = st1VarC.a(lt1.HTTP, y42.a(new b11(s01Var.f8807b, s01Var.a))).b(c11Var).b(z01Var).i();
            final g52<?> g52VarA = y42.a(s01Var);
            return st1VarC.b(lt1.PRE_PROCESS, xs1VarI, g52VarA).a(new Callable(xs1VarI, g52VarA) { // from class: com.google.android.gms.internal.ads.h01
                private final g52 a;

                /* renamed from: b, reason: collision with root package name */
                private final g52 f6263b;

                {
                    this.a = xs1VarI;
                    this.f6263b = g52VarA;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    g52 g52Var = this.a;
                    g52 g52Var2 = this.f6263b;
                    return new u01((y01) g52Var.get(), ((s01) g52Var2.get()).f8807b, ((s01) g52Var2.get()).a);
                }
            }).c(keVarA).i();
        }
        final g52<JSONObject> g52VarN4 = N4(qlVar, st1VarC, th1VarA);
        final g52<tl> g52VarO4 = O4(g52VarN4, st1VarC, veVarA);
        final xs1 xs1VarI2 = st1VarC.b(lt1.HTTP, g52VarO4, g52VarN4).a(new Callable(g52VarN4, g52VarO4) { // from class: com.google.android.gms.internal.ads.f01
            private final g52 a;

            /* renamed from: b, reason: collision with root package name */
            private final g52 f5763b;

            {
                this.a = g52VarN4;
                this.f5763b = g52VarO4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new b11((JSONObject) this.a.get(), (tl) this.f5763b.get());
            }
        }).b(c11Var).b(z01Var).i();
        return st1VarC.b(lt1.PRE_PROCESS, g52VarN4, g52VarO4, xs1VarI2).a(new Callable(xs1VarI2, g52VarN4, g52VarO4) { // from class: com.google.android.gms.internal.ads.g01
            private final g52 a;

            /* renamed from: b, reason: collision with root package name */
            private final g52 f5997b;

            /* renamed from: c, reason: collision with root package name */
            private final g52 f5998c;

            {
                this.a = xs1VarI2;
                this.f5997b = g52VarN4;
                this.f5998c = g52VarO4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new u01((y01) this.a.get(), (JSONObject) this.f5997b.get(), (tl) this.f5998c.get());
            }
        }).c(keVarA).i();
    }

    @Override // com.google.android.gms.internal.ads.hl
    public final void J0(ql qlVar, ll llVar) {
        P4(J4(qlVar, Binder.getCallingUid()), llVar);
    }

    public final g52<InputStream> J4(ql qlVar, int i2) {
        if (!p5.a.e().booleanValue()) {
            return y42.b(new Exception("Split request is disabled."));
        }
        jr1 jr1Var = qlVar.f8409m;
        if (jr1Var == null) {
            return y42.b(new Exception("Pool configuration missing from request."));
        }
        if (jr1Var.f6821i == 0 || jr1Var.f6822j == 0) {
            return y42.b(new Exception("Caching is disabled."));
        }
        ve veVarA = zzs.zzp().a(this.f9606e, kr.c());
        th1 th1VarA = this.f9609h.a(qlVar, i2);
        st1 st1VarC = th1VarA.c();
        final g52<JSONObject> g52VarN4 = N4(qlVar, st1VarC, th1VarA);
        final g52<tl> g52VarO4 = O4(g52VarN4, st1VarC, veVarA);
        return st1VarC.b(lt1.GET_URL_AND_CACHE_KEY, g52VarN4, g52VarO4).a(new Callable(this, g52VarO4, g52VarN4) { // from class: com.google.android.gms.internal.ads.n01
            private final v01 a;

            /* renamed from: b, reason: collision with root package name */
            private final g52 f7606b;

            /* renamed from: c, reason: collision with root package name */
            private final g52 f7607c;

            {
                this.a = this;
                this.f7606b = g52VarO4;
                this.f7607c = g52VarN4;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.M4(this.f7606b, this.f7607c);
            }
        }).i();
    }

    public final g52<InputStream> K4(String str) {
        if (!p5.a.e().booleanValue()) {
            return y42.b(new Exception("Split request is disabled."));
        }
        q01 q01Var = new q01(this);
        if (this.f9610i.remove(str) != null) {
            return y42.a(q01Var);
        }
        String strValueOf = String.valueOf(str);
        return y42.b(new Exception(strValueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(strValueOf) : new String("URL to be removed not found for cache key: ")));
    }

    public final g52<InputStream> L4(ql qlVar, int i2) {
        ve veVarA = zzs.zzp().a(this.f9606e, kr.c());
        if (!u5.a.e().booleanValue()) {
            return y42.b(new Exception("Signal collection disabled."));
        }
        th1 th1VarA = this.f9609h.a(qlVar, i2);
        final eh1<JSONObject> eh1VarB = th1VarA.b();
        return th1VarA.c().a(lt1.GET_SIGNALS, y42.a(qlVar.f8401e)).c(new e42(eh1VarB) { // from class: com.google.android.gms.internal.ads.o01
            private final eh1 a;

            {
                this.a = eh1VarB;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.a(zzs.zzc().zzh((Bundle) obj));
            }
        }).j(lt1.JS_SIGNALS).c(veVarA.a("google.afma.request.getSignals", se.f8855b, se.f8856c)).i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream M4(g52 g52Var, g52 g52Var2) {
        String strI = ((tl) g52Var.get()).i();
        this.f9610i.put(strI, new s01((tl) g52Var.get(), (JSONObject) g52Var2.get()));
        return new ByteArrayInputStream(strI.getBytes(u02.f9331c));
    }

    @Override // com.google.android.gms.internal.ads.hl
    public final void i3(String str, ll llVar) {
        P4(K4(str), llVar);
    }

    @Override // com.google.android.gms.internal.ads.hl
    public final void p0(ql qlVar, ll llVar) {
        P4(L4(qlVar, Binder.getCallingUid()), llVar);
    }

    @Override // com.google.android.gms.internal.ads.hl
    public final void s4(ql qlVar, ll llVar) {
        g52<InputStream> g52VarI4 = I4(qlVar, Binder.getCallingUid());
        P4(g52VarI4, llVar);
        g52VarI4.zze(new Runnable(this) { // from class: com.google.android.gms.internal.ads.m01

            /* renamed from: e, reason: collision with root package name */
            private final v01 f7391e;

            {
                this.f7391e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7391e.zzk();
            }
        }, this.f9607f);
    }

    final /* synthetic */ void zzk() {
        tr.a(this.f9608g.a(), "persistFlags");
    }
}