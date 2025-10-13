package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sz0 implements tz0 {
    private final Map<String, wo2<tz0>> a;

    /* renamed from: b, reason: collision with root package name */
    private final h52 f9040b;

    /* renamed from: c, reason: collision with root package name */
    private final id0 f9041c;

    public sz0(Map<String, wo2<tz0>> map, h52 h52Var, id0 id0Var) {
        this.a = map;
        this.f9040b = h52Var;
        this.f9041c = id0Var;
    }

    @Override // com.google.android.gms.internal.ads.tz0
    public final g52<kp1> a(final ql qlVar) {
        this.f9041c.f(qlVar);
        g52<kp1> g52VarB = y42.b(new tx0(3));
        for (String str : ((String) c.c().b(w3.r5)).split(",")) {
            final wo2<tz0> wo2Var = this.a.get(str.trim());
            if (wo2Var != null) {
                g52VarB = y42.f(g52VarB, tx0.class, new e42(wo2Var, qlVar) { // from class: com.google.android.gms.internal.ads.qz0
                    private final wo2 a;

                    /* renamed from: b, reason: collision with root package name */
                    private final ql f8545b;

                    {
                        this.a = wo2Var;
                        this.f8545b = qlVar;
                    }

                    @Override // com.google.android.gms.internal.ads.e42
                    public final g52 zza(Object obj) {
                        wo2 wo2Var2 = this.a;
                        return ((tz0) wo2Var2.zzb()).a(this.f8545b);
                    }
                }, this.f9040b);
            }
        }
        y42.o(g52VarB, new rz0(this), qr.f8451f);
        return g52VarB;
    }
}