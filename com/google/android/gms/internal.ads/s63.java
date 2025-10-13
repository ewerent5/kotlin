package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdRequest;
import j$.util.Spliterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class s63 extends ej2<s63, q63> implements mk2 {
    private static final s63 zzr;
    private int zzb;
    private int zze;
    private int zzg;
    private d83 zzi;
    private h63 zzk;
    private m63 zzl;
    private g73 zzm;
    private i53 zzn;
    private q73 zzo;
    private b93 zzp;
    private u53 zzq;
    private String zzf = "";
    private int zzh = CoreConstants.MILLIS_IN_ONE_SECOND;
    private mj2 zzj = ej2.o();

    static {
        s63 s63Var = new s63();
        zzr = s63Var;
        ej2.A(s63.class, s63Var);
    }

    private s63() {
    }

    public static q63 G() {
        return zzr.w();
    }

    static /* synthetic */ void I(s63 s63Var, String str) {
        str.getClass();
        s63Var.zzb |= 2;
        s63Var.zzf = str;
    }

    static /* synthetic */ void J(s63 s63Var, Iterable iterable) {
        mj2 mj2Var = s63Var.zzj;
        if (!mj2Var.zza()) {
            int size = mj2Var.size();
            s63Var.zzj = mj2Var.v(size == 0 ? 10 : size + size);
        }
        lh2.j(iterable, s63Var.zzj);
    }

    static /* synthetic */ void M(s63 s63Var, h63 h63Var) {
        h63Var.getClass();
        s63Var.zzk = h63Var;
        s63Var.zzb |= 32;
    }

    static /* synthetic */ void N(s63 s63Var, i53 i53Var) {
        i53Var.getClass();
        s63Var.zzn = i53Var;
        s63Var.zzb |= 256;
    }

    static /* synthetic */ void O(s63 s63Var, q73 q73Var) {
        q73Var.getClass();
        s63Var.zzo = q73Var;
        s63Var.zzb |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    static /* synthetic */ void P(s63 s63Var, b93 b93Var) {
        b93Var.getClass();
        s63Var.zzp = b93Var;
        s63Var.zzb |= Spliterator.IMMUTABLE;
    }

    static /* synthetic */ void Q(s63 s63Var, u53 u53Var) {
        u53Var.getClass();
        s63Var.zzq = u53Var;
        s63Var.zzb |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzr, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", p63.b(), "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i3 == 3) {
            return new s63();
        }
        if (i3 == 4) {
            return new q63(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzr;
    }

    public final String D() {
        return this.zzf;
    }

    public final h63 E() {
        h63 h63Var = this.zzk;
        return h63Var == null ? h63.D() : h63Var;
    }

    public final i53 F() {
        i53 i53Var = this.zzn;
        return i53Var == null ? i53.E() : i53Var;
    }
}