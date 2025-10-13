package kotlinx.coroutines.internal;

/* compiled from: OnUndeliveredElement.kt */
/* loaded from: classes3.dex */
public final class s {

    /* compiled from: OnUndeliveredElement.kt */
    static final class a extends i.y.d.m implements i.y.c.l<Throwable, i.s> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i.y.c.l f16998e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f16999f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.v.g f17000g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i.y.c.l lVar, Object obj, i.v.g gVar) {
            super(1);
            this.f16998e = lVar;
            this.f16999f = obj;
            this.f17000g = gVar;
        }

        public final void a(Throwable th) {
            s.b(this.f16998e, this.f16999f, this.f17000g);
        }

        @Override // i.y.c.l
        public /* bridge */ /* synthetic */ i.s invoke(Throwable th) {
            a(th);
            return i.s.a;
        }
    }

    public static final <E> i.y.c.l<Throwable, i.s> a(i.y.c.l<? super E, i.s> lVar, E e2, i.v.g gVar) {
        return new a(lVar, e2, gVar);
    }

    public static final <E> void b(i.y.c.l<? super E, i.s> lVar, E e2, i.v.g gVar) {
        h0 h0VarC = c(lVar, e2, null);
        if (h0VarC != null) {
            kotlinx.coroutines.f0.a(gVar, h0VarC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> h0 c(i.y.c.l<? super E, i.s> lVar, E e2, h0 h0Var) {
        try {
            lVar.invoke(e2);
        } catch (Throwable th) {
            if (h0Var == null || h0Var.getCause() == th) {
                return new h0("Exception in undelivered element handler for " + e2, th);
            }
            i.b.a(h0Var, th);
        }
        return h0Var;
    }

    public static /* synthetic */ h0 d(i.y.c.l lVar, Object obj, h0 h0Var, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            h0Var = null;
        }
        return c(lVar, obj, h0Var);
    }
}