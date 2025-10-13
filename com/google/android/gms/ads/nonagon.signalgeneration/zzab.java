package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzab {
    public final String zza;
    public String zzb;
    public Bundle zzc = new Bundle();

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzab(android.util.JsonReader r8) throws java.io.IOException {
        /*
            r7 = this;
            r7.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r7.zzc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r8.beginObject()
            java.lang.String r1 = ""
            r2 = r1
        L15:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L72
            java.lang.String r3 = r8.nextName()
            if (r3 != 0) goto L22
            r3 = r1
        L22:
            int r4 = r3.hashCode()
            r5 = -995427962(0xffffffffc4aaf986, float:-1367.7976)
            r6 = 1
            if (r4 == r5) goto L3c
            r5 = -271442291(0xffffffffefd21e8d, float:-1.3005757E29)
            if (r4 == r5) goto L32
            goto L46
        L32:
            java.lang.String r4 = "signal_dictionary"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L46
            r3 = 1
            goto L47
        L3c:
            java.lang.String r4 = "params"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L46
            r3 = 0
            goto L47
        L46:
            r3 = -1
        L47:
            if (r3 == 0) goto L6d
            if (r3 == r6) goto L4f
            r8.skipValue()
            goto L15
        L4f:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r8.beginObject()
        L57:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L69
            java.lang.String r3 = r8.nextName()
            java.lang.String r4 = r8.nextString()
            r0.put(r3, r4)
            goto L57
        L69:
            r8.endObject()
            goto L15
        L6d:
            java.lang.String r2 = r8.nextString()
            goto L15
        L72:
            r7.zza = r2
            r8.endObject()
            java.util.Set r8 = r0.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L7f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r0.getValue()
            if (r1 == 0) goto L7f
            android.os.Bundle r1 = r7.zzc
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.putString(r2, r0)
            goto L7f
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzab.<init>(android.util.JsonReader):void");
    }
}