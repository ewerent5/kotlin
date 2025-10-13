package e.c.b.d.a.b;

/* loaded from: classes.dex */
public abstract class g implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.d.a.f.p<?> f15337e;

    g() {
        this.f15337e = null;
    }

    public g(e.c.b.d.a.f.p<?> pVar) {
        this.f15337e = pVar;
    }

    protected abstract void a();

    public final void b(Exception exc) {
        e.c.b.d.a.f.p<?> pVar = this.f15337e;
        if (pVar != null) {
            pVar.d(exc);
        }
    }

    final e.c.b.d.a.f.p<?> c() {
        return this.f15337e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            b(e2);
        }
    }
}