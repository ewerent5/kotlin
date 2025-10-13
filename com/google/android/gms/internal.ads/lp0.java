package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lp0 {
    private final qp1 a;

    /* renamed from: b */
    private final Executor f7289b;

    /* renamed from: c */
    private final vr0 f7290c;

    public lp0(qp1 qp1Var, Executor executor, vr0 vr0Var) {
        this.a = qp1Var;
        this.f7289b = executor;
        this.f7290c = vr0Var;
    }

    private final void h(ew ewVar) {
        ewVar.T("/video", aa.f4880m);
        ewVar.T("/videoMeta", aa.n);
        ewVar.T("/precache", new mv());
        ewVar.T("/delayPageLoaded", aa.q);
        ewVar.T("/instrument", aa.o);
        ewVar.T("/log", aa.f4875h);
        ewVar.T("/videoClicked", aa.f4876i);
        ewVar.E0().x0(true);
        ewVar.T("/click", aa.f4871d);
        if (((Boolean) c.c().b(w3.Z1)).booleanValue()) {
            ewVar.T("/getNativeAdViewSignals", aa.t);
        }
        if (this.a.f8425b != null) {
            ewVar.E0().Z(true);
            ewVar.T("/open", new na(null, null, null, null, null));
        } else {
            ewVar.E0().Z(false);
        }
        if (zzs.zzA().g(ewVar.getContext())) {
            ewVar.T("/logScionEvent", new ha(ewVar.getContext()));
        }
    }

    public final g52<ew> a(final JSONObject jSONObject) {
        return y42.h(y42.h(y42.a(null), new e42(this) { // from class: com.google.android.gms.internal.ads.cp0
            private final lp0 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.c(obj);
            }
        }, this.f7289b), new e42(this, jSONObject) { // from class: com.google.android.gms.internal.ads.ap0
            private final lp0 a;

            /* renamed from: b, reason: collision with root package name */
            private final JSONObject f4966b;

            {
                this.a = this;
                this.f4966b = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.f(this.f4966b, (ew) obj);
            }
        }, this.f7289b);
    }

    public final g52<ew> b(final String str, final String str2) {
        return y42.h(y42.a(null), new e42(this, str, str2) { // from class: com.google.android.gms.internal.ads.bp0
            private final lp0 a;

            /* renamed from: b, reason: collision with root package name */
            private final String f5162b;

            /* renamed from: c, reason: collision with root package name */
            private final String f5163c;

            {
                this.a = this;
                this.f5162b = str;
                this.f5163c = str2;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.d(this.f5162b, this.f5163c, obj);
            }
        }, this.f7289b);
    }

    final /* synthetic */ g52 c(Object obj) {
        ew ewVarA = this.f7290c.a(r93.I(), null, null);
        final vr vrVarB = vr.b(ewVarA);
        h(ewVarA);
        ewVarA.E0().d0(new sx(vrVarB) { // from class: com.google.android.gms.internal.ads.dp0
            private final vr a;

            {
                this.a = vrVarB;
            }

            @Override // com.google.android.gms.internal.ads.sx
            public final void zzb() {
                this.a.c();
            }
        });
        ewVarA.loadUrl((String) c.c().b(w3.Y1));
        return vrVarB;
    }

    final /* synthetic */ g52 d(String str, String str2, Object obj) {
        final ew ewVarA = this.f7290c.a(r93.I(), null, null);
        final vr vrVarB = vr.b(ewVarA);
        h(ewVarA);
        if (this.a.f8425b != null) {
            ewVarA.p0(vx.e());
        } else {
            ewVarA.p0(vx.d());
        }
        ewVarA.E0().i0(new rx(this, ewVarA, vrVarB) { // from class: com.google.android.gms.internal.ads.ep0

            /* renamed from: e, reason: collision with root package name */
            private final lp0 f5681e;

            /* renamed from: f, reason: collision with root package name */
            private final ew f5682f;

            /* renamed from: g, reason: collision with root package name */
            private final vr f5683g;

            {
                this.f5681e = this;
                this.f5682f = ewVarA;
                this.f5683g = vrVarB;
            }

            @Override // com.google.android.gms.internal.ads.rx
            public final void zza(boolean z) {
                this.f5681e.e(this.f5682f, this.f5683g, z);
            }
        });
        ewVarA.A0(str, str2, null);
        return vrVarB;
    }

    final /* synthetic */ void e(ew ewVar, vr vrVar, boolean z) {
        if (!z) {
            vrVar.zzd(new e71(1, "Instream video Web View failed to load."));
            return;
        }
        if (this.a.a != null && ewVar.zzh() != null) {
            ewVar.zzh().J4(this.a.a);
        }
        vrVar.c();
    }

    final /* synthetic */ g52 f(JSONObject jSONObject, final ew ewVar) {
        final vr vrVarB = vr.b(ewVar);
        if (this.a.f8425b != null) {
            ewVar.p0(vx.e());
        } else {
            ewVar.p0(vx.d());
        }
        ewVar.E0().i0(new rx(this, ewVar, vrVarB) { // from class: com.google.android.gms.internal.ads.fp0

            /* renamed from: e, reason: collision with root package name */
            private final lp0 f5924e;

            /* renamed from: f, reason: collision with root package name */
            private final ew f5925f;

            /* renamed from: g, reason: collision with root package name */
            private final vr f5926g;

            {
                this.f5924e = this;
                this.f5925f = ewVar;
                this.f5926g = vrVarB;
            }

            @Override // com.google.android.gms.internal.ads.rx
            public final void zza(boolean z) {
                this.f5924e.g(this.f5925f, this.f5926g, z);
            }
        });
        ewVar.j0("google.afma.nativeAds.renderVideo", jSONObject);
        return vrVarB;
    }

    final /* synthetic */ void g(ew ewVar, vr vrVar, boolean z) {
        if (this.a.a != null && ewVar.zzh() != null) {
            ewVar.zzh().J4(this.a.a);
        }
        vrVar.c();
    }
}