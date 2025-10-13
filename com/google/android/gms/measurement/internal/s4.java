package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class s4 {
    private final v4 a;

    public s4(v4 v4Var) {
        com.google.android.gms.common.internal.p.j(v4Var);
        this.a = v4Var;
    }

    public static boolean b(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.p.j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void a(Context context, Intent intent) {
        v3 v3VarZzq = z4.b(context, null, null).zzq();
        if (intent == null) {
            v3VarZzq.D().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        v3VarZzq.I().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                v3VarZzq.D().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            v3VarZzq.I().a("Starting wakeful intent.");
            this.a.a(context, className);
        }
    }
}