package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzap;
import com.google.android.gms.ads.internal.util.zzaq;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fz0 extends kl {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ gz0 f5987e;

    protected fz0(gz0 gz0Var) {
        this.f5987e = gz0Var;
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final void c3(ParcelFileDescriptor parcelFileDescriptor) {
        this.f5987e.a.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final void v4(zzaq zzaqVar) {
        this.f5987e.a.zzd(new zzap(zzaqVar.zza, zzaqVar.zzb));
    }
}