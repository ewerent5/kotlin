package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ph0 extends sf0<v13> implements v13 {

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    private final Map<View, w13> f8156f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f8157g;

    /* renamed from: h, reason: collision with root package name */
    private final xo1 f8158h;

    public ph0(Context context, Set<nh0<v13>> set, xo1 xo1Var) {
        super(set);
        this.f8156f = new WeakHashMap(1);
        this.f8157g = context;
        this.f8158h = xo1Var;
    }

    public final synchronized void K0(View view) {
        w13 w13Var = this.f8156f.get(view);
        if (w13Var == null) {
            w13Var = new w13(this.f8157g, view);
            w13Var.a(this);
            this.f8156f.put(view, w13Var);
        }
        if (this.f8158h.R) {
            if (((Boolean) c.c().b(w3.S0)).booleanValue()) {
                w13Var.d(((Long) c.c().b(w3.R0)).longValue());
                return;
            }
        }
        w13Var.e();
    }

    public final synchronized void L0(View view) {
        if (this.f8156f.containsKey(view)) {
            this.f8156f.get(view).b(this);
            this.f8156f.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.v13
    public final synchronized void c0(final u13 u13Var) {
        J0(new rf0(u13Var) { // from class: com.google.android.gms.internal.ads.oh0
            private final u13 a;

            {
                this.a = u13Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((v13) obj).c0(this.a);
            }
        });
    }
}