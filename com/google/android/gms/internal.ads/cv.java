package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class cv implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ dv f5375e;

    cv(dv dvVar) {
        this.f5375e = dvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzs.zzy().c(this.f5375e);
    }
}