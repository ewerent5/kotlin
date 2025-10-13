package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mp2 extends ou1<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public long f7522b;

    /* renamed from: c, reason: collision with root package name */
    public long f7523c;

    public mp2(String str) {
        this.f7522b = -1L;
        this.f7523c = -1L;
        HashMap mapB = ou1.b(str);
        if (mapB != null) {
            this.f7522b = ((Long) mapB.get(0)).longValue();
            this.f7523c = ((Long) mapB.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.ou1
    protected final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, Long.valueOf(this.f7522b));
        map.put(1, Long.valueOf(this.f7523c));
        return map;
    }
}