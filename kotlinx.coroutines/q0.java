package kotlinx.coroutines;

import i.m;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes3.dex */
public abstract class q0<T> extends kotlinx.coroutines.t2.i {

    /* renamed from: g */
    public int f17031g;

    public q0(int i2) {
        this.f17031g = i2;
    }

    public void b(Object obj, Throwable th) {
    }

    public abstract i.v.d<T> d();

    public Throwable g(Object obj) {
        if (!(obj instanceof w)) {
            obj = null;
        }
        w wVar = (w) obj;
        if (wVar != null) {
            return wVar.f17169b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T i(Object obj) {
        return obj;
    }

    public final void o(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            i.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        i.y.d.l.b(th);
        f0.a(d().getContext(), new l0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object p();

    @Override // java.lang.Runnable
    public final void run() {
        Object objA;
        Object objA2;
        if (m0.a()) {
            if (!(this.f17031g != -1)) {
                throw new AssertionError();
            }
        }
        kotlinx.coroutines.t2.j jVar = this.f17143f;
        try {
            i.v.d<T> dVarD = d();
            if (dVarD == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
            }
            kotlinx.coroutines.internal.e eVar = (kotlinx.coroutines.internal.e) dVarD;
            i.v.d<T> dVar = eVar.f16969m;
            i.v.g context = dVar.getContext();
            Object objP = p();
            Object objC = kotlinx.coroutines.internal.b0.c(context, eVar.f16967k);
            try {
                Throwable thG = g(objP);
                o1 o1Var = (thG == null && r0.b(this.f17031g)) ? (o1) context.get(o1.f17025d) : null;
                if (o1Var != null && !o1Var.b()) {
                    Throwable thS = o1Var.s();
                    b(objP, thS);
                    m.a aVar = i.m.f15825e;
                    if (m0.d() && (dVar instanceof i.v.j.a.e)) {
                        thS = kotlinx.coroutines.internal.w.j(thS, (i.v.j.a.e) dVar);
                    }
                    dVar.e(i.m.a(i.n.a(thS)));
                } else if (thG != null) {
                    m.a aVar2 = i.m.f15825e;
                    dVar.e(i.m.a(i.n.a(thG)));
                } else {
                    T tI = i(objP);
                    m.a aVar3 = i.m.f15825e;
                    dVar.e(i.m.a(tI));
                }
                i.s sVar = i.s.a;
                try {
                    m.a aVar4 = i.m.f15825e;
                    jVar.j();
                    objA2 = i.m.a(sVar);
                } catch (Throwable th) {
                    m.a aVar5 = i.m.f15825e;
                    objA2 = i.m.a(i.n.a(th));
                }
                o(null, i.m.b(objA2));
            } finally {
                kotlinx.coroutines.internal.b0.a(context, objC);
            }
        } catch (Throwable th2) {
            try {
                m.a aVar6 = i.m.f15825e;
                jVar.j();
                objA = i.m.a(i.s.a);
            } catch (Throwable th3) {
                m.a aVar7 = i.m.f15825e;
                objA = i.m.a(i.n.a(th3));
            }
            o(th2, i.m.b(objA));
        }
    }
}