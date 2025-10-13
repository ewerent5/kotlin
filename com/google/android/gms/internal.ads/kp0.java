package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kp0 {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final j30 f7033b;

    /* renamed from: c, reason: collision with root package name */
    private final ph0 f7034c;

    kp0(Executor executor, j30 j30Var, ph0 ph0Var) {
        this.a = executor;
        this.f7034c = ph0Var;
        this.f7033b = j30Var;
    }

    public final void a(final ew ewVar) {
        if (ewVar == null) {
            return;
        }
        this.f7034c.K0(ewVar.n());
        this.f7034c.H0(new v13(ewVar) { // from class: com.google.android.gms.internal.ads.gp0

            /* renamed from: e, reason: collision with root package name */
            private final ew f6154e;

            {
                this.f6154e = ewVar;
            }

            @Override // com.google.android.gms.internal.ads.v13
            public final void c0(u13 u13Var) {
                tx txVarE0 = this.f6154e.E0();
                Rect rect = u13Var.f9349d;
                txVarE0.g0(rect.left, rect.top, false);
            }
        }, this.a);
        this.f7034c.H0(new v13(ewVar) { // from class: com.google.android.gms.internal.ads.hp0

            /* renamed from: e, reason: collision with root package name */
            private final ew f6368e;

            {
                this.f6368e = ewVar;
            }

            @Override // com.google.android.gms.internal.ads.v13
            public final void c0(u13 u13Var) {
                ew ewVar2 = this.f6368e;
                HashMap map = new HashMap();
                map.put("isVisible", true != u13Var.f9355j ? "0" : "1");
                ewVar2.e0("onAdVisibilityChanged", map);
            }
        }, this.a);
        this.f7034c.H0(this.f7033b, this.a);
        this.f7033b.a(ewVar);
        ewVar.T("/trackActiveViewUnit", new ba(this) { // from class: com.google.android.gms.internal.ads.ip0
            private final kp0 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                this.a.c((ew) obj, map);
            }
        });
        ewVar.T("/untrackActiveViewUnit", new ba(this) { // from class: com.google.android.gms.internal.ads.jp0
            private final kp0 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                this.a.b((ew) obj, map);
            }
        });
    }

    final /* synthetic */ void b(ew ewVar, Map map) {
        this.f7033b.b();
    }

    final /* synthetic */ void c(ew ewVar, Map map) {
        this.f7033b.c();
    }
}