package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.h5;
import com.google.android.gms.internal.ads.i6;
import com.google.android.gms.internal.ads.zw;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzaz extends zw {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ dr zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaz(zzbe zzbeVar, int i2, String str, i6 i6Var, h5 h5Var, byte[] bArr, Map map, dr drVar) {
        super(i2, str, i6Var, h5Var);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = drVar;
    }

    @Override // com.google.android.gms.internal.ads.d1
    public final Map<String, String> zzm() {
        Map<String, String> map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.d1
    public final byte[] zzn() {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zw, com.google.android.gms.internal.ads.d1
    protected final /* bridge */ /* synthetic */ void zzs(String str) {
        zzz(str);
    }

    @Override // com.google.android.gms.internal.ads.zw
    protected final void zzz(String str) throws IOException {
        this.zzc.e(str);
        super.zzz(str);
    }
}