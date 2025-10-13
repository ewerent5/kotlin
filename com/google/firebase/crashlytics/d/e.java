package com.google.firebase.crashlytics.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.d.h.m;
import com.google.firebase.crashlytics.d.h.s;
import com.google.firebase.crashlytics.d.h.u;
import com.google.firebase.crashlytics.d.h.x;
import e.c.b.b.e.g;
import e.c.b.b.e.h;
import java.util.concurrent.Executor;

/* compiled from: Onboarding.java */
/* loaded from: classes.dex */
public class e {
    private final com.google.firebase.crashlytics.d.k.c a = new com.google.firebase.crashlytics.d.k.c();

    /* renamed from: b */
    private final com.google.firebase.c f12315b;

    /* renamed from: c */
    private final Context f12316c;

    /* renamed from: d */
    private PackageManager f12317d;

    /* renamed from: e */
    private String f12318e;

    /* renamed from: f */
    private PackageInfo f12319f;

    /* renamed from: g */
    private String f12320g;

    /* renamed from: h */
    private String f12321h;

    /* renamed from: i */
    private String f12322i;

    /* renamed from: j */
    private String f12323j;

    /* renamed from: k */
    private String f12324k;

    /* renamed from: l */
    private x f12325l;

    /* renamed from: m */
    private s f12326m;

    /* compiled from: Onboarding.java */
    class a implements g<com.google.firebase.crashlytics.d.p.i.b, Void> {
        final /* synthetic */ String a;

        /* renamed from: b */
        final /* synthetic */ com.google.firebase.crashlytics.d.p.d f12327b;

        /* renamed from: c */
        final /* synthetic */ Executor f12328c;

        a(String str, com.google.firebase.crashlytics.d.p.d dVar, Executor executor) {
            this.a = str;
            this.f12327b = dVar;
            this.f12328c = executor;
        }

        @Override // e.c.b.b.e.g
        /* renamed from: b */
        public h<Void> a(com.google.firebase.crashlytics.d.p.i.b bVar) throws Exception {
            try {
                e.this.i(bVar, this.a, this.f12327b, this.f12328c, true);
                return null;
            } catch (Exception e2) {
                com.google.firebase.crashlytics.d.b.f().e("Error performing auto configuration.", e2);
                throw e2;
            }
        }
    }

    /* compiled from: Onboarding.java */
    class b implements g<Void, com.google.firebase.crashlytics.d.p.i.b> {
        final /* synthetic */ com.google.firebase.crashlytics.d.p.d a;

        b(com.google.firebase.crashlytics.d.p.d dVar) {
            this.a = dVar;
        }

        @Override // e.c.b.b.e.g
        /* renamed from: b */
        public h<com.google.firebase.crashlytics.d.p.i.b> a(Void r1) {
            return this.a.a();
        }
    }

    /* compiled from: Onboarding.java */
    class c implements e.c.b.b.e.a<Void, Object> {
        c() {
        }

        @Override // e.c.b.b.e.a
        public Object a(h<Void> hVar) {
            if (hVar.n()) {
                return null;
            }
            com.google.firebase.crashlytics.d.b.f().e("Error fetching settings.", hVar.j());
            return null;
        }
    }

    public e(com.google.firebase.c cVar, Context context, x xVar, s sVar) {
        this.f12315b = cVar;
        this.f12316c = context;
        this.f12325l = xVar;
        this.f12326m = sVar;
    }

    private com.google.firebase.crashlytics.d.p.i.a b(String str, String str2) {
        return new com.google.firebase.crashlytics.d.p.i.a(str, str2, e().d(), this.f12321h, this.f12320g, com.google.firebase.crashlytics.d.h.h.h(com.google.firebase.crashlytics.d.h.h.p(d()), str2, this.f12321h, this.f12320g), this.f12323j, u.a(this.f12322i).b(), this.f12324k, "0");
    }

    private x e() {
        return this.f12325l;
    }

    private static String g() {
        return m.i();
    }

    public void i(com.google.firebase.crashlytics.d.p.i.b bVar, String str, com.google.firebase.crashlytics.d.p.d dVar, Executor executor, boolean z) {
        if ("new".equals(bVar.a)) {
            if (j(bVar, str, z)) {
                dVar.o(com.google.firebase.crashlytics.d.p.c.SKIP_CACHE_LOOKUP, executor);
                return;
            } else {
                com.google.firebase.crashlytics.d.b.f().e("Failed to create app with Crashlytics service.", null);
                return;
            }
        }
        if ("configured".equals(bVar.a)) {
            dVar.o(com.google.firebase.crashlytics.d.p.c.SKIP_CACHE_LOOKUP, executor);
        } else if (bVar.f12747g) {
            com.google.firebase.crashlytics.d.b.f().b("Server says an update is required - forcing a full App update.");
            k(bVar, str, z);
        }
    }

    private boolean j(com.google.firebase.crashlytics.d.p.i.b bVar, String str, boolean z) {
        return new com.google.firebase.crashlytics.d.p.j.b(f(), bVar.f12742b, this.a, g()).i(b(bVar.f12746f, str), z);
    }

    private boolean k(com.google.firebase.crashlytics.d.p.i.b bVar, String str, boolean z) {
        return new com.google.firebase.crashlytics.d.p.j.e(f(), bVar.f12742b, this.a, g()).i(b(bVar.f12746f, str), z);
    }

    public void c(Executor executor, com.google.firebase.crashlytics.d.p.d dVar) {
        this.f12326m.j().p(executor, new b(dVar)).p(executor, new a(this.f12315b.j().c(), dVar, executor));
    }

    public Context d() {
        return this.f12316c;
    }

    String f() {
        return com.google.firebase.crashlytics.d.h.h.u(this.f12316c, "com.crashlytics.ApiEndpoint");
    }

    public boolean h() throws PackageManager.NameNotFoundException {
        try {
            this.f12322i = this.f12325l.e();
            this.f12317d = this.f12316c.getPackageManager();
            String packageName = this.f12316c.getPackageName();
            this.f12318e = packageName;
            PackageInfo packageInfo = this.f12317d.getPackageInfo(packageName, 0);
            this.f12319f = packageInfo;
            this.f12320g = Integer.toString(packageInfo.versionCode);
            String str = this.f12319f.versionName;
            if (str == null) {
                str = "0.0";
            }
            this.f12321h = str;
            this.f12323j = this.f12317d.getApplicationLabel(this.f12316c.getApplicationInfo()).toString();
            this.f12324k = Integer.toString(this.f12316c.getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            com.google.firebase.crashlytics.d.b.f().e("Failed init", e2);
            return false;
        }
    }

    public com.google.firebase.crashlytics.d.p.d l(Context context, com.google.firebase.c cVar, Executor executor) {
        com.google.firebase.crashlytics.d.p.d dVarL = com.google.firebase.crashlytics.d.p.d.l(context, cVar.j().c(), this.f12325l, this.a, this.f12320g, this.f12321h, f(), this.f12326m);
        dVarL.p(executor).g(executor, new c());
        return dVarL;
    }
}