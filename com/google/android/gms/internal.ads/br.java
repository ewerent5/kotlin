package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class br implements cr {
    private final String a;

    br(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void a(JsonWriter jsonWriter) throws IOException {
        String str = this.a;
        int i2 = dr.f5511f;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}