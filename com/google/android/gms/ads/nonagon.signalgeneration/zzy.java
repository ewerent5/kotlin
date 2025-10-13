package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.e42;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.y42;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzy implements e42 {
    private final ql zza;

    zzy(ql qlVar) {
        this.zza = qlVar;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        ql qlVar = this.zza;
        zzab zzabVar = new zzab(new JsonReader(new InputStreamReader((InputStream) obj)));
        try {
            zzabVar.zzb = com.google.android.gms.ads.internal.zzs.zzc().zzh(qlVar.f8401e).toString();
        } catch (JSONException unused) {
            zzabVar.zzb = "{}";
        }
        return y42.a(zzabVar);
    }
}