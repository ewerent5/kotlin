package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;

/* compiled from: AlarmManagerScheduler.java */
/* loaded from: classes.dex */
public class a implements s {
    private final Context a;

    /* renamed from: b */
    private final e.c.b.a.i.w.j.c f4389b;

    /* renamed from: c */
    private AlarmManager f4390c;

    /* renamed from: d */
    private final g f4391d;

    /* renamed from: e */
    private final e.c.b.a.i.y.a f4392e;

    public a(Context context, e.c.b.a.i.w.j.c cVar, e.c.b.a.i.y.a aVar, g gVar) {
        this(context, cVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public void a(e.c.b.a.i.m mVar, int i2) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", mVar.b());
        builder.appendQueryParameter("priority", String.valueOf(e.c.b.a.i.z.a.a(mVar.d())));
        if (mVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(mVar.c(), 0));
        }
        Intent intent = new Intent(this.a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (b(intent)) {
            e.c.b.a.i.u.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long jD0 = this.f4389b.D0(mVar);
        long jG = this.f4391d.g(mVar.d(), jD0, i2);
        e.c.b.a.i.u.a.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", mVar, Long.valueOf(jG), Long.valueOf(jD0), Integer.valueOf(i2));
        this.f4390c.set(3, this.f4392e.a() + jG, PendingIntent.getBroadcast(this.a, 0, intent, 0));
    }

    boolean b(Intent intent) {
        return PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null;
    }

    a(Context context, e.c.b.a.i.w.j.c cVar, AlarmManager alarmManager, e.c.b.a.i.y.a aVar, g gVar) {
        this.a = context;
        this.f4389b = cVar;
        this.f4390c = alarmManager;
        this.f4392e = aVar;
        this.f4391d = gVar;
    }
}