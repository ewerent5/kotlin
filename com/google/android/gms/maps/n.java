package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.i.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
final class n extends e.c.b.b.b.a<m> {

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f10722e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f10723f;

    /* renamed from: g, reason: collision with root package name */
    protected e.c.b.b.b.e<m> f10724g;

    /* renamed from: h, reason: collision with root package name */
    private final GoogleMapOptions f10725h;

    /* renamed from: i, reason: collision with root package name */
    private final List<f> f10726i = new ArrayList();

    n(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f10722e = viewGroup;
        this.f10723f = context;
        this.f10725h = googleMapOptions;
    }

    @Override // e.c.b.b.b.a
    protected final void a(e.c.b.b.b.e<m> eVar) {
        this.f10724g = eVar;
        r();
    }

    public final void r() {
        if (this.f10724g == null || b() != null) {
            return;
        }
        try {
            e.a(this.f10723f);
            com.google.android.gms.maps.i.c cVarR3 = s.a(this.f10723f).R3(e.c.b.b.b.d.m4(this.f10723f), this.f10725h);
            if (cVarR3 == null) {
                return;
            }
            this.f10724g.a(new m(this.f10722e, cVarR3));
            Iterator<f> it = this.f10726i.iterator();
            while (it.hasNext()) {
                b().a(it.next());
            }
            this.f10726i.clear();
        } catch (RemoteException e2) {
            throw new com.google.android.gms.maps.model.h(e2);
        } catch (com.google.android.gms.common.g unused) {
        }
    }

    public final void s(f fVar) {
        if (b() != null) {
            b().a(fVar);
        } else {
            this.f10726i.add(fVar);
        }
    }
}