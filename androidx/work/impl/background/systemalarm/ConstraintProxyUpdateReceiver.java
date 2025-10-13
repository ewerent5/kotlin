package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.h;
import androidx.work.impl.background.systemalarm.ConstraintProxy;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    static final String a = h.f("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Intent f2139e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f2140f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f2141g;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f2139e = intent;
            this.f2140f = context;
            this.f2141g = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f2139e.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f2139e.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f2139e.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f2139e.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                h.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                androidx.work.impl.utils.d.a(this.f2140f, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                androidx.work.impl.utils.d.a(this.f2140f, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                androidx.work.impl.utils.d.a(this.f2140f, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                androidx.work.impl.utils.d.a(this.f2140f, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f2141g.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            androidx.work.impl.h.j(context).o().b(new a(intent, context, goAsync()));
        } else {
            h.c().a(a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}