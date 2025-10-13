package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cq0 implements ba<Object> {
    private final u7 a;

    /* renamed from: b, reason: collision with root package name */
    private final pq0 f5351b;

    /* renamed from: c, reason: collision with root package name */
    private final go2<xp0> f5352c;

    public cq0(fm0 fm0Var, tl0 tl0Var, pq0 pq0Var, go2<xp0> go2Var) {
        this.a = fm0Var.g(tl0Var.n());
        this.f5351b = pq0Var;
        this.f5352c = go2Var;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.a.y4(this.f5352c.zzb(), str);
        } catch (RemoteException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            er.zzj(sb.toString(), e2);
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        this.f5351b.d("/nativeAdCustomClick", this);
    }
}