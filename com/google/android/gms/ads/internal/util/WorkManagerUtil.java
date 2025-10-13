package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.work.b;
import androidx.work.c;
import androidx.work.e;
import androidx.work.i;
import androidx.work.j;
import androidx.work.o;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.er;
import e.c.b.b.b.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbg {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void zzb(Context context) {
        try {
            o.e(context.getApplicationContext(), new b.a().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbh
    public final boolean zze(@RecentlyNonNull e.c.b.b.b.b bVar, @RecentlyNonNull String str, @RecentlyNonNull String str2) throws Throwable {
        Context context = (Context) d.Y(bVar);
        zzb(context);
        c cVarA = new c.a().b(i.CONNECTED).a();
        try {
            o.d(context).b(new j.a(OfflineNotificationPoster.class).e(cVarA).f(new e.a().e("uri", str).e("gws_query_id", str2).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e2) {
            er.zzj("Failed to instantiate WorkManager.", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbh
    public final void zzf(@RecentlyNonNull e.c.b.b.b.b bVar) {
        Context context = (Context) d.Y(bVar);
        zzb(context);
        try {
            o oVarD = o.d(context);
            oVarD.a("offline_ping_sender_work");
            oVarD.b(new j.a(OfflinePingSender.class).e(new c.a().b(i.CONNECTED).a()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e2) {
            er.zzj("Failed to instantiate WorkManager.", e2);
        }
    }
}