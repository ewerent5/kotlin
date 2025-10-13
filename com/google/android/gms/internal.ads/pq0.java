package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pq0 {

    /* renamed from: b, reason: collision with root package name */
    private final zza f8239b;

    /* renamed from: c, reason: collision with root package name */
    private final qw f8240c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f8241d;

    /* renamed from: e, reason: collision with root package name */
    private final nu0 f8242e;

    /* renamed from: f, reason: collision with root package name */
    private final cu1 f8243f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f8244g;

    /* renamed from: h, reason: collision with root package name */
    private final ip2 f8245h;

    /* renamed from: i, reason: collision with root package name */
    private final kr f8246i;

    /* renamed from: k, reason: collision with root package name */
    private final x21 f8248k;

    /* renamed from: l, reason: collision with root package name */
    private final vu1 f8249l;

    /* renamed from: m, reason: collision with root package name */
    private g52<ew> f8250m;
    private final kq0 a = new kq0(null);

    /* renamed from: j, reason: collision with root package name */
    private final qa f8247j = new qa();

    pq0(nq0 nq0Var) {
        this.f8241d = nq0Var.f7772c;
        this.f8244g = nq0Var.f7776g;
        this.f8245h = nq0Var.f7777h;
        this.f8246i = nq0Var.f7778i;
        this.f8239b = nq0Var.a;
        this.f8240c = nq0Var.f7771b;
        this.f8248k = nq0Var.f7775f;
        this.f8249l = nq0Var.f7779j;
        this.f8242e = nq0Var.f7773d;
        this.f8243f = nq0Var.f7774e;
    }

    public final synchronized void a() {
        g52<ew> g52VarI = y42.i(qw.b(this.f8241d, this.f8246i, (String) c.c().b(w3.X1), this.f8245h, this.f8239b), new x02(this) { // from class: com.google.android.gms.internal.ads.dq0
            private final pq0 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                ew ewVar = (ew) obj;
                this.a.j(ewVar);
                return ewVar;
            }
        }, this.f8244g);
        this.f8250m = g52VarI;
        tr.a(g52VarI, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void b() {
        g52<ew> g52Var = this.f8250m;
        if (g52Var == null) {
            return;
        }
        y42.o(g52Var, new fq0(this), this.f8244g);
        this.f8250m = null;
    }

    public final synchronized g52<JSONObject> c(final String str, final JSONObject jSONObject) {
        g52<ew> g52Var = this.f8250m;
        if (g52Var == null) {
            return y42.a(null);
        }
        return y42.h(g52Var, new e42(this, str, jSONObject) { // from class: com.google.android.gms.internal.ads.eq0
            private final pq0 a;

            /* renamed from: b, reason: collision with root package name */
            private final String f5685b;

            /* renamed from: c, reason: collision with root package name */
            private final JSONObject f5686c;

            {
                this.a = this;
                this.f5685b = str;
                this.f5686c = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.i(this.f5685b, this.f5686c, (ew) obj);
            }
        }, this.f8244g);
    }

    public final synchronized void d(String str, ba<Object> baVar) {
        g52<ew> g52Var = this.f8250m;
        if (g52Var == null) {
            return;
        }
        y42.o(g52Var, new gq0(this, str, baVar), this.f8244g);
    }

    public final synchronized void e(String str, ba<Object> baVar) {
        g52<ew> g52Var = this.f8250m;
        if (g52Var == null) {
            return;
        }
        y42.o(g52Var, new hq0(this, str, baVar), this.f8244g);
    }

    public final synchronized void f(String str, Map<String, ?> map) {
        g52<ew> g52Var = this.f8250m;
        if (g52Var == null) {
            return;
        }
        y42.o(g52Var, new iq0(this, "sendMessageToNativeJs", map), this.f8244g);
    }

    public final synchronized void g(xo1 xo1Var, ap1 ap1Var) {
        g52<ew> g52Var = this.f8250m;
        if (g52Var == null) {
            return;
        }
        y42.o(g52Var, new jq0(this, xo1Var, ap1Var), this.f8244g);
    }

    public final <T> void h(WeakReference<T> weakReference, String str, ba<T> baVar) {
        d(str, new oq0(this, weakReference, str, baVar, null));
    }

    final /* synthetic */ g52 i(String str, JSONObject jSONObject, ew ewVar) {
        return this.f8247j.c(ewVar, str, jSONObject);
    }

    final /* synthetic */ ew j(ew ewVar) {
        ewVar.T("/result", this.f8247j);
        tx txVarE0 = ewVar.E0();
        kq0 kq0Var = this.a;
        txVarE0.z0(null, kq0Var, kq0Var, kq0Var, kq0Var, false, null, new zzb(this.f8241d, null, null), null, null, this.f8248k, this.f8249l, this.f8242e, this.f8243f, null);
        return ewVar;
    }
}