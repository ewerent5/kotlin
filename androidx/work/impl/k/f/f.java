package androidx.work.impl.k.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.h;

/* compiled from: StorageNotLowTracker.java */
/* loaded from: classes.dex */
public class f extends c<Boolean> {

    /* renamed from: i, reason: collision with root package name */
    private static final String f2285i = h.f("StorageNotLowTracker");

    public f(Context context, androidx.work.impl.utils.k.a aVar) {
        super(context, aVar);
    }

    @Override // androidx.work.impl.k.f.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.k.f.c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        h.c().a(f2285i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            d(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            d(Boolean.TRUE);
        }
    }

    @Override // androidx.work.impl.k.f.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent intentRegisterReceiver = this.f2275c.registerReceiver(null, g());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}