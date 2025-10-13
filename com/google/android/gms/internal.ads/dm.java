package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class dm extends fm {

    /* renamed from: e, reason: collision with root package name */
    private final String f5490e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5491f;

    public dm(String str, int i2) {
        this.f5490e = str;
        this.f5491f = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof dm)) {
            dm dmVar = (dm) obj;
            if (com.google.android.gms.common.internal.o.a(this.f5490e, dmVar.f5490e) && com.google.android.gms.common.internal.o.a(Integer.valueOf(this.f5491f), Integer.valueOf(dmVar.f5491f))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.gm
    public final String zzb() {
        return this.f5490e;
    }

    @Override // com.google.android.gms.internal.ads.gm
    public final int zzc() {
        return this.f5491f;
    }
}