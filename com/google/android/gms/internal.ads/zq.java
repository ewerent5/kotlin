package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zq implements cr {
    private final int a;

    /* renamed from: b */
    private final Map f10628b;

    zq(int i2, Map map) {
        this.a = i2;
        this.f10628b = map;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void a(JsonWriter jsonWriter) throws IOException {
        dr.l(this.a, this.f10628b, jsonWriter);
    }
}