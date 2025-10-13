package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.a;
import com.google.android.gms.common.f;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.p;
import e.c.b.b.c.a.d;
import e.c.b.b.c.a.e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class AdvertisingIdClient {

    @GuardedBy("this")
    private final Context mContext;

    @GuardedBy("this")
    private a zze;

    @GuardedBy("this")
    private d zzf;

    @GuardedBy("this")
    private boolean zzg;
    private final Object zzh;

    @GuardedBy("mAutoDisconnectTaskLock")
    private zza zzi;
    private final boolean zzj;
    private final long zzk;

    public static final class Info {
        private final String zzq;
        private final boolean zzr;

        public Info(String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final String toString() {
            String str = this.zzq;
            boolean z = this.zzr;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    static class zza extends Thread {
        private WeakReference<AdvertisingIdClient> zzm;
        private long zzn;
        CountDownLatch zzo = new CountDownLatch(1);
        boolean zzp = false;

        public zza(AdvertisingIdClient advertisingIdClient, long j2) {
            this.zzm = new WeakReference<>(advertisingIdClient);
            this.zzn = j2;
            start();
        }

        private final void disconnect() {
            AdvertisingIdClient advertisingIdClient = this.zzm.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.zzp = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.zzo.await(this.zzn, TimeUnit.MILLISECONDS)) {
                    return;
                }
                disconnect();
            } catch (InterruptedException unused) {
                disconnect();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    private AdvertisingIdClient(Context context, long j2, boolean z, boolean z2) {
        Context applicationContext;
        this.zzh = new Object();
        p.j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j2;
        this.zzj = z2;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        zzb zzbVar = new zzb(context);
        boolean z = zzbVar.getBoolean("gads:ad_id_app_context:enabled", false);
        float f2 = zzbVar.getFloat("gads:ad_id_app_context:ping_ratio", 0.0f);
        String string = zzbVar.getString("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, z, zzbVar.getBoolean("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            Info info = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info, z, f2, SystemClock.elapsedRealtime() - jElapsedRealtime, string, null);
            return info;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        zzb zzbVar = new zzb(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, zzbVar.getBoolean("gads:ad_id_app_context:enabled", false), zzbVar.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private static a zza(Context context, boolean z) throws PackageManager.NameNotFoundException, IOException, g {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int iH = f.f().h(context, 12451000);
            if (iH != 0 && iH != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            a aVar = new a();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (com.google.android.gms.common.o.a.b().a(context, intent, aVar, 1)) {
                    return aVar;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new g(9);
        }
    }

    private static d zza(Context context, a aVar) throws IOException {
        try {
            return e.R(aVar.a(AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private final void zza() {
        synchronized (this.zzh) {
            zza zzaVar = this.zzi;
            if (zzaVar != null) {
                zzaVar.zzo.countDown();
                try {
                    this.zzi.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.zzk > 0) {
                this.zzi = new zza(this, this.zzk);
            }
        }
    }

    private final void zza(boolean z) {
        p.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                finish();
            }
            a aVarZza = zza(this.mContext, this.zzj);
            this.zze = aVarZza;
            this.zzf = zza(this.mContext, aVarZza);
            this.zzg = true;
            if (z) {
                zza();
            }
        }
    }

    private final boolean zza(Info info, boolean z, float f2, long j2, String str, Throwable th) {
        if (Math.random() > f2) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", z ? "1" : "0");
        if (info != null) {
            map.put("limit_ad_tracking", info.isLimitAdTrackingEnabled() ? "1" : "0");
        }
        if (info != null && info.getId() != null) {
            map.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            map.put("experiment_id", str);
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j2));
        new com.google.android.gms.ads.identifier.zza(this, map).start();
        return true;
    }

    private final boolean zzb() {
        boolean zZzc;
        p.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                p.j(this.zze);
                p.j(this.zzf);
                zZzc = this.zzf.zzc();
            } else {
                synchronized (this.zzh) {
                    zza zzaVar = this.zzi;
                    if (zzaVar == null || !zzaVar.zzp) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    p.j(this.zze);
                    p.j(this.zzf);
                    try {
                        zZzc = this.zzf.zzc();
                    } catch (RemoteException e2) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
        }
        zza();
        return zZzc;
    }

    protected void finalize() throws Throwable {
        finish();
        super.finalize();
    }

    public final void finish() {
        p.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.mContext == null || this.zze == null) {
                return;
            }
            try {
                if (this.zzg) {
                    com.google.android.gms.common.o.a.b().c(this.mContext, this.zze);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.zzg = false;
            this.zzf = null;
            this.zze = null;
        }
    }

    public Info getInfo() {
        Info info;
        p.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                p.j(this.zze);
                p.j(this.zzf);
                info = new Info(this.zzf.G(), this.zzf.t1(true));
            } else {
                synchronized (this.zzh) {
                    zza zzaVar = this.zzi;
                    if (zzaVar == null || !zzaVar.zzp) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    p.j(this.zze);
                    p.j(this.zzf);
                    try {
                        info = new Info(this.zzf.G(), this.zzf.t1(true));
                    } catch (RemoteException e2) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
        }
        zza();
        return info;
    }

    public void start() {
        zza(true);
    }
}