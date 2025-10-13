package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public class d extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private final n f10681e;

    public d(@RecentlyNonNull Context context) {
        super(context);
        this.f10681e = new n(this, context, null);
        setClickable(true);
    }

    public void a(@RecentlyNonNull f fVar) {
        com.google.android.gms.common.internal.p.e("getMapAsync() must be called on the main thread");
        com.google.android.gms.common.internal.p.k(fVar, "callback must not be null.");
        this.f10681e.s(fVar);
    }

    public void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f10681e.c(bundle);
            if (this.f10681e.b() == null) {
                e.c.b.b.b.a.k(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void c() {
        this.f10681e.d();
    }

    public void d() {
        this.f10681e.e();
    }

    public void e() {
        this.f10681e.f();
    }

    public void f() {
        this.f10681e.g();
    }

    public void g(@RecentlyNonNull Bundle bundle) {
        this.f10681e.h(bundle);
    }

    public void h() {
        this.f10681e.i();
    }

    public void i() {
        this.f10681e.j();
    }
}