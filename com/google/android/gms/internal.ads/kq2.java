package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kq2 extends ou1<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public Long f7050b;

    /* renamed from: c, reason: collision with root package name */
    public Long f7051c;

    /* renamed from: d, reason: collision with root package name */
    public Long f7052d;

    /* renamed from: e, reason: collision with root package name */
    public Long f7053e;

    public kq2(String str) {
        HashMap mapB = ou1.b(str);
        if (mapB != null) {
            this.f7050b = (Long) mapB.get(0);
            this.f7051c = (Long) mapB.get(1);
            this.f7052d = (Long) mapB.get(2);
            this.f7053e = (Long) mapB.get(3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ou1
    protected final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f7050b);
        map.put(1, this.f7051c);
        map.put(2, this.f7052d);
        map.put(3, this.f7053e);
        return map;
    }
}