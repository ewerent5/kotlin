package androidx.work.impl.k.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.h;

/* compiled from: BroadcastReceiverConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: g, reason: collision with root package name */
    private static final String f2272g = h.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: h, reason: collision with root package name */
    private final BroadcastReceiver f2273h;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, androidx.work.impl.utils.k.a aVar) {
        super(context, aVar);
        this.f2273h = new a();
    }

    @Override // androidx.work.impl.k.f.d
    public void e() {
        h.c().a(f2272g, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f2275c.registerReceiver(this.f2273h, g());
    }

    @Override // androidx.work.impl.k.f.d
    public void f() {
        h.c().a(f2272g, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f2275c.unregisterReceiver(this.f2273h);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}