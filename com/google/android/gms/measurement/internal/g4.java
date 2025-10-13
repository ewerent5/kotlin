package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
class g4 extends BroadcastReceiver {
    private static final String a = g4.class.getName();

    /* renamed from: b, reason: collision with root package name */
    private final t9 f10887b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10888c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10889d;

    g4(t9 t9Var) {
        com.google.android.gms.common.internal.p.j(t9Var);
        this.f10887b = t9Var;
    }

    public final void b() {
        this.f10887b.d0();
        this.f10887b.zzp().d();
        if (this.f10888c) {
            return;
        }
        this.f10887b.zzm().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f10889d = this.f10887b.T().v();
        this.f10887b.zzq().I().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f10889d));
        this.f10888c = true;
    }

    public final void c() {
        this.f10887b.d0();
        this.f10887b.zzp().d();
        this.f10887b.zzp().d();
        if (this.f10888c) {
            this.f10887b.zzq().I().a("Unregistering connectivity change receiver");
            this.f10888c = false;
            this.f10889d = false;
            try {
                this.f10887b.zzm().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.f10887b.zzq().A().b("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f10887b.d0();
        String action = intent.getAction();
        this.f10887b.zzq().I().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f10887b.zzq().D().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zV = this.f10887b.T().v();
        if (this.f10889d != zV) {
            this.f10889d = zV;
            this.f10887b.zzp().u(new j4(this, zV));
        }
    }
}