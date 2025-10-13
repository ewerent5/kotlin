package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tv1 {
    private static final tv1 a = new tv1();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<hv1> f9275b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<hv1> f9276c = new ArrayList<>();

    private tv1() {
    }

    public static tv1 a() {
        return a;
    }

    public final void b(hv1 hv1Var) {
        this.f9275b.add(hv1Var);
    }

    public final void c(hv1 hv1Var) {
        boolean zG = g();
        this.f9276c.add(hv1Var);
        if (zG) {
            return;
        }
        aw1.a().c();
    }

    public final void d(hv1 hv1Var) {
        boolean zG = g();
        this.f9275b.remove(hv1Var);
        this.f9276c.remove(hv1Var);
        if (!zG || g()) {
            return;
        }
        aw1.a().d();
    }

    public final Collection<hv1> e() {
        return Collections.unmodifiableCollection(this.f9275b);
    }

    public final Collection<hv1> f() {
        return Collections.unmodifiableCollection(this.f9276c);
    }

    public final boolean g() {
        return this.f9276c.size() > 0;
    }
}