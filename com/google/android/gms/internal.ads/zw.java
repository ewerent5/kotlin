package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class zw extends d1<String> {
    private final Object zza;
    private final i6<String> zzb;

    public zw(int i2, String str, i6<String> i6Var, h5 h5Var) {
        super(i2, str, h5Var);
        this.zza = new Object();
        this.zzb = i6Var;
    }

    @Override // com.google.android.gms.internal.ads.d1
    protected final j7<String> zzr(t83 t83Var) {
        String str;
        String str2;
        try {
            byte[] bArr = t83Var.f9090b;
            Map<String, String> map = t83Var.f9091c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i2 = 1;
                while (true) {
                    if (i2 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i2].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i2++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(t83Var.f9090b);
        }
        return j7.a(str, qo.a(t83Var));
    }

    @Override // com.google.android.gms.internal.ads.d1
    protected /* bridge */ /* synthetic */ void zzs(String str) {
        throw null;
    }

    protected void zzz(String str) {
        i6<String> i6Var;
        synchronized (this.zza) {
            i6Var = this.zzb;
        }
        i6Var.zza(str);
    }
}