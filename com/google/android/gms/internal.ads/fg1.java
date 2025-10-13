package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class fg1 implements x02 {
    private final String a;

    fg1(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        String strValueOf = String.valueOf(this.a);
        er.zzf(strValueOf.length() != 0 ? "Error calling adapter: ".concat(strValueOf) : new String("Error calling adapter: "));
        return null;
    }
}