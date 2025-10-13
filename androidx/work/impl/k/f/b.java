package androidx.work.impl.k.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.h;

/* compiled from: BatteryNotLowTracker.java */
/* loaded from: classes.dex */
public class b extends c<Boolean> {

    /* renamed from: i, reason: collision with root package name */
    private static final String f2271i = h.f("BatteryNotLowTracker");

    public b(Context context, androidx.work.impl.utils.k.a aVar) {
        super(context, aVar);
    }

    @Override // androidx.work.impl.k.f.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.k.f.c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        h.c().a(f2271i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            d(Boolean.FALSE);
        }
    }

    @Override // androidx.work.impl.k.f.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent intentRegisterReceiver = this.f2275c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("plugged", 0) != 0 || intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        h.c().b(f2271i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}