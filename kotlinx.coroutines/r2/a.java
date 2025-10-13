package kotlinx.coroutines.r2;

import ch.qos.logback.classic.Level;
import i.s;

/* compiled from: Flow.kt */
/* loaded from: classes3.dex */
public abstract class a<T> implements c<T> {

    /* compiled from: Flow.kt */
    @i.v.j.a.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {212}, m = "collect")
    /* renamed from: kotlinx.coroutines.r2.a$a, reason: collision with other inner class name */
    static final class C0227a extends i.v.j.a.d {

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f17062h;

        /* renamed from: i, reason: collision with root package name */
        int f17063i;

        /* renamed from: k, reason: collision with root package name */
        Object f17065k;

        /* renamed from: l, reason: collision with root package name */
        Object f17066l;

        /* renamed from: m, reason: collision with root package name */
        Object f17067m;

        C0227a(i.v.d dVar) {
            super(dVar);
        }

        @Override // i.v.j.a.a
        public final Object p(Object obj) {
            this.f17062h = obj;
            this.f17063i |= Level.ALL_INT;
            return a.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.r2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlinx.coroutines.r2.d<? super T> r6, i.v.d<? super i.s> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.r2.a.C0227a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.r2.a$a r0 = (kotlinx.coroutines.r2.a.C0227a) r0
            int r1 = r0.f17063i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17063i = r1
            goto L18
        L13:
            kotlinx.coroutines.r2.a$a r0 = new kotlinx.coroutines.r2.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17062h
            java.lang.Object r1 = i.v.i.b.c()
            int r2 = r0.f17063i
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f17067m
            kotlinx.coroutines.r2.i.d r6 = (kotlinx.coroutines.r2.i.d) r6
            java.lang.Object r1 = r0.f17066l
            kotlinx.coroutines.r2.d r1 = (kotlinx.coroutines.r2.d) r1
            java.lang.Object r0 = r0.f17065k
            kotlinx.coroutines.r2.a r0 = (kotlinx.coroutines.r2.a) r0
            i.n.b(r7)     // Catch: java.lang.Throwable -> L35
            goto L5b
        L35:
            r7 = move-exception
            goto L65
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            i.n.b(r7)
            kotlinx.coroutines.r2.i.d r7 = new kotlinx.coroutines.r2.i.d
            i.v.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f17065k = r5     // Catch: java.lang.Throwable -> L61
            r0.f17066l = r6     // Catch: java.lang.Throwable -> L61
            r0.f17067m = r7     // Catch: java.lang.Throwable -> L61
            r0.f17063i = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L61
            if (r6 != r1) goto L5a
            return r1
        L5a:
            r6 = r7
        L5b:
            r6.q()
            i.s r6 = i.s.a
            return r6
        L61:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L65:
            r6.q()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.r2.a.a(kotlinx.coroutines.r2.d, i.v.d):java.lang.Object");
    }

    public abstract Object b(d<? super T> dVar, i.v.d<? super s> dVar2);
}