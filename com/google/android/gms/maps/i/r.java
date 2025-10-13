package com.google.android.gms.maps.i;

import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class r {
    private r() {
    }

    public static void a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable parcelableB = b(bundle, "MapOptions");
        if (parcelableB != null) {
            c(bundle2, "MapOptions", parcelableB);
        }
        Parcelable parcelableB2 = b(bundle, "StreetViewPanoramaOptions");
        if (parcelableB2 != null) {
            c(bundle2, "StreetViewPanoramaOptions", parcelableB2);
        }
        Parcelable parcelableB3 = b(bundle, "camera");
        if (parcelableB3 != null) {
            c(bundle2, "camera", parcelableB3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static <T extends Parcelable> T b(Bundle bundle, String str) {
        ClassLoader classLoaderD = d();
        bundle.setClassLoader(classLoaderD);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoaderD);
        return (T) bundle2.getParcelable(str);
    }

    public static void c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoaderD = d();
        bundle.setClassLoader(classLoaderD);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoaderD);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    private static ClassLoader d() {
        return (ClassLoader) com.google.android.gms.common.internal.p.j(r.class.getClassLoader());
    }
}