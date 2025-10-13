package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qw0 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f8504f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference<Context> f8505g;

    /* renamed from: h, reason: collision with root package name */
    private final js0 f8506h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f8507i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f8508j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f8509k;

    /* renamed from: l, reason: collision with root package name */
    private final wu0 f8510l;

    /* renamed from: m, reason: collision with root package name */
    private final kr f8511m;
    private final zg0 o;
    private boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8500b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8501c = false;

    /* renamed from: e, reason: collision with root package name */
    private final wr<Boolean> f8503e = new wr<>();
    private final Map<String, xb> n = new ConcurrentHashMap();
    private boolean p = true;

    /* renamed from: d, reason: collision with root package name */
    private final long f8502d = zzs.zzj().c();

    public qw0(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, js0 js0Var, ScheduledExecutorService scheduledExecutorService, wu0 wu0Var, kr krVar, zg0 zg0Var) {
        this.f8506h = js0Var;
        this.f8504f = context;
        this.f8505g = weakReference;
        this.f8507i = executor2;
        this.f8509k = scheduledExecutorService;
        this.f8508j = executor;
        this.f8510l = wu0Var;
        this.f8511m = krVar;
        this.o = zg0Var;
        u("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* synthetic */ boolean l(qw0 qw0Var, boolean z) {
        qw0Var.f8501c = true;
        return true;
    }

    static /* synthetic */ void q(final qw0 qw0Var, String str) throws JSONException {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final Object obj = new Object();
                final wr wrVar = new wr();
                g52 g52VarG = y42.g(wrVar, ((Long) c.c().b(w3.h1)).longValue(), TimeUnit.SECONDS, qw0Var.f8509k);
                qw0Var.f8510l.a(next);
                qw0Var.o.zza(next);
                final long jC = zzs.zzj().c();
                Iterator<String> it = itKeys;
                g52VarG.zze(new Runnable(qw0Var, obj, wrVar, next, jC) { // from class: com.google.android.gms.internal.ads.jw0

                    /* renamed from: e, reason: collision with root package name */
                    private final qw0 f6865e;

                    /* renamed from: f, reason: collision with root package name */
                    private final Object f6866f;

                    /* renamed from: g, reason: collision with root package name */
                    private final wr f6867g;

                    /* renamed from: h, reason: collision with root package name */
                    private final String f6868h;

                    /* renamed from: i, reason: collision with root package name */
                    private final long f6869i;

                    {
                        this.f6865e = qw0Var;
                        this.f6866f = obj;
                        this.f6867g = wrVar;
                        this.f6868h = next;
                        this.f6869i = jC;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6865e.h(this.f6866f, this.f6867g, this.f6868h, this.f6869i);
                    }
                }, qw0Var.f8507i);
                arrayList.add(g52VarG);
                final pw0 pw0Var = new pw0(qw0Var, obj, next, jC, wrVar);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new hc(strOptString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                qw0Var.u(next, false, "", 0);
                try {
                    try {
                        final hq1 hq1VarB = qw0Var.f8506h.b(next, new JSONObject());
                        qw0Var.f8508j.execute(new Runnable(qw0Var, hq1VarB, pw0Var, arrayList2, next) { // from class: com.google.android.gms.internal.ads.lw0

                            /* renamed from: e, reason: collision with root package name */
                            private final qw0 f7344e;

                            /* renamed from: f, reason: collision with root package name */
                            private final hq1 f7345f;

                            /* renamed from: g, reason: collision with root package name */
                            private final bc f7346g;

                            /* renamed from: h, reason: collision with root package name */
                            private final List f7347h;

                            /* renamed from: i, reason: collision with root package name */
                            private final String f7348i;

                            {
                                this.f7344e = qw0Var;
                                this.f7345f = hq1VarB;
                                this.f7346g = pw0Var;
                                this.f7347h = arrayList2;
                                this.f7348i = next;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f7344e.f(this.f7345f, this.f7346g, this.f7347h, this.f7348i);
                            }
                        });
                    } catch (RemoteException e2) {
                        er.zzg("", e2);
                    }
                } catch (vp1 unused2) {
                    pw0Var.b("Failed to create Adapter.");
                }
                itKeys = it;
            }
            y42.l(arrayList).a(new Callable(qw0Var) { // from class: com.google.android.gms.internal.ads.kw0
                private final qw0 a;

                {
                    this.a = qw0Var;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.a.g();
                    return null;
                }
            }, qw0Var.f8507i);
        } catch (JSONException e3) {
            zze.zzb("Malformed CLD response", e3);
        }
    }

    private final synchronized g52<String> t() {
        String strD = zzs.zzg().l().zzn().d();
        if (!TextUtils.isEmpty(strD)) {
            return y42.a(strD);
        }
        final wr wrVar = new wr();
        zzs.zzg().l().zzo(new Runnable(this, wrVar) { // from class: com.google.android.gms.internal.ads.hw0

            /* renamed from: e, reason: collision with root package name */
            private final qw0 f6417e;

            /* renamed from: f, reason: collision with root package name */
            private final wr f6418f;

            {
                this.f6417e = this;
                this.f6418f = wrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6417e.j(this.f6418f);
            }
        });
        return wrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(String str, boolean z, String str2, int i2) {
        this.n.put(str, new xb(str, z, i2, str2));
    }

    public final void a() {
        this.p = false;
    }

    public final void b(final ec ecVar) {
        this.f8503e.zze(new Runnable(this, ecVar) { // from class: com.google.android.gms.internal.ads.ew0

            /* renamed from: e, reason: collision with root package name */
            private final qw0 f5728e;

            /* renamed from: f, reason: collision with root package name */
            private final ec f5729f;

            {
                this.f5728e = this;
                this.f5729f = ecVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                qw0 qw0Var = this.f5728e;
                try {
                    this.f5729f.t3(qw0Var.d());
                } catch (RemoteException e2) {
                    er.zzg("", e2);
                }
            }
        }, this.f8508j);
    }

    public final void c() {
        if (!o5.a.e().booleanValue()) {
            if (this.f8511m.f7056g >= ((Integer) c.c().b(w3.g1)).intValue() && this.p) {
                if (this.a) {
                    return;
                }
                synchronized (this) {
                    if (this.a) {
                        return;
                    }
                    this.f8510l.d();
                    this.o.zzd();
                    this.f8503e.zze(new Runnable(this) { // from class: com.google.android.gms.internal.ads.fw0

                        /* renamed from: e, reason: collision with root package name */
                        private final qw0 f5965e;

                        {
                            this.f5965e = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f5965e.k();
                        }
                    }, this.f8507i);
                    this.a = true;
                    g52<String> g52VarT = t();
                    this.f8509k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.iw0

                        /* renamed from: e, reason: collision with root package name */
                        private final qw0 f6624e;

                        {
                            this.f6624e = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6624e.i();
                        }
                    }, ((Long) c.c().b(w3.i1)).longValue(), TimeUnit.SECONDS);
                    y42.o(g52VarT, new ow0(this), this.f8507i);
                    return;
                }
            }
        }
        if (this.a) {
            return;
        }
        u("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f8503e.zzc(Boolean.FALSE);
        this.a = true;
        this.f8500b = true;
    }

    public final List<xb> d() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.n.keySet()) {
            xb xbVar = this.n.get(str);
            arrayList.add(new xb(str, xbVar.f10150f, xbVar.f10151g, xbVar.f10152h));
        }
        return arrayList;
    }

    public final boolean e() {
        return this.f8500b;
    }

    final /* synthetic */ void f(hq1 hq1Var, bc bcVar, List list, String str) {
        try {
            try {
                Context context = this.f8505g.get();
                if (context == null) {
                    context = this.f8504f;
                }
                hq1Var.B(context, bcVar, list);
            } catch (RemoteException e2) {
                er.zzg("", e2);
            }
        } catch (vp1 unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            bcVar.b(sb.toString());
        }
    }

    final /* synthetic */ Object g() {
        this.f8503e.zzc(Boolean.TRUE);
        return null;
    }

    final /* synthetic */ void h(Object obj, wr wrVar, String str, long j2) {
        synchronized (obj) {
            if (!wrVar.isDone()) {
                u(str, false, "Timeout.", (int) (zzs.zzj().c() - j2));
                this.f8510l.c(str, "timeout");
                this.o.j0(str, "timeout");
                wrVar.zzc(Boolean.FALSE);
            }
        }
    }

    final /* synthetic */ void i() {
        synchronized (this) {
            if (this.f8501c) {
                return;
            }
            u("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzs.zzj().c() - this.f8502d));
            this.f8503e.zzd(new Exception());
        }
    }

    final /* synthetic */ void j(final wr wrVar) {
        this.f8507i.execute(new Runnable(this, wrVar) { // from class: com.google.android.gms.internal.ads.mw0

            /* renamed from: e, reason: collision with root package name */
            private final qw0 f7571e;

            /* renamed from: f, reason: collision with root package name */
            private final wr f7572f;

            {
                this.f7571e = this;
                this.f7572f = wrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wr wrVar2 = this.f7572f;
                String strD = zzs.zzg().l().zzn().d();
                if (TextUtils.isEmpty(strD)) {
                    wrVar2.zzd(new Exception());
                } else {
                    wrVar2.zzc(strD);
                }
            }
        });
    }

    final /* synthetic */ void k() {
        this.f8510l.e();
        this.o.zze();
        this.f8500b = true;
    }
}