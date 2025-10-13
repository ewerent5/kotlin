package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class dv extends zzb {
    final lt a;

    /* renamed from: b, reason: collision with root package name */
    final lv f5521b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5522c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f5523d;

    dv(lt ltVar, lv lvVar, String str, String[] strArr) {
        this.a = ltVar;
        this.f5521b = lvVar;
        this.f5522c = str;
        this.f5523d = strArr;
        zzs.zzy().a(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.f5521b.i(this.f5522c, this.f5523d);
        } finally {
            zzr.zza.post(new cv(this));
        }
    }
}