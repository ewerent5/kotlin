package kotlinx.coroutines;

import ch.qos.logback.core.CoreConstants;

/* compiled from: AbstractCoroutine.kt */
/* loaded from: classes3.dex */
public abstract class a<T> extends v1 implements o1, i.v.d<T>, i0 {

    /* renamed from: f, reason: collision with root package name */
    private final i.v.g f16925f;

    /* renamed from: g, reason: collision with root package name */
    protected final i.v.g f16926g;

    public a(i.v.g gVar, boolean z) {
        super(z);
        this.f16926g = gVar;
        this.f16925f = gVar.plus(this);
    }

    @Override // kotlinx.coroutines.i0
    public i.v.g A() {
        return this.f16925f;
    }

    protected void B0(Object obj) {
        u(obj);
    }

    public final void C0() {
        Y((o1) this.f16926g.get(o1.f17025d));
    }

    protected void D0(Throwable th, boolean z) {
    }

    protected void E0(T t) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.v1
    public String F() {
        return n0.a(this) + " was cancelled";
    }

    protected void F0() {
    }

    public final <R> void G0(k0 k0Var, R r, i.y.c.p<? super R, ? super i.v.d<? super T>, ? extends Object> pVar) {
        C0();
        k0Var.a(pVar, r, this);
    }

    @Override // kotlinx.coroutines.v1
    public final void X(Throwable th) {
        f0.a(this.f16925f, th);
    }

    @Override // kotlinx.coroutines.v1, kotlinx.coroutines.o1
    public boolean b() {
        return super.b();
    }

    @Override // i.v.d
    public final void e(Object obj) {
        Object objE0 = e0(a0.d(obj, null, 1, null));
        if (objE0 == w1.f17171b) {
            return;
        }
        B0(objE0);
    }

    @Override // kotlinx.coroutines.v1
    public String g0() {
        String strB = c0.b(this.f16925f);
        if (strB == null) {
            return super.g0();
        }
        return CoreConstants.DOUBLE_QUOTE_CHAR + strB + "\":" + super.g0();
    }

    @Override // i.v.d
    public final i.v.g getContext() {
        return this.f16925f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.v1
    protected final void l0(Object obj) {
        if (!(obj instanceof w)) {
            E0(obj);
        } else {
            w wVar = (w) obj;
            D0(wVar.f17169b, wVar.a());
        }
    }

    @Override // kotlinx.coroutines.v1
    public final void m0() {
        F0();
    }
}