package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class se {
    private static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final oe<JSONObject> f8855b = new re();

    /* renamed from: c, reason: collision with root package name */
    public static final me<InputStream> f8856c = pe.a;

    static final /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(a));
    }
}