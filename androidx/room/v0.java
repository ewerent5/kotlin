package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.i0;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RoomTrackingLiveData.java */
/* loaded from: classes.dex */
class v0<T> extends LiveData<T> {

    /* renamed from: k, reason: collision with root package name */
    final q0 f1972k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f1973l;

    /* renamed from: m, reason: collision with root package name */
    final Callable<T> f1974m;
    private final h0 n;
    final i0.c o;
    final AtomicBoolean p = new AtomicBoolean(true);
    final AtomicBoolean q = new AtomicBoolean(false);
    final AtomicBoolean r = new AtomicBoolean(false);
    final Runnable s = new a();
    final Runnable t = new b();

    /* compiled from: RoomTrackingLiveData.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (v0.this.r.compareAndSet(false, true)) {
                v0.this.f1972k.k().b(v0.this.o);
            }
            do {
                if (v0.this.q.compareAndSet(false, true)) {
                    T tCall = null;
                    z = false;
                    while (v0.this.p.compareAndSet(true, false)) {
                        try {
                            try {
                                tCall = v0.this.f1974m.call();
                                z = true;
                            } catch (Exception e2) {
                                throw new RuntimeException("Exception while computing database live data.", e2);
                            }
                        } finally {
                            v0.this.q.set(false);
                        }
                    }
                    if (z) {
                        v0.this.j(tCall);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (v0.this.p.get());
        }
    }

    /* compiled from: RoomTrackingLiveData.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zE = v0.this.e();
            if (v0.this.p.compareAndSet(false, true) && zE) {
                v0.this.n().execute(v0.this.s);
            }
        }
    }

    /* compiled from: RoomTrackingLiveData.java */
    class c extends i0.c {
        c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.i0.c
        public void b(Set<String> set) {
            c.b.a.a.a.f().b(v0.this.t);
        }
    }

    @SuppressLint({"RestrictedApi"})
    v0(q0 q0Var, h0 h0Var, boolean z, Callable<T> callable, String[] strArr) {
        this.f1972k = q0Var;
        this.f1973l = z;
        this.f1974m = callable;
        this.n = h0Var;
        this.o = new c(strArr);
    }

    @Override // androidx.lifecycle.LiveData
    protected void h() {
        super.h();
        this.n.b(this);
        n().execute(this.s);
    }

    @Override // androidx.lifecycle.LiveData
    protected void i() {
        super.i();
        this.n.c(this);
    }

    Executor n() {
        return this.f1973l ? this.f1972k.p() : this.f1972k.m();
    }
}