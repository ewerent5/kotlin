package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzu;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ka implements zzu {
    boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f6979b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map f6980c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c93 f6981d;

    ka(na naVar, Map map, Map map2, c93 c93Var) {
        this.f6979b = map;
        this.f6980c = map2;
        this.f6981d = c93Var;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzu
    public final void zza(boolean z) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.f6979b.put((String) this.f6980c.get("event_id"), Boolean.valueOf(z));
        ((vc) this.f6981d).e0("openIntentAsync", this.f6979b);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzu
    public final void zzb(int i2) {
    }
}