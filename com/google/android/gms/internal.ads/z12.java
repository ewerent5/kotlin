package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class z12<E> extends r12<E> {

    /* renamed from: g, reason: collision with root package name */
    private final b22<E> f10527g;

    z12(b22<E> b22Var, int i2) {
        super(b22Var.size(), i2);
        this.f10527g = b22Var;
    }

    @Override // com.google.android.gms.internal.ads.r12
    protected final E a(int i2) {
        return this.f10527g.get(i2);
    }
}