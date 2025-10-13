package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdRequest;
import j$.util.Spliterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q61 extends ej2<q61, p51> implements mk2 {
    private static final q61 zzz;
    private int zzb;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = CoreConstants.MILLIS_IN_ONE_SECOND;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = CoreConstants.MILLIS_IN_ONE_SECOND;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        q61 q61Var = new q61();
        zzz = q61Var;
        ej2.A(q61.class, q61Var);
    }

    private q61() {
    }

    public static p51 D() {
        return zzz.w();
    }

    static /* synthetic */ void F(q61 q61Var, long j2) {
        q61Var.zzb |= 1;
        q61Var.zze = j2;
    }

    static /* synthetic */ void G(q61 q61Var, long j2) {
        q61Var.zzb |= 2;
        q61Var.zzf = j2;
    }

    static /* synthetic */ void H(q61 q61Var, long j2) {
        q61Var.zzb |= 4;
        q61Var.zzg = j2;
    }

    static /* synthetic */ void I(q61 q61Var, long j2) {
        q61Var.zzb |= 8;
        q61Var.zzh = j2;
    }

    static /* synthetic */ void J(q61 q61Var) {
        q61Var.zzb &= -9;
        q61Var.zzh = -1L;
    }

    static /* synthetic */ void L(q61 q61Var, long j2) {
        q61Var.zzb |= 16;
        q61Var.zzi = j2;
    }

    static /* synthetic */ void M(q61 q61Var, long j2) {
        q61Var.zzb |= 32;
        q61Var.zzj = j2;
    }

    static /* synthetic */ void N(q61 q61Var, ek1 ek1Var) {
        q61Var.zzk = ek1Var.zza();
        q61Var.zzb |= 64;
    }

    static /* synthetic */ void O(q61 q61Var, long j2) {
        q61Var.zzb |= 128;
        q61Var.zzl = j2;
    }

    static /* synthetic */ void P(q61 q61Var, long j2) {
        q61Var.zzb |= 256;
        q61Var.zzm = j2;
    }

    static /* synthetic */ void Q(q61 q61Var, long j2) {
        q61Var.zzb |= AdRequest.MAX_CONTENT_URL_LENGTH;
        q61Var.zzn = j2;
    }

    static /* synthetic */ void R(q61 q61Var, ek1 ek1Var) {
        q61Var.zzo = ek1Var.zza();
        q61Var.zzb |= Spliterator.IMMUTABLE;
    }

    static /* synthetic */ void S(q61 q61Var, long j2) {
        q61Var.zzb |= 2048;
        q61Var.zzp = j2;
    }

    static /* synthetic */ void T(q61 q61Var, long j2) {
        q61Var.zzb |= Spliterator.CONCURRENT;
        q61Var.zzq = j2;
    }

    static /* synthetic */ void U(q61 q61Var, long j2) {
        q61Var.zzb |= 8192;
        q61Var.zzr = j2;
    }

    static /* synthetic */ void V(q61 q61Var, long j2) {
        q61Var.zzb |= 16384;
        q61Var.zzs = j2;
    }

    static /* synthetic */ void W(q61 q61Var, long j2) {
        q61Var.zzb |= 32768;
        q61Var.zzt = j2;
    }

    static /* synthetic */ void X(q61 q61Var, long j2) {
        q61Var.zzb |= 65536;
        q61Var.zzu = j2;
    }

    static /* synthetic */ void Y(q61 q61Var, long j2) {
        q61Var.zzb |= 131072;
        q61Var.zzv = j2;
    }

    static /* synthetic */ void Z(q61 q61Var, long j2) {
        q61Var.zzb |= 262144;
        q61Var.zzw = j2;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", ek1.b(), "zzl", "zzm", "zzn", "zzo", ek1.b(), "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i3 == 3) {
            return new q61();
        }
        dt0 dt0Var = null;
        if (i3 == 4) {
            return new p51(dt0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzz;
    }
}