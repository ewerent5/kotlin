package e.c.b.d.a.b;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p<T extends IInterface> {
    private static final Map<String, Handler> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f15348b;

    /* renamed from: c, reason: collision with root package name */
    private final f f15349c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15350d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15352f;

    /* renamed from: g, reason: collision with root package name */
    private final Intent f15353g;

    /* renamed from: h, reason: collision with root package name */
    private final l<T> f15354h;

    /* renamed from: k, reason: collision with root package name */
    private ServiceConnection f15357k;

    /* renamed from: l, reason: collision with root package name */
    private T f15358l;

    /* renamed from: e, reason: collision with root package name */
    private final List<g> f15351e = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f15356j = new IBinder.DeathRecipient(this) { // from class: e.c.b.d.a.b.h
        private final p a;

        {
            this.a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.a.n();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference<k> f15355i = new WeakReference<>(null);

    public p(Context context, f fVar, String str, Intent intent, l<T> lVar) {
        this.f15348b = context;
        this.f15349c = fVar;
        this.f15350d = str;
        this.f15353g = intent;
        this.f15354h = lVar;
    }

    static /* synthetic */ void d(p pVar, g gVar) {
        if (pVar.f15358l != null || pVar.f15352f) {
            if (!pVar.f15352f) {
                gVar.run();
                return;
            } else {
                pVar.f15349c.d("Waiting to bind to the service.", new Object[0]);
                pVar.f15351e.add(gVar);
                return;
            }
        }
        pVar.f15349c.d("Initiate binding to the service.", new Object[0]);
        pVar.f15351e.add(gVar);
        o oVar = new o(pVar);
        pVar.f15357k = oVar;
        pVar.f15352f = true;
        if (pVar.f15348b.bindService(pVar.f15353g, oVar, 1)) {
            return;
        }
        pVar.f15349c.d("Failed to bind to the service.", new Object[0]);
        pVar.f15352f = false;
        Iterator<g> it = pVar.f15351e.iterator();
        while (it.hasNext()) {
            it.next().b(new q());
        }
        pVar.f15351e.clear();
    }

    static /* synthetic */ void j(p pVar) throws RemoteException {
        pVar.f15349c.d("linkToDeath", new Object[0]);
        try {
            pVar.f15358l.asBinder().linkToDeath(pVar.f15356j, 0);
        } catch (RemoteException e2) {
            pVar.f15349c.c(e2, "linkToDeath failed", new Object[0]);
        }
    }

    static /* synthetic */ void m(p pVar) {
        pVar.f15349c.d("unlinkToDeath", new Object[0]);
        pVar.f15358l.asBinder().unlinkToDeath(pVar.f15356j, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(g gVar) {
        Handler handler;
        Map<String, Handler> map = a;
        synchronized (map) {
            if (!map.containsKey(this.f15350d)) {
                HandlerThread handlerThread = new HandlerThread(this.f15350d, 10);
                handlerThread.start();
                map.put(this.f15350d, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f15350d);
        }
        handler.post(gVar);
    }

    public final void a(g gVar) {
        r(new i(this, gVar.c(), gVar));
    }

    public final void b() {
        r(new j(this));
    }

    public final T c() {
        return this.f15358l;
    }

    final /* bridge */ /* synthetic */ void n() {
        this.f15349c.d("reportBinderDeath", new Object[0]);
        k kVar = this.f15355i.get();
        if (kVar != null) {
            this.f15349c.d("calling onBinderDied", new Object[0]);
            kVar.a();
            return;
        }
        this.f15349c.d("%s : Binder has died.", this.f15350d);
        Iterator<g> it = this.f15351e.iterator();
        while (it.hasNext()) {
            it.next().b(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f15350d).concat(" : Binder has died.")));
        }
        this.f15351e.clear();
    }
}