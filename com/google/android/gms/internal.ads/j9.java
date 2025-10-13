package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class j9 implements x02 {
    private final String a;

    j9(String str) {
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0059  */
    @Override // com.google.android.gms.internal.ads.x02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object apply(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.a
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.gms.internal.ads.ba<com.google.android.gms.internal.ads.ew> r1 = com.google.android.gms.internal.ads.aa.a
            if (r6 != 0) goto L9
            goto L74
        L9:
            com.google.android.gms.internal.ads.z4<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.k5.f6960e
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L18
            goto L39
        L18:
            java.lang.String r1 = ".doubleclick.net"
            java.lang.String r2 = ".googleadservices.com"
            java.lang.String r3 = ".googlesyndication.com"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r2 = r2.getHost()
            r3 = 0
        L2b:
            r4 = 3
            if (r3 >= r4) goto L74
            r4 = r1[r3]
            boolean r4 = r2.endsWith(r4)
            if (r4 != 0) goto L39
            int r3 = r3 + 1
            goto L2b
        L39:
            com.google.android.gms.internal.ads.z4<java.lang.String> r1 = com.google.android.gms.internal.ads.k5.a
            java.lang.Object r1 = r1.e()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.internal.ads.z4<java.lang.String> r2 = com.google.android.gms.internal.ads.k5.f6957b
            java.lang.Object r2 = r2.e()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L53
            java.lang.String r0 = r0.replace(r1, r6)
        L53:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L74
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r3 = r1.getQueryParameter(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L74
            android.net.Uri$Builder r0 = r1.buildUpon()
            android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
            java.lang.String r6 = r6.toString()
            return r6
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j9.apply(java.lang.Object):java.lang.Object");
    }
}