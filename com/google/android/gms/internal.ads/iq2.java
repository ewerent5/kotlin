package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class iq2 extends ou1<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public Long f6572b;

    /* renamed from: c, reason: collision with root package name */
    public Long f6573c;

    /* renamed from: d, reason: collision with root package name */
    public Long f6574d;

    /* renamed from: e, reason: collision with root package name */
    public Long f6575e;

    /* renamed from: f, reason: collision with root package name */
    public Long f6576f;

    /* renamed from: g, reason: collision with root package name */
    public Long f6577g;

    /* renamed from: h, reason: collision with root package name */
    public Long f6578h;

    /* renamed from: i, reason: collision with root package name */
    public Long f6579i;

    /* renamed from: j, reason: collision with root package name */
    public Long f6580j;

    /* renamed from: k, reason: collision with root package name */
    public Long f6581k;

    /* renamed from: l, reason: collision with root package name */
    public Long f6582l;

    public iq2(String str) {
        HashMap mapB = ou1.b(str);
        if (mapB != null) {
            this.f6572b = (Long) mapB.get(0);
            this.f6573c = (Long) mapB.get(1);
            this.f6574d = (Long) mapB.get(2);
            this.f6575e = (Long) mapB.get(3);
            this.f6576f = (Long) mapB.get(4);
            this.f6577g = (Long) mapB.get(5);
            this.f6578h = (Long) mapB.get(6);
            this.f6579i = (Long) mapB.get(7);
            this.f6580j = (Long) mapB.get(8);
            this.f6581k = (Long) mapB.get(9);
            this.f6582l = (Long) mapB.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ou1
    protected final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f6572b);
        map.put(1, this.f6573c);
        map.put(2, this.f6574d);
        map.put(3, this.f6575e);
        map.put(4, this.f6576f);
        map.put(5, this.f6577g);
        map.put(6, this.f6578h);
        map.put(7, this.f6579i);
        map.put(8, this.f6580j);
        map.put(9, this.f6581k);
        map.put(10, this.f6582l);
        return map;
    }
}