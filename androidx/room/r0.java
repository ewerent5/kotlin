package androidx.room;

import ch.qos.logback.classic.Level;
import i.m;
import i.v.g;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.o1;

/* compiled from: RoomDatabase.kt */
/* loaded from: classes.dex */
public final class r0 {

    /* compiled from: RoomDatabase.kt */
    static final class a extends i.y.d.m implements i.y.c.l<Throwable, i.s> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Executor f1936e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ o1 f1937f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Executor executor, o1 o1Var) {
            super(1);
            this.f1936e = executor;
            this.f1937f = o1Var;
        }

        public final void a(Throwable th) {
            o1.a.a(this.f1937f, null, 1, null);
        }

        @Override // i.y.c.l
        public /* bridge */ /* synthetic */ i.s invoke(Throwable th) {
            a(th);
            return i.s.a;
        }
    }

    /* compiled from: RoomDatabase.kt */
    static final class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.k f1938e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Executor f1939f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o1 f1940g;

        /* compiled from: RoomDatabase.kt */
        @i.v.j.a.f(c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", f = "RoomDatabase.kt", l = {124}, m = "invokeSuspend")
        static final class a extends i.v.j.a.k implements i.y.c.p<kotlinx.coroutines.i0, i.v.d<? super i.s>, Object> {

            /* renamed from: i, reason: collision with root package name */
            private /* synthetic */ Object f1941i;

            /* renamed from: j, reason: collision with root package name */
            int f1942j;

            a(i.v.d dVar) {
                super(2, dVar);
            }

            @Override // i.v.j.a.a
            public final i.v.d<i.s> g(Object obj, i.v.d<?> dVar) {
                i.y.d.l.d(dVar, "completion");
                a aVar = b.this.new a(dVar);
                aVar.f1941i = obj;
                return aVar;
            }

            @Override // i.y.c.p
            public final Object i(kotlinx.coroutines.i0 i0Var, i.v.d<? super i.s> dVar) {
                return ((a) g(i0Var, dVar)).p(i.s.a);
            }

            @Override // i.v.j.a.a
            public final Object p(Object obj) throws Throwable {
                Object objC = i.v.i.d.c();
                int i2 = this.f1942j;
                if (i2 == 0) {
                    i.n.b(obj);
                    kotlinx.coroutines.i0 i0Var = (kotlinx.coroutines.i0) this.f1941i;
                    kotlinx.coroutines.k kVar = b.this.f1938e;
                    g.b bVar = i0Var.A().get(i.v.e.f15850b);
                    i.y.d.l.b(bVar);
                    m.a aVar = i.m.f15825e;
                    kVar.e(i.m.a(bVar));
                    o1 o1Var = b.this.f1940g;
                    this.f1942j = 1;
                    if (o1Var.i(this) == objC) {
                        return objC;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i.n.b(obj);
                }
                return i.s.a;
            }
        }

        b(kotlinx.coroutines.k kVar, Executor executor, o1 o1Var) {
            this.f1938e = kVar;
            this.f1939f = executor;
            this.f1940g = o1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            kotlinx.coroutines.g.b(null, new a(null), 1, null);
        }
    }

    /* compiled from: RoomDatabase.kt */
    @i.v.j.a.f(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabase.kt", l = {99}, m = "createTransactionContext")
    static final class c extends i.v.j.a.d {

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f1944h;

        /* renamed from: i, reason: collision with root package name */
        int f1945i;

        /* renamed from: j, reason: collision with root package name */
        Object f1946j;

        /* renamed from: k, reason: collision with root package name */
        Object f1947k;

        c(i.v.d dVar) {
            super(dVar);
        }

        @Override // i.v.j.a.a
        public final Object p(Object obj) {
            this.f1944h = obj;
            this.f1945i |= Level.ALL_INT;
            return r0.b(null, this);
        }
    }

    /* compiled from: RoomDatabase.kt */
    static final class d extends i.y.d.m implements i.y.c.l<Throwable, i.s> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.u f1948e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlinx.coroutines.u uVar) {
            super(1);
            this.f1948e = uVar;
        }

        public final void a(Throwable th) {
            o1.a.a(this.f1948e, null, 1, null);
        }

        @Override // i.y.c.l
        public /* bridge */ /* synthetic */ i.s invoke(Throwable th) {
            a(th);
            return i.s.a;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @i.v.j.a.f(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabase.kt", l = {50, 51}, m = "withTransaction")
    static final class e extends i.v.j.a.d {

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f1949h;

        /* renamed from: i, reason: collision with root package name */
        int f1950i;

        /* renamed from: j, reason: collision with root package name */
        Object f1951j;

        /* renamed from: k, reason: collision with root package name */
        Object f1952k;

        e(i.v.d dVar) {
            super(dVar);
        }

        @Override // i.v.j.a.a
        public final Object p(Object obj) {
            this.f1949h = obj;
            this.f1950i |= Level.ALL_INT;
            return r0.c(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: RoomDatabase.kt */
    @i.v.j.a.f(c = "androidx.room.RoomDatabaseKt$withTransaction$2", f = "RoomDatabase.kt", l = {58}, m = "invokeSuspend")
    static final class f<R> extends i.v.j.a.k implements i.y.c.p<kotlinx.coroutines.i0, i.v.d<? super R>, Object> {

        /* renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f1953i;

        /* renamed from: j, reason: collision with root package name */
        int f1954j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ q0 f1955k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ i.y.c.l f1956l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(q0 q0Var, i.y.c.l lVar, i.v.d dVar) {
            super(2, dVar);
            this.f1955k = q0Var;
            this.f1956l = lVar;
        }

        @Override // i.v.j.a.a
        public final i.v.d<i.s> g(Object obj, i.v.d<?> dVar) {
            i.y.d.l.d(dVar, "completion");
            f fVar = new f(this.f1955k, this.f1956l, dVar);
            fVar.f1953i = obj;
            return fVar;
        }

        @Override // i.y.c.p
        public final Object i(kotlinx.coroutines.i0 i0Var, Object obj) {
            return ((f) g(i0Var, (i.v.d) obj)).p(i.s.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // i.v.j.a.a
        public final Object p(Object obj) throws Throwable {
            Throwable th;
            z0 z0Var;
            z0 z0VarC = i.v.i.d.c();
            int i2 = this.f1954j;
            try {
                if (i2 == 0) {
                    i.n.b(obj);
                    g.b bVar = ((kotlinx.coroutines.i0) this.f1953i).A().get(z0.f2032e);
                    i.y.d.l.b(bVar);
                    z0 z0Var2 = (z0) bVar;
                    z0Var2.a();
                    try {
                        this.f1955k.c();
                        try {
                            i.y.c.l lVar = this.f1956l;
                            this.f1953i = z0Var2;
                            this.f1954j = 1;
                            Object objInvoke = lVar.invoke(this);
                            if (objInvoke == z0VarC) {
                                return z0VarC;
                            }
                            z0Var = z0Var2;
                            obj = objInvoke;
                        } catch (Throwable th2) {
                            th = th2;
                            this.f1955k.h();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        z0VarC = z0Var2;
                        th = th3;
                        z0VarC.e();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z0Var = (z0) this.f1953i;
                    try {
                        i.n.b(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        this.f1955k.h();
                        throw th;
                    }
                }
                this.f1955k.D();
                this.f1955k.h();
                z0Var.e();
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    static final /* synthetic */ Object a(Executor executor, o1 o1Var, i.v.d<? super i.v.e> dVar) throws Throwable {
        kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(i.v.i.c.b(dVar), 1);
        lVar.D();
        lVar.f(new a(executor, o1Var));
        try {
            executor.execute(new b(lVar, executor, o1Var));
        } catch (RejectedExecutionException e2) {
            lVar.m(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        Object objB = lVar.B();
        if (objB == i.v.i.d.c()) {
            i.v.j.a.h.c(dVar);
        }
        return objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static final /* synthetic */ java.lang.Object b(androidx.room.q0 r6, i.v.d<? super i.v.g> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof androidx.room.r0.c
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.r0$c r0 = (androidx.room.r0.c) r0
            int r1 = r0.f1945i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1945i = r1
            goto L18
        L13:
            androidx.room.r0$c r0 = new androidx.room.r0$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1944h
            java.lang.Object r1 = i.v.i.b.c()
            int r2 = r0.f1945i
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f1947k
            kotlinx.coroutines.u r6 = (kotlinx.coroutines.u) r6
            java.lang.Object r0 = r0.f1946j
            androidx.room.q0 r0 = (androidx.room.q0) r0
            i.n.b(r7)
            goto L71
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            i.n.b(r7)
            r7 = 0
            kotlinx.coroutines.u r7 = kotlinx.coroutines.s1.b(r7, r3, r7)
            i.v.g r2 = r0.getContext()
            kotlinx.coroutines.o1$b r4 = kotlinx.coroutines.o1.f17025d
            i.v.g$b r2 = r2.get(r4)
            kotlinx.coroutines.o1 r2 = (kotlinx.coroutines.o1) r2
            if (r2 == 0) goto L57
            androidx.room.r0$d r4 = new androidx.room.r0$d
            r4.<init>(r7)
            r2.B(r4)
        L57:
            java.util.concurrent.Executor r2 = r6.p()
            java.lang.String r4 = "transactionExecutor"
            i.y.d.l.c(r2, r4)
            r0.f1946j = r6
            r0.f1947k = r7
            r0.f1945i = r3
            java.lang.Object r0 = a(r2, r7, r0)
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L71:
            i.v.e r7 = (i.v.e) r7
            androidx.room.z0 r1 = new androidx.room.z0
            r1.<init>(r6, r7)
            java.lang.ThreadLocal r0 = r0.o()
            java.lang.String r2 = "suspendingTransactionId"
            i.y.d.l.c(r0, r2)
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r6 = i.v.j.a.b.b(r6)
            kotlinx.coroutines.h2 r6 = kotlinx.coroutines.i2.a(r0, r6)
            i.v.g r7 = r7.plus(r1)
            i.v.g r6 = r7.plus(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.r0.b(androidx.room.q0, i.v.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[PHI: r7
  0x007b: PHI (r7v11 java.lang.Object) = (r7v8 java.lang.Object), (r7v1 java.lang.Object) binds: [B:26:0x0078, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <R> java.lang.Object c(androidx.room.q0 r5, i.y.c.l<? super i.v.d<? super R>, ? extends java.lang.Object> r6, i.v.d<? super R> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof androidx.room.r0.e
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.r0$e r0 = (androidx.room.r0.e) r0
            int r1 = r0.f1950i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1950i = r1
            goto L18
        L13:
            androidx.room.r0$e r0 = new androidx.room.r0$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1949h
            java.lang.Object r1 = i.v.i.b.c()
            int r2 = r0.f1950i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            i.n.b(r7)
            goto L7b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f1952k
            r6 = r5
            i.y.c.l r6 = (i.y.c.l) r6
            java.lang.Object r5 = r0.f1951j
            androidx.room.q0 r5 = (androidx.room.q0) r5
            i.n.b(r7)
            goto L66
        L41:
            i.n.b(r7)
            i.v.g r7 = r0.getContext()
            androidx.room.z0$a r2 = androidx.room.z0.f2032e
            i.v.g$b r7 = r7.get(r2)
            androidx.room.z0 r7 = (androidx.room.z0) r7
            if (r7 == 0) goto L59
            i.v.e r7 = r7.c()
            if (r7 == 0) goto L59
            goto L68
        L59:
            r0.f1951j = r5
            r0.f1952k = r6
            r0.f1950i = r4
            java.lang.Object r7 = b(r5, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            i.v.g r7 = (i.v.g) r7
        L68:
            androidx.room.r0$f r2 = new androidx.room.r0$f
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f1951j = r4
            r0.f1952k = r4
            r0.f1950i = r3
            java.lang.Object r7 = kotlinx.coroutines.f.e(r7, r2, r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.r0.c(androidx.room.q0, i.y.c.l, i.v.d):java.lang.Object");
    }
}