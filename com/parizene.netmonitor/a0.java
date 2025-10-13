package com.parizene.netmonitor;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.i;
import com.parizene.netmonitor.ui.HomeActivity;

/* compiled from: NotificationHelper.java */
/* loaded from: classes.dex */
public class a0 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f13004b;

    public a0(Context context, NotificationManager notificationManager) {
        this.a = context;
        this.f13004b = notificationManager;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("channel_background_service", context.getString(R.string.channel_background_service), 3);
            notificationChannel.setShowBadge(false);
            notificationChannel.enableVibration(false);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
            NotificationChannel notificationChannel2 = new NotificationChannel("channel_other", context.getString(R.string.channel_other), 3);
            notificationChannel2.setShowBadge(false);
            notificationChannel2.enableVibration(false);
            notificationChannel2.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel2);
        }
    }

    private static String f(long j2, long j3) {
        if (j2 <= 0) {
            return null;
        }
        return ((int) ((j3 * 100) / j2)) + "%";
    }

    public Notification a(String str, String str2, String str3) {
        i.d dVar = new i.d(this.a, "channel_background_service");
        dVar.q(R.drawable.ic_stat_notify);
        dVar.j(str);
        dVar.i(str2);
        dVar.r(new i.b().g(str2).h(str3));
        dVar.h(PendingIntent.getActivity(this.a, 0, new Intent(this.a, (Class<?>) HomeActivity.class), 134217728));
        return dVar.b();
    }

    public Notification b(boolean z, String str) {
        return c(this.a.getString(z ? R.string.notify_import_cell_db_finished : R.string.notify_export_cell_db_finished), str, new Intent(this.a, (Class<?>) HomeActivity.class));
    }

    public Notification c(String str, String str2, Intent intent) {
        i.d dVar = new i.d(this.a, "channel_other");
        dVar.e(true);
        dVar.q(android.R.drawable.stat_sys_download_done);
        dVar.j(str);
        dVar.i(str2);
        dVar.h(PendingIntent.getActivity(this.a, 0, intent, 0));
        return dVar.b();
    }

    public Notification d(boolean z, int i2, int i3) {
        return e(this.a.getString(z ? R.string.notify_import_cell_db_ticker : R.string.notify_export_cell_db_ticker), i3 + "/" + i2, i2, i3, new Intent(this.a, (Class<?>) HomeActivity.class));
    }

    public Notification e(String str, String str2, long j2, long j3, Intent intent) {
        i.d dVar = new i.d(this.a, "channel_other");
        dVar.n(true);
        dVar.q(android.R.drawable.stat_sys_download);
        dVar.h(PendingIntent.getActivity(this.a, 0, intent, 0));
        dVar.j(str);
        dVar.i(str2);
        dVar.g(f(j2, j3));
        dVar.p((int) j2, (int) j3, j2 == -1);
        return dVar.b();
    }

    public void g(int i2) {
        this.f13004b.cancel(i2);
    }

    public void h() {
        this.f13004b.cancelAll();
    }

    public void i(int i2, Notification notification) {
        this.f13004b.notify(i2, notification);
    }
}