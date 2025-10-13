package com.google.android.datatransport.cct.f;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes.dex */
public final class b implements com.google.firebase.k.g.a {
    public static final com.google.firebase.k.g.a a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class a implements com.google.firebase.k.c<com.google.android.datatransport.cct.f.a> {
        static final a a = new a();

        private a() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.cct.f.a aVar, com.google.firebase.k.d dVar) {
            dVar.f("sdkVersion", aVar.m());
            dVar.f("model", aVar.j());
            dVar.f("hardware", aVar.f());
            dVar.f("device", aVar.d());
            dVar.f("product", aVar.l());
            dVar.f("osBuild", aVar.k());
            dVar.f("manufacturer", aVar.h());
            dVar.f("fingerprint", aVar.e());
            dVar.f("locale", aVar.g());
            dVar.f("country", aVar.c());
            dVar.f("mccMnc", aVar.i());
            dVar.f("applicationBuild", aVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$b, reason: collision with other inner class name */
    private static final class C0106b implements com.google.firebase.k.c<j> {
        static final C0106b a = new C0106b();

        private C0106b() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, com.google.firebase.k.d dVar) {
            dVar.f("logRequest", jVar.c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class c implements com.google.firebase.k.c<k> {
        static final c a = new c();

        private c() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(k kVar, com.google.firebase.k.d dVar) {
            dVar.f("clientType", kVar.c());
            dVar.f("androidClientInfo", kVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class d implements com.google.firebase.k.c<l> {
        static final d a = new d();

        private d() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(l lVar, com.google.firebase.k.d dVar) {
            dVar.b("eventTimeMs", lVar.c());
            dVar.f("eventCode", lVar.b());
            dVar.b("eventUptimeMs", lVar.d());
            dVar.f("sourceExtension", lVar.f());
            dVar.f("sourceExtensionJsonProto3", lVar.g());
            dVar.b("timezoneOffsetSeconds", lVar.h());
            dVar.f("networkConnectionInfo", lVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class e implements com.google.firebase.k.c<m> {
        static final e a = new e();

        private e() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(m mVar, com.google.firebase.k.d dVar) {
            dVar.b("requestTimeMs", mVar.g());
            dVar.b("requestUptimeMs", mVar.h());
            dVar.f("clientInfo", mVar.b());
            dVar.f("logSource", mVar.d());
            dVar.f("logSourceName", mVar.e());
            dVar.f("logEvent", mVar.c());
            dVar.f("qosTier", mVar.f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class f implements com.google.firebase.k.c<o> {
        static final f a = new f();

        private f() {
        }

        @Override // com.google.firebase.k.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(o oVar, com.google.firebase.k.d dVar) {
            dVar.f("networkType", oVar.c());
            dVar.f("mobileSubtype", oVar.b());
        }
    }

    private b() {
    }

    @Override // com.google.firebase.k.g.a
    public void a(com.google.firebase.k.g.b<?> bVar) {
        C0106b c0106b = C0106b.a;
        bVar.a(j.class, c0106b);
        bVar.a(com.google.android.datatransport.cct.f.d.class, c0106b);
        e eVar = e.a;
        bVar.a(m.class, eVar);
        bVar.a(g.class, eVar);
        c cVar = c.a;
        bVar.a(k.class, cVar);
        bVar.a(com.google.android.datatransport.cct.f.e.class, cVar);
        a aVar = a.a;
        bVar.a(com.google.android.datatransport.cct.f.a.class, aVar);
        bVar.a(com.google.android.datatransport.cct.f.c.class, aVar);
        d dVar = d.a;
        bVar.a(l.class, dVar);
        bVar.a(com.google.android.datatransport.cct.f.f.class, dVar);
        f fVar = f.a;
        bVar.a(o.class, fVar);
        bVar.a(i.class, fVar);
    }
}