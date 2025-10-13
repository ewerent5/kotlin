package e.g.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: IabBroadcastReceiver.java */
/* loaded from: classes.dex */
public class d extends BroadcastReceiver {
    private final a a;

    /* compiled from: IabBroadcastReceiver.java */
    public interface a {
        void a();
    }

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }
}