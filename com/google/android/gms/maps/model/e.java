package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class e {
    private final e.c.b.b.c.d.l a;

    public e(e.c.b.b.c.d.l lVar) {
        this.a = (e.c.b.b.c.d.l) com.google.android.gms.common.internal.p.j(lVar);
    }

    @RecentlyNonNull
    public LatLng a() {
        try {
            return this.a.zzg();
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    @RecentlyNullable
    public String b() {
        try {
            return this.a.zzk();
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    @RecentlyNullable
    public Object c() {
        try {
            return e.c.b.b.b.d.Y(this.a.q());
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    @RecentlyNullable
    public String d() {
        try {
            return this.a.zzi();
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public void e() {
        try {
            this.a.zzd();
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        try {
            return this.a.y0(((e) obj).a);
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public void f(float f2, float f3) {
        try {
            this.a.x0(f2, f3);
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public void g(a aVar) {
        try {
            if (aVar == null) {
                this.a.F3(null);
            } else {
                this.a.F3(aVar.a());
            }
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public void h(@RecentlyNonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.a.M0(latLng);
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public int hashCode() {
        try {
            return this.a.zzt();
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public void i(String str) {
        try {
            this.a.T3(str);
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public void j(Object obj) {
        try {
            this.a.q1(e.c.b.b.b.d.m4(obj));
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }

    public void k(String str) {
        try {
            this.a.D2(str);
        } catch (RemoteException e2) {
            throw new h(e2);
        }
    }
}