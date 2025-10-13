package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vb implements b.InterfaceC0113b {
    final /* synthetic */ wr a;

    vb(wb wbVar, wr wrVar) {
        this.a = wrVar;
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0113b
    public final void U(com.google.android.gms.common.b bVar) {
        this.a.zzd(new RuntimeException("Connection failed."));
    }
}