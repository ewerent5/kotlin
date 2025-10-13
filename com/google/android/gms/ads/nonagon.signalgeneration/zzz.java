package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.e42;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.sy0;
import com.google.android.gms.internal.ads.y42;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzz implements e42<ql, zzab> {
    private final Executor zza;
    private final sy0 zzb;

    public zzz(Executor executor, sy0 sy0Var) {
        this.zza = executor;
        this.zzb = sy0Var;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final /* bridge */ /* synthetic */ g52<zzab> zza(ql qlVar) {
        final ql qlVar2 = qlVar;
        return y42.h(this.zzb.a(qlVar2), new e42(qlVar2) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzy
            private final ql zza;

            {
                this.zza = qlVar2;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                ql qlVar3 = this.zza;
                zzab zzabVar = new zzab(new JsonReader(new InputStreamReader((InputStream) obj)));
                try {
                    zzabVar.zzb = com.google.android.gms.ads.internal.zzs.zzc().zzh(qlVar3.f8401e).toString();
                } catch (JSONException unused) {
                    zzabVar.zzb = "{}";
                }
                return y42.a(zzabVar);
            }
        }, this.zza);
    }
}