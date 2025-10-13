package com.google.android.gms.maps;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.i;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class g {
    private final com.google.android.gms.maps.i.d a;

    g(com.google.android.gms.maps.i.d dVar) {
        this.a = dVar;
    }

    @RecentlyNonNull
    public i a() {
        try {
            return this.a.L();
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }
}