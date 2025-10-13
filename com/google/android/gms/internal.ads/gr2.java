package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gr2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private final boolean f6174i;

    public gr2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        super(gq2Var, "XjijUwmXm7DyFf8ohwUhl/9yUgRUqxHQnI45c1t0y/YKbCSD+OaDQ73UKMg990Kz", "6/jwpsIwP7bZ+3d0h4XGdi00o4+iCHVraAq2DY8Q/Kk=", eu0Var, i2, 61);
        this.f6174i = gq2Var.k();
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        long jLongValue = ((Long) this.f8257f.invoke(null, this.f8253b.b(), Boolean.valueOf(this.f6174i))).longValue();
        synchronized (this.f8256e) {
            this.f8256e.H(jLongValue);
        }
    }
}