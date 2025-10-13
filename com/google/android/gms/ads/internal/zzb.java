package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.dl;
import com.google.android.gms.internal.ads.ho;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final ho zzc;
    private final dl zzd = new dl(false, Collections.emptyList());

    public zzb(Context context, ho hoVar, dl dlVar) {
        this.zza = context;
        this.zzc = hoVar;
    }

    private final boolean zzd() {
        ho hoVar = this.zzc;
        return (hoVar != null && hoVar.zza().f5676j) || this.zzd.f5485e;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final boolean zzb() {
        return !zzd() || this.zzb;
    }

    public final void zzc(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            ho hoVar = this.zzc;
            if (hoVar != null) {
                hoVar.b(str, null, 3);
                return;
            }
            dl dlVar = this.zzd;
            if (!dlVar.f5485e || (list = dlVar.f5486f) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzs.zzc();
                    com.google.android.gms.ads.internal.util.zzr.zzL(this.zza, "", strReplace);
                }
            }
        }
    }
}