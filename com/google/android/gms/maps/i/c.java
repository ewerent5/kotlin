package com.google.android.gms.maps.i;

import android.os.Bundle;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public interface c extends IInterface {
    @RecentlyNonNull
    e.c.b.b.b.b getView();

    void h();

    void l();

    void m2(j jVar);

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void r(@RecentlyNonNull Bundle bundle);

    void z(@RecentlyNonNull Bundle bundle);
}