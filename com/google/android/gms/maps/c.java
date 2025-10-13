package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public class c {
    private final com.google.android.gms.maps.i.b a;

    /* renamed from: b, reason: collision with root package name */
    private h f10680b;

    /* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
    public interface a {
        void a();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
    public interface b {
        void a(@RecentlyNonNull com.google.android.gms.maps.model.e eVar);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
    /* renamed from: com.google.android.gms.maps.c$c, reason: collision with other inner class name */
    public interface InterfaceC0114c {
        boolean a(@RecentlyNonNull com.google.android.gms.maps.model.e eVar);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
    @Deprecated
    public interface d {
        void a(@RecentlyNonNull Location location);
    }

    public c(@RecentlyNonNull com.google.android.gms.maps.i.b bVar) {
        this.a = (com.google.android.gms.maps.i.b) com.google.android.gms.common.internal.p.j(bVar);
    }

    @RecentlyNonNull
    public final com.google.android.gms.maps.model.c a(@RecentlyNonNull com.google.android.gms.maps.model.d dVar) {
        try {
            com.google.android.gms.common.internal.p.k(dVar, "CircleOptions must not be null.");
            return new com.google.android.gms.maps.model.c(this.a.E0(dVar));
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @RecentlyNullable
    public final com.google.android.gms.maps.model.e b(@RecentlyNonNull com.google.android.gms.maps.model.f fVar) {
        try {
            com.google.android.gms.common.internal.p.k(fVar, "MarkerOptions must not be null.");
            e.c.b.b.c.d.l lVarZ4 = this.a.z4(fVar);
            if (lVarZ4 != null) {
                return new com.google.android.gms.maps.model.e(lVarZ4);
            }
            return null;
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    public final void c(@RecentlyNonNull com.google.android.gms.maps.a aVar) {
        try {
            com.google.android.gms.common.internal.p.k(aVar, "CameraUpdate must not be null.");
            this.a.M3(aVar.a());
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @RecentlyNonNull
    @Deprecated
    public final Location d() {
        try {
            return this.a.A();
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @RecentlyNonNull
    public final g e() {
        try {
            return new g(this.a.s3());
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @RecentlyNonNull
    public final h f() {
        try {
            if (this.f10680b == null) {
                this.f10680b = new h(this.a.N2());
            }
            return this.f10680b;
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    public final void g(int i2) {
        try {
            this.a.s(i2);
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    public final void h(boolean z) {
        try {
            this.a.y(z);
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    public final void i(a aVar) {
        try {
            if (aVar == null) {
                this.a.i1(null);
            } else {
                this.a.i1(new q(this, aVar));
            }
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    public final void j(b bVar) {
        try {
            if (bVar == null) {
                this.a.B0(null);
            } else {
                this.a.B0(new o(this, bVar));
            }
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    public final void k(InterfaceC0114c interfaceC0114c) {
        try {
            if (interfaceC0114c == null) {
                this.a.b3(null);
            } else {
                this.a.b3(new j(this, interfaceC0114c));
            }
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @Deprecated
    public final void l(d dVar) {
        try {
            if (dVar == null) {
                this.a.v3(null);
            } else {
                this.a.v3(new p(this, dVar));
            }
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }
}