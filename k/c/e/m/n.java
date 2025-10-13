package k.c.e.m;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.joran.action.Action;

/* compiled from: MapTileFileStorageProviderBase.java */
/* loaded from: classes3.dex */
public abstract class n extends p {

    /* renamed from: e, reason: collision with root package name */
    private final k.c.e.d f16647e;

    /* renamed from: f, reason: collision with root package name */
    private b f16648f;

    /* compiled from: MapTileFileStorageProviderBase.java */
    private class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.MEDIA_MOUNTED".equals(action)) {
                n.this.n();
            } else if ("android.intent.action.MEDIA_UNMOUNTED".equals(action)) {
                n.this.o();
            }
        }
    }

    public n(k.c.e.d dVar, int i2, int i3) {
        super(i2, i3);
        this.f16647e = dVar;
        this.f16648f = new b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme(Action.FILE_ATTRIBUTE);
        dVar.b(this.f16648f, intentFilter);
    }

    @Override // k.c.e.m.p
    public void c() {
        b bVar = this.f16648f;
        if (bVar != null) {
            this.f16647e.a(bVar);
            this.f16648f = null;
        }
        super.c();
    }

    protected void n() {
    }

    protected void o() {
    }
}