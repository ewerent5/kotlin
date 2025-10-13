package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class er2 extends pr2 {
    public er2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        super(gq2Var, "sT47VR68C8cERi/0itZP+BsmCv/YYJ9p1AyAQJ4PMt7kQEnzEdHbEJ7D0Q038xaP", "VdkstFhaRmxqYWVlF/gLTzv1f2odqs7Iuhyqw8uXCUM=", eu0Var, i2, 73);
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        try {
            this.f8256e.M(((Boolean) this.f8257f.invoke(null, this.f8253b.b())).booleanValue() ? ek1.ENUM_TRUE : ek1.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.f8256e.M(ek1.ENUM_FAILURE);
        }
    }
}