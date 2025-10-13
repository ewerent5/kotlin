package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class e31 extends TimerTask {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AlertDialog f5567e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Timer f5568f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ zzm f5569g;

    e31(AlertDialog alertDialog, Timer timer, zzm zzmVar) {
        this.f5567e = alertDialog;
        this.f5568f = timer;
        this.f5569g = zzmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f5567e.dismiss();
        this.f5568f.cancel();
        zzm zzmVar = this.f5569g;
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}