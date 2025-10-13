package com.google.android.gms.common;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: c */
    private static final Object f4643c = new Object();

    /* renamed from: d */
    private static final e f4644d = new e();

    /* renamed from: e */
    public static final int f4645e = f.a;

    /* renamed from: f */
    private String f4646f;

    @SuppressLint({"HandlerLeak"})
    private class a extends e.c.b.b.c.b.d {
        private final Context a;

        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i2);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int iG = e.this.g(this.a);
            if (e.this.i(iG)) {
                e.this.n(this.a, iG);
            }
        }
    }

    public static e l() {
        return f4644d;
    }

    static Dialog o(Context context, int i2, com.google.android.gms.common.internal.f fVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.d.d(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strC = com.google.android.gms.common.internal.d.c(context, i2);
        if (strC != null) {
            builder.setPositiveButton(strC, fVar);
        }
        String strG = com.google.android.gms.common.internal.d.g(context, i2);
        if (strG != null) {
            builder.setTitle(strG);
        }
        return builder.create();
    }

    static void p(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof androidx.fragment.app.d) {
            m.T2(dialog, onCancelListener).S2(((androidx.fragment.app.d) activity).y(), str);
        } else {
            c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        }
    }

    @TargetApi(20)
    private final void r(Context context, int i2, String str, PendingIntent pendingIntent) {
        int i3;
        if (i2 == 18) {
            q(context);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strF = com.google.android.gms.common.internal.d.f(context, i2);
        String strE = com.google.android.gms.common.internal.d.e(context, i2);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        i.d dVarR = new i.d(context).m(true).e(true).j(strF).r(new i.b().g(strE));
        if (com.google.android.gms.common.util.j.d(context)) {
            p.m(com.google.android.gms.common.util.n.g());
            dVarR.q(context.getApplicationInfo().icon).o(2);
            if (com.google.android.gms.common.util.j.f(context)) {
                dVarR.a(e.c.b.b.a.a.a, resources.getString(e.c.b.b.a.b.o), pendingIntent);
            } else {
                dVarR.h(pendingIntent);
            }
        } else {
            dVarR.q(R.drawable.stat_sys_warning).s(resources.getString(e.c.b.b.a.b.f14342h)).t(System.currentTimeMillis()).h(pendingIntent).i(strE);
        }
        if (com.google.android.gms.common.util.n.k()) {
            p.m(com.google.android.gms.common.util.n.k());
            String strT = t();
            if (strT == null) {
                strT = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strB = com.google.android.gms.common.internal.d.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", strB, 4));
                } else if (!strB.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(strB);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            dVarR.f(strT);
        }
        Notification notificationB = dVarR.b();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            i3 = 10436;
            j.f4759b.set(false);
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationB);
    }

    private final String t() {
        String str;
        synchronized (f4643c) {
            str = this.f4646f;
        }
        return str;
    }

    @Override // com.google.android.gms.common.f
    public Intent b(Context context, int i2, String str) {
        return super.b(context, i2, str);
    }

    @Override // com.google.android.gms.common.f
    public PendingIntent c(Context context, int i2, int i3) {
        return super.c(context, i2, i3);
    }

    @Override // com.google.android.gms.common.f
    public final String e(int i2) {
        return super.e(i2);
    }

    @Override // com.google.android.gms.common.f
    public int g(Context context) {
        return super.g(context);
    }

    @Override // com.google.android.gms.common.f
    public int h(Context context, int i2) {
        return super.h(context, i2);
    }

    @Override // com.google.android.gms.common.f
    public final boolean i(int i2) {
        return super.i(i2);
    }

    public Dialog j(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return o(activity, i2, com.google.android.gms.common.internal.f.a(activity, b(activity, i2, DateTokenConverter.CONVERTER_KEY), i3), onCancelListener);
    }

    public PendingIntent k(Context context, b bVar) {
        return bVar.K() ? bVar.J() : c(context, bVar.c(), 0);
    }

    public boolean m(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogJ = j(activity, i2, i3, onCancelListener);
        if (dialogJ == null) {
            return false;
        }
        p(activity, dialogJ, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void n(Context context, int i2) {
        r(context, i2, null, d(context, i2, 0, "n"));
    }

    final void q(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean s(Context context, b bVar, int i2) {
        PendingIntent pendingIntentK = k(context, bVar);
        if (pendingIntentK == null) {
            return false;
        }
        r(context, bVar.c(), null, GoogleApiActivity.a(context, pendingIntentK, i2));
        return true;
    }
}