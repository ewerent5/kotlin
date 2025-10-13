package k.c.e.o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: SimpleRegisterReceiver.java */
/* loaded from: classes3.dex */
public class d implements k.c.e.d {
    private Context a;

    public d(Context context) {
        this.a = context;
    }

    @Override // k.c.e.d
    public void a(BroadcastReceiver broadcastReceiver) {
        this.a.unregisterReceiver(broadcastReceiver);
    }

    @Override // k.c.e.d
    public Intent b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return this.a.registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override // k.c.e.d
    public void destroy() {
        this.a = null;
    }
}