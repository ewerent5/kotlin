package e.a.a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TrackingOptions.java */
/* loaded from: classes.dex */
public class l {
    private static final String a = "e.a.a.l";

    /* renamed from: b, reason: collision with root package name */
    private static String[] f14193b = {"city", "country", "dma", "ip_address", "lat_lng", "region"};

    /* renamed from: c, reason: collision with root package name */
    private static String[] f14194c = {"adid", "city", "ip_address", "lat_lng"};

    /* renamed from: d, reason: collision with root package name */
    Set<String> f14195d = new HashSet();

    static l a(l lVar) {
        l lVar2 = new l();
        Iterator<String> it = lVar.f14195d.iterator();
        while (it.hasNext()) {
            lVar2.d(it.next());
        }
        return lVar2;
    }

    private void d(String str) {
        this.f14195d.add(str);
    }

    static l e() {
        l lVar = new l();
        for (String str : f14194c) {
            lVar.d(str);
        }
        return lVar;
    }

    private boolean o(String str) {
        return !this.f14195d.contains(str);
    }

    public l b() {
        d("ip_address");
        return this;
    }

    public l c() {
        d("lat_lng");
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            return ((l) obj).f14195d.equals(this.f14195d);
        }
        return false;
    }

    protected JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.f14195d.isEmpty()) {
            return jSONObject;
        }
        for (String str : f14193b) {
            if (this.f14195d.contains(str)) {
                try {
                    jSONObject.put(str, false);
                } catch (JSONException e2) {
                    e.d().b(a, e2.toString());
                }
            }
        }
        return jSONObject;
    }

    l g(l lVar) {
        Iterator<String> it = lVar.f14195d.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
        return this;
    }

    boolean h() {
        return o("adid");
    }

    boolean i() {
        return o("api_level");
    }

    boolean j() {
        return o("carrier");
    }

    boolean k() {
        return o("country");
    }

    boolean l() {
        return o("device_brand");
    }

    boolean m() {
        return o("device_manufacturer");
    }

    boolean n() {
        return o("device_model");
    }

    boolean p() {
        return o("language");
    }

    boolean q() {
        return o("lat_lng");
    }

    boolean r() {
        return o("os_name");
    }

    boolean s() {
        return o("os_version");
    }

    boolean t() {
        return o("platform");
    }

    boolean u() {
        return o("version_name");
    }
}