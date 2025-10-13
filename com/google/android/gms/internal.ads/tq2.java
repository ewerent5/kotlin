package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tq2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f9236i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f9237j = new Object();

    public tq2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        super(gq2Var, "a8WVEEgQUuRlHEL8p7VCnMYz1L5wp12p5V6BuvGYOX9cH77Etpv1p/6pnJhm6Sng", "KN0/uDtqy2OEMEK3fD3bi0yvaWvEIDu4SPEHxOLonhI=", eu0Var, i2, 44);
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        if (f9236i == null) {
            synchronized (f9237j) {
                if (f9236i == null) {
                    f9236i = (Long) this.f8257f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f8256e) {
            this.f8256e.r(f9236i.longValue());
        }
    }
}