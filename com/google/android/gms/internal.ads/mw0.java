package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class mw0 implements Runnable {

    /* renamed from: e */
    private final qw0 f7571e;

    /* renamed from: f */
    private final wr f7572f;

    mw0(qw0 qw0Var, wr wrVar) {
        this.f7571e = qw0Var;
        this.f7572f = wrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wr wrVar = this.f7572f;
        String strD = zzs.zzg().l().zzn().d();
        if (TextUtils.isEmpty(strD)) {
            wrVar.zzd(new Exception());
        } else {
            wrVar.zzc(strD);
        }
    }
}