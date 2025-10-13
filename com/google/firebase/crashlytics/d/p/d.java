package com.google.firebase.crashlytics.d.p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.crashlytics.d.h.h0;
import com.google.firebase.crashlytics.d.h.r;
import com.google.firebase.crashlytics.d.h.s;
import com.google.firebase.crashlytics.d.h.u;
import com.google.firebase.crashlytics.d.h.x;
import e.c.b.b.e.i;
import e.c.b.b.e.k;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: SettingsController.java */
/* loaded from: classes.dex */
public class d implements e {
    private final Context a;

    /* renamed from: b */
    private final com.google.firebase.crashlytics.d.p.i.g f12725b;

    /* renamed from: c */
    private final f f12726c;

    /* renamed from: d */
    private final r f12727d;

    /* renamed from: e */
    private final com.google.firebase.crashlytics.d.p.a f12728e;

    /* renamed from: f */
    private final com.google.firebase.crashlytics.d.p.j.d f12729f;

    /* renamed from: g */
    private final s f12730g;

    /* renamed from: h */
    private final AtomicReference<com.google.firebase.crashlytics.d.p.i.e> f12731h;

    /* renamed from: i */
    private final AtomicReference<i<com.google.firebase.crashlytics.d.p.i.b>> f12732i;

    /* compiled from: SettingsController.java */
    class a implements e.c.b.b.e.g<Void, Void> {
        a() {
        }

        @Override // e.c.b.b.e.g
        /* renamed from: b */
        public e.c.b.b.e.h<Void> a(Void r5) throws Throwable {
            JSONObject jSONObjectA = d.this.f12729f.a(d.this.f12725b, true);
            if (jSONObjectA != null) {
                com.google.firebase.crashlytics.d.p.i.f fVarB = d.this.f12726c.b(jSONObjectA);
                d.this.f12728e.c(fVarB.d(), jSONObjectA);
                d.this.q(jSONObjectA, "Loaded settings: ");
                d dVar = d.this;
                dVar.r(dVar.f12725b.f12760f);
                d.this.f12731h.set(fVarB);
                ((i) d.this.f12732i.get()).e(fVarB.c());
                i iVar = new i();
                iVar.e(fVarB.c());
                d.this.f12732i.set(iVar);
            }
            return k.d(null);
        }
    }

    d(Context context, com.google.firebase.crashlytics.d.p.i.g gVar, r rVar, f fVar, com.google.firebase.crashlytics.d.p.a aVar, com.google.firebase.crashlytics.d.p.j.d dVar, s sVar) {
        AtomicReference<com.google.firebase.crashlytics.d.p.i.e> atomicReference = new AtomicReference<>();
        this.f12731h = atomicReference;
        this.f12732i = new AtomicReference<>(new i());
        this.a = context;
        this.f12725b = gVar;
        this.f12727d = rVar;
        this.f12726c = fVar;
        this.f12728e = aVar;
        this.f12729f = dVar;
        this.f12730g = sVar;
        atomicReference.set(b.e(rVar));
    }

    public static d l(Context context, String str, x xVar, com.google.firebase.crashlytics.d.k.c cVar, String str2, String str3, String str4, s sVar) {
        String strE = xVar.e();
        h0 h0Var = new h0();
        return new d(context, new com.google.firebase.crashlytics.d.p.i.g(str, xVar.f(), xVar.g(), xVar.h(), xVar, com.google.firebase.crashlytics.d.h.h.h(com.google.firebase.crashlytics.d.h.h.p(context), str, str3, str2), str3, str2, u.a(strE).b()), h0Var, new f(h0Var), new com.google.firebase.crashlytics.d.p.a(context), new com.google.firebase.crashlytics.d.p.j.c(str4, String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), cVar), sVar);
    }

    private com.google.firebase.crashlytics.d.p.i.f m(c cVar) throws Throwable {
        com.google.firebase.crashlytics.d.p.i.f fVar = null;
        try {
            if (!c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                JSONObject jSONObjectB = this.f12728e.b();
                if (jSONObjectB != null) {
                    com.google.firebase.crashlytics.d.p.i.f fVarB = this.f12726c.b(jSONObjectB);
                    if (fVarB != null) {
                        q(jSONObjectB, "Loaded cached settings: ");
                        long jA = this.f12727d.a();
                        if (c.IGNORE_CACHE_EXPIRATION.equals(cVar) || !fVarB.e(jA)) {
                            try {
                                com.google.firebase.crashlytics.d.b.f().b("Returning cached settings.");
                                fVar = fVarB;
                            } catch (Exception e2) {
                                e = e2;
                                fVar = fVarB;
                                com.google.firebase.crashlytics.d.b.f().e("Failed to get cached settings", e);
                                return fVar;
                            }
                        } else {
                            com.google.firebase.crashlytics.d.b.f().b("Cached settings have expired.");
                        }
                    } else {
                        com.google.firebase.crashlytics.d.b.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    com.google.firebase.crashlytics.d.b.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        return fVar;
    }

    private String n() {
        return com.google.firebase.crashlytics.d.h.h.t(this.a).getString("existing_instance_identifier", "");
    }

    public void q(JSONObject jSONObject, String str) {
        com.google.firebase.crashlytics.d.b.f().b(str + jSONObject.toString());
    }

    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = com.google.firebase.crashlytics.d.h.h.t(this.a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.d.p.e
    public e.c.b.b.e.h<com.google.firebase.crashlytics.d.p.i.b> a() {
        return this.f12732i.get().a();
    }

    @Override // com.google.firebase.crashlytics.d.p.e
    public com.google.firebase.crashlytics.d.p.i.e b() {
        return this.f12731h.get();
    }

    boolean k() {
        return !n().equals(this.f12725b.f12760f);
    }

    public e.c.b.b.e.h<Void> o(c cVar, Executor executor) {
        com.google.firebase.crashlytics.d.p.i.f fVarM;
        if (!k() && (fVarM = m(cVar)) != null) {
            this.f12731h.set(fVarM);
            this.f12732i.get().e(fVarM.c());
            return k.d(null);
        }
        com.google.firebase.crashlytics.d.p.i.f fVarM2 = m(c.IGNORE_CACHE_EXPIRATION);
        if (fVarM2 != null) {
            this.f12731h.set(fVarM2);
            this.f12732i.get().e(fVarM2.c());
        }
        return this.f12730g.j().p(executor, new a());
    }

    public e.c.b.b.e.h<Void> p(Executor executor) {
        return o(c.USE_CACHE, executor);
    }
}