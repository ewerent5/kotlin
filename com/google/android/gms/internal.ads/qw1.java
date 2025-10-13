package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qw1 extends ou1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    public String f8512b;

    /* renamed from: c, reason: collision with root package name */
    public long f8513c;

    /* renamed from: d, reason: collision with root package name */
    public String f8514d;

    /* renamed from: e, reason: collision with root package name */
    public String f8515e;

    /* renamed from: f, reason: collision with root package name */
    public String f8516f;

    public qw1() {
        this.f8512b = "E";
        this.f8513c = -1L;
        this.f8514d = "E";
        this.f8515e = "E";
        this.f8516f = "E";
    }

    @Override // com.google.android.gms.internal.ads.ou1
    protected final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.f8512b);
        map.put(4, this.f8516f);
        map.put(3, this.f8515e);
        map.put(2, this.f8514d);
        map.put(1, Long.valueOf(this.f8513c));
        return map;
    }

    public qw1(String str) {
        this.f8512b = "E";
        this.f8513c = -1L;
        this.f8514d = "E";
        this.f8515e = "E";
        this.f8516f = "E";
        HashMap mapB = ou1.b(str);
        if (mapB != null) {
            this.f8512b = mapB.get(0) == null ? "E" : (String) mapB.get(0);
            this.f8513c = mapB.get(1) != null ? ((Long) mapB.get(1)).longValue() : -1L;
            this.f8514d = mapB.get(2) == null ? "E" : (String) mapB.get(2);
            this.f8515e = mapB.get(3) == null ? "E" : (String) mapB.get(3);
            this.f8516f = mapB.get(4) != null ? (String) mapB.get(4) : "E";
        }
    }
}