package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: RemoteConfigComponent.java */
/* loaded from: classes.dex */
public class o {
    private static final com.google.android.gms.common.util.f a = com.google.android.gms.common.util.i.d();

    /* renamed from: b, reason: collision with root package name */
    private static final Random f12974b = new Random();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, g> f12975c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f12976d;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f12977e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.c f12978f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.installations.g f12979g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.j.c f12980h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.analytics.a.a f12981i;

    /* renamed from: j, reason: collision with root package name */
    private final String f12982j;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, String> f12983k;

    o(Context context, com.google.firebase.c cVar, com.google.firebase.installations.g gVar, com.google.firebase.j.c cVar2, com.google.firebase.analytics.a.a aVar) {
        this(context, Executors.newCachedThreadPool(), cVar, gVar, cVar2, aVar, true);
    }

    private com.google.firebase.remoteconfig.internal.e c(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.e.f(Executors.newCachedThreadPool(), com.google.firebase.remoteconfig.internal.o.c(this.f12976d, String.format("%s_%s_%s_%s.json", "frc", this.f12982j, str, str2)));
    }

    private com.google.firebase.remoteconfig.internal.m g(com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.e eVar2) {
        return new com.google.firebase.remoteconfig.internal.m(this.f12977e, eVar, eVar2);
    }

    static com.google.firebase.remoteconfig.internal.n h(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.n(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static com.google.firebase.remoteconfig.internal.p i(com.google.firebase.c cVar, String str, com.google.firebase.analytics.a.a aVar) {
        if (k(cVar) && str.equals("firebase") && aVar != null) {
            return new com.google.firebase.remoteconfig.internal.p(aVar);
        }
        return null;
    }

    private static boolean j(com.google.firebase.c cVar, String str) {
        return str.equals("firebase") && k(cVar);
    }

    private static boolean k(com.google.firebase.c cVar) {
        return cVar.i().equals("[DEFAULT]");
    }

    synchronized g a(com.google.firebase.c cVar, String str, com.google.firebase.installations.g gVar, com.google.firebase.j.c cVar2, Executor executor, com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.e eVar2, com.google.firebase.remoteconfig.internal.e eVar3, com.google.firebase.remoteconfig.internal.k kVar, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.n nVar) {
        if (!this.f12975c.containsKey(str)) {
            g gVar2 = new g(this.f12976d, cVar, gVar, j(cVar, str) ? cVar2 : null, executor, eVar, eVar2, eVar3, kVar, mVar, nVar);
            gVar2.s();
            this.f12975c.put(str, gVar2);
        }
        return this.f12975c.get(str);
    }

    public synchronized g b(String str) {
        com.google.firebase.remoteconfig.internal.e eVarC;
        com.google.firebase.remoteconfig.internal.e eVarC2;
        com.google.firebase.remoteconfig.internal.e eVarC3;
        com.google.firebase.remoteconfig.internal.n nVarH;
        com.google.firebase.remoteconfig.internal.m mVarG;
        eVarC = c(str, "fetch");
        eVarC2 = c(str, "activate");
        eVarC3 = c(str, "defaults");
        nVarH = h(this.f12976d, this.f12982j, str);
        mVarG = g(eVarC2, eVarC3);
        com.google.firebase.remoteconfig.internal.p pVarI = i(this.f12978f, str, this.f12981i);
        if (pVarI != null) {
            mVarG.a(n.b(pVarI));
        }
        return a(this.f12978f, str, this.f12979g, this.f12980h, this.f12977e, eVarC, eVarC2, eVarC3, e(str, eVarC, nVarH), mVarG, nVarH);
    }

    g d() {
        return b("firebase");
    }

    synchronized com.google.firebase.remoteconfig.internal.k e(String str, com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.n nVar) {
        return new com.google.firebase.remoteconfig.internal.k(this.f12979g, k(this.f12978f) ? this.f12981i : null, this.f12977e, a, f12974b, eVar, f(this.f12978f.j().b(), str, nVar), nVar, this.f12983k);
    }

    ConfigFetchHttpClient f(String str, String str2, com.google.firebase.remoteconfig.internal.n nVar) {
        return new ConfigFetchHttpClient(this.f12976d, this.f12978f.j().c(), str, str2, nVar.b(), nVar.b());
    }

    protected o(Context context, ExecutorService executorService, com.google.firebase.c cVar, com.google.firebase.installations.g gVar, com.google.firebase.j.c cVar2, com.google.firebase.analytics.a.a aVar, boolean z) {
        this.f12975c = new HashMap();
        this.f12983k = new HashMap();
        this.f12976d = context;
        this.f12977e = executorService;
        this.f12978f = cVar;
        this.f12979g = gVar;
        this.f12980h = cVar2;
        this.f12981i = aVar;
        this.f12982j = cVar.j().c();
        if (z) {
            e.c.b.b.e.k.b(executorService, m.a(this));
        }
    }
}