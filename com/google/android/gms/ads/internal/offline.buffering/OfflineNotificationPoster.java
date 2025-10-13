package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.kj;
import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.ads.ta3;
import e.c.b.b.b.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {
    private final kj zza;

    public OfflineNotificationPoster(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = ta3.b().i(context, new pf());
    }

    @Override // androidx.work.Worker
    @RecentlyNonNull
    public final ListenableWorker.a doWork() {
        try {
            this.zza.e0(d.m4(getApplicationContext()), getInputData().i("uri"), getInputData().i("gws_query_id"));
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}