package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class y81 implements j31<r40> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final p50 f10389b;

    /* renamed from: c, reason: collision with root package name */
    private final s4 f10390c;

    /* renamed from: d, reason: collision with root package name */
    private final h52 f10391d;

    /* renamed from: e, reason: collision with root package name */
    private final st1 f10392e;

    public y81(Context context, p50 p50Var, st1 st1Var, h52 h52Var, s4 s4Var) {
        this.a = context;
        this.f10389b = p50Var;
        this.f10392e = st1Var;
        this.f10391d = h52Var;
        this.f10390c = s4Var;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<r40> a(kp1 kp1Var, xo1 xo1Var) {
        s40 s40VarD = this.f10389b.d(new i70(kp1Var, xo1Var, null), new w81(this, new View(this.a), null, u81.a, xo1Var.t.get(0)));
        x81 x81VarK = s40VarD.k();
        cp1 cp1Var = xo1Var.r;
        final n4 n4Var = new n4(x81VarK, cp1Var.f5346b, cp1Var.a);
        st1 st1Var = this.f10392e;
        return ct1.d(new ws1(this, n4Var) { // from class: com.google.android.gms.internal.ads.v81
            private final y81 a;

            /* renamed from: b, reason: collision with root package name */
            private final n4 f9671b;

            {
                this.a = this;
                this.f9671b = n4Var;
            }

            @Override // com.google.android.gms.internal.ads.ws1
            public final void zza() {
                this.a.c(this.f9671b);
            }
        }, this.f10391d, lt1.CUSTOM_RENDER_SYN, st1Var).j(lt1.CUSTOM_RENDER_ACK).e(y42.a(s40VarD.h())).i();
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        cp1 cp1Var;
        return (this.f10390c == null || (cp1Var = xo1Var.r) == null || cp1Var.a == null) ? false : true;
    }

    final /* synthetic */ void c(n4 n4Var) {
        this.f10390c.u4(n4Var);
    }
}