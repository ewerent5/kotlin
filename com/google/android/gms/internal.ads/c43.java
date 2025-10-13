package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class c43 implements b.InterfaceC0113b {
    final /* synthetic */ d43 a;

    c43(d43 d43Var) {
        this.a = d43Var;
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0113b
    public final void U(com.google.android.gms.common.b bVar) {
        synchronized (this.a.f5427b) {
            this.a.f5430e = null;
            if (this.a.f5428c != null) {
                d43.j(this.a, null);
            }
            this.a.f5427b.notifyAll();
        }
    }
}