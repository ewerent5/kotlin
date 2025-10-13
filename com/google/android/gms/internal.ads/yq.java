package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class yq implements cr {
    private final String a;

    /* renamed from: b */
    private final String f10465b;

    /* renamed from: c */
    private final Map f10466c;

    /* renamed from: d */
    private final byte[] f10467d;

    yq(String str, String str2, Map map, byte[] bArr) {
        this.a = str;
        this.f10465b = str2;
        this.f10466c = map;
        this.f10467d = bArr;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void a(JsonWriter jsonWriter) throws IOException {
        dr.m(this.a, this.f10465b, this.f10466c, this.f10467d, jsonWriter);
    }
}