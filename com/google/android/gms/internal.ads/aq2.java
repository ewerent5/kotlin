package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class aq2 extends ou1<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public Long f4985b;

    /* renamed from: c, reason: collision with root package name */
    public Long f4986c;

    public aq2(String str) {
        HashMap mapB = ou1.b(str);
        if (mapB != null) {
            this.f4985b = (Long) mapB.get(0);
            this.f4986c = (Long) mapB.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.ou1
    protected final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f4985b);
        map.put(1, this.f4986c);
        return map;
    }
}