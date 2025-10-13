package e.c.b.d.a.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
final class o implements ServiceConnection {
    final /* synthetic */ p a;

    /* synthetic */ o(p pVar) {
        this.a = pVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.f15349c.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.r(new m(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.f15349c.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.r(new n(this));
    }
}