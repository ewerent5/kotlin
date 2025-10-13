package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pr1 implements nr1 {
    private final String a;

    public pr1(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.nr1
    public final boolean equals(Object obj) {
        if (obj instanceof pr1) {
            return this.a.equals(((pr1) obj).a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nr1
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}