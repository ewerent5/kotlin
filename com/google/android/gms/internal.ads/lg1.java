package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lg1 implements ah1<mg1> {
    private final kp a;

    /* renamed from: b, reason: collision with root package name */
    private final h52 f7249b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f7250c;

    public lg1(kp kpVar, h52 h52Var, Context context) {
        this.a = kpVar;
        this.f7249b = h52Var;
        this.f7250c = context;
    }

    final /* synthetic */ mg1 a() throws NoSuchMethodException, SecurityException {
        if (!this.a.g(this.f7250c)) {
            return new mg1(null, null, null, null, null);
        }
        String strO = this.a.o(this.f7250c);
        String str = strO == null ? "" : strO;
        String strP = this.a.p(this.f7250c);
        String str2 = strP == null ? "" : strP;
        String strQ = this.a.q(this.f7250c);
        String str3 = strQ == null ? "" : strQ;
        String strR = this.a.r(this.f7250c);
        return new mg1(str, str2, str3, strR == null ? "" : strR, "TIME_OUT".equals(str2) ? (Long) c.c().b(w3.a0) : null);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<mg1> zza() {
        return this.f7249b.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.kg1
            private final lg1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}