package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.d1;
import com.google.android.gms.internal.ads.g4;
import com.google.android.gms.internal.ads.ma;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.rf;
import com.google.android.gms.internal.ads.sg;
import com.google.android.gms.internal.ads.t83;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.vs;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.wb;
import com.google.android.gms.internal.ads.xq;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzao extends sg {
    private final Context zzc;

    private zzao(Context context, rf rfVar) {
        super(rfVar);
        this.zzc = context;
    }

    public static g4 zzb(Context context) {
        g4 g4Var = new g4(new pn(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzao(context, new vs(null, null)), 4);
        g4Var.a();
        return g4Var;
    }

    @Override // com.google.android.gms.internal.ads.sg, com.google.android.gms.internal.ads.q53
    public final t83 zza(d1<?> d1Var) throws ma {
        if (d1Var.zza() == 0) {
            if (Pattern.matches((String) c.c().b(w3.F2), d1Var.zzh())) {
                ta3.a();
                if (xq.n(this.zzc, 13400000)) {
                    t83 t83VarZza = new wb(this.zzc).zza(d1Var);
                    if (t83VarZza != null) {
                        String strValueOf = String.valueOf(d1Var.zzh());
                        zze.zza(strValueOf.length() != 0 ? "Got gmscore asset response: ".concat(strValueOf) : new String("Got gmscore asset response: "));
                        return t83VarZza;
                    }
                    String strValueOf2 = String.valueOf(d1Var.zzh());
                    zze.zza(strValueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(strValueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.zza(d1Var);
    }
}