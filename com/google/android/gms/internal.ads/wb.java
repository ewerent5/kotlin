package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wb implements q53 {
    private volatile ib a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f9946b;

    public wb(Context context) {
        this.f9946b = context;
    }

    static /* synthetic */ void a(wb wbVar) {
        if (wbVar.a == null) {
            return;
        }
        wbVar.a.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.q53
    public final t83 zza(d1<?> d1Var) throws ma {
        Parcelable.Creator<jb> creator = jb.CREATOR;
        Map<String, String> mapZzm = d1Var.zzm();
        int size = mapZzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry<String, String> entry : mapZzm.entrySet()) {
            strArr[i3] = entry.getKey();
            strArr2[i3] = entry.getValue();
            i3++;
        }
        jb jbVar = new jb(d1Var.zzh(), strArr, strArr2);
        long jC = zzs.zzj().c();
        try {
            wr wrVar = new wr();
            this.a = new ib(this.f9946b, zzs.zzq().zza(), new ub(this, wrVar), new vb(this, wrVar));
            this.a.checkAvailabilityAndConnect();
            sb sbVar = new sb(this, jbVar);
            h52 h52Var = qr.a;
            g52 g52VarG = y42.g(y42.h(wrVar, sbVar, h52Var), ((Integer) c.c().b(w3.G2)).intValue(), TimeUnit.MILLISECONDS, qr.f8449d);
            g52VarG.zze(new tb(this), h52Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) g52VarG.get();
            long jC2 = zzs.zzj().c();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(jC2 - jC);
            sb.append("ms");
            zze.zza(sb.toString());
            lb lbVar = (lb) new ol(parcelFileDescriptor).c(lb.CREATOR);
            if (lbVar == null) {
                return null;
            }
            if (lbVar.f7228e) {
                throw new ma(lbVar.f7229f);
            }
            if (lbVar.f7232i.length != lbVar.f7233j.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = lbVar.f7232i;
                if (i2 >= strArr3.length) {
                    return new t83(lbVar.f7230g, lbVar.f7231h, map, lbVar.f7234k, lbVar.f7235l);
                }
                map.put(strArr3[i2], lbVar.f7233j[i2]);
                i2++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            long jC3 = zzs.zzj().c();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(jC3 - jC);
            sb2.append("ms");
            zze.zza(sb2.toString());
            return null;
        } catch (Throwable th) {
            long jC4 = zzs.zzj().c();
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(jC4 - jC);
            sb3.append("ms");
            zze.zza(sb3.toString());
            throw th;
        }
    }
}