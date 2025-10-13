package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class b implements Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final Status f4562e = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: f, reason: collision with root package name */
    private static final Status f4563f = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: g, reason: collision with root package name */
    private static final Object f4564g = new Object();

    /* renamed from: h, reason: collision with root package name */
    @GuardedBy("lock")
    private static b f4565h;

    /* renamed from: l, reason: collision with root package name */
    private final Context f4569l;

    /* renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.common.e f4570m;
    private final com.google.android.gms.common.internal.j n;

    @GuardedBy("lock")
    private i r;
    private final Handler u;

    /* renamed from: i, reason: collision with root package name */
    private long f4566i = 5000;

    /* renamed from: j, reason: collision with root package name */
    private long f4567j = 120000;

    /* renamed from: k, reason: collision with root package name */
    private long f4568k = AbstractComponentTracker.LINGERING_TIMEOUT;
    private final AtomicInteger o = new AtomicInteger(1);
    private final AtomicInteger p = new AtomicInteger(0);
    private final Map<c0<?>, a<?>> q = new ConcurrentHashMap(5, 0.75f, 1);

    @GuardedBy("lock")
    private final Set<c0<?>> s = new c.e.b();
    private final Set<c0<?>> t = new c.e.b();

    public class a<O extends a.d> implements com.google.android.gms.common.api.f, com.google.android.gms.common.api.g {

        /* renamed from: f, reason: collision with root package name */
        private final a.f f4572f;

        /* renamed from: g, reason: collision with root package name */
        private final a.b f4573g;

        /* renamed from: h, reason: collision with root package name */
        private final c0<O> f4574h;

        /* renamed from: i, reason: collision with root package name */
        private final h f4575i;

        /* renamed from: l, reason: collision with root package name */
        private final int f4578l;

        /* renamed from: m, reason: collision with root package name */
        private final u f4579m;
        private boolean n;

        /* renamed from: e, reason: collision with root package name */
        private final Queue<k> f4571e = new LinkedList();

        /* renamed from: j, reason: collision with root package name */
        private final Set<d0> f4576j = new HashSet();

        /* renamed from: k, reason: collision with root package name */
        private final Map<f<?>, s> f4577k = new HashMap();
        private final List<C0112b> o = new ArrayList();
        private com.google.android.gms.common.b p = null;

        public a(com.google.android.gms.common.api.e<O> eVar) {
            a.f fVarC = eVar.c(b.this.u.getLooper(), this);
            this.f4572f = fVarC;
            if (fVarC instanceof com.google.android.gms.common.internal.u) {
                this.f4573g = ((com.google.android.gms.common.internal.u) fVarC).g();
            } else {
                this.f4573g = fVarC;
            }
            this.f4574h = eVar.e();
            this.f4575i = new h();
            this.f4578l = eVar.b();
            if (fVarC.requiresSignIn()) {
                this.f4579m = eVar.d(b.this.f4569l, b.this.u);
            } else {
                this.f4579m = null;
            }
        }

        private final void B(k kVar) {
            kVar.d(this.f4575i, d());
            try {
                kVar.c(this);
            } catch (DeadObjectException unused) {
                R(1);
                this.f4572f.disconnect();
            }
        }

        private final boolean C(boolean z) {
            com.google.android.gms.common.internal.p.d(b.this.u);
            if (!this.f4572f.isConnected() || this.f4577k.size() != 0) {
                return false;
            }
            if (!this.f4575i.b()) {
                this.f4572f.disconnect();
                return true;
            }
            if (z) {
                y();
            }
            return false;
        }

        private final boolean H(com.google.android.gms.common.b bVar) {
            synchronized (b.f4564g) {
                if (b.this.r != null && b.this.s.contains(this.f4574h)) {
                    i unused = b.this.r;
                    throw null;
                }
            }
            return false;
        }

        private final void I(com.google.android.gms.common.b bVar) {
            for (d0 d0Var : this.f4576j) {
                String endpointPackageName = null;
                if (com.google.android.gms.common.internal.o.a(bVar, com.google.android.gms.common.b.f4622e)) {
                    endpointPackageName = this.f4572f.getEndpointPackageName();
                }
                d0Var.a(this.f4574h, bVar, endpointPackageName);
            }
            this.f4576j.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final com.google.android.gms.common.d f(com.google.android.gms.common.d[] dVarArr) {
            if (dVarArr != null && dVarArr.length != 0) {
                com.google.android.gms.common.d[] availableFeatures = this.f4572f.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new com.google.android.gms.common.d[0];
                }
                c.e.a aVar = new c.e.a(availableFeatures.length);
                for (com.google.android.gms.common.d dVar : availableFeatures) {
                    aVar.put(dVar.c(), Long.valueOf(dVar.I()));
                }
                for (com.google.android.gms.common.d dVar2 : dVarArr) {
                    if (!aVar.containsKey(dVar2.c()) || ((Long) aVar.get(dVar2.c())).longValue() < dVar2.I()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(C0112b c0112b) {
            if (this.o.contains(c0112b) && !this.n) {
                if (this.f4572f.isConnected()) {
                    s();
                } else {
                    a();
                }
            }
        }

        static /* synthetic */ boolean k(a aVar, boolean z) {
            return aVar.C(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void o(C0112b c0112b) {
            com.google.android.gms.common.d[] dVarArrG;
            if (this.o.remove(c0112b)) {
                b.this.u.removeMessages(15, c0112b);
                b.this.u.removeMessages(16, c0112b);
                com.google.android.gms.common.d dVar = c0112b.f4580b;
                ArrayList arrayList = new ArrayList(this.f4571e.size());
                for (k kVar : this.f4571e) {
                    if ((kVar instanceof t) && (dVarArrG = ((t) kVar).g(this)) != null && com.google.android.gms.common.util.b.b(dVarArrG, dVar)) {
                        arrayList.add(kVar);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    k kVar2 = (k) obj;
                    this.f4571e.remove(kVar2);
                    kVar2.e(new com.google.android.gms.common.api.l(dVar));
                }
            }
        }

        private final boolean p(k kVar) {
            if (!(kVar instanceof t)) {
                B(kVar);
                return true;
            }
            t tVar = (t) kVar;
            com.google.android.gms.common.d dVarF = f(tVar.g(this));
            if (dVarF == null) {
                B(kVar);
                return true;
            }
            if (!tVar.h(this)) {
                tVar.e(new com.google.android.gms.common.api.l(dVarF));
                return false;
            }
            C0112b c0112b = new C0112b(this.f4574h, dVarF, null);
            int iIndexOf = this.o.indexOf(c0112b);
            if (iIndexOf >= 0) {
                C0112b c0112b2 = this.o.get(iIndexOf);
                b.this.u.removeMessages(15, c0112b2);
                b.this.u.sendMessageDelayed(Message.obtain(b.this.u, 15, c0112b2), b.this.f4566i);
                return false;
            }
            this.o.add(c0112b);
            b.this.u.sendMessageDelayed(Message.obtain(b.this.u, 15, c0112b), b.this.f4566i);
            b.this.u.sendMessageDelayed(Message.obtain(b.this.u, 16, c0112b), b.this.f4567j);
            com.google.android.gms.common.b bVar = new com.google.android.gms.common.b(2, null);
            if (H(bVar)) {
                return false;
            }
            b.this.i(bVar, this.f4578l);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void q() {
            v();
            I(com.google.android.gms.common.b.f4622e);
            x();
            Iterator<s> it = this.f4577k.values().iterator();
            if (it.hasNext()) {
                g<a.b, ?> gVar = it.next().a;
                throw null;
            }
            s();
            y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r() {
            v();
            this.n = true;
            this.f4575i.d();
            b.this.u.sendMessageDelayed(Message.obtain(b.this.u, 9, this.f4574h), b.this.f4566i);
            b.this.u.sendMessageDelayed(Message.obtain(b.this.u, 11, this.f4574h), b.this.f4567j);
            b.this.n.a();
        }

        private final void s() {
            ArrayList arrayList = new ArrayList(this.f4571e);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                k kVar = (k) obj;
                if (!this.f4572f.isConnected()) {
                    return;
                }
                if (p(kVar)) {
                    this.f4571e.remove(kVar);
                }
            }
        }

        private final void x() {
            if (this.n) {
                b.this.u.removeMessages(11, this.f4574h);
                b.this.u.removeMessages(9, this.f4574h);
                this.n = false;
            }
        }

        private final void y() {
            b.this.u.removeMessages(12, this.f4574h);
            b.this.u.sendMessageDelayed(b.this.u.obtainMessage(12, this.f4574h), b.this.f4568k);
        }

        public final void A(Status status) {
            com.google.android.gms.common.internal.p.d(b.this.u);
            Iterator<k> it = this.f4571e.iterator();
            while (it.hasNext()) {
                it.next().b(status);
            }
            this.f4571e.clear();
        }

        public final void G(com.google.android.gms.common.b bVar) {
            com.google.android.gms.common.internal.p.d(b.this.u);
            this.f4572f.disconnect();
            U(bVar);
        }

        @Override // com.google.android.gms.common.api.f
        public final void R(int i2) {
            if (Looper.myLooper() == b.this.u.getLooper()) {
                r();
            } else {
                b.this.u.post(new n(this));
            }
        }

        @Override // com.google.android.gms.common.api.g
        public final void U(com.google.android.gms.common.b bVar) {
            com.google.android.gms.common.internal.p.d(b.this.u);
            u uVar = this.f4579m;
            if (uVar != null) {
                uVar.L4();
            }
            v();
            b.this.n.a();
            I(bVar);
            if (bVar.c() == 4) {
                A(b.f4563f);
                return;
            }
            if (this.f4571e.isEmpty()) {
                this.p = bVar;
                return;
            }
            if (H(bVar) || b.this.i(bVar, this.f4578l)) {
                return;
            }
            if (bVar.c() == 18) {
                this.n = true;
            }
            if (this.n) {
                b.this.u.sendMessageDelayed(Message.obtain(b.this.u, 9, this.f4574h), b.this.f4566i);
                return;
            }
            String strA = this.f4574h.a();
            StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 38);
            sb.append("API: ");
            sb.append(strA);
            sb.append(" is not available on this device.");
            A(new Status(17, sb.toString()));
        }

        @Override // com.google.android.gms.common.api.f
        public final void Y(Bundle bundle) {
            if (Looper.myLooper() == b.this.u.getLooper()) {
                q();
            } else {
                b.this.u.post(new m(this));
            }
        }

        public final void a() {
            com.google.android.gms.common.internal.p.d(b.this.u);
            if (this.f4572f.isConnected() || this.f4572f.isConnecting()) {
                return;
            }
            int iB = b.this.n.b(b.this.f4569l, this.f4572f);
            if (iB != 0) {
                U(new com.google.android.gms.common.b(iB, null));
                return;
            }
            c cVar = b.this.new c(this.f4572f, this.f4574h);
            if (this.f4572f.requiresSignIn()) {
                this.f4579m.K4(cVar);
            }
            this.f4572f.connect(cVar);
        }

        public final int b() {
            return this.f4578l;
        }

        final boolean c() {
            return this.f4572f.isConnected();
        }

        public final boolean d() {
            return this.f4572f.requiresSignIn();
        }

        public final void e() {
            com.google.android.gms.common.internal.p.d(b.this.u);
            if (this.n) {
                a();
            }
        }

        public final void i(k kVar) {
            com.google.android.gms.common.internal.p.d(b.this.u);
            if (this.f4572f.isConnected()) {
                if (p(kVar)) {
                    y();
                    return;
                } else {
                    this.f4571e.add(kVar);
                    return;
                }
            }
            this.f4571e.add(kVar);
            com.google.android.gms.common.b bVar = this.p;
            if (bVar == null || !bVar.K()) {
                a();
            } else {
                U(this.p);
            }
        }

        public final void j(d0 d0Var) {
            com.google.android.gms.common.internal.p.d(b.this.u);
            this.f4576j.add(d0Var);
        }

        public final a.f l() {
            return this.f4572f;
        }

        public final void m() {
            com.google.android.gms.common.internal.p.d(b.this.u);
            if (this.n) {
                x();
                A(b.this.f4570m.g(b.this.f4569l) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f4572f.disconnect();
            }
        }

        public final void t() {
            com.google.android.gms.common.internal.p.d(b.this.u);
            A(b.f4562e);
            this.f4575i.c();
            for (f fVar : (f[]) this.f4577k.keySet().toArray(new f[this.f4577k.size()])) {
                i(new b0(fVar, new e.c.b.b.e.i()));
            }
            I(new com.google.android.gms.common.b(4));
            if (this.f4572f.isConnected()) {
                this.f4572f.onUserSignOut(new o(this));
            }
        }

        public final Map<f<?>, s> u() {
            return this.f4577k;
        }

        public final void v() {
            com.google.android.gms.common.internal.p.d(b.this.u);
            this.p = null;
        }

        public final com.google.android.gms.common.b w() {
            com.google.android.gms.common.internal.p.d(b.this.u);
            return this.p;
        }

        public final boolean z() {
            return C(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements x, b.c {
        private final a.f a;

        /* renamed from: b, reason: collision with root package name */
        private final c0<?> f4581b;

        /* renamed from: c, reason: collision with root package name */
        private com.google.android.gms.common.internal.k f4582c = null;

        /* renamed from: d, reason: collision with root package name */
        private Set<Scope> f4583d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4584e = false;

        public c(a.f fVar, c0<?> c0Var) {
            this.a = fVar;
            this.f4581b = c0Var;
        }

        static /* synthetic */ boolean e(c cVar, boolean z) {
            cVar.f4584e = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g() {
            com.google.android.gms.common.internal.k kVar;
            if (!this.f4584e || (kVar = this.f4582c) == null) {
                return;
            }
            this.a.getRemoteService(kVar, this.f4583d);
        }

        @Override // com.google.android.gms.common.internal.b.c
        public final void a(com.google.android.gms.common.b bVar) {
            b.this.u.post(new q(this, bVar));
        }

        @Override // com.google.android.gms.common.api.internal.x
        public final void b(com.google.android.gms.common.internal.k kVar, Set<Scope> set) {
            if (kVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                c(new com.google.android.gms.common.b(4));
            } else {
                this.f4582c = kVar;
                this.f4583d = set;
                g();
            }
        }

        @Override // com.google.android.gms.common.api.internal.x
        public final void c(com.google.android.gms.common.b bVar) {
            ((a) b.this.q.get(this.f4581b)).G(bVar);
        }
    }

    private b(Context context, Looper looper, com.google.android.gms.common.e eVar) {
        this.f4569l = context;
        e.c.b.b.c.b.d dVar = new e.c.b.b.c.b.d(looper, this);
        this.u = dVar;
        this.f4570m = eVar;
        this.n = new com.google.android.gms.common.internal.j(eVar);
        dVar.sendMessage(dVar.obtainMessage(6));
    }

    public static b d(Context context) {
        b bVar;
        synchronized (f4564g) {
            if (f4565h == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f4565h = new b(context.getApplicationContext(), handlerThread.getLooper(), com.google.android.gms.common.e.l());
            }
            bVar = f4565h;
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(com.google.android.gms.common.api.e<?> eVar) {
        Object objE = eVar.e();
        a<?> aVar = this.q.get(objE);
        if (aVar == null) {
            aVar = new a<>(eVar);
            this.q.put(objE, aVar);
        }
        if (aVar.d()) {
            this.t.add(objE);
        }
        aVar.a();
    }

    public final void b(com.google.android.gms.common.b bVar, int i2) {
        if (i(bVar, i2)) {
            return;
        }
        Handler handler = this.u;
        handler.sendMessage(handler.obtainMessage(5, i2, 0, bVar));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i2 = message.what;
        a<?> aVar = null;
        switch (i2) {
            case 1:
                this.f4568k = ((Boolean) message.obj).booleanValue() ? AbstractComponentTracker.LINGERING_TIMEOUT : 300000L;
                this.u.removeMessages(12);
                for (c0<?> c0Var : this.q.keySet()) {
                    Handler handler = this.u;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c0Var), this.f4568k);
                }
                return true;
            case 2:
                d0 d0Var = (d0) message.obj;
                Iterator<c0<?>> it = d0Var.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        c0<?> next = it.next();
                        a<?> aVar2 = this.q.get(next);
                        if (aVar2 == null) {
                            d0Var.a(next, new com.google.android.gms.common.b(13), null);
                        } else if (aVar2.c()) {
                            d0Var.a(next, com.google.android.gms.common.b.f4622e, aVar2.l().getEndpointPackageName());
                        } else if (aVar2.w() != null) {
                            d0Var.a(next, aVar2.w(), null);
                        } else {
                            aVar2.j(d0Var);
                            aVar2.a();
                        }
                    }
                }
                return true;
            case 3:
                for (a<?> aVar3 : this.q.values()) {
                    aVar3.v();
                    aVar3.a();
                }
                return true;
            case 4:
            case 8:
            case 13:
                r rVar = (r) message.obj;
                a<?> aVar4 = this.q.get(rVar.f4608c.e());
                if (aVar4 == null) {
                    e(rVar.f4608c);
                    aVar4 = this.q.get(rVar.f4608c.e());
                }
                if (!aVar4.d() || this.p.get() == rVar.f4607b) {
                    aVar4.i(rVar.a);
                } else {
                    rVar.a.b(f4562e);
                    aVar4.t();
                }
                return true;
            case 5:
                int i3 = message.arg1;
                com.google.android.gms.common.b bVar = (com.google.android.gms.common.b) message.obj;
                Iterator<a<?>> it2 = this.q.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a<?> next2 = it2.next();
                        if (next2.b() == i3) {
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    String strE = this.f4570m.e(bVar.c());
                    String strI = bVar.I();
                    StringBuilder sb = new StringBuilder(String.valueOf(strE).length() + 69 + String.valueOf(strI).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(strE);
                    sb.append(": ");
                    sb.append(strI);
                    aVar.A(new Status(17, sb.toString()));
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i3);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                if (com.google.android.gms.common.util.n.a() && (this.f4569l.getApplicationContext() instanceof Application)) {
                    com.google.android.gms.common.api.internal.a.c((Application) this.f4569l.getApplicationContext());
                    com.google.android.gms.common.api.internal.a.b().a(new l(this));
                    if (!com.google.android.gms.common.api.internal.a.b().e(true)) {
                        this.f4568k = 300000L;
                    }
                }
                return true;
            case 7:
                e((com.google.android.gms.common.api.e) message.obj);
                return true;
            case 9:
                if (this.q.containsKey(message.obj)) {
                    this.q.get(message.obj).e();
                }
                return true;
            case 10:
                Iterator<c0<?>> it3 = this.t.iterator();
                while (it3.hasNext()) {
                    this.q.remove(it3.next()).t();
                }
                this.t.clear();
                return true;
            case 11:
                if (this.q.containsKey(message.obj)) {
                    this.q.get(message.obj).m();
                }
                return true;
            case 12:
                if (this.q.containsKey(message.obj)) {
                    this.q.get(message.obj).z();
                }
                return true;
            case 14:
                j jVar = (j) message.obj;
                c0<?> c0VarB = jVar.b();
                if (this.q.containsKey(c0VarB)) {
                    jVar.a().c(Boolean.valueOf(a.k(this.q.get(c0VarB), false)));
                } else {
                    jVar.a().c(Boolean.FALSE);
                }
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                C0112b c0112b = (C0112b) message.obj;
                if (this.q.containsKey(c0112b.a)) {
                    this.q.get(c0112b.a).h(c0112b);
                }
                return true;
            case 16:
                C0112b c0112b2 = (C0112b) message.obj;
                if (this.q.containsKey(c0112b2.a)) {
                    this.q.get(c0112b2.a).o(c0112b2);
                }
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    final boolean i(com.google.android.gms.common.b bVar, int i2) {
        return this.f4570m.s(this.f4569l, bVar, i2);
    }

    public final void q() {
        Handler handler = this.u;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: com.google.android.gms.common.api.internal.b$b, reason: collision with other inner class name */
    private static class C0112b {
        private final c0<?> a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.android.gms.common.d f4580b;

        private C0112b(c0<?> c0Var, com.google.android.gms.common.d dVar) {
            this.a = c0Var;
            this.f4580b = dVar;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C0112b)) {
                C0112b c0112b = (C0112b) obj;
                if (com.google.android.gms.common.internal.o.a(this.a, c0112b.a) && com.google.android.gms.common.internal.o.a(this.f4580b, c0112b.f4580b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return com.google.android.gms.common.internal.o.b(this.a, this.f4580b);
        }

        public final String toString() {
            return com.google.android.gms.common.internal.o.c(this).a(Action.KEY_ATTRIBUTE, this.a).a("feature", this.f4580b).toString();
        }

        /* synthetic */ C0112b(c0 c0Var, com.google.android.gms.common.d dVar, l lVar) {
            this(c0Var, dVar);
        }
    }
}