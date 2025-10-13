package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class b43 implements b.a {
    final /* synthetic */ d43 a;

    b43(d43 d43Var) {
        this.a = d43Var;
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void R(int i2) {
        synchronized (this.a.f5427b) {
            this.a.f5430e = null;
            this.a.f5427b.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void Y(Bundle bundle) {
        synchronized (this.a.f5427b) {
            try {
            } catch (DeadObjectException e2) {
                er.zzg("Unable to obtain a cache service instance.", e2);
                d43.f(this.a);
            }
            if (this.a.f5428c != null) {
                d43 d43Var = this.a;
                d43Var.f5430e = d43Var.f5428c.d();
                this.a.f5427b.notifyAll();
            } else {
                this.a.f5427b.notifyAll();
            }
        }
    }
}