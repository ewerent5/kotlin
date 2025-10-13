package kotlinx.coroutines.r2;

import ch.qos.logback.classic.Level;
import i.s;
import i.y.c.l;
import i.y.c.p;
import i.y.d.u;

/* compiled from: Distinct.kt */
/* loaded from: classes3.dex */
final class b<T> implements c<T> {
    private final c<T> a;

    /* renamed from: b, reason: collision with root package name */
    public final l<T, Object> f17068b;

    /* renamed from: c, reason: collision with root package name */
    public final p<Object, Object, Boolean> f17069c;

    /* compiled from: Collect.kt */
    public static final class a implements d<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f17071f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f17072g;

        @i.v.j.a.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$$inlined$collect$1", f = "Distinct.kt", l = {137}, m = "emit")
        /* renamed from: kotlinx.coroutines.r2.b$a$a, reason: collision with other inner class name */
        public static final class C0228a extends i.v.j.a.d {

            /* renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f17073h;

            /* renamed from: i, reason: collision with root package name */
            int f17074i;

            /* renamed from: k, reason: collision with root package name */
            Object f17076k;

            /* renamed from: l, reason: collision with root package name */
            Object f17077l;

            /* renamed from: m, reason: collision with root package name */
            Object f17078m;
            Object n;
            Object o;

            public C0228a(i.v.d dVar) {
                super(dVar);
            }

            @Override // i.v.j.a.a
            public final Object p(Object obj) {
                this.f17073h = obj;
                this.f17074i |= Level.ALL_INT;
                return a.this.b(null, this);
            }
        }

        public a(u uVar, d dVar) {
            this.f17071f = uVar;
            this.f17072g = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.r2.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(java.lang.Object r6, i.v.d r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.r2.b.a.C0228a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.r2.b$a$a r0 = (kotlinx.coroutines.r2.b.a.C0228a) r0
                int r1 = r0.f17074i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17074i = r1
                goto L18
            L13:
                kotlinx.coroutines.r2.b$a$a r0 = new kotlinx.coroutines.r2.b$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f17073h
                java.lang.Object r1 = i.v.i.b.c()
                int r2 = r0.f17074i
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r6 = r0.f17078m
                i.v.d r6 = (i.v.d) r6
                java.lang.Object r6 = r0.f17076k
                kotlinx.coroutines.r2.b$a r6 = (kotlinx.coroutines.r2.b.a) r6
                i.n.b(r7)
                goto L75
            L31:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L39:
                i.n.b(r7)
                kotlinx.coroutines.r2.b r7 = kotlinx.coroutines.r2.b.this
                i.y.c.l<T, java.lang.Object> r7 = r7.f17068b
                java.lang.Object r7 = r7.invoke(r6)
                i.y.d.u r2 = r5.f17071f
                T r2 = r2.f15893e
                kotlinx.coroutines.internal.x r4 = kotlinx.coroutines.r2.i.c.a
                if (r2 == r4) goto L5c
                kotlinx.coroutines.r2.b r4 = kotlinx.coroutines.r2.b.this
                i.y.c.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f17069c
                java.lang.Object r2 = r4.i(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L75
            L5c:
                i.y.d.u r2 = r5.f17071f
                r2.f15893e = r7
                kotlinx.coroutines.r2.d r2 = r5.f17072g
                r0.f17076k = r5
                r0.f17077l = r6
                r0.f17078m = r0
                r0.n = r6
                r0.o = r7
                r0.f17074i = r3
                java.lang.Object r6 = r2.b(r6, r0)
                if (r6 != r1) goto L75
                return r1
            L75:
                i.s r6 = i.s.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.r2.b.a.b(java.lang.Object, i.v.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(c<? extends T> cVar, l<? super T, ? extends Object> lVar, p<Object, Object, Boolean> pVar) {
        this.a = cVar;
        this.f17068b = lVar;
        this.f17069c = pVar;
    }

    @Override // kotlinx.coroutines.r2.c
    public Object a(d<? super T> dVar, i.v.d<? super s> dVar2) {
        u uVar = new u();
        uVar.f15893e = (T) kotlinx.coroutines.r2.i.c.a;
        Object objA = this.a.a(new a(uVar, dVar), dVar2);
        return objA == i.v.i.d.c() ? objA : s.a;
    }
}