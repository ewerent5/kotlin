package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.f0;
import androidx.room.g0;
import androidx.room.i0;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiInstanceInvalidationClient.java */
/* loaded from: classes.dex */
class j0 {
    final Context a;

    /* renamed from: b, reason: collision with root package name */
    final String f1866b;

    /* renamed from: c, reason: collision with root package name */
    int f1867c;

    /* renamed from: d, reason: collision with root package name */
    final i0 f1868d;

    /* renamed from: e, reason: collision with root package name */
    final i0.c f1869e;

    /* renamed from: f, reason: collision with root package name */
    g0 f1870f;

    /* renamed from: g, reason: collision with root package name */
    final Executor f1871g;

    /* renamed from: h, reason: collision with root package name */
    final f0 f1872h = new a();

    /* renamed from: i, reason: collision with root package name */
    final AtomicBoolean f1873i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    final ServiceConnection f1874j;

    /* renamed from: k, reason: collision with root package name */
    final Runnable f1875k;

    /* renamed from: l, reason: collision with root package name */
    final Runnable f1876l;

    /* compiled from: MultiInstanceInvalidationClient.java */
    class a extends f0.a {

        /* compiled from: MultiInstanceInvalidationClient.java */
        /* renamed from: androidx.room.j0$a$a, reason: collision with other inner class name */
        class RunnableC0028a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String[] f1878e;

            RunnableC0028a(String[] strArr) {
                this.f1878e = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                j0.this.f1868d.h(this.f1878e);
            }
        }

        a() {
        }

        @Override // androidx.room.f0
        public void L0(String[] strArr) {
            j0.this.f1871g.execute(new RunnableC0028a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            j0.this.f1870f = g0.a.R(iBinder);
            j0 j0Var = j0.this;
            j0Var.f1871g.execute(j0Var.f1875k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            j0 j0Var = j0.this;
            j0Var.f1871g.execute(j0Var.f1876l);
            j0.this.f1870f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j0 j0Var = j0.this;
                g0 g0Var = j0Var.f1870f;
                if (g0Var != null) {
                    j0Var.f1867c = g0Var.e1(j0Var.f1872h, j0Var.f1866b);
                    j0 j0Var2 = j0.this;
                    j0Var2.f1868d.a(j0Var2.f1869e);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0 j0Var = j0.this;
            j0Var.f1868d.k(j0Var.f1869e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    class e extends i0.c {
        e(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.i0.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.i0.c
        public void b(Set<String> set) {
            if (j0.this.f1873i.get()) {
                return;
            }
            try {
                j0 j0Var = j0.this;
                g0 g0Var = j0Var.f1870f;
                if (g0Var != null) {
                    g0Var.e4(j0Var.f1867c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot broadcast invalidation", e2);
            }
        }
    }

    j0(Context context, String str, i0 i0Var, Executor executor) {
        b bVar = new b();
        this.f1874j = bVar;
        this.f1875k = new c();
        this.f1876l = new d();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f1866b = str;
        this.f1868d = i0Var;
        this.f1871g = executor;
        this.f1869e = new e((String[]) i0Var.f1842b.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }

    void a() {
        if (this.f1873i.compareAndSet(false, true)) {
            this.f1868d.k(this.f1869e);
            try {
                g0 g0Var = this.f1870f;
                if (g0Var != null) {
                    g0Var.x4(this.f1872h, this.f1867c);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e2);
            }
            this.a.unbindService(this.f1874j);
        }
    }
}