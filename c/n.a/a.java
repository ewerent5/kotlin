package c.n.a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter;

/* compiled from: WakefulBroadcastReceiver.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class a extends BroadcastReceiver {
    private static final SparseArray<PowerManager.WakeLock> a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static int f3268b = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = a;
        synchronized (sparseArray) {
            int i2 = f3268b;
            int i3 = i2 + 1;
            f3268b = i3;
            if (i3 <= 0) {
                f3268b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i2);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(ReconfigureOnChangeFilter.DEFAULT_REFRESH_PERIOD);
            sparseArray.put(i2, wakeLockNewWakeLock);
            return componentNameStartService;
        }
    }
}