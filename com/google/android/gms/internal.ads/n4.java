package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class n4 extends o4 {

    /* renamed from: e, reason: collision with root package name */
    private final zzf f7648e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7649f;

    /* renamed from: g, reason: collision with root package name */
    private final String f7650g;

    public n4(zzf zzfVar, String str, String str2) {
        this.f7648e = zzfVar;
        this.f7649f = str;
        this.f7650g = str2;
    }

    @Override // com.google.android.gms.internal.ads.p4
    public final void v(e.c.b.b.b.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f7648e.zza((View) e.c.b.b.b.d.Y(bVar));
    }

    @Override // com.google.android.gms.internal.ads.p4
    public final String zzb() {
        return this.f7649f;
    }

    @Override // com.google.android.gms.internal.ads.p4
    public final String zzc() {
        return this.f7650g;
    }

    @Override // com.google.android.gms.internal.ads.p4
    public final void zze() {
        this.f7648e.zzb();
    }

    @Override // com.google.android.gms.internal.ads.p4
    public final void zzf() {
        this.f7648e.zzc();
    }
}