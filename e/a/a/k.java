package e.a.a;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Identify.java */
/* loaded from: classes.dex */
public class k {
    private static final String a = "e.a.a.k";

    /* renamed from: b, reason: collision with root package name */
    protected JSONObject f14191b = new JSONObject();

    /* renamed from: c, reason: collision with root package name */
    protected Set<String> f14192c = new HashSet();

    private void a(String str, String str2, Object obj) throws JSONException {
        if (m.d(str2)) {
            e.d().h(a, String.format("Attempting to perform operation %s with a null or empty string property, ignoring", str));
            return;
        }
        if (obj == null) {
            e.d().h(a, String.format("Attempting to perform operation %s with null value for property %s, ignoring", str, str2));
            return;
        }
        if (this.f14191b.has("$clearAll")) {
            e.d().h(a, String.format("This Identify already contains a $clearAll operation, ignoring operation %s", str));
            return;
        }
        if (this.f14192c.contains(str2)) {
            e.d().h(a, String.format("Already used property %s in previous operation, ignoring operation %s", str2, str));
            return;
        }
        try {
            if (!this.f14191b.has(str)) {
                this.f14191b.put(str, new JSONObject());
            }
            this.f14191b.getJSONObject(str).put(str2, obj);
            this.f14192c.add(str2);
        } catch (JSONException e2) {
            e.d().b(a, e2.toString());
        }
    }

    public k b(String str, int i2) throws JSONException {
        a("$set", str, Integer.valueOf(i2));
        return this;
    }

    public k c(String str, String str2) throws JSONException {
        a("$set", str, str2);
        return this;
    }

    public k d(String str, boolean z) throws JSONException {
        a("$set", str, Boolean.valueOf(z));
        return this;
    }

    public k e(String str) throws JSONException {
        a("$unset", str, "-");
        return this;
    }
}