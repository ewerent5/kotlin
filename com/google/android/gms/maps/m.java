package com.google.android.gms.maps;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.i.r;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
final class m implements e.c.b.b.b.c {
    private final ViewGroup a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.maps.i.c f10686b;

    /* renamed from: c, reason: collision with root package name */
    private View f10687c;

    public m(ViewGroup viewGroup, com.google.android.gms.maps.i.c cVar) {
        this.f10686b = (com.google.android.gms.maps.i.c) com.google.android.gms.common.internal.p.j(cVar);
        this.a = (ViewGroup) com.google.android.gms.common.internal.p.j(viewGroup);
    }

    public final void a(f fVar) {
        try {
            this.f10686b.m2(new l(this, fVar));
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @Override // e.c.b.b.b.c
    public final void h() {
        try {
            this.f10686b.h();
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @Override // e.c.b.b.b.c
    public final void l() {
        try {
            this.f10686b.l();
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @Override // e.c.b.b.b.c
    public final void onDestroy() {
        try {
            this.f10686b.onDestroy();
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @Override // e.c.b.b.b.c
    public final void onLowMemory() {
        try {
            this.f10686b.onLowMemory();
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @Override // e.c.b.b.b.c
    public final void onPause() {
        try {
            this.f10686b.onPause();
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @Override // e.c.b.b.b.c
    public final void onResume() {
        try {
            this.f10686b.onResume();
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @Override // e.c.b.b.b.c
    public final void r(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            r.a(bundle, bundle2);
            this.f10686b.r(bundle2);
            r.a(bundle2, bundle);
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }

    @Override // e.c.b.b.b.c
    public final void z(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            r.a(bundle, bundle2);
            this.f10686b.z(bundle2);
            r.a(bundle2, bundle);
            this.f10687c = (View) e.c.b.b.b.d.Y(this.f10686b.getView());
            this.a.removeAllViews();
            this.a.addView(this.f10687c);
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        }
    }
}