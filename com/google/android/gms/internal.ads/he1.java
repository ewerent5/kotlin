package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class he1 implements Callable {
    private final ie1 a;

    he1(ie1 ie1Var) {
        this.a = ie1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strZzf;
        String strZzj;
        String strC;
        zzs.zzc();
        v23 v23VarZzb = zzs.zzg().l().zzb();
        Bundle bundle = null;
        if (v23VarZzb != null && (!zzs.zzg().l().zzd() || !zzs.zzg().l().zzh())) {
            if (v23VarZzb.h()) {
                v23VarZzb.f();
            }
            k23 k23VarE = v23VarZzb.e();
            if (k23VarE != null) {
                strZzf = k23VarE.b();
                strC = k23VarE.c();
                strZzj = k23VarE.d();
                if (strZzf != null) {
                    zzs.zzg().l().zze(strZzf);
                }
                if (strZzj != null) {
                    zzs.zzg().l().zzi(strZzj);
                }
            } else {
                strZzf = zzs.zzg().l().zzf();
                strZzj = zzs.zzg().l().zzj();
                strC = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!zzs.zzg().l().zzh()) {
                if (strZzj == null || TextUtils.isEmpty(strZzj)) {
                    bundle2.putString("v_fp_vertical", "no_hash");
                } else {
                    bundle2.putString("v_fp_vertical", strZzj);
                }
            }
            if (strZzf != null && !zzs.zzg().l().zzd()) {
                bundle2.putString("fingerprint", strZzf);
                if (!strZzf.equals(strC)) {
                    bundle2.putString("v_fp", strC);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new je1(bundle);
    }
}