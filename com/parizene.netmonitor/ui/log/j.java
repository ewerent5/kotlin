package com.parizene.netmonitor.ui.log;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.db.AppDatabase;
import java.util.List;

/* compiled from: LogItemsRepository.kt */
/* loaded from: classes3.dex */
public final class j {
    private final AppDatabase a;

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements kotlinx.coroutines.r2.c<List<? extends g>> {
        final /* synthetic */ kotlinx.coroutines.r2.c a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f13898b;

        /* compiled from: Collect.kt */
        /* renamed from: com.parizene.netmonitor.ui.log.j$a$a, reason: collision with other inner class name */
        public static final class C0167a implements kotlinx.coroutines.r2.d<List<? extends com.parizene.netmonitor.db.celllog.i.e>> {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r2.d f13899e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f13900f;

            @i.v.j.a.f(c = "com.parizene.netmonitor.ui.log.LogItemsRepository$loadLogItems$$inlined$map$1$2", f = "LogItemsRepository.kt", l = {135}, m = "emit")
            /* renamed from: com.parizene.netmonitor.ui.log.j$a$a$a, reason: collision with other inner class name */
            public static final class C0168a extends i.v.j.a.d {

                /* renamed from: h, reason: collision with root package name */
                /* synthetic */ Object f13901h;

                /* renamed from: i, reason: collision with root package name */
                int f13902i;

                public C0168a(i.v.d dVar) {
                    super(dVar);
                }

                @Override // i.v.j.a.a
                public final Object p(Object obj) {
                    this.f13901h = obj;
                    this.f13902i |= Level.ALL_INT;
                    return C0167a.this.b(null, this);
                }
            }

            public C0167a(kotlinx.coroutines.r2.d dVar, a aVar) {
                this.f13899e = dVar;
                this.f13900f = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.r2.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object b(java.util.List<? extends com.parizene.netmonitor.db.celllog.i.e> r7, i.v.d r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.parizene.netmonitor.ui.log.j.a.C0167a.C0168a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.parizene.netmonitor.ui.log.j$a$a$a r0 = (com.parizene.netmonitor.ui.log.j.a.C0167a.C0168a) r0
                    int r1 = r0.f13902i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13902i = r1
                    goto L18
                L13:
                    com.parizene.netmonitor.ui.log.j$a$a$a r0 = new com.parizene.netmonitor.ui.log.j$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f13901h
                    java.lang.Object r1 = i.v.i.b.c()
                    int r2 = r0.f13902i
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    i.n.b(r8)
                    goto L68
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    i.n.b(r8)
                    kotlinx.coroutines.r2.d r8 = r6.f13899e
                    java.util.List r7 = (java.util.List) r7
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = i.t.j.o(r7, r4)
                    r2.<init>(r4)
                    java.util.Iterator r7 = r7.iterator()
                L47:
                    boolean r4 = r7.hasNext()
                    if (r4 == 0) goto L5f
                    java.lang.Object r4 = r7.next()
                    com.parizene.netmonitor.db.celllog.i.e r4 = (com.parizene.netmonitor.db.celllog.i.e) r4
                    com.parizene.netmonitor.ui.log.j$a r5 = r6.f13900f
                    com.parizene.netmonitor.ui.log.j r5 = r5.f13898b
                    com.parizene.netmonitor.ui.log.g r4 = com.parizene.netmonitor.ui.log.j.a(r5, r4)
                    r2.add(r4)
                    goto L47
                L5f:
                    r0.f13902i = r3
                    java.lang.Object r7 = r8.b(r2, r0)
                    if (r7 != r1) goto L68
                    return r1
                L68:
                    i.s r7 = i.s.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.parizene.netmonitor.ui.log.j.a.C0167a.b(java.lang.Object, i.v.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.r2.c cVar, j jVar) {
            this.a = cVar;
            this.f13898b = jVar;
        }

        @Override // kotlinx.coroutines.r2.c
        public Object a(kotlinx.coroutines.r2.d<? super List<? extends g>> dVar, i.v.d dVar2) {
            Object objA = this.a.a(new C0167a(dVar, this), dVar2);
            return objA == i.v.i.d.c() ? objA : i.s.a;
        }
    }

    public j(AppDatabase appDatabase) {
        i.y.d.l.d(appDatabase, "appDatabase");
        this.a = appDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g d(com.parizene.netmonitor.db.celllog.i.e eVar) {
        long j2 = eVar.a;
        boolean z = eVar.f13095i;
        String str = eVar.f13088b;
        i.y.d.l.c(str, "entity.mcc");
        String str2 = eVar.f13089c;
        i.y.d.l.c(str2, "entity.mnc");
        int i2 = eVar.f13090d;
        long jA = eVar.a();
        int iB = eVar.b();
        int i3 = eVar.f13092f;
        int i4 = eVar.f13098l;
        int iG = eVar.g();
        int iE = eVar.e();
        int i5 = eVar.f13097k;
        long j3 = eVar.f13096j;
        long j4 = CoreConstants.MILLIS_IN_ONE_MINUTE;
        String strD = eVar.d();
        i.y.d.l.c(strD, "entity.info");
        return new g(j2, z, str, str2, i2, jA, iB, i3, i4, iG, iE, i5, (j3 / j4) * j4, strD);
    }

    public final Object b(g gVar, i.v.d<? super i.s> dVar) {
        Object objG = this.a.F().g(gVar.c(), dVar);
        return objG == i.v.i.d.c() ? objG : i.s.a;
    }

    public final kotlinx.coroutines.r2.c<List<g>> c(String str, String str2, String str3, boolean z, boolean z2, int i2, int i3) {
        return new a(this.a.F().o(str, str2, str3, z, z2, i2, i3), this);
    }

    public final Object e(g gVar, String str, i.v.d<? super i.s> dVar) {
        Object objI = this.a.G().i(gVar.i(), gVar.j(), gVar.f(), gVar.b(), str, dVar);
        return objI == i.v.i.d.c() ? objI : i.s.a;
    }
}