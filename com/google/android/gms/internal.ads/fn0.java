package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fn0 {
    private final vr0 a;

    /* renamed from: b, reason: collision with root package name */
    private final pq0 f5901b;

    /* renamed from: c, reason: collision with root package name */
    private final j30 f5902c;

    /* renamed from: d, reason: collision with root package name */
    private final cm0 f5903d;

    public fn0(vr0 vr0Var, pq0 pq0Var, j30 j30Var, cm0 cm0Var) {
        this.a = vr0Var;
        this.f5901b = pq0Var;
        this.f5902c = j30Var;
        this.f5903d = cm0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a() {
        ew ewVarA = this.a.a(r93.I(), null, null);
        ((View) ewVarA).setVisibility(8);
        ewVarA.T("/sendMessageToSdk", new ba(this) { // from class: com.google.android.gms.internal.ads.zm0
            private final fn0 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                this.a.f((ew) obj, map);
            }
        });
        ewVarA.T("/adMuted", new ba(this) { // from class: com.google.android.gms.internal.ads.an0
            private final fn0 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                this.a.e((ew) obj, map);
            }
        });
        this.f5901b.h(new WeakReference(ewVarA), "/loadHtml", new ba(this) { // from class: com.google.android.gms.internal.ads.bn0
            private final fn0 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, final Map map) {
                final fn0 fn0Var = this.a;
                ew ewVar = (ew) obj;
                ewVar.E0().i0(new rx(fn0Var, map) { // from class: com.google.android.gms.internal.ads.en0

                    /* renamed from: e, reason: collision with root package name */
                    private final fn0 f5669e;

                    /* renamed from: f, reason: collision with root package name */
                    private final Map f5670f;

                    {
                        this.f5669e = fn0Var;
                        this.f5670f = map;
                    }

                    @Override // com.google.android.gms.internal.ads.rx
                    public final void zza(boolean z) {
                        this.f5669e.d(this.f5670f, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    ewVar.loadData(str, "text/html", "UTF-8");
                } else {
                    ewVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f5901b.h(new WeakReference(ewVarA), "/showOverlay", new ba(this) { // from class: com.google.android.gms.internal.ads.cn0
            private final fn0 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                this.a.c((ew) obj, map);
            }
        });
        this.f5901b.h(new WeakReference(ewVarA), "/hideOverlay", new ba(this) { // from class: com.google.android.gms.internal.ads.dn0
            private final fn0 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                this.a.b((ew) obj, map);
            }
        });
        return (View) ewVarA;
    }

    final /* synthetic */ void b(ew ewVar, Map map) {
        er.zzh("Hiding native ads overlay.");
        ewVar.n().setVisibility(8);
        this.f5902c.d(false);
    }

    final /* synthetic */ void c(ew ewVar, Map map) {
        er.zzh("Showing native ads overlay.");
        ewVar.n().setVisibility(0);
        this.f5902c.d(true);
    }

    final /* synthetic */ void d(Map map, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f5901b.f("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void e(ew ewVar, Map map) {
        this.f5903d.zzs();
    }

    final /* synthetic */ void f(ew ewVar, Map map) {
        this.f5901b.f("sendMessageToNativeJs", map);
    }
}