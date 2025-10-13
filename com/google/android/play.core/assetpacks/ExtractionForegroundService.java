package com.google.android.play.core.assetpacks;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

/* loaded from: classes.dex */
public class ExtractionForegroundService extends Service {

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.d.a.b.f f11927e = new e.c.b.d.a.b.f("ExtractionForegroundService");

    /* renamed from: f, reason: collision with root package name */
    Context f11928f;

    /* renamed from: g, reason: collision with root package name */
    g2 f11929g;

    /* renamed from: h, reason: collision with root package name */
    NotificationManager f11930h;

    private final synchronized void a(Intent intent) {
        int intExtra;
        String stringExtra = intent.getStringExtra("notification_title");
        String stringExtra2 = intent.getStringExtra("notification_subtext");
        long longExtra = intent.getLongExtra("notification_timeout", 600000L);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("notification_on_click_intent");
        int i2 = Build.VERSION.SDK_INT;
        Notification.Builder timeoutAfter = i2 >= 26 ? new Notification.Builder(this.f11928f, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(longExtra) : new Notification.Builder(this.f11928f).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        Notification.Builder contentTitle = timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false).setContentTitle(stringExtra == null ? "Downloading additional file" : stringExtra);
        if (stringExtra2 == null) {
            stringExtra = "Transferring";
        }
        contentTitle.setSubText(stringExtra);
        if (i2 >= 21 && (intExtra = intent.getIntExtra("notification_color", 0)) != 0) {
            timeoutAfter.setColor(intExtra).setVisibility(-1);
        }
        Notification notificationBuild = timeoutAfter.build();
        this.f11927e.d("Starting foreground installation service.", new Object[0]);
        this.f11929g.a(true);
        if (i2 >= 26) {
            c(intent.getStringExtra("notification_channel_name"));
        }
        startForeground(-1883842196, notificationBuild);
    }

    private final synchronized void b() {
        this.f11927e.d("Stopping service.", new Object[0]);
        this.f11929g.a(false);
        stopForeground(true);
        stopSelf();
    }

    @TargetApi(26)
    private final synchronized void c(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        this.f11930h.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        i1.h(getApplicationContext()).a(this);
        this.f11930h = (NotificationManager) this.f11928f.getSystemService("notification");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        a(intent);
        int intExtra = intent.getIntExtra("action_type", 0);
        if (intExtra == 2) {
            b();
        } else {
            this.f11927e.b("Unknown action type received: %d", Integer.valueOf(intExtra));
        }
        return 2;
    }
}