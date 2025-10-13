package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yo2 extends c.c.b.d {
    private final WeakReference<v4> a;

    public yo2(v4 v4Var, byte[] bArr) {
        this.a = new WeakReference<>(v4Var);
    }

    @Override // c.c.b.d
    public final void a(ComponentName componentName, c.c.b.b bVar) {
        v4 v4Var = this.a.get();
        if (v4Var != null) {
            v4Var.f(bVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        v4 v4Var = this.a.get();
        if (v4Var != null) {
            v4Var.g();
        }
    }
}