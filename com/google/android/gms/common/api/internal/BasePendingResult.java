package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.j> extends com.google.android.gms.common.api.h<R> {
    static final ThreadLocal<Boolean> a = new f0();

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.common.api.k<? super R> f4549g;

    /* renamed from: i, reason: collision with root package name */
    private R f4551i;

    /* renamed from: j, reason: collision with root package name */
    private Status f4552j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f4553k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4554l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4555m;

    @KeepName
    private b mResultGuardian;
    private com.google.android.gms.common.internal.l n;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4544b = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final CountDownLatch f4547e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<h.a> f4548f = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<z> f4550h = new AtomicReference<>();
    private boolean o = false;

    /* renamed from: c, reason: collision with root package name */
    private final a<R> f4545c = new a<>(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<?> f4546d = new WeakReference<>(null);

    public static class a<R extends com.google.android.gms.common.api.j> extends e.c.b.b.c.b.d {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(com.google.android.gms.common.api.k<? super R> kVar, R r) {
            sendMessage(obtainMessage(1, new Pair(kVar, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 == 2) {
                    ((BasePendingResult) message.obj).h(Status.f4530h);
                    return;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) pair.first;
            com.google.android.gms.common.api.j jVar = (com.google.android.gms.common.api.j) pair.second;
            try {
                kVar.a(jVar);
            } catch (RuntimeException e2) {
                BasePendingResult.g(jVar);
                throw e2;
            }
        }
    }

    private final class b {
        private b() {
        }

        protected final void finalize() throws Throwable {
            BasePendingResult.g(BasePendingResult.this.f4551i);
            super.finalize();
        }

        /* synthetic */ b(BasePendingResult basePendingResult, f0 f0Var) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    private final R b() {
        R r;
        synchronized (this.f4544b) {
            com.google.android.gms.common.internal.p.n(!this.f4553k, "Result has already been consumed.");
            com.google.android.gms.common.internal.p.n(c(), "Result is not ready.");
            r = this.f4551i;
            this.f4551i = null;
            this.f4549g = null;
            this.f4553k = true;
        }
        z andSet = this.f4550h.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    private final void f(R r) {
        this.f4551i = r;
        f0 f0Var = null;
        this.n = null;
        this.f4547e.countDown();
        this.f4552j = this.f4551i.a();
        if (this.f4554l) {
            this.f4549g = null;
        } else if (this.f4549g != null) {
            this.f4545c.removeMessages(2);
            this.f4545c.a(this.f4549g, b());
        } else if (this.f4551i instanceof com.google.android.gms.common.api.i) {
            this.mResultGuardian = new b(this, f0Var);
        }
        ArrayList<h.a> arrayList = this.f4548f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            h.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.f4552j);
        }
        this.f4548f.clear();
    }

    public static void g(com.google.android.gms.common.api.j jVar) {
        if (jVar instanceof com.google.android.gms.common.api.i) {
            try {
                ((com.google.android.gms.common.api.i) jVar).a();
            } catch (RuntimeException e2) {
                String strValueOf = String.valueOf(jVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    protected abstract R a(Status status);

    public final boolean c() {
        return this.f4547e.getCount() == 0;
    }

    public final void d(R r) {
        synchronized (this.f4544b) {
            if (this.f4555m || this.f4554l) {
                g(r);
                return;
            }
            c();
            boolean z = true;
            com.google.android.gms.common.internal.p.n(!c(), "Results have already been set");
            if (this.f4553k) {
                z = false;
            }
            com.google.android.gms.common.internal.p.n(z, "Result has already been consumed");
            f(r);
        }
    }

    public final void h(Status status) {
        synchronized (this.f4544b) {
            if (!c()) {
                d(a(status));
                this.f4555m = true;
            }
        }
    }
}