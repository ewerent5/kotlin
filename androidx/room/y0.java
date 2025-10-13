package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement.java */
/* loaded from: classes.dex */
public abstract class y0 {
    private final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final q0 f2013b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c.r.a.f f2014c;

    public y0(q0 q0Var) {
        this.f2013b = q0Var;
    }

    private c.r.a.f c() {
        return this.f2013b.e(d());
    }

    private c.r.a.f e(boolean z) {
        if (!z) {
            return c();
        }
        if (this.f2014c == null) {
            this.f2014c = c();
        }
        return this.f2014c;
    }

    public c.r.a.f a() {
        b();
        return e(this.a.compareAndSet(false, true));
    }

    protected void b() {
        this.f2013b.a();
    }

    protected abstract String d();

    public void f(c.r.a.f fVar) {
        if (fVar == this.f2014c) {
            this.a.set(false);
        }
    }
}