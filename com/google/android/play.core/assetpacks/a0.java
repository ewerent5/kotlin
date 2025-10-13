package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class a0 extends e.c.b.d.a.b.r0 {

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.d.a.b.f f11932e = new e.c.b.d.a.b.f("AssetPackExtractionService");

    /* renamed from: f, reason: collision with root package name */
    private final Context f11933f;

    /* renamed from: g, reason: collision with root package name */
    private final v f11934g;

    a0(Context context, v vVar) {
        this.f11933f = context;
        this.f11934g = vVar;
    }

    private final synchronized void r3(Bundle bundle) {
        ComponentName componentNameStartForegroundService;
        Intent intent = new Intent(this.f11933f, (Class<?>) ExtractionForegroundService.class);
        int i2 = bundle.getInt("action_type");
        intent.putExtra("action_type", i2);
        if (i2 == 1) {
            intent.putExtra("notification_channel_name", bundle.getString("notification_channel_name"));
            intent.putExtra("notification_title", bundle.getString("notification_title"));
            intent.putExtra("notification_subtext", bundle.getString("notification_subtext"));
            intent.putExtra("notification_timeout", bundle.getLong("notification_timeout"));
            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            if (parcelable instanceof PendingIntent) {
                intent.putExtra("notification_on_click_intent", parcelable);
            }
            intent.putExtra("notification_color", bundle.getInt("notification_color"));
        }
        try {
            componentNameStartForegroundService = Build.VERSION.SDK_INT >= 26 ? this.f11933f.startForegroundService(intent) : this.f11933f.startService(intent);
        } catch (IllegalStateException | SecurityException e2) {
            this.f11932e.c(e2, "Failed starting installation service.", new Object[0]);
            componentNameStartForegroundService = null;
        }
        if (componentNameStartForegroundService == null) {
            this.f11932e.b("Failed starting installation service.", new Object[0]);
        }
    }

    @Override // e.c.b.d.a.b.s0
    public final void J1(Bundle bundle, e.c.b.d.a.b.u0 u0Var) {
        this.f11932e.a("updateServiceState AIDL call", new Object[0]);
        if (!e.c.b.d.a.b.t.a(this.f11933f) || !e.c.b.d.a.b.t.b(this.f11933f)) {
            u0Var.r3(new Bundle());
        } else {
            r3(bundle);
            u0Var.E2(new Bundle(), new Bundle());
        }
    }

    @Override // e.c.b.d.a.b.s0
    public final void t0(e.c.b.d.a.b.u0 u0Var) {
        this.f11932e.a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!e.c.b.d.a.b.t.a(this.f11933f) || !e.c.b.d.a.b.t.b(this.f11933f)) {
            u0Var.r3(new Bundle());
        } else {
            this.f11934g.K();
            u0Var.I2(new Bundle());
        }
    }
}