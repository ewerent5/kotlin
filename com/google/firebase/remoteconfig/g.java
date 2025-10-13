package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes.dex */
public class g {
    public static final byte[] a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private final Context f12902b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.c f12903c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.j.c f12904d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f12905e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.e f12906f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.e f12907g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.e f12908h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.k f12909i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.m f12910j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.n f12911k;

    /* renamed from: l, reason: collision with root package name */
    private final com.google.firebase.installations.g f12912l;

    g(Context context, com.google.firebase.c cVar, com.google.firebase.installations.g gVar, com.google.firebase.j.c cVar2, Executor executor, com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.e eVar2, com.google.firebase.remoteconfig.internal.e eVar3, com.google.firebase.remoteconfig.internal.k kVar, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.n nVar) {
        this.f12902b = context;
        this.f12903c = cVar;
        this.f12912l = gVar;
        this.f12904d = cVar2;
        this.f12905e = executor;
        this.f12906f = eVar;
        this.f12907g = eVar2;
        this.f12908h = eVar3;
        this.f12909i = kVar;
        this.f12910j = mVar;
        this.f12911k = nVar;
    }

    public static g f() {
        return g(com.google.firebase.c.h());
    }

    public static g g(com.google.firebase.c cVar) {
        return ((o) cVar.f(o.class)).d();
    }

    private static boolean i(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return fVar2 == null || !fVar.e().equals(fVar2.e());
    }

    static /* synthetic */ e.c.b.b.e.h j(g gVar, e.c.b.b.e.h hVar, e.c.b.b.e.h hVar2, e.c.b.b.e.h hVar3) {
        if (!hVar.n() || hVar.k() == null) {
            return e.c.b.b.e.k.d(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.f fVar = (com.google.firebase.remoteconfig.internal.f) hVar.k();
        return (!hVar2.n() || i(fVar, (com.google.firebase.remoteconfig.internal.f) hVar2.k())) ? gVar.f12907g.i(fVar).g(gVar.f12905e, a.b(gVar)) : e.c.b.b.e.k.d(Boolean.FALSE);
    }

    static /* synthetic */ Void m(g gVar, l lVar) {
        gVar.f12911k.h(lVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(e.c.b.b.e.h<com.google.firebase.remoteconfig.internal.f> hVar) {
        if (!hVar.n()) {
            return false;
        }
        this.f12906f.b();
        if (hVar.k() != null) {
            u(hVar.k().c());
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }

    private e.c.b.b.e.h<Void> r(Map<String, String> map) {
        try {
            return this.f12908h.i(com.google.firebase.remoteconfig.internal.f.g().b(map).a()).o(f.b());
        } catch (JSONException e2) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e2);
            return e.c.b.b.e.k.d(null);
        }
    }

    static List<Map<String, String>> t(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public e.c.b.b.e.h<Boolean> b() {
        e.c.b.b.e.h<com.google.firebase.remoteconfig.internal.f> hVarC = this.f12906f.c();
        e.c.b.b.e.h<com.google.firebase.remoteconfig.internal.f> hVarC2 = this.f12907g.c();
        return e.c.b.b.e.k.h(hVarC, hVarC2).i(this.f12905e, c.b(this, hVarC, hVarC2));
    }

    public e.c.b.b.e.h<Void> c() {
        return this.f12909i.d().o(d.b());
    }

    public e.c.b.b.e.h<Boolean> d() {
        return c().p(this.f12905e, b.b(this));
    }

    public boolean e(String str) {
        return this.f12910j.c(str);
    }

    public String h(String str) {
        return this.f12910j.e(str);
    }

    public e.c.b.b.e.h<Void> p(l lVar) {
        return e.c.b.b.e.k.b(this.f12905e, e.a(this, lVar));
    }

    public e.c.b.b.e.h<Void> q(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put(entry.getKey(), new String((byte[]) value));
            } else {
                map2.put(entry.getKey(), value.toString());
            }
        }
        return r(map2);
    }

    void s() {
        this.f12907g.c();
        this.f12908h.c();
        this.f12906f.c();
    }

    void u(JSONArray jSONArray) {
        if (this.f12904d == null) {
            return;
        }
        try {
            this.f12904d.k(t(jSONArray));
        } catch (com.google.firebase.j.a e2) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
        } catch (JSONException e3) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e3);
        }
    }
}