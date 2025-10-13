package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ur0 {
    private final oa0 a;

    /* renamed from: b */
    private final wb0 f9537b;

    /* renamed from: c */
    private final jc0 f9538c;

    /* renamed from: d */
    private final vc0 f9539d;

    /* renamed from: e */
    private final ef0 f9540e;

    /* renamed from: f */
    private final Executor f9541f;

    /* renamed from: g */
    private final ph0 f9542g;

    /* renamed from: h */
    private final y20 f9543h;

    /* renamed from: i */
    private final zzb f9544i;

    /* renamed from: j */
    private final ho f9545j;

    /* renamed from: k */
    private final ip2 f9546k;

    /* renamed from: l */
    private final ve0 f9547l;

    /* renamed from: m */
    private final x21 f9548m;
    private final vu1 n;
    private final nu0 o;
    private final cu1 p;

    public ur0(oa0 oa0Var, wb0 wb0Var, jc0 jc0Var, vc0 vc0Var, ef0 ef0Var, Executor executor, ph0 ph0Var, y20 y20Var, zzb zzbVar, ho hoVar, ip2 ip2Var, ve0 ve0Var, x21 x21Var, vu1 vu1Var, nu0 nu0Var, cu1 cu1Var) {
        this.a = oa0Var;
        this.f9537b = wb0Var;
        this.f9538c = jc0Var;
        this.f9539d = vc0Var;
        this.f9540e = ef0Var;
        this.f9541f = executor;
        this.f9542g = ph0Var;
        this.f9543h = y20Var;
        this.f9544i = zzbVar;
        this.f9545j = hoVar;
        this.f9546k = ip2Var;
        this.f9547l = ve0Var;
        this.f9548m = x21Var;
        this.n = vu1Var;
        this.o = nu0Var;
        this.p = cu1Var;
    }

    public static final g52<?> j(ew ewVar, String str, String str2) {
        final wr wrVar = new wr();
        ewVar.E0().i0(new rx(wrVar) { // from class: com.google.android.gms.internal.ads.sr0

            /* renamed from: e, reason: collision with root package name */
            private final wr f8966e;

            {
                this.f8966e = wrVar;
            }

            @Override // com.google.android.gms.internal.ads.rx
            public final void zza(boolean z) {
                wr wrVar2 = this.f8966e;
                if (z) {
                    wrVar2.zzc(null);
                } else {
                    wrVar2.zzd(new Exception("Ad Web View failed to load."));
                }
            }
        });
        ewVar.A0(str, str2, null);
        return wrVar;
    }

    final /* synthetic */ void a(ew ewVar, ew ewVar2, Map map) {
        this.f9543h.f(ewVar);
    }

    final /* synthetic */ void b(View view) {
        this.f9544i.zza();
    }

    final /* synthetic */ boolean c(View view, MotionEvent motionEvent) {
        this.f9544i.zza();
        return false;
    }

    final /* synthetic */ void d() {
        this.f9537b.K0();
    }

    final /* synthetic */ void e(String str, String str2) {
        this.f9540e.G(str, str2);
    }

    final /* synthetic */ void f() {
        this.a.onAdClicked();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(final ew ewVar, boolean z, ea eaVar) {
        zm2 zm2VarB;
        ewVar.E0().z0(new c93(this) { // from class: com.google.android.gms.internal.ads.lr0

            /* renamed from: e, reason: collision with root package name */
            private final ur0 f7296e;

            {
                this.f7296e = this;
            }

            @Override // com.google.android.gms.internal.ads.c93
            public final void onAdClicked() {
                this.f7296e.f();
            }
        }, this.f9538c, this.f9539d, new d9(this) { // from class: com.google.android.gms.internal.ads.mr0

            /* renamed from: e, reason: collision with root package name */
            private final ur0 f7530e;

            {
                this.f7530e = this;
            }

            @Override // com.google.android.gms.internal.ads.d9
            public final void G(String str, String str2) {
                this.f7530e.e(str, str2);
            }
        }, new zzw(this) { // from class: com.google.android.gms.internal.ads.nr0

            /* renamed from: e, reason: collision with root package name */
            private final ur0 f7790e;

            {
                this.f7790e = this;
            }

            @Override // com.google.android.gms.ads.internal.overlay.zzw
            public final void zzf() {
                this.f7790e.d();
            }
        }, z, eaVar, this.f9544i, new tr0(this), this.f9545j, this.f9548m, this.n, this.o, this.p, null);
        ewVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.google.android.gms.internal.ads.or0

            /* renamed from: e, reason: collision with root package name */
            private final ur0 f8005e;

            {
                this.f8005e = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f8005e.c(view, motionEvent);
                return false;
            }
        });
        ewVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.gms.internal.ads.pr0

            /* renamed from: e, reason: collision with root package name */
            private final ur0 f8252e;

            {
                this.f8252e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8252e.b(view);
            }
        });
        if (((Boolean) c.c().b(w3.D1)).booleanValue() && (zm2VarB = this.f9546k.b()) != null) {
            zm2VarB.zzj((View) ewVar);
        }
        this.f9542g.H0(ewVar, this.f9541f);
        this.f9542g.H0(new v13(ewVar) { // from class: com.google.android.gms.internal.ads.qr0

            /* renamed from: e, reason: collision with root package name */
            private final ew f8452e;

            {
                this.f8452e = ewVar;
            }

            @Override // com.google.android.gms.internal.ads.v13
            public final void c0(u13 u13Var) {
                tx txVarE0 = this.f8452e.E0();
                Rect rect = u13Var.f9349d;
                txVarE0.g0(rect.left, rect.top, false);
            }
        }, this.f9541f);
        this.f9542g.K0((View) ewVar);
        ewVar.T("/trackActiveViewUnit", new ba(this, ewVar) { // from class: com.google.android.gms.internal.ads.rr0
            private final ur0 a;

            /* renamed from: b, reason: collision with root package name */
            private final ew f8712b;

            {
                this.a = this;
                this.f8712b = ewVar;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                this.a.a(this.f8712b, (ew) obj, map);
            }
        });
        this.f9543h.m(ewVar);
    }
}