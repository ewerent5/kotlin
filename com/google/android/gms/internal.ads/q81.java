package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zb0;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q81<AdT, AdapterT, ListenerT extends zb0> implements j31<AdT> {
    private final l31<AdapterT, ListenerT> a;

    /* renamed from: b, reason: collision with root package name */
    private final s31<AdT, AdapterT, ListenerT> f8344b;

    /* renamed from: c, reason: collision with root package name */
    private final st1 f8345c;

    /* renamed from: d, reason: collision with root package name */
    private final h52 f8346d;

    public q81(st1 st1Var, h52 h52Var, l31<AdapterT, ListenerT> l31Var, s31<AdT, AdapterT, ListenerT> s31Var) {
        this.f8345c = st1Var;
        this.f8346d = h52Var;
        this.f8344b = s31Var;
        this.a = l31Var;
    }

    static final String e(String str, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<AdT> a(final kp1 kp1Var, final xo1 xo1Var) {
        final m31<AdapterT, ListenerT> m31VarA;
        Iterator<String> it = xo1Var.s.iterator();
        while (true) {
            if (!it.hasNext()) {
                m31VarA = null;
                break;
            }
            try {
                m31VarA = this.a.a(it.next(), xo1Var.u);
                break;
            } catch (vp1 unused) {
            }
        }
        if (m31VarA == null) {
            return y42.b(new p61("Unable to instantiate mediation adapter class."));
        }
        wr wrVar = new wr();
        m31VarA.f7413c.m4(new p81(this, m31VarA, wrVar));
        if (xo1Var.H) {
            Bundle bundle = kp1Var.a.a.f8427d.q;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        st1 st1Var = this.f8345c;
        return ct1.d(new ws1(this, kp1Var, xo1Var, m31VarA) { // from class: com.google.android.gms.internal.ads.n81
            private final q81 a;

            /* renamed from: b, reason: collision with root package name */
            private final kp1 f7667b;

            /* renamed from: c, reason: collision with root package name */
            private final xo1 f7668c;

            /* renamed from: d, reason: collision with root package name */
            private final m31 f7669d;

            {
                this.a = this;
                this.f7667b = kp1Var;
                this.f7668c = xo1Var;
                this.f7669d = m31VarA;
            }

            @Override // com.google.android.gms.internal.ads.ws1
            public final void zza() {
                this.a.d(this.f7667b, this.f7668c, this.f7669d);
            }
        }, this.f8346d, lt1.ADAPTER_LOAD_AD_SYN, st1Var).j(lt1.ADAPTER_LOAD_AD_ACK).e(wrVar).j(lt1.ADAPTER_WRAP_ADAPTER).b(new vs1(this, kp1Var, xo1Var, m31VarA) { // from class: com.google.android.gms.internal.ads.o81
            private final q81 a;

            /* renamed from: b, reason: collision with root package name */
            private final kp1 f7925b;

            /* renamed from: c, reason: collision with root package name */
            private final xo1 f7926c;

            /* renamed from: d, reason: collision with root package name */
            private final m31 f7927d;

            {
                this.a = this;
                this.f7925b = kp1Var;
                this.f7926c = xo1Var;
                this.f7927d = m31VarA;
            }

            @Override // com.google.android.gms.internal.ads.vs1
            public final Object zza(Object obj) {
                return this.a.c(this.f7925b, this.f7926c, this.f7927d, (Void) obj);
            }
        }).i();
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        return !xo1Var.s.isEmpty();
    }

    final /* synthetic */ Object c(kp1 kp1Var, xo1 xo1Var, m31 m31Var, Void r4) {
        return this.f8344b.a(kp1Var, xo1Var, m31Var);
    }

    final /* synthetic */ void d(kp1 kp1Var, xo1 xo1Var, m31 m31Var) {
        this.f8344b.b(kp1Var, xo1Var, m31Var);
    }
}