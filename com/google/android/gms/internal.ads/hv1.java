package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hv1 extends dv1 {
    private static final Pattern a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b, reason: collision with root package name */
    private final fv1 f6408b;

    /* renamed from: c, reason: collision with root package name */
    private final ev1 f6409c;

    /* renamed from: e, reason: collision with root package name */
    private ex1 f6411e;

    /* renamed from: f, reason: collision with root package name */
    private gw1 f6412f;

    /* renamed from: d, reason: collision with root package name */
    private final List<wv1> f6410d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f6413g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6414h = false;

    /* renamed from: i, reason: collision with root package name */
    private final String f6415i = UUID.randomUUID().toString();

    hv1(ev1 ev1Var, fv1 fv1Var) {
        this.f6409c = ev1Var;
        this.f6408b = fv1Var;
        l(null);
        if (fv1Var.j() == gv1.HTML || fv1Var.j() == gv1.JAVASCRIPT) {
            this.f6412f = new hw1(fv1Var.g());
        } else {
            this.f6412f = new jw1(fv1Var.f(), null);
        }
        this.f6412f.a();
        tv1.a().b(this);
        zv1.a().b(this.f6412f.d(), ev1Var.c());
    }

    private final void l(View view) {
        this.f6411e = new ex1(view);
    }

    @Override // com.google.android.gms.internal.ads.dv1
    public final void a() throws JSONException {
        if (this.f6413g) {
            return;
        }
        this.f6413g = true;
        tv1.a().c(this);
        this.f6412f.j(aw1.a().f());
        this.f6412f.h(this, this.f6408b);
    }

    @Override // com.google.android.gms.internal.ads.dv1
    public final void b(View view) {
        if (this.f6414h || j() == view) {
            return;
        }
        l(view);
        this.f6412f.k();
        Collection<hv1> collectionE = tv1.a().e();
        if (collectionE == null || collectionE.size() <= 0) {
            return;
        }
        for (hv1 hv1Var : collectionE) {
            if (hv1Var != this && hv1Var.j() == view) {
                hv1Var.f6411e.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dv1
    public final void c() {
        if (this.f6414h) {
            return;
        }
        this.f6411e.clear();
        if (!this.f6414h) {
            this.f6410d.clear();
        }
        this.f6414h = true;
        zv1.a().d(this.f6412f.d());
        tv1.a().d(this);
        this.f6412f.b();
        this.f6412f = null;
    }

    @Override // com.google.android.gms.internal.ads.dv1
    public final void d(View view, jv1 jv1Var, String str) {
        wv1 next;
        if (this.f6414h) {
            return;
        }
        if (str != null && (str.length() > 50 || !a.matcher(str).matches())) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
        Iterator<wv1> it = this.f6410d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.a().get() == view) {
                    break;
                }
            }
        }
        if (next == null) {
            this.f6410d.add(new wv1(view, jv1Var, str));
        }
    }

    @Override // com.google.android.gms.internal.ads.dv1
    @Deprecated
    public final void e(View view) {
        d(view, jv1.OTHER, null);
    }

    public final List<wv1> g() {
        return this.f6410d;
    }

    public final gw1 h() {
        return this.f6412f;
    }

    public final String i() {
        return this.f6415i;
    }

    public final View j() {
        return this.f6411e.get();
    }

    public final boolean k() {
        return this.f6413g && !this.f6414h;
    }
}