package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class br2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private static volatile String f5174i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f5175j = new Object();

    public br2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        super(gq2Var, "v7A3h9QqVCXIbrfyosHIukYh/yZv47yYSEhtQFNg8vHfmWE6VQ1je6L104nqsnjL", "8sE7Kp846pN8ghcm6jpvMxjTA1L8yxDG5/OLZ4fVnxc=", eu0Var, i2, 1);
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        this.f8256e.R("E");
        if (f5174i == null) {
            synchronized (f5175j) {
                if (f5174i == null) {
                    f5174i = (String) this.f8257f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f8256e) {
            this.f8256e.R(f5174i);
        }
    }
}