package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class gu1 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6180b;

    public gu1(String str, String str2) {
        this.a = str;
        this.f6180b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu1)) {
            return false;
        }
        gu1 gu1Var = (gu1) obj;
        return this.a.equals(gu1Var.a) && this.f6180b.equals(gu1Var.f6180b);
    }

    public final int hashCode() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.f6180b);
        return (strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf)).hashCode();
    }
}