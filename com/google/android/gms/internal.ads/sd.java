package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class sd implements ba<he> {
    final /* synthetic */ ad a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzbq f8851b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ge f8852c;

    sd(ge geVar, ip2 ip2Var, ad adVar, zzbq zzbqVar) {
        this.f8852c = geVar;
        this.a = adVar;
        this.f8851b = zzbqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.ba, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(he heVar, Map map) {
        synchronized (this.f8852c.a) {
            er.zzh("JS Engine is requesting an update");
            if (this.f8852c.f6110h == 0) {
                er.zzh("Starting reload.");
                this.f8852c.f6110h = 2;
                this.f8852c.a(null);
            }
            this.a.A("/requestReload", this.f8851b.zza());
        }
    }
}