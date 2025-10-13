package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class s extends e.c.b.d.a.c.c<AssetPackState> {

    /* renamed from: g, reason: collision with root package name */
    private final a1 f12130g;

    /* renamed from: h, reason: collision with root package name */
    private final l0 f12131h;

    /* renamed from: i, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<s2> f12132i;

    /* renamed from: j, reason: collision with root package name */
    private final e0 f12133j;

    /* renamed from: k, reason: collision with root package name */
    private final o0 f12134k;

    /* renamed from: l, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<Executor> f12135l;

    /* renamed from: m, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<Executor> f12136m;
    private final Handler n;

    s(Context context, a1 a1Var, l0 l0Var, e.c.b.d.a.b.e0<s2> e0Var, o0 o0Var, e0 e0Var2, e.c.b.d.a.b.e0<Executor> e0Var3, e.c.b.d.a.b.e0<Executor> e0Var4) {
        super(new e.c.b.d.a.b.f("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.n = new Handler(Looper.getMainLooper());
        this.f12130g = a1Var;
        this.f12131h = l0Var;
        this.f12132i = e0Var;
        this.f12134k = o0Var;
        this.f12133j = e0Var2;
        this.f12135l = e0Var3;
        this.f12136m = e0Var4;
    }

    @Override // e.c.b.d.a.c.c
    protected final void a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.a.b("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.a.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        final AssetPackState assetPackStateE = AssetPackState.e(bundleExtra, stringArrayList.get(0), this.f12134k, u.f12151b);
        this.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", assetPackStateE);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.f12133j.a(pendingIntent);
        }
        this.f12136m.a().execute(new Runnable(this, bundleExtra, assetPackStateE) { // from class: com.google.android.play.core.assetpacks.q

            /* renamed from: e, reason: collision with root package name */
            private final s f12114e;

            /* renamed from: f, reason: collision with root package name */
            private final Bundle f12115f;

            /* renamed from: g, reason: collision with root package name */
            private final AssetPackState f12116g;

            {
                this.f12114e = this;
                this.f12115f = bundleExtra;
                this.f12116g = assetPackStateE;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12114e.h(this.f12115f, this.f12116g);
            }
        });
        this.f12135l.a().execute(new Runnable(this, bundleExtra) { // from class: com.google.android.play.core.assetpacks.r

            /* renamed from: e, reason: collision with root package name */
            private final s f12120e;

            /* renamed from: f, reason: collision with root package name */
            private final Bundle f12121f;

            {
                this.f12120e = this;
                this.f12121f = bundleExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12120e.g(this.f12121f);
            }
        });
    }

    final void f(final AssetPackState assetPackState) {
        this.n.post(new Runnable(this, assetPackState) { // from class: com.google.android.play.core.assetpacks.p

            /* renamed from: e, reason: collision with root package name */
            private final s f12110e;

            /* renamed from: f, reason: collision with root package name */
            private final AssetPackState f12111f;

            {
                this.f12110e = this;
                this.f12111f = assetPackState;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12110e.d(this.f12111f);
            }
        });
    }

    final /* synthetic */ void g(Bundle bundle) {
        if (this.f12130g.d(bundle)) {
            this.f12131h.a();
        }
    }

    final /* synthetic */ void h(Bundle bundle, AssetPackState assetPackState) {
        if (this.f12130g.e(bundle)) {
            f(assetPackState);
            this.f12132i.a().a();
        }
    }
}