package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import androidx.core.app.i;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class f31 extends jj {

    /* renamed from: e */
    private final Context f5783e;

    /* renamed from: f */
    private final nu0 f5784f;

    /* renamed from: g */
    private final jr f5785g;

    /* renamed from: h */
    private final x21 f5786h;

    /* renamed from: i */
    private final cu1 f5787i;

    public f31(Context context, x21 x21Var, jr jrVar, nu0 nu0Var, cu1 cu1Var) {
        this.f5783e = context;
        this.f5784f = nu0Var;
        this.f5785g = jrVar;
        this.f5786h = x21Var;
        this.f5787i = cu1Var;
    }

    public static void J4(final Activity activity, final zzm zzmVar, final zzbh zzbhVar, final x21 x21Var, final nu0 nu0Var, final cu1 cu1Var, final String str, final String str2) {
        zzs.zzc();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, zzs.zze().zzm());
        final Resources resourcesF = zzs.zzg().f();
        builder.setTitle(resourcesF == null ? "Open ad when you're back online." : resourcesF.getString(R.string.offline_opt_in_title)).setMessage(resourcesF == null ? "We'll send you a notification with a link to the advertiser site." : resourcesF.getString(R.string.offline_opt_in_message)).setPositiveButton(resourcesF == null ? "OK" : resourcesF.getString(R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener(nu0Var, activity, cu1Var, x21Var, str, zzbhVar, str2, resourcesF, zzmVar) { // from class: com.google.android.gms.internal.ads.a31

            /* renamed from: e, reason: collision with root package name */
            private final nu0 f4828e;

            /* renamed from: f, reason: collision with root package name */
            private final Activity f4829f;

            /* renamed from: g, reason: collision with root package name */
            private final cu1 f4830g;

            /* renamed from: h, reason: collision with root package name */
            private final x21 f4831h;

            /* renamed from: i, reason: collision with root package name */
            private final String f4832i;

            /* renamed from: j, reason: collision with root package name */
            private final zzbh f4833j;

            /* renamed from: k, reason: collision with root package name */
            private final String f4834k;

            /* renamed from: l, reason: collision with root package name */
            private final Resources f4835l;

            /* renamed from: m, reason: collision with root package name */
            private final zzm f4836m;

            {
                this.f4828e = nu0Var;
                this.f4829f = activity;
                this.f4830g = cu1Var;
                this.f4831h = x21Var;
                this.f4832i = str;
                this.f4833j = zzbhVar;
                this.f4834k = str2;
                this.f4835l = resourcesF;
                this.f4836m = zzmVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                final zzm zzmVar2;
                nu0 nu0Var2 = this.f4828e;
                Activity activity2 = this.f4829f;
                cu1 cu1Var2 = this.f4830g;
                x21 x21Var2 = this.f4831h;
                String str3 = this.f4832i;
                zzbh zzbhVar2 = this.f4833j;
                String str4 = this.f4834k;
                Resources resources = this.f4835l;
                zzm zzmVar3 = this.f4836m;
                if (nu0Var2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "confirm");
                    zzmVar2 = zzmVar3;
                    f31.L4(activity2, nu0Var2, cu1Var2, x21Var2, str3, "dialog_click", map);
                } else {
                    zzmVar2 = zzmVar3;
                }
                try {
                } catch (RemoteException e2) {
                    er.zzg("Failed to schedule offline notification poster.", e2);
                }
                if (!zzbhVar2.zze(e.c.b.b.b.d.m4(activity2), str4, str3)) {
                    x21Var2.g(str3);
                    if (nu0Var2 != null) {
                        f31.K4(activity2, nu0Var2, cu1Var2, x21Var2, str3, "offline_notification_worker_not_scheduled");
                    }
                }
                zzs.zzc();
                AlertDialog.Builder builder2 = new AlertDialog.Builder(activity2, zzs.zze().zzm());
                builder2.setMessage(resources == null ? "You'll get a notification with the link when you're back online" : resources.getString(R.string.offline_opt_in_confirmation)).setOnCancelListener(new DialogInterface.OnCancelListener(zzmVar2) { // from class: com.google.android.gms.internal.ads.d31

                    /* renamed from: e, reason: collision with root package name */
                    private final zzm f5423e;

                    {
                        this.f5423e = zzmVar2;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        zzm zzmVar4 = this.f5423e;
                        if (zzmVar4 != null) {
                            zzmVar4.zzb();
                        }
                    }
                });
                AlertDialog alertDialogCreate = builder2.create();
                alertDialogCreate.show();
                Timer timer = new Timer();
                timer.schedule(new e31(alertDialogCreate, timer, zzmVar2), 3000L);
            }
        }).setNegativeButton(resourcesF == null ? "No thanks" : resourcesF.getString(R.string.offline_opt_in_decline), new DialogInterface.OnClickListener(x21Var, str, nu0Var, activity, cu1Var, zzmVar) { // from class: com.google.android.gms.internal.ads.b31

            /* renamed from: e, reason: collision with root package name */
            private final x21 f5056e;

            /* renamed from: f, reason: collision with root package name */
            private final String f5057f;

            /* renamed from: g, reason: collision with root package name */
            private final nu0 f5058g;

            /* renamed from: h, reason: collision with root package name */
            private final Activity f5059h;

            /* renamed from: i, reason: collision with root package name */
            private final cu1 f5060i;

            /* renamed from: j, reason: collision with root package name */
            private final zzm f5061j;

            {
                this.f5056e = x21Var;
                this.f5057f = str;
                this.f5058g = nu0Var;
                this.f5059h = activity;
                this.f5060i = cu1Var;
                this.f5061j = zzmVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                x21 x21Var2 = this.f5056e;
                String str3 = this.f5057f;
                nu0 nu0Var2 = this.f5058g;
                Activity activity2 = this.f5059h;
                cu1 cu1Var2 = this.f5060i;
                zzm zzmVar2 = this.f5061j;
                x21Var2.g(str3);
                if (nu0Var2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    f31.L4(activity2, nu0Var2, cu1Var2, x21Var2, str3, "dialog_click", map);
                }
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(x21Var, str, nu0Var, activity, cu1Var, zzmVar) { // from class: com.google.android.gms.internal.ads.c31

            /* renamed from: e, reason: collision with root package name */
            private final x21 f5251e;

            /* renamed from: f, reason: collision with root package name */
            private final String f5252f;

            /* renamed from: g, reason: collision with root package name */
            private final nu0 f5253g;

            /* renamed from: h, reason: collision with root package name */
            private final Activity f5254h;

            /* renamed from: i, reason: collision with root package name */
            private final cu1 f5255i;

            /* renamed from: j, reason: collision with root package name */
            private final zzm f5256j;

            {
                this.f5251e = x21Var;
                this.f5252f = str;
                this.f5253g = nu0Var;
                this.f5254h = activity;
                this.f5255i = cu1Var;
                this.f5256j = zzmVar;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                x21 x21Var2 = this.f5251e;
                String str3 = this.f5252f;
                nu0 nu0Var2 = this.f5253g;
                Activity activity2 = this.f5254h;
                cu1 cu1Var2 = this.f5255i;
                zzm zzmVar2 = this.f5256j;
                x21Var2.g(str3);
                if (nu0Var2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    f31.L4(activity2, nu0Var2, cu1Var2, x21Var2, str3, "dialog_click", map);
                }
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        builder.create().show();
    }

    public static void K4(Context context, nu0 nu0Var, cu1 cu1Var, x21 x21Var, String str, String str2) {
        L4(context, nu0Var, cu1Var, x21Var, str, str2, new HashMap());
    }

    public static void L4(Context context, nu0 nu0Var, cu1 cu1Var, x21 x21Var, String str, String str2, Map<String, String> map) {
        String strE;
        if (((Boolean) c.c().b(w3.I5)).booleanValue()) {
            bu1 bu1VarA = bu1.a(str2);
            bu1VarA.c("gqi", str);
            zzs.zzc();
            bu1VarA.c("device_connectivity", true == zzr.zzH(context) ? "online" : "offline");
            bu1VarA.c("event_timestamp", String.valueOf(zzs.zzj().a()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bu1VarA.c(entry.getKey(), entry.getValue());
            }
            strE = cu1Var.a(bu1VarA);
        } else {
            mu0 mu0VarA = nu0Var.a();
            mu0VarA.c("gqi", str);
            mu0VarA.c("action", str2);
            zzs.zzc();
            mu0VarA.c("device_connectivity", true == zzr.zzH(context) ? "online" : "offline");
            mu0VarA.c("event_timestamp", String.valueOf(zzs.zzj().a()));
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                mu0VarA.c(entry2.getKey(), entry2.getValue());
            }
            strE = mu0VarA.e();
        }
        x21Var.i(new z21(zzs.zzj().a(), str, strE, 2));
    }

    private final void M4(String str, String str2, Map<String, String> map) {
        L4(this.f5783e, this.f5784f, this.f5787i, this.f5786h, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void a0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            zzs.zzc();
            boolean zZzH = zzr.zzH(this.f5783e);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zZzH ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f5783e;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            M4(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.f5786h.getWritableDatabase();
                if (c == 1) {
                    this.f5786h.c(writableDatabase, this.f5785g, stringExtra2);
                } else {
                    x21.v(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 51);
                sb.append("Failed to get writable offline buffering database: ");
                sb.append(strValueOf);
                er.zzf(sb.toString());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void e0(e.c.b.b.b.b bVar, String str, String str2) {
        Context context = (Context) e.c.b.b.b.d.Y(bVar);
        zzs.zzc();
        if (com.google.android.gms.common.util.n.k()) {
            NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i2 = m02.a;
        PendingIntent pendingIntentA = m02.a(context, 0, intent, i2 | 1073741824, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent pendingIntentA2 = m02.a(context, 0, intent2, i2 | 1073741824, 0);
        Resources resourcesF = zzs.zzg().f();
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, new i.d(context, "offline_notification_channel").j(resourcesF == null ? "View the ad you saved when you were offline" : resourcesF.getString(R.string.offline_notification_title)).i(resourcesF == null ? "Tap to open ad" : resourcesF.getString(R.string.offline_notification_text)).e(true).k(pendingIntentA2).h(pendingIntentA).q(context.getApplicationInfo().icon).b());
        M4(str2, "offline_notification_impression", new HashMap());
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void zzg() {
        x21 x21Var = this.f5786h;
        final jr jrVar = this.f5785g;
        x21Var.b(new vs1(jrVar) { // from class: com.google.android.gms.internal.ads.r21
            private final jr a;

            {
                this.a = jrVar;
            }

            @Override // com.google.android.gms.internal.ads.vs1
            public final Object zza(Object obj) {
                x21.s(this.a, (SQLiteDatabase) obj);
                return null;
            }
        });
    }
}