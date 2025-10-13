package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vv1 {

    @SuppressLint({"StaticFieldLeak"})
    private static final vv1 a = new vv1();

    /* renamed from: b, reason: collision with root package name */
    private Context f9790b;

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f9791c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9792d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9793e;

    /* renamed from: f, reason: collision with root package name */
    private aw1 f9794f;

    private vv1() {
    }

    public static vv1 a() {
        return a;
    }

    static /* synthetic */ void f(vv1 vv1Var, boolean z) {
        if (vv1Var.f9793e != z) {
            vv1Var.f9793e = z;
            if (vv1Var.f9792d) {
                vv1Var.h();
                if (vv1Var.f9794f != null) {
                    if (vv1Var.e()) {
                        xw1.b().c();
                    } else {
                        xw1.b().e();
                    }
                }
            }
        }
    }

    private final void h() {
        boolean z = this.f9793e;
        Iterator<hv1> it = tv1.a().e().iterator();
        while (it.hasNext()) {
            gw1 gw1VarH = it.next().h();
            if (gw1VarH.e()) {
                zv1.a().g(gw1VarH.d(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    public final void b(Context context) {
        this.f9790b = context.getApplicationContext();
    }

    public final void c() {
        this.f9791c = new uv1(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f9790b.registerReceiver(this.f9791c, intentFilter);
        this.f9792d = true;
        h();
    }

    public final void d() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f9790b;
        if (context != null && (broadcastReceiver = this.f9791c) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f9791c = null;
        }
        this.f9792d = false;
        this.f9793e = false;
        this.f9794f = null;
    }

    public final boolean e() {
        return !this.f9793e;
    }

    public final void g(aw1 aw1Var) {
        this.f9794f = aw1Var;
    }
}