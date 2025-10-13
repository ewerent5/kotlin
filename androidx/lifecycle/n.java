package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: LifecycleService.java */
/* loaded from: classes.dex */
public class n extends Service implements k {

    /* renamed from: e, reason: collision with root package name */
    private final w f1221e = new w(this);

    @Override // androidx.lifecycle.k
    public g i() {
        return this.f1221e.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f1221e.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1221e.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f1221e.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        this.f1221e.e();
        super.onStart(intent, i2);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }
}