package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ar implements cr {
    private final byte[] a;

    ar(byte[] bArr) {
        this.a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void a(JsonWriter jsonWriter) throws NoSuchAlgorithmException, IOException {
        byte[] bArr = this.a;
        int i2 = dr.f5511f;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String strA = com.google.android.gms.common.util.c.a(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(strA);
        } else {
            String strD = xq.d(strA);
            if (strD != null) {
                jsonWriter.name("bodydigest").value(strD);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }
}