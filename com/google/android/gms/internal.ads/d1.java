package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class d1<T> implements Comparable<d1<T>> {
    private final oc zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final h5 zzf;
    private Integer zzg;
    private g4 zzh;
    private boolean zzi;
    private gv2 zzj;
    private c0 zzk;
    private final l03 zzl;

    public d1(int i2, String str, h5 h5Var) {
        Uri uri;
        String host;
        this.zza = oc.a ? new oc() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i2;
        this.zzc = str;
        this.zzf = h5Var;
        this.zzl = new l03();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((d1) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        String strConcat = strValueOf.length() != 0 ? "0x".concat(strValueOf) : new String("0x");
        zzl();
        String str = this.zzc;
        String strValueOf2 = String.valueOf(this.zzg);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(strConcat).length() + 6 + strValueOf2.length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(strConcat);
        sb.append(" NORMAL ");
        sb.append(strValueOf2);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (oc.a) {
            this.zza.a(str, Thread.currentThread().getId());
        }
    }

    final void zzd(String str) {
        g4 g4Var = this.zzh;
        if (g4Var != null) {
            g4Var.c(this);
        }
        if (oc.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new b(this, str, id));
            } else {
                this.zza.a(str, id);
                this.zza.b(toString());
            }
        }
    }

    final void zze(int i2) {
        g4 g4Var = this.zzh;
        if (g4Var != null) {
            g4Var.d(this, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d1<?> zzf(g4 g4Var) {
        this.zzh = g4Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d1<?> zzg(int i2) {
        this.zzg = Integer.valueOf(i2);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        String str = this.zzc;
        if (this.zzb == 0) {
            return str;
        }
        String string = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append(CoreConstants.DASH_CHAR);
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d1<?> zzj(gv2 gv2Var) {
        this.zzj = gv2Var;
        return this;
    }

    public final gv2 zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map<String, String> zzm() {
        return Collections.emptyMap();
    }

    public byte[] zzn() {
        return null;
    }

    public final int zzo() {
        return this.zzl.a();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    protected abstract j7<T> zzr(t83 t83Var);

    protected abstract void zzs(T t);

    public final void zzt(ma maVar) {
        h5 h5Var;
        synchronized (this.zze) {
            h5Var = this.zzf;
        }
        if (h5Var != null) {
            h5Var.zza(maVar);
        }
    }

    final void zzu(c0 c0Var) {
        synchronized (this.zze) {
            this.zzk = c0Var;
        }
    }

    final void zzv(j7<?> j7Var) {
        c0 c0Var;
        synchronized (this.zze) {
            c0Var = this.zzk;
        }
        if (c0Var != null) {
            c0Var.b(this, j7Var);
        }
    }

    final void zzw() {
        c0 c0Var;
        synchronized (this.zze) {
            c0Var = this.zzk;
        }
        if (c0Var != null) {
            c0Var.a(this);
        }
    }

    public final l03 zzy() {
        return this.zzl;
    }
}