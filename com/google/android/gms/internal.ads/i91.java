package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i91 implements zzf {

    @GuardedBy("this")
    private zzf a;

    public final synchronized void a(zzf zzfVar) {
        this.a = zzfVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        zzf zzfVar = this.a;
        if (zzfVar != null) {
            zzfVar.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzb() {
        zzf zzfVar = this.a;
        if (zzfVar != null) {
            zzfVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzc() {
        zzf zzfVar = this.a;
        if (zzfVar != null) {
            zzfVar.zzc();
        }
    }
}