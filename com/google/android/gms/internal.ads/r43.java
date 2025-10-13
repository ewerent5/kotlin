package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class r43 implements b.InterfaceC0113b {
    final /* synthetic */ wr a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s43 f8578b;

    r43(s43 s43Var, wr wrVar) {
        this.f8578b = s43Var;
        this.a = wrVar;
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0113b
    public final void U(com.google.android.gms.common.b bVar) {
        synchronized (this.f8578b.f8816d) {
            this.a.zzd(new RuntimeException("Connection failed."));
        }
    }
}