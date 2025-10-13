package androidx.room;

import androidx.room.i0;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: CoroutinesRoom.kt */
/* loaded from: classes.dex */
public final class z {
    public static final a a = new a(null);

    /* compiled from: CoroutinesRoom.kt */
    public static final class a {

        /* JADX INFO: Add missing generic type declarations: [R] */
        /* compiled from: CoroutinesRoom.kt */
        @i.v.j.a.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: androidx.room.z$a$a, reason: collision with other inner class name */
        static final class C0029a<R> extends i.v.j.a.k implements i.y.c.p<kotlinx.coroutines.r2.d<? super R>, i.v.d<? super i.s>, Object> {

            /* renamed from: i, reason: collision with root package name */
            private /* synthetic */ Object f2015i;

            /* renamed from: j, reason: collision with root package name */
            int f2016j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ String[] f2017k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ boolean f2018l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ q0 f2019m;
            final /* synthetic */ Callable n;

            /* compiled from: CoroutinesRoom.kt */
            @i.v.j.a.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {121, 123}, m = "invokeSuspend")
            /* renamed from: androidx.room.z$a$a$a, reason: collision with other inner class name */
            static final class C0030a extends i.v.j.a.k implements i.y.c.p<kotlinx.coroutines.i0, i.v.d<? super i.s>, Object> {

                /* renamed from: i, reason: collision with root package name */
                Object f2020i;

                /* renamed from: j, reason: collision with root package name */
                int f2021j;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r2.d f2023l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ i.y.d.u f2024m;
                final /* synthetic */ kotlinx.coroutines.q2.g n;
                final /* synthetic */ i.y.d.u o;

                /* compiled from: CoroutinesRoom.kt */
                @i.v.j.a.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {123}, m = "invokeSuspend")
                /* renamed from: androidx.room.z$a$a$a$a, reason: collision with other inner class name */
                static final class C0031a extends i.v.j.a.k implements i.y.c.p<kotlinx.coroutines.i0, i.v.d<? super i.s>, Object> {

                    /* renamed from: i, reason: collision with root package name */
                    int f2025i;

                    /* renamed from: k, reason: collision with root package name */
                    final /* synthetic */ i.y.d.u f2027k;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0031a(i.y.d.u uVar, i.v.d dVar) {
                        super(2, dVar);
                        this.f2027k = uVar;
                    }

                    @Override // i.v.j.a.a
                    public final i.v.d<i.s> g(Object obj, i.v.d<?> dVar) {
                        i.y.d.l.d(dVar, "completion");
                        return C0030a.this.new C0031a(this.f2027k, dVar);
                    }

                    @Override // i.y.c.p
                    public final Object i(kotlinx.coroutines.i0 i0Var, i.v.d<? super i.s> dVar) {
                        return ((C0031a) g(i0Var, dVar)).p(i.s.a);
                    }

                    @Override // i.v.j.a.a
                    public final Object p(Object obj) throws Throwable {
                        Object objC = i.v.i.d.c();
                        int i2 = this.f2025i;
                        if (i2 == 0) {
                            i.n.b(obj);
                            kotlinx.coroutines.r2.d dVar = C0030a.this.f2023l;
                            T t = this.f2027k.f15893e;
                            this.f2025i = 1;
                            if (dVar.b(t, this) == objC) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0030a(kotlinx.coroutines.r2.d dVar, i.y.d.u uVar, kotlinx.coroutines.q2.g gVar, i.y.d.u uVar2, i.v.d dVar2) {
                    super(2, dVar2);
                    this.f2023l = dVar;
                    this.f2024m = uVar;
                    this.n = gVar;
                    this.o = uVar2;
                }

                @Override // i.v.j.a.a
                public final i.v.d<i.s> g(Object obj, i.v.d<?> dVar) {
                    i.y.d.l.d(dVar, "completion");
                    return new C0030a(this.f2023l, this.f2024m, this.n, this.o, dVar);
                }

                @Override // i.y.c.p
                public final Object i(kotlinx.coroutines.i0 i0Var, i.v.d<? super i.s> dVar) {
                    return ((C0030a) g(i0Var, dVar)).p(i.s.a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #0 {all -> 0x009c, blocks: (B:17:0x0044, B:21:0x0052, B:23:0x005a), top: B:35:0x0044 }] */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
                /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Object] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0086 -> B:35:0x0044). Please report as a decompilation issue!!! */
                @Override // i.v.j.a.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object p(java.lang.Object r10) throws java.lang.Throwable {
                    /*
                        r9 = this;
                        java.lang.Object r0 = i.v.i.b.c()
                        int r1 = r9.f2021j
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L29
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r9.f2020i
                        kotlinx.coroutines.q2.h r1 = (kotlinx.coroutines.q2.h) r1
                        i.n.b(r10)     // Catch: java.lang.Throwable -> L9e
                        r10 = r1
                        goto L43
                    L17:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L1f:
                        java.lang.Object r1 = r9.f2020i
                        kotlinx.coroutines.q2.h r1 = (kotlinx.coroutines.q2.h) r1
                        i.n.b(r10)     // Catch: java.lang.Throwable -> L9e
                        r4 = r1
                        r1 = r9
                        goto L52
                    L29:
                        i.n.b(r10)
                        androidx.room.z$a$a r10 = androidx.room.z.a.C0029a.this
                        androidx.room.q0 r10 = r10.f2019m
                        androidx.room.i0 r10 = r10.k()
                        i.y.d.u r1 = r9.f2024m
                        T r1 = r1.f15893e
                        androidx.room.z$a$a$b r1 = (androidx.room.z.a.C0029a.b) r1
                        r10.a(r1)
                        kotlinx.coroutines.q2.g r10 = r9.n     // Catch: java.lang.Throwable -> L9e
                        kotlinx.coroutines.q2.h r10 = r10.iterator()     // Catch: java.lang.Throwable -> L9e
                    L43:
                        r1 = r9
                    L44:
                        r1.f2020i = r10     // Catch: java.lang.Throwable -> L9c
                        r1.f2021j = r3     // Catch: java.lang.Throwable -> L9c
                        java.lang.Object r4 = r10.a(r1)     // Catch: java.lang.Throwable -> L9c
                        if (r4 != r0) goto L4f
                        return r0
                    L4f:
                        r8 = r4
                        r4 = r10
                        r10 = r8
                    L52:
                        java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9c
                        boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9c
                        if (r10 == 0) goto L88
                        java.lang.Object r10 = r4.next()     // Catch: java.lang.Throwable -> L9c
                        i.s r10 = (i.s) r10     // Catch: java.lang.Throwable -> L9c
                        i.y.d.u r10 = new i.y.d.u     // Catch: java.lang.Throwable -> L9c
                        r10.<init>()     // Catch: java.lang.Throwable -> L9c
                        androidx.room.z$a$a r5 = androidx.room.z.a.C0029a.this     // Catch: java.lang.Throwable -> L9c
                        java.util.concurrent.Callable r5 = r5.n     // Catch: java.lang.Throwable -> L9c
                        java.lang.Object r5 = r5.call()     // Catch: java.lang.Throwable -> L9c
                        r10.f15893e = r5     // Catch: java.lang.Throwable -> L9c
                        i.y.d.u r5 = r1.o     // Catch: java.lang.Throwable -> L9c
                        T r5 = r5.f15893e     // Catch: java.lang.Throwable -> L9c
                        i.v.g r5 = (i.v.g) r5     // Catch: java.lang.Throwable -> L9c
                        androidx.room.z$a$a$a$a r6 = new androidx.room.z$a$a$a$a     // Catch: java.lang.Throwable -> L9c
                        r7 = 0
                        r6.<init>(r10, r7)     // Catch: java.lang.Throwable -> L9c
                        r1.f2020i = r4     // Catch: java.lang.Throwable -> L9c
                        r1.f2021j = r2     // Catch: java.lang.Throwable -> L9c
                        java.lang.Object r10 = kotlinx.coroutines.f.e(r5, r6, r1)     // Catch: java.lang.Throwable -> L9c
                        if (r10 != r0) goto L86
                        return r0
                    L86:
                        r10 = r4
                        goto L44
                    L88:
                        androidx.room.z$a$a r10 = androidx.room.z.a.C0029a.this
                        androidx.room.q0 r10 = r10.f2019m
                        androidx.room.i0 r10 = r10.k()
                        i.y.d.u r0 = r1.f2024m
                        T r0 = r0.f15893e
                        androidx.room.z$a$a$b r0 = (androidx.room.z.a.C0029a.b) r0
                        r10.k(r0)
                        i.s r10 = i.s.a
                        return r10
                    L9c:
                        r10 = move-exception
                        goto La0
                    L9e:
                        r10 = move-exception
                        r1 = r9
                    La0:
                        androidx.room.z$a$a r0 = androidx.room.z.a.C0029a.this
                        androidx.room.q0 r0 = r0.f2019m
                        androidx.room.i0 r0 = r0.k()
                        i.y.d.u r1 = r1.f2024m
                        T r1 = r1.f15893e
                        androidx.room.z$a$a$b r1 = (androidx.room.z.a.C0029a.b) r1
                        r0.k(r1)
                        throw r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.z.a.C0029a.C0030a.p(java.lang.Object):java.lang.Object");
                }
            }

            /* compiled from: CoroutinesRoom.kt */
            /* renamed from: androidx.room.z$a$a$b */
            public static final class b extends i0.c {

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.q2.g f2029c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(kotlinx.coroutines.q2.g gVar, String[] strArr) {
                    super(strArr);
                    this.f2029c = gVar;
                }

                @Override // androidx.room.i0.c
                public void b(Set<String> set) {
                    i.y.d.l.d(set, "tables");
                    this.f2029c.offer(i.s.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0029a(String[] strArr, boolean z, q0 q0Var, Callable callable, i.v.d dVar) {
                super(2, dVar);
                this.f2017k = strArr;
                this.f2018l = z;
                this.f2019m = q0Var;
                this.n = callable;
            }

            @Override // i.v.j.a.a
            public final i.v.d<i.s> g(Object obj, i.v.d<?> dVar) {
                i.y.d.l.d(dVar, "completion");
                C0029a c0029a = new C0029a(this.f2017k, this.f2018l, this.f2019m, this.n, dVar);
                c0029a.f2015i = obj;
                return c0029a;
            }

            @Override // i.y.c.p
            public final Object i(Object obj, i.v.d<? super i.s> dVar) {
                return ((C0029a) g(obj, dVar)).p(i.s.a);
            }

            /* JADX WARN: Type inference failed for: r11v3, types: [T, androidx.room.z$a$a$b] */
            /* JADX WARN: Type inference failed for: r11v5, types: [T, i.v.g] */
            @Override // i.v.j.a.a
            public final Object p(Object obj) throws Throwable {
                i.v.e eVarB;
                Object objC = i.v.i.d.c();
                int i2 = this.f2016j;
                if (i2 == 0) {
                    i.n.b(obj);
                    kotlinx.coroutines.r2.d dVar = (kotlinx.coroutines.r2.d) this.f2015i;
                    kotlinx.coroutines.q2.g gVarB = kotlinx.coroutines.q2.i.b(-1, null, null, 6, null);
                    i.y.d.u uVar = new i.y.d.u();
                    uVar.f15893e = new b(gVarB, this.f2017k);
                    gVarB.offer(i.s.a);
                    i.y.d.u uVar2 = new i.y.d.u();
                    uVar2.f15893e = getContext();
                    z0 z0Var = (z0) getContext().get(z0.f2032e);
                    if (z0Var == null || (eVarB = z0Var.c()) == null) {
                        eVarB = this.f2018l ? a0.b(this.f2019m) : a0.a(this.f2019m);
                    }
                    C0030a c0030a = new C0030a(dVar, uVar, gVarB, uVar2, null);
                    this.f2016j = 1;
                    if (kotlinx.coroutines.f.e(eVarB, c0030a, this) == objC) {
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

        /* JADX INFO: Add missing generic type declarations: [R] */
        /* compiled from: CoroutinesRoom.kt */
        @i.v.j.a.f(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        static final class b<R> extends i.v.j.a.k implements i.y.c.p<kotlinx.coroutines.i0, i.v.d<? super R>, Object> {

            /* renamed from: i, reason: collision with root package name */
            int f2030i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Callable f2031j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Callable callable, i.v.d dVar) {
                super(2, dVar);
                this.f2031j = callable;
            }

            @Override // i.v.j.a.a
            public final i.v.d<i.s> g(Object obj, i.v.d<?> dVar) {
                i.y.d.l.d(dVar, "completion");
                return new b(this.f2031j, dVar);
            }

            @Override // i.y.c.p
            public final Object i(kotlinx.coroutines.i0 i0Var, Object obj) {
                return ((b) g(i0Var, (i.v.d) obj)).p(i.s.a);
            }

            @Override // i.v.j.a.a
            public final Object p(Object obj) throws Throwable {
                i.v.i.d.c();
                if (this.f2030i != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i.n.b(obj);
                return this.f2031j.call();
            }
        }

        private a() {
        }

        public final <R> kotlinx.coroutines.r2.c<R> a(q0 q0Var, boolean z, String[] strArr, Callable<R> callable) {
            i.y.d.l.d(q0Var, "db");
            i.y.d.l.d(strArr, "tableNames");
            i.y.d.l.d(callable, "callable");
            return kotlinx.coroutines.r2.e.b(new C0029a(strArr, z, q0Var, callable, null));
        }

        public final <R> Object b(q0 q0Var, boolean z, Callable<R> callable, i.v.d<? super R> dVar) {
            i.v.e eVarB;
            if (q0Var.w() && q0Var.q()) {
                return callable.call();
            }
            z0 z0Var = (z0) dVar.getContext().get(z0.f2032e);
            if (z0Var == null || (eVarB = z0Var.c()) == null) {
                eVarB = z ? a0.b(q0Var) : a0.a(q0Var);
            }
            return kotlinx.coroutines.f.e(eVarB, new b(callable, null), dVar);
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    public static final <R> kotlinx.coroutines.r2.c<R> a(q0 q0Var, boolean z, String[] strArr, Callable<R> callable) {
        return a.a(q0Var, z, strArr, callable);
    }

    public static final <R> Object b(q0 q0Var, boolean z, Callable<R> callable, i.v.d<? super R> dVar) {
        return a.b(q0Var, z, callable, dVar);
    }
}