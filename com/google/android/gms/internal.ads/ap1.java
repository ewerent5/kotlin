package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.util.zzbk;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ap1 {
    public final List<String> a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4967b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4968c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4969d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4970e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4971f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4972g;

    /* renamed from: h, reason: collision with root package name */
    public final zo1 f4973h;

    ap1(JsonReader jsonReader) throws IOException {
        List<String> listEmptyList = Collections.emptyList();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        long jNextLong = 0;
        zo1 zo1Var = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("nofill_urls".equals(strNextName)) {
                listEmptyList = zzbk.zzb(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                if (((Boolean) c.c().b(w3.v5)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zo1Var = new zo1(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.a = listEmptyList;
        this.f4968c = iNextInt;
        this.f4967b = strNextString;
        this.f4969d = strNextString2;
        this.f4970e = iNextInt2;
        this.f4971f = jNextLong;
        this.f4973h = zo1Var;
        this.f4972g = zNextBoolean;
    }
}