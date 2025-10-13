package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class b {
    private static e.c.b.b.c.d.f a;

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Bitmap bitmap) {
        com.google.android.gms.common.internal.p.k(bitmap, "image must not be null");
        try {
            return new a(c().c2(bitmap));
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public static void b(e.c.b.b.c.d.f fVar) {
        if (a != null) {
            return;
        }
        a = (e.c.b.b.c.d.f) com.google.android.gms.common.internal.p.k(fVar, "delegate must not be null");
    }

    private static e.c.b.b.c.d.f c() {
        return (e.c.b.b.c.d.f) com.google.android.gms.common.internal.p.k(a, "IBitmapDescriptorFactory is not initialized");
    }
}