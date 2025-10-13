package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.w3;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzbw {
    private boolean zzd;
    private Context zze;
    private boolean zzc = false;

    @GuardedBy("this")
    private final Map<BroadcastReceiver, IntentFilter> zzb = new WeakHashMap();

    @GuardedBy("this")
    private final BroadcastReceiver zza = new zzbv(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zze(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.zzb.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((BroadcastReceiver) arrayList.get(i2)).onReceive(context, intent);
        }
    }

    public final synchronized void zza(Context context) {
        if (this.zzc) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        if (applicationContext == null) {
            this.zze = context;
        }
        w3.a(this.zze);
        this.zzd = ((Boolean) c.c().b(w3.d2)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.zze.registerReceiver(this.zza, intentFilter);
        this.zzc = true;
    }

    public final synchronized void zzb(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.zzd) {
            this.zzb.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.zzd) {
            this.zzb.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}