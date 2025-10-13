package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.d1;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.j7;
import com.google.android.gms.internal.ads.qo;
import com.google.android.gms.internal.ads.t83;
import com.google.android.gms.internal.ads.wr;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzbd extends d1<t83> {
    private final wr<t83> zza;
    private final dr zzb;

    public zzbd(String str, Map<String, String> map, wr<t83> wrVar) throws IOException {
        super(0, str, new zzbc(wrVar));
        this.zza = wrVar;
        dr drVar = new dr(null);
        this.zzb = drVar;
        drVar.b(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.d1
    protected final j7<t83> zzr(t83 t83Var) {
        return j7.a(t83Var, qo.a(t83Var));
    }

    @Override // com.google.android.gms.internal.ads.d1
    protected final /* bridge */ /* synthetic */ void zzs(t83 t83Var) throws IOException {
        t83 t83Var2 = t83Var;
        this.zzb.d(t83Var2.f9091c, t83Var2.a);
        dr drVar = this.zzb;
        byte[] bArr = t83Var2.f9090b;
        if (dr.j() && bArr != null) {
            drVar.f(bArr);
        }
        this.zza.zzc(t83Var2);
    }
}