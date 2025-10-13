package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ho0 implements Callable {
    private final io0 a;

    /* renamed from: b */
    private final g52 f6357b;

    /* renamed from: c */
    private final g52 f6358c;

    /* renamed from: d */
    private final g52 f6359d;

    /* renamed from: e */
    private final g52 f6360e;

    /* renamed from: f */
    private final g52 f6361f;

    /* renamed from: g */
    private final JSONObject f6362g;

    /* renamed from: h */
    private final g52 f6363h;

    /* renamed from: i */
    private final g52 f6364i;

    /* renamed from: j */
    private final g52 f6365j;

    ho0(io0 io0Var, g52 g52Var, g52 g52Var2, g52 g52Var3, g52 g52Var4, g52 g52Var5, JSONObject jSONObject, g52 g52Var6, g52 g52Var7, g52 g52Var8) {
        this.a = io0Var;
        this.f6357b = g52Var;
        this.f6358c = g52Var2;
        this.f6359d = g52Var3;
        this.f6360e = g52Var4;
        this.f6361f = g52Var5;
        this.f6362g = jSONObject;
        this.f6363h = g52Var6;
        this.f6364i = g52Var7;
        this.f6365j = g52Var8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        g52 g52Var = this.f6357b;
        g52 g52Var2 = this.f6358c;
        g52 g52Var3 = this.f6359d;
        g52 g52Var4 = this.f6360e;
        g52 g52Var5 = this.f6361f;
        JSONObject jSONObject = this.f6362g;
        g52 g52Var6 = this.f6363h;
        g52 g52Var7 = this.f6364i;
        g52 g52Var8 = this.f6365j;
        tl0 tl0Var = (tl0) g52Var.get();
        tl0Var.H((List) g52Var2.get());
        tl0Var.M((t6) g52Var3.get());
        tl0Var.N((t6) g52Var4.get());
        tl0Var.G((l6) g52Var5.get());
        tl0Var.I(so0.h(jSONObject));
        tl0Var.J(so0.g(jSONObject));
        ew ewVar = (ew) g52Var6.get();
        if (ewVar != null) {
            tl0Var.P(ewVar);
            tl0Var.K(ewVar.n());
            tl0Var.F(ewVar.zzh());
        }
        ew ewVar2 = (ew) g52Var7.get();
        if (ewVar2 != null) {
            tl0Var.Q(ewVar2);
        }
        for (wo0 wo0Var : (List) g52Var8.get()) {
            if (wo0Var.a != 1) {
                tl0Var.T(wo0Var.f10009b, wo0Var.f10011d);
            } else {
                tl0Var.S(wo0Var.f10009b, wo0Var.f10010c);
            }
        }
        return tl0Var;
    }
}