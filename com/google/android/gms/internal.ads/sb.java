package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class sb implements e42<qb, ParcelFileDescriptor> {
    final /* synthetic */ jb a;

    sb(wb wbVar, jb jbVar) {
        this.a = jbVar;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final /* bridge */ /* synthetic */ g52<ParcelFileDescriptor> zza(qb qbVar) {
        wr wrVar = new wr();
        qbVar.R(this.a, new rb(this, wrVar));
        return wrVar;
    }
}