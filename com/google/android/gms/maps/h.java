package com.google.android.gms.maps;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class h {
    private final com.google.android.gms.maps.i.e a;

    h(com.google.android.gms.maps.i.e eVar) {
        this.a = eVar;
    }

    public void a(boolean z) {
        try {
            this.a.z0(z);
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    public void b(boolean z) {
        try {
            this.a.W1(z);
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }
}