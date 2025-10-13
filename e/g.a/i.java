package e.g.a;

import org.json.JSONObject;

/* compiled from: Purchase.java */
/* loaded from: classes.dex */
public class i {
    String a;

    /* renamed from: b, reason: collision with root package name */
    String f15683b;

    /* renamed from: c, reason: collision with root package name */
    String f15684c;

    /* renamed from: d, reason: collision with root package name */
    String f15685d;

    /* renamed from: e, reason: collision with root package name */
    long f15686e;

    /* renamed from: f, reason: collision with root package name */
    int f15687f;

    /* renamed from: g, reason: collision with root package name */
    String f15688g;

    /* renamed from: h, reason: collision with root package name */
    String f15689h;

    /* renamed from: i, reason: collision with root package name */
    String f15690i;

    /* renamed from: j, reason: collision with root package name */
    String f15691j;

    /* renamed from: k, reason: collision with root package name */
    boolean f15692k;

    public i(String str, String str2, String str3) {
        this.a = str;
        this.f15690i = str2;
        JSONObject jSONObject = new JSONObject(this.f15690i);
        this.f15683b = jSONObject.optString("orderId");
        this.f15684c = jSONObject.optString("packageName");
        this.f15685d = jSONObject.optString("productId");
        this.f15686e = jSONObject.optLong("purchaseTime");
        this.f15687f = jSONObject.optInt("purchaseState");
        this.f15688g = jSONObject.optString("developerPayload");
        this.f15689h = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.f15692k = jSONObject.optBoolean("autoRenewing");
        this.f15691j = str3;
    }

    public String a() {
        return this.f15688g;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.f15685d;
    }

    public String d() {
        return this.f15689h;
    }

    public boolean e() {
        return this.f15692k;
    }

    public String toString() {
        return "PurchaseInfo(type:" + this.a + "):" + this.f15690i;
    }
}