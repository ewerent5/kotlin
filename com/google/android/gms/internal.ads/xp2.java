package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xp2 extends ou1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    public Long f10214b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f10215c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f10216d;

    public xp2(String str) {
        HashMap mapB = ou1.b(str);
        if (mapB != null) {
            this.f10214b = (Long) mapB.get(0);
            this.f10215c = (Boolean) mapB.get(1);
            this.f10216d = (Boolean) mapB.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ou1
    protected final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.f10214b);
        map.put(1, this.f10215c);
        map.put(2, this.f10216d);
        return map;
    }
}