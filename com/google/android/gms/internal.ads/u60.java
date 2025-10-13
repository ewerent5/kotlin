package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class u60<AdT> implements v60<AdT> {
    private final Map<String, j31<AdT>> a;

    u60(Map<String, j31<AdT>> map) {
        this.a = map;
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final j31<AdT> a(int i2, String str) {
        return this.a.get(str);
    }
}