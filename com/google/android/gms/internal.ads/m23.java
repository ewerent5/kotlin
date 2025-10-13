package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class m23 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o23 f7411e;

    m23(o23 o23Var) {
        this.f7411e = o23Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7411e.f7889g) {
            if (this.f7411e.f7890h && this.f7411e.f7891i) {
                o23.i(this.f7411e, false);
                er.zzd("App went background");
                Iterator it = this.f7411e.f7892j.iterator();
                while (it.hasNext()) {
                    try {
                        ((p23) it.next()).zza(false);
                    } catch (Exception e2) {
                        er.zzg("", e2);
                    }
                }
            } else {
                er.zzd("App is still foreground");
            }
        }
    }
}