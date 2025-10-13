package com.google.android.gms.maps.i;

import android.location.Location;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public interface b extends IInterface {
    @RecentlyNonNull
    Location A();

    void B0(@Nullable h hVar);

    e.c.b.b.c.d.i E0(com.google.android.gms.maps.model.d dVar);

    void M3(@RecentlyNonNull e.c.b.b.b.b bVar);

    @RecentlyNonNull
    e N2();

    void b3(@Nullable l lVar);

    void i1(@Nullable y yVar);

    void s(int i2);

    @RecentlyNonNull
    d s3();

    void v3(@Nullable n nVar);

    void y(boolean z);

    e.c.b.b.c.d.l z4(com.google.android.gms.maps.model.f fVar);
}