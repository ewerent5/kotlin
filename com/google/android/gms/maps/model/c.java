package com.google.android.gms.maps.model;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class c {
    private final e.c.b.b.c.d.i a;

    public c(e.c.b.b.c.d.i iVar) {
        this.a = (e.c.b.b.c.d.i) com.google.android.gms.common.internal.p.j(iVar);
    }

    public void a() {
        try {
            this.a.zzd();
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        try {
            return this.a.D3(((c) obj).a);
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public final int hashCode() {
        try {
            return this.a.zzu();
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }
}