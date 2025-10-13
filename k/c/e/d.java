package k.c.e;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: IRegisterReceiver.java */
/* loaded from: classes3.dex */
public interface d {
    void a(BroadcastReceiver broadcastReceiver);

    Intent b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

    void destroy();
}