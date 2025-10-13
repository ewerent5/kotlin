package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class qf0 implements Runnable {

    /* renamed from: e */
    private final rf0 f8367e;

    /* renamed from: f */
    private final Object f8368f;

    qf0(rf0 rf0Var, Object obj) {
        this.f8367e = rf0Var;
        this.f8368f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f8367e.zza(this.f8368f);
        } catch (Throwable th) {
            zzs.zzg().h(th, "EventEmitter.notify");
            zze.zzb("Event emitter exception.", th);
        }
    }
}