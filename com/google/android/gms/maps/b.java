package com.google.android.gms.maps;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class b {
    private static com.google.android.gms.maps.i.a a;

    @RecentlyNonNull
    public static a a(@RecentlyNonNull LatLng latLng) {
        com.google.android.gms.common.internal.p.k(latLng, "latLng must not be null");
        try {
            return new a(d().Y0(latLng));
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @RecentlyNonNull
    public static a b(@RecentlyNonNull LatLng latLng, float f2) {
        com.google.android.gms.common.internal.p.k(latLng, "latLng must not be null");
        try {
            return new a(d().c4(latLng, f2));
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    public static void c(@RecentlyNonNull com.google.android.gms.maps.i.a aVar) {
        a = (com.google.android.gms.maps.i.a) com.google.android.gms.common.internal.p.j(aVar);
    }

    private static com.google.android.gms.maps.i.a d() {
        return (com.google.android.gms.maps.i.a) com.google.android.gms.common.internal.p.k(a, "CameraUpdateFactory is not initialized");
    }
}