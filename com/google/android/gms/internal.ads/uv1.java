package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class uv1 extends BroadcastReceiver {
    final /* synthetic */ vv1 a;

    uv1(vv1 vv1Var) {
        this.a = vv1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            vv1.f(this.a, true);
            return;
        }
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            vv1.f(this.a, false);
        } else {
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
                return;
            }
            vv1.f(this.a, false);
        }
    }
}