package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.RemoteException;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class a31 implements DialogInterface.OnClickListener {

    /* renamed from: e */
    private final nu0 f4828e;

    /* renamed from: f */
    private final Activity f4829f;

    /* renamed from: g */
    private final cu1 f4830g;

    /* renamed from: h */
    private final x21 f4831h;

    /* renamed from: i */
    private final String f4832i;

    /* renamed from: j */
    private final zzbh f4833j;

    /* renamed from: k */
    private final String f4834k;

    /* renamed from: l */
    private final Resources f4835l;

    /* renamed from: m */
    private final zzm f4836m;

    a31(nu0 nu0Var, Activity activity, cu1 cu1Var, x21 x21Var, String str, zzbh zzbhVar, String str2, Resources resources, zzm zzmVar) {
        this.f4828e = nu0Var;
        this.f4829f = activity;
        this.f4830g = cu1Var;
        this.f4831h = x21Var;
        this.f4832i = str;
        this.f4833j = zzbhVar;
        this.f4834k = str2;
        this.f4835l = resources;
        this.f4836m = zzmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        zzm zzmVar;
        nu0 nu0Var = this.f4828e;
        Activity activity = this.f4829f;
        cu1 cu1Var = this.f4830g;
        x21 x21Var = this.f4831h;
        String str = this.f4832i;
        zzbh zzbhVar = this.f4833j;
        String str2 = this.f4834k;
        Resources resources = this.f4835l;
        zzm zzmVar2 = this.f4836m;
        if (nu0Var != null) {
            HashMap map = new HashMap();
            map.put("dialog_action", "confirm");
            zzmVar = zzmVar2;
            f31.L4(activity, nu0Var, cu1Var, x21Var, str, "dialog_click", map);
        } else {
            zzmVar = zzmVar2;
        }
        try {
        } catch (RemoteException e2) {
            er.zzg("Failed to schedule offline notification poster.", e2);
        }
        if (!zzbhVar.zze(e.c.b.b.b.d.m4(activity), str2, str)) {
            x21Var.g(str);
            if (nu0Var != null) {
                f31.K4(activity, nu0Var, cu1Var, x21Var, str, "offline_notification_worker_not_scheduled");
            }
        }
        zzs.zzc();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, zzs.zze().zzm());
        builder.setMessage(resources == null ? "You'll get a notification with the link when you're back online" : resources.getString(R.string.offline_opt_in_confirmation)).setOnCancelListener(new DialogInterface.OnCancelListener(zzmVar) { // from class: com.google.android.gms.internal.ads.d31

            /* renamed from: e */
            private final zzm f5423e;

            d31(zzm zzmVar3) {
                this.f5423e = zzmVar3;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface2) {
                zzm zzmVar3 = this.f5423e;
                if (zzmVar3 != null) {
                    zzmVar3.zzb();
                }
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new e31(alertDialogCreate, timer, zzmVar3), 3000L);
    }
}