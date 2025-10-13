package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzs;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class y40 {
    private final q60 a;

    /* renamed from: b, reason: collision with root package name */
    private final View f10363b;

    /* renamed from: c, reason: collision with root package name */
    private final yo1 f10364c;

    /* renamed from: d, reason: collision with root package name */
    private final ew f10365d;

    public y40(View view, ew ewVar, q60 q60Var, yo1 yo1Var) {
        this.f10363b = view;
        this.f10365d = ewVar;
        this.a = q60Var;
        this.f10364c = yo1Var;
    }

    public static final nh0<dc0> f(final Context context, final kr krVar, final xo1 xo1Var, final qp1 qp1Var) {
        return new nh0<>(new dc0(context, krVar, xo1Var, qp1Var) { // from class: com.google.android.gms.internal.ads.w40

            /* renamed from: e, reason: collision with root package name */
            private final Context f9883e;

            /* renamed from: f, reason: collision with root package name */
            private final kr f9884f;

            /* renamed from: g, reason: collision with root package name */
            private final xo1 f9885g;

            /* renamed from: h, reason: collision with root package name */
            private final qp1 f9886h;

            {
                this.f9883e = context;
                this.f9884f = krVar;
                this.f9885g = xo1Var;
                this.f9886h = qp1Var;
            }

            @Override // com.google.android.gms.internal.ads.dc0
            public final void b0() {
                zzs.zzm().zzc(this.f9883e, this.f9884f.f7054e, this.f9885g.B.toString(), this.f9886h.f8429f);
            }
        }, qr.f8451f);
    }

    public static final Set<nh0<dc0>> g(k60 k60Var) {
        return Collections.singleton(new nh0(k60Var, qr.f8451f));
    }

    public static final nh0<dc0> h(i60 i60Var) {
        return new nh0<>(i60Var, qr.f8450e);
    }

    public final ew a() {
        return this.f10365d;
    }

    public final View b() {
        return this.f10363b;
    }

    public final q60 c() {
        return this.a;
    }

    public final yo1 d() {
        return this.f10364c;
    }

    public bc0 e(Set<nh0<dc0>> set) {
        return new bc0(set);
    }
}