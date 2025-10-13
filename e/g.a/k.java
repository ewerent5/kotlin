package e.g.a;

import org.json.JSONObject;

/* compiled from: SkuDetails.java */
/* loaded from: classes.dex */
public class k {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15693b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15694c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15695d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15696e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15697f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15698g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15699h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15700i;

    /* renamed from: j, reason: collision with root package name */
    private final String f15701j;

    /* renamed from: k, reason: collision with root package name */
    private final String f15702k;

    /* renamed from: l, reason: collision with root package name */
    private final String f15703l;

    /* renamed from: m, reason: collision with root package name */
    private final long f15704m;
    private final String n;
    private final String o;

    public k(String str, String str2) {
        this.a = str;
        this.f15700i = str2;
        JSONObject jSONObject = new JSONObject(str2);
        this.f15693b = jSONObject.optString("productId");
        this.f15694c = jSONObject.optString("type");
        this.f15695d = jSONObject.optString("price");
        this.f15696e = jSONObject.optLong("price_amount_micros");
        this.f15697f = jSONObject.optString("price_currency_code");
        this.f15698g = jSONObject.optString("title");
        this.f15699h = jSONObject.optString("description");
        this.f15701j = jSONObject.optString("subscriptionPeriod");
        this.f15702k = jSONObject.optString("freeTrialPeriod");
        this.f15703l = jSONObject.optString("introductoryPrice");
        this.f15704m = jSONObject.optLong("introductoryPriceAmountMicros");
        this.n = jSONObject.optString("introductoryPricePeriod");
        this.o = jSONObject.optString("introductoryPriceCycles");
    }

    public String a() {
        return this.f15702k;
    }

    public String b() {
        return this.f15695d;
    }

    public long c() {
        return this.f15696e;
    }

    public String d() {
        return this.f15697f;
    }

    public String e() {
        return this.f15693b;
    }

    public String f() {
        return this.f15701j;
    }

    public String g() {
        return this.f15694c;
    }

    public String toString() {
        return "SkuDetails:" + this.f15700i;
    }
}