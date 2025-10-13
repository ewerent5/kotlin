package com.parizene.netmonitor.ui.map;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;

/* compiled from: OsmView.java */
/* loaded from: classes3.dex */
public class s0 implements e0 {
    private final Context a;

    /* renamed from: b */
    private final k.c.g.d f13986b;

    /* renamed from: c */
    private final Handler f13987c;

    public s0(Context context, Handler handler) {
        this.a = context;
        this.f13987c = handler;
        this.f13986b = new k.c.g.d(context);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void f() {
        d0.a(this);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void g() {
        d0.j(this);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void h() {
        d0.h(this);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void i(c0 c0Var) {
        c0Var.v(new p0(this.a, this.f13986b, this.f13987c));
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void j(ViewGroup viewGroup) {
        viewGroup.removeView(this.f13986b);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void k(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        viewGroup.addView(this.f13986b, layoutParams);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void l() {
        d0.i(this);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void onDestroy() {
        d0.c(this);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void onLowMemory() {
        d0.d(this);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void onPause() {
        d0.e(this);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void onResume() {
        d0.f(this);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void r(Bundle bundle) {
        d0.g(this, bundle);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void z(Bundle bundle) {
        d0.b(this, bundle);
    }
}