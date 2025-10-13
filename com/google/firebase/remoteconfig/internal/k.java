package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.internal.n;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes.dex */
public class k {
    public static final long a = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: b, reason: collision with root package name */
    static final int[] f12941b = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.g f12942c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.analytics.a.a f12943d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f12944e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f12945f;

    /* renamed from: g, reason: collision with root package name */
    private final Random f12946g;

    /* renamed from: h, reason: collision with root package name */
    private final e f12947h;

    /* renamed from: i, reason: collision with root package name */
    private final ConfigFetchHttpClient f12948i;

    /* renamed from: j, reason: collision with root package name */
    private final n f12949j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, String> f12950k;

    /* compiled from: ConfigFetchHandler.java */
    public static class a {
        private final Date a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12951b;

        /* renamed from: c, reason: collision with root package name */
        private final f f12952c;

        /* renamed from: d, reason: collision with root package name */
        private final String f12953d;

        private a(Date date, int i2, f fVar, String str) {
            this.a = date;
            this.f12951b = i2;
            this.f12952c = fVar;
            this.f12953d = str;
        }

        public static a a(Date date) {
            return new a(date, 1, null, null);
        }

        public static a b(f fVar, String str) {
            return new a(fVar.e(), 0, fVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public f d() {
            return this.f12952c;
        }

        String e() {
            return this.f12953d;
        }

        int f() {
            return this.f12951b;
        }
    }

    public k(com.google.firebase.installations.g gVar, com.google.firebase.analytics.a.a aVar, Executor executor, com.google.android.gms.common.util.f fVar, Random random, e eVar, ConfigFetchHttpClient configFetchHttpClient, n nVar, Map<String, String> map) {
        this.f12942c = gVar;
        this.f12943d = aVar;
        this.f12944e = executor;
        this.f12945f = fVar;
        this.f12946g = random;
        this.f12947h = eVar;
        this.f12948i = configFetchHttpClient;
        this.f12949j = nVar;
        this.f12950k = map;
    }

    private boolean a(long j2, Date date) {
        Date dateD = this.f12949j.d();
        if (dateD.equals(n.a)) {
            return false;
        }
        return date.before(new Date(dateD.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    private com.google.firebase.remoteconfig.k b(com.google.firebase.remoteconfig.k kVar) throws com.google.firebase.remoteconfig.h {
        String str;
        int iA = kVar.a();
        if (iA == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iA == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iA == 429) {
                throw new com.google.firebase.remoteconfig.h("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iA != 500) {
                switch (iA) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new com.google.firebase.remoteconfig.k(kVar.a(), "Fetch failed: " + str, kVar);
    }

    private String c(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2)));
    }

    private a f(String str, String str2, Date date) throws com.google.firebase.remoteconfig.i, IOException {
        try {
            a aVarFetch = this.f12948i.fetch(this.f12948i.c(), str, str2, k(), this.f12949j.c(), this.f12950k, date);
            if (aVarFetch.e() != null) {
                this.f12949j.i(aVarFetch.e());
            }
            this.f12949j.f();
            return aVarFetch;
        } catch (com.google.firebase.remoteconfig.k e2) {
            n.a aVarR = r(e2.a(), date);
            if (q(aVarR, e2.a())) {
                throw new com.google.firebase.remoteconfig.j(aVarR.a().getTime());
            }
            throw b(e2);
        }
    }

    private e.c.b.b.e.h<a> g(String str, String str2, Date date) throws IOException {
        try {
            a aVarF = f(str, str2, date);
            return aVarF.f() != 0 ? e.c.b.b.e.k.d(aVarF) : this.f12947h.i(aVarF.d()).p(this.f12944e, j.b(aVarF));
        } catch (com.google.firebase.remoteconfig.i e2) {
            return e.c.b.b.e.k.c(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e.c.b.b.e.h<a> h(e.c.b.b.e.h<f> hVar, long j2) {
        e.c.b.b.e.h hVarI;
        Date date = new Date(this.f12945f.a());
        if (hVar.n() && a(j2, date)) {
            return e.c.b.b.e.k.d(a.c(date));
        }
        Date dateI = i(date);
        if (dateI != null) {
            hVarI = e.c.b.b.e.k.c(new com.google.firebase.remoteconfig.j(c(dateI.getTime() - date.getTime()), dateI.getTime()));
        } else {
            e.c.b.b.e.h<String> hVarG = this.f12942c.G();
            e.c.b.b.e.h<com.google.firebase.installations.l> hVarA = this.f12942c.a(false);
            hVarI = e.c.b.b.e.k.h(hVarG, hVarA).i(this.f12944e, h.b(this, hVarG, hVarA, date));
        }
        return hVarI.i(this.f12944e, i.b(this, date));
    }

    private Date i(Date date) {
        Date dateA = this.f12949j.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    private long j(int i2) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f12941b;
        return (timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]) / 2) + this.f12946g.nextInt((int) r0);
    }

    private Map<String, String> k() {
        HashMap map = new HashMap();
        com.google.firebase.analytics.a.a aVar = this.f12943d;
        if (aVar == null) {
            return map;
        }
        for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        return map;
    }

    private boolean l(int i2) {
        return i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    static /* synthetic */ e.c.b.b.e.h o(k kVar, e.c.b.b.e.h hVar, e.c.b.b.e.h hVar2, Date date, e.c.b.b.e.h hVar3) {
        return !hVar.n() ? e.c.b.b.e.k.c(new com.google.firebase.remoteconfig.h("Firebase Installations failed to get installation ID for fetch.", hVar.j())) : !hVar2.n() ? e.c.b.b.e.k.c(new com.google.firebase.remoteconfig.h("Firebase Installations failed to get installation auth token for fetch.", hVar2.j())) : kVar.g((String) hVar.k(), ((com.google.firebase.installations.l) hVar2.k()).b(), date);
    }

    static /* synthetic */ e.c.b.b.e.h p(k kVar, Date date, e.c.b.b.e.h hVar) {
        kVar.t(hVar, date);
        return hVar;
    }

    private boolean q(n.a aVar, int i2) {
        return aVar.b() > 1 || i2 == 429;
    }

    private n.a r(int i2, Date date) {
        if (l(i2)) {
            s(date);
        }
        return this.f12949j.a();
    }

    private void s(Date date) {
        int iB = this.f12949j.a().b() + 1;
        this.f12949j.g(iB, new Date(date.getTime() + j(iB)));
    }

    private void t(e.c.b.b.e.h<a> hVar, Date date) {
        if (hVar.n()) {
            this.f12949j.k(date);
            return;
        }
        Exception excJ = hVar.j();
        if (excJ == null) {
            return;
        }
        if (excJ instanceof com.google.firebase.remoteconfig.j) {
            this.f12949j.l();
        } else {
            this.f12949j.j();
        }
    }

    public e.c.b.b.e.h<a> d() {
        return e(this.f12949j.e());
    }

    public e.c.b.b.e.h<a> e(long j2) {
        return this.f12947h.c().i(this.f12944e, g.b(this, j2));
    }
}