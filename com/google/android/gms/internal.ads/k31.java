package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class k31<DelegateT, AdapterT> implements j31<AdapterT> {
    public final j31<DelegateT> a;

    /* renamed from: b, reason: collision with root package name */
    private final x02<DelegateT, AdapterT> f6942b;

    public k31(j31<DelegateT> j31Var, x02<DelegateT, AdapterT> x02Var) {
        this.a = j31Var;
        this.f6942b = x02Var;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<AdapterT> a(kp1 kp1Var, xo1 xo1Var) {
        return y42.i(this.a.a(kp1Var, xo1Var), this.f6942b, qr.a);
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        return this.a.b(kp1Var, xo1Var);
    }
}