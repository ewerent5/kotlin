package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ct {
    private final Context a;

    /* renamed from: b */
    private final lt f5361b;

    /* renamed from: c */
    private final ViewGroup f5362c;

    /* renamed from: d */
    private bt f5363d;

    public ct(Context context, ViewGroup viewGroup, ew ewVar) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5362c = viewGroup;
        this.f5361b = ewVar;
        this.f5363d = null;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        com.google.android.gms.common.internal.p.e("The underlay may only be modified from the UI thread.");
        bt btVar = this.f5363d;
        if (btVar != null) {
            btVar.n(i2, i3, i4, i5);
        }
    }

    public final void b(int i2, int i3, int i4, int i5, int i6, boolean z, kt ktVar) {
        if (this.f5363d != null) {
            return;
        }
        d4.a(this.f5361b.zzq().c(), this.f5361b.zzi(), "vpr2");
        Context context = this.a;
        lt ltVar = this.f5361b;
        bt btVar = new bt(context, ltVar, i6, z, ltVar.zzq().c(), ktVar);
        this.f5363d = btVar;
        this.f5362c.addView(btVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f5363d.n(i2, i3, i4, i5);
        this.f5361b.zzg(false);
    }

    public final bt c() {
        com.google.android.gms.common.internal.p.e("getAdVideoUnderlay must be called from the UI thread.");
        return this.f5363d;
    }

    public final void d() {
        com.google.android.gms.common.internal.p.e("onPause must be called from the UI thread.");
        bt btVar = this.f5363d;
        if (btVar != null) {
            btVar.r();
        }
    }

    public final void e() {
        com.google.android.gms.common.internal.p.e("onDestroy must be called from the UI thread.");
        bt btVar = this.f5363d;
        if (btVar != null) {
            btVar.f();
            this.f5362c.removeView(this.f5363d);
            this.f5363d = null;
        }
    }

    public final void f(int i2) {
        com.google.android.gms.common.internal.p.e("setPlayerBackgroundColor must be called from the UI thread.");
        bt btVar = this.f5363d;
        if (btVar != null) {
            btVar.m(i2);
        }
    }
}