package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class da implements ba<ew> {
    private final ea a;

    public da(ea eaVar, byte[] bArr) {
        this.a = eaVar;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(ew ewVar, Map map) throws NumberFormatException {
        ew ewVar2 = ewVar;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f2 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f2 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e2) {
            er.zzg("Fail to parse float", e2);
        }
        this.a.a(zEquals);
        this.a.b(zEquals2, f2);
        ewVar2.n0(zEquals);
    }
}