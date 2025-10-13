package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class d31 implements DialogInterface.OnCancelListener {

    /* renamed from: e */
    private final zzm f5423e;

    d31(zzm zzmVar) {
        this.f5423e = zzmVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        zzm zzmVar = this.f5423e;
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}