package androidx.lifecycle;

import androidx.lifecycle.g;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    final Object f1173b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private c.b.a.b.b<r<? super T>, LiveData<T>.c> f1174c = new c.b.a.b.b<>();

    /* renamed from: d, reason: collision with root package name */
    int f1175d = 0;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f1176e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f1177f;

    /* renamed from: g, reason: collision with root package name */
    private int f1178g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1179h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1180i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f1181j;

    class LifecycleBoundObserver extends LiveData<T>.c implements i {

        /* renamed from: i, reason: collision with root package name */
        final k f1182i;

        LifecycleBoundObserver(k kVar, r<? super T> rVar) {
            super(rVar);
            this.f1182i = kVar;
        }

        @Override // androidx.lifecycle.i
        public void c(k kVar, g.b bVar) {
            if (this.f1182i.i().b() == g.c.DESTROYED) {
                LiveData.this.k(this.f1186e);
            } else {
                h(k());
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        void i() {
            this.f1182i.i().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean j(k kVar) {
            return this.f1182i == kVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return this.f1182i.i().b().a(g.c.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f1173b) {
                obj = LiveData.this.f1177f;
                LiveData.this.f1177f = LiveData.a;
            }
            LiveData.this.l(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(r<? super T> rVar) {
            super(rVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: e, reason: collision with root package name */
        final r<? super T> f1186e;

        /* renamed from: f, reason: collision with root package name */
        boolean f1187f;

        /* renamed from: g, reason: collision with root package name */
        int f1188g = -1;

        c(r<? super T> rVar) {
            this.f1186e = rVar;
        }

        void h(boolean z) {
            if (z == this.f1187f) {
                return;
            }
            this.f1187f = z;
            LiveData liveData = LiveData.this;
            int i2 = liveData.f1175d;
            boolean z2 = i2 == 0;
            liveData.f1175d = i2 + (z ? 1 : -1);
            if (z2 && z) {
                liveData.h();
            }
            LiveData liveData2 = LiveData.this;
            if (liveData2.f1175d == 0 && !this.f1187f) {
                liveData2.i();
            }
            if (this.f1187f) {
                LiveData.this.c(this);
            }
        }

        void i() {
        }

        boolean j(k kVar) {
            return false;
        }

        abstract boolean k();
    }

    public LiveData() {
        Object obj = a;
        this.f1177f = obj;
        this.f1181j = new a();
        this.f1176e = obj;
        this.f1178g = -1;
    }

    static void a(String str) {
        if (c.b.a.a.a.f().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void b(LiveData<T>.c cVar) {
        if (cVar.f1187f) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i2 = cVar.f1188g;
            int i3 = this.f1178g;
            if (i2 >= i3) {
                return;
            }
            cVar.f1188g = i3;
            cVar.f1186e.a((Object) this.f1176e);
        }
    }

    void c(LiveData<T>.c cVar) {
        if (this.f1179h) {
            this.f1180i = true;
            return;
        }
        this.f1179h = true;
        do {
            this.f1180i = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                c.b.a.b.b<r<? super T>, LiveData<T>.c>.d dVarE = this.f1174c.e();
                while (dVarE.hasNext()) {
                    b((c) dVarE.next().getValue());
                    if (this.f1180i) {
                        break;
                    }
                }
            }
        } while (this.f1180i);
        this.f1179h = false;
    }

    public T d() {
        T t = (T) this.f1176e;
        if (t != a) {
            return t;
        }
        return null;
    }

    public boolean e() {
        return this.f1175d > 0;
    }

    public void f(k kVar, r<? super T> rVar) {
        a("observe");
        if (kVar.i().b() == g.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(kVar, rVar);
        LiveData<T>.c cVarK = this.f1174c.k(rVar, lifecycleBoundObserver);
        if (cVarK != null && !cVarK.j(kVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarK != null) {
            return;
        }
        kVar.i().a(lifecycleBoundObserver);
    }

    public void g(r<? super T> rVar) {
        a("observeForever");
        b bVar = new b(rVar);
        LiveData<T>.c cVarK = this.f1174c.k(rVar, bVar);
        if (cVarK instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarK != null) {
            return;
        }
        bVar.h(true);
    }

    protected void h() {
    }

    protected void i() {
    }

    protected void j(T t) {
        boolean z;
        synchronized (this.f1173b) {
            z = this.f1177f == a;
            this.f1177f = t;
        }
        if (z) {
            c.b.a.a.a.f().d(this.f1181j);
        }
    }

    public void k(r<? super T> rVar) {
        a("removeObserver");
        LiveData<T>.c cVarL = this.f1174c.l(rVar);
        if (cVarL == null) {
            return;
        }
        cVarL.i();
        cVarL.h(false);
    }

    protected void l(T t) {
        a("setValue");
        this.f1178g++;
        this.f1176e = t;
        c(null);
    }
}