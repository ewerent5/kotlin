package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class py0 implements mo2<String> {
    public static py0 a() {
        return oy0.a;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzs.zzc();
        String string = UUID.randomUUID().toString();
        ro2.b(string);
        return string;
    }
}