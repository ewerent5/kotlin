package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ub implements b.a {
    final /* synthetic */ wr a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ wb f9411b;

    ub(wb wbVar, wr wrVar) {
        this.f9411b = wbVar;
        this.a = wrVar;
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void R(int i2) {
        wr wrVar = this.a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i2);
        wrVar.zzd(new RuntimeException(sb.toString()));
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void Y(Bundle bundle) {
        try {
            this.a.zzc(this.f9411b.a.c());
        } catch (DeadObjectException e2) {
            this.a.zzd(e2);
        }
    }
}