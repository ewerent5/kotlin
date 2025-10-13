package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hg1 implements ah1<ig1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f6330b;

    /* renamed from: c, reason: collision with root package name */
    private final t91 f6331c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f6332d;

    /* renamed from: e, reason: collision with root package name */
    private final qp1 f6333e;

    /* renamed from: f, reason: collision with root package name */
    private final o91 f6334f;

    /* renamed from: g, reason: collision with root package name */
    final String f6335g;

    public hg1(h52 h52Var, ScheduledExecutorService scheduledExecutorService, String str, t91 t91Var, Context context, qp1 qp1Var, o91 o91Var) {
        this.a = h52Var;
        this.f6330b = scheduledExecutorService;
        this.f6335g = str;
        this.f6331c = t91Var;
        this.f6332d = context;
        this.f6333e = qp1Var;
        this.f6334f = o91Var;
    }

    final /* synthetic */ g52 a(String str, List list, Bundle bundle) {
        wr wrVar = new wr();
        this.f6334f.a(str);
        th thVarB = this.f6334f.b(str);
        Objects.requireNonNull(thVarB);
        thVarB.j1(e.c.b.b.b.d.m4(this.f6332d), this.f6335g, bundle, (Bundle) list.get(0), this.f6333e.f8428e, new x91(str, thVarB, wrVar));
        return wrVar;
    }

    final /* bridge */ /* synthetic */ g52 b() {
        Map<String, List<Bundle>> mapB = this.f6331c.b(this.f6335g, this.f6333e.f8429f);
        final ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Bundle>> entry : mapB.entrySet()) {
            final String key = entry.getKey();
            final List<Bundle> value = entry.getValue();
            Bundle bundle = this.f6333e.f8427d.q;
            final Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
            arrayList.add(y42.e((p42) y42.g(p42.D(y42.d(new d42(this, key, value, bundle2) { // from class: com.google.android.gms.internal.ads.eg1
                private final hg1 a;

                /* renamed from: b, reason: collision with root package name */
                private final String f5632b;

                /* renamed from: c, reason: collision with root package name */
                private final List f5633c;

                /* renamed from: d, reason: collision with root package name */
                private final Bundle f5634d;

                {
                    this.a = this;
                    this.f5632b = key;
                    this.f5633c = value;
                    this.f5634d = bundle2;
                }

                @Override // com.google.android.gms.internal.ads.d42
                public final g52 zza() {
                    return this.a.a(this.f5632b, this.f5633c, this.f5634d);
                }
            }, this.a)), ((Long) c.c().b(w3.X0)).longValue(), TimeUnit.MILLISECONDS, this.f6330b), Throwable.class, new x02(key) { // from class: com.google.android.gms.internal.ads.fg1
                private final String a;

                {
                    this.a = key;
                }

                @Override // com.google.android.gms.internal.ads.x02
                public final Object apply(Object obj) {
                    String strValueOf = String.valueOf(this.a);
                    er.zzf(strValueOf.length() != 0 ? "Error calling adapter: ".concat(strValueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, this.a));
        }
        return y42.n(arrayList).a(new Callable(arrayList) { // from class: com.google.android.gms.internal.ads.gg1
            private final List a;

            {
                this.a = arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<g52> list = this.a;
                JSONArray jSONArray = new JSONArray();
                for (g52 g52Var : list) {
                    if (((JSONObject) g52Var.get()) != null) {
                        jSONArray.put(g52Var.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new ig1(jSONArray.toString());
            }
        }, this.a);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<ig1> zza() {
        return y42.d(new d42(this) { // from class: com.google.android.gms.internal.ads.dg1
            private final hg1 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.d42
            public final g52 zza() {
                return this.a.b();
            }
        }, this.a);
    }
}