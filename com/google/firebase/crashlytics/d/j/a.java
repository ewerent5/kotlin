package com.google.firebase.crashlytics.d.j;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* loaded from: classes.dex */
public final class a implements com.google.firebase.k.g.a {
    public static final com.google.firebase.k.g.a a = new a();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.d.j.a$a */
    private static final class C0134a implements com.google.firebase.k.c<v.b> {
        static final C0134a a = new C0134a();

        private C0134a() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.b bVar, com.google.firebase.k.d dVar) {
            dVar.f(Action.KEY_ATTRIBUTE, bVar.b());
            dVar.f("value", bVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class b implements com.google.firebase.k.c<v> {
        static final b a = new b();

        private b() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v vVar, com.google.firebase.k.d dVar) {
            dVar.f("sdkVersion", vVar.i());
            dVar.f("gmpAppId", vVar.e());
            dVar.c("platform", vVar.h());
            dVar.f("installationUuid", vVar.f());
            dVar.f("buildVersion", vVar.c());
            dVar.f("displayVersion", vVar.d());
            dVar.f("session", vVar.j());
            dVar.f("ndkPayload", vVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class c implements com.google.firebase.k.c<v.c> {
        static final c a = new c();

        private c() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.c cVar, com.google.firebase.k.d dVar) {
            dVar.f("files", cVar.b());
            dVar.f("orgId", cVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class d implements com.google.firebase.k.c<v.c.b> {
        static final d a = new d();

        private d() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.c.b bVar, com.google.firebase.k.d dVar) {
            dVar.f("filename", bVar.c());
            dVar.f("contents", bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class e implements com.google.firebase.k.c<v.d.a> {
        static final e a = new e();

        private e() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.a aVar, com.google.firebase.k.d dVar) {
            dVar.f("identifier", aVar.e());
            dVar.f("version", aVar.h());
            dVar.f("displayVersion", aVar.d());
            dVar.f("organization", aVar.g());
            dVar.f("installationUuid", aVar.f());
            dVar.f("developmentPlatform", aVar.b());
            dVar.f("developmentPlatformVersion", aVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class f implements com.google.firebase.k.c<v.d.a.b> {
        static final f a = new f();

        private f() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.a.b bVar, com.google.firebase.k.d dVar) {
            dVar.f("clsId", bVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class g implements com.google.firebase.k.c<v.d.c> {
        static final g a = new g();

        private g() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.c cVar, com.google.firebase.k.d dVar) {
            dVar.c("arch", cVar.b());
            dVar.f("model", cVar.f());
            dVar.c("cores", cVar.c());
            dVar.b("ram", cVar.h());
            dVar.b("diskSpace", cVar.d());
            dVar.a("simulator", cVar.j());
            dVar.c("state", cVar.i());
            dVar.f("manufacturer", cVar.e());
            dVar.f("modelClass", cVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class h implements com.google.firebase.k.c<v.d> {
        static final h a = new h();

        private h() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d dVar, com.google.firebase.k.d dVar2) {
            dVar2.f("generator", dVar.f());
            dVar2.f("identifier", dVar.i());
            dVar2.b("startedAt", dVar.k());
            dVar2.f("endedAt", dVar.d());
            dVar2.a("crashed", dVar.m());
            dVar2.f("app", dVar.b());
            dVar2.f("user", dVar.l());
            dVar2.f("os", dVar.j());
            dVar2.f("device", dVar.c());
            dVar2.f("events", dVar.e());
            dVar2.c("generatorType", dVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class i implements com.google.firebase.k.c<v.d.AbstractC0137d.a> {
        static final i a = new i();

        private i() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.AbstractC0137d.a aVar, com.google.firebase.k.d dVar) {
            dVar.f("execution", aVar.d());
            dVar.f("customAttributes", aVar.c());
            dVar.f("background", aVar.b());
            dVar.c("uiOrientation", aVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class j implements com.google.firebase.k.c<v.d.AbstractC0137d.a.b.AbstractC0139a> {
        static final j a = new j();

        private j() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.AbstractC0137d.a.b.AbstractC0139a abstractC0139a, com.google.firebase.k.d dVar) {
            dVar.b("baseAddress", abstractC0139a.b());
            dVar.b("size", abstractC0139a.d());
            dVar.f(Action.NAME_ATTRIBUTE, abstractC0139a.c());
            dVar.f("uuid", abstractC0139a.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class k implements com.google.firebase.k.c<v.d.AbstractC0137d.a.b> {
        static final k a = new k();

        private k() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.AbstractC0137d.a.b bVar, com.google.firebase.k.d dVar) {
            dVar.f("threads", bVar.e());
            dVar.f("exception", bVar.c());
            dVar.f("signal", bVar.d());
            dVar.f("binaries", bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class l implements com.google.firebase.k.c<v.d.AbstractC0137d.a.b.c> {
        static final l a = new l();

        private l() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.AbstractC0137d.a.b.c cVar, com.google.firebase.k.d dVar) {
            dVar.f("type", cVar.f());
            dVar.f("reason", cVar.e());
            dVar.f("frames", cVar.c());
            dVar.f("causedBy", cVar.b());
            dVar.c("overflowCount", cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class m implements com.google.firebase.k.c<v.d.AbstractC0137d.a.b.AbstractC0143d> {
        static final m a = new m();

        private m() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.AbstractC0137d.a.b.AbstractC0143d abstractC0143d, com.google.firebase.k.d dVar) {
            dVar.f(Action.NAME_ATTRIBUTE, abstractC0143d.d());
            dVar.f("code", abstractC0143d.c());
            dVar.b("address", abstractC0143d.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class n implements com.google.firebase.k.c<v.d.AbstractC0137d.a.b.e> {
        static final n a = new n();

        private n() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.AbstractC0137d.a.b.e eVar, com.google.firebase.k.d dVar) {
            dVar.f(Action.NAME_ATTRIBUTE, eVar.d());
            dVar.c("importance", eVar.c());
            dVar.f("frames", eVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class o implements com.google.firebase.k.c<v.d.AbstractC0137d.a.b.e.AbstractC0146b> {
        static final o a = new o();

        private o() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.AbstractC0137d.a.b.e.AbstractC0146b abstractC0146b, com.google.firebase.k.d dVar) {
            dVar.b("pc", abstractC0146b.e());
            dVar.f("symbol", abstractC0146b.f());
            dVar.f(Action.FILE_ATTRIBUTE, abstractC0146b.b());
            dVar.b("offset", abstractC0146b.d());
            dVar.c("importance", abstractC0146b.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class p implements com.google.firebase.k.c<v.d.AbstractC0137d.c> {
        static final p a = new p();

        private p() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.AbstractC0137d.c cVar, com.google.firebase.k.d dVar) {
            dVar.f("batteryLevel", cVar.b());
            dVar.c("batteryVelocity", cVar.c());
            dVar.a("proximityOn", cVar.g());
            dVar.c("orientation", cVar.e());
            dVar.b("ramUsed", cVar.f());
            dVar.b("diskUsed", cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class q implements com.google.firebase.k.c<v.d.AbstractC0137d> {
        static final q a = new q();

        private q() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.AbstractC0137d abstractC0137d, com.google.firebase.k.d dVar) {
            dVar.b("timestamp", abstractC0137d.e());
            dVar.f("type", abstractC0137d.f());
            dVar.f("app", abstractC0137d.b());
            dVar.f("device", abstractC0137d.c());
            dVar.f("log", abstractC0137d.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class r implements com.google.firebase.k.c<v.d.AbstractC0137d.AbstractC0148d> {
        static final r a = new r();

        private r() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.AbstractC0137d.AbstractC0148d abstractC0148d, com.google.firebase.k.d dVar) {
            dVar.f("content", abstractC0148d.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class s implements com.google.firebase.k.c<v.d.e> {
        static final s a = new s();

        private s() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.e eVar, com.google.firebase.k.d dVar) {
            dVar.c("platform", eVar.c());
            dVar.f("version", eVar.d());
            dVar.f("buildVersion", eVar.b());
            dVar.a("jailbroken", eVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class t implements com.google.firebase.k.c<v.d.f> {
        static final t a = new t();

        private t() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b */
        public void a(v.d.f fVar, com.google.firebase.k.d dVar) {
            dVar.f("identifier", fVar.b());
        }
    }

    private a() {
    }

    @Override // com.google.firebase.k.g.a
    public void a(com.google.firebase.k.g.b<?> bVar) {
        b bVar2 = b.a;
        bVar.a(v.class, bVar2);
        bVar.a(com.google.firebase.crashlytics.d.j.b.class, bVar2);
        h hVar = h.a;
        bVar.a(v.d.class, hVar);
        bVar.a(com.google.firebase.crashlytics.d.j.f.class, hVar);
        e eVar = e.a;
        bVar.a(v.d.a.class, eVar);
        bVar.a(com.google.firebase.crashlytics.d.j.g.class, eVar);
        f fVar = f.a;
        bVar.a(v.d.a.b.class, fVar);
        bVar.a(com.google.firebase.crashlytics.d.j.h.class, fVar);
        t tVar = t.a;
        bVar.a(v.d.f.class, tVar);
        bVar.a(u.class, tVar);
        s sVar = s.a;
        bVar.a(v.d.e.class, sVar);
        bVar.a(com.google.firebase.crashlytics.d.j.t.class, sVar);
        g gVar = g.a;
        bVar.a(v.d.c.class, gVar);
        bVar.a(com.google.firebase.crashlytics.d.j.i.class, gVar);
        q qVar = q.a;
        bVar.a(v.d.AbstractC0137d.class, qVar);
        bVar.a(com.google.firebase.crashlytics.d.j.j.class, qVar);
        i iVar = i.a;
        bVar.a(v.d.AbstractC0137d.a.class, iVar);
        bVar.a(com.google.firebase.crashlytics.d.j.k.class, iVar);
        k kVar = k.a;
        bVar.a(v.d.AbstractC0137d.a.b.class, kVar);
        bVar.a(com.google.firebase.crashlytics.d.j.l.class, kVar);
        n nVar = n.a;
        bVar.a(v.d.AbstractC0137d.a.b.e.class, nVar);
        bVar.a(com.google.firebase.crashlytics.d.j.p.class, nVar);
        o oVar = o.a;
        bVar.a(v.d.AbstractC0137d.a.b.e.AbstractC0146b.class, oVar);
        bVar.a(com.google.firebase.crashlytics.d.j.q.class, oVar);
        l lVar = l.a;
        bVar.a(v.d.AbstractC0137d.a.b.c.class, lVar);
        bVar.a(com.google.firebase.crashlytics.d.j.n.class, lVar);
        m mVar = m.a;
        bVar.a(v.d.AbstractC0137d.a.b.AbstractC0143d.class, mVar);
        bVar.a(com.google.firebase.crashlytics.d.j.o.class, mVar);
        j jVar = j.a;
        bVar.a(v.d.AbstractC0137d.a.b.AbstractC0139a.class, jVar);
        bVar.a(com.google.firebase.crashlytics.d.j.m.class, jVar);
        C0134a c0134a = C0134a.a;
        bVar.a(v.b.class, c0134a);
        bVar.a(com.google.firebase.crashlytics.d.j.c.class, c0134a);
        p pVar = p.a;
        bVar.a(v.d.AbstractC0137d.c.class, pVar);
        bVar.a(com.google.firebase.crashlytics.d.j.r.class, pVar);
        r rVar = r.a;
        bVar.a(v.d.AbstractC0137d.AbstractC0148d.class, rVar);
        bVar.a(com.google.firebase.crashlytics.d.j.s.class, rVar);
        c cVar = c.a;
        bVar.a(v.c.class, cVar);
        bVar.a(com.google.firebase.crashlytics.d.j.d.class, cVar);
        d dVar = d.a;
        bVar.a(v.c.b.class, dVar);
        bVar.a(com.google.firebase.crashlytics.d.j.e.class, dVar);
    }
}