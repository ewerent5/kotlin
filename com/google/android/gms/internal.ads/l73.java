package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class l73 extends ej2<l73, k73> implements mk2 {
    private static final kj2<Integer, x53> zzj = new j73();
    private static final l73 zzr;
    private int zzb;
    private long zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private jj2 zzi = ej2.m();
    private g73 zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;

    static {
        l73 l73Var = new l73();
        zzr = l73Var;
        ej2.A(l73.class, l73Var);
    }

    private l73() {
    }

    static /* synthetic */ void D(l73 l73Var, p63 p63Var) {
        l73Var.zzp = p63Var.zza();
        l73Var.zzb |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    static /* synthetic */ void E(l73 l73Var, p73 p73Var) {
        l73Var.zzq = p73Var.zza();
        l73Var.zzb |= Spliterator.IMMUTABLE;
    }

    public static l73 S(byte[] bArr) {
        return (l73) ej2.u(zzr, bArr);
    }

    public static k73 T() {
        return zzr.w();
    }

    static /* synthetic */ void V(l73 l73Var, long j2) {
        l73Var.zzb |= 1;
        l73Var.zze = j2;
    }

    static /* synthetic */ void W(l73 l73Var, p63 p63Var) {
        l73Var.zzf = p63Var.zza();
        l73Var.zzb |= 2;
    }

    static /* synthetic */ void X(l73 l73Var, long j2) {
        l73Var.zzb |= 4;
        l73Var.zzg = j2;
    }

    static /* synthetic */ void Y(l73 l73Var, long j2) {
        l73Var.zzb |= 8;
        l73Var.zzh = j2;
    }

    static /* synthetic */ void Z(l73 l73Var, Iterable iterable) {
        jj2 jj2Var = l73Var.zzi;
        if (!jj2Var.zza()) {
            l73Var.zzi = ej2.n(jj2Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            l73Var.zzi.Z(((x53) it.next()).zza());
        }
    }

    static /* synthetic */ void a0(l73 l73Var, g73 g73Var) {
        g73Var.getClass();
        l73Var.zzk = g73Var;
        l73Var.zzb |= 16;
    }

    static /* synthetic */ void b0(l73 l73Var, p63 p63Var) {
        l73Var.zzl = p63Var.zza();
        l73Var.zzb |= 32;
    }

    static /* synthetic */ void c0(l73 l73Var, p63 p63Var) {
        l73Var.zzm = p63Var.zza();
        l73Var.zzb |= 64;
    }

    static /* synthetic */ void d0(l73 l73Var, p63 p63Var) {
        l73Var.zzn = p63Var.zza();
        l73Var.zzb |= 128;
    }

    static /* synthetic */ void e0(l73 l73Var, int i2) {
        l73Var.zzb |= 256;
        l73Var.zzo = i2;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzr, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzb", "zze", "zzf", p63.b(), "zzg", "zzh", "zzi", x53.b(), "zzk", "zzl", p63.b(), "zzm", p63.b(), "zzn", p63.b(), "zzo", "zzp", p63.b(), "zzq", p73.b()});
        }
        if (i3 == 3) {
            return new l73();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new k73(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzr;
    }

    public final long F() {
        return this.zze;
    }

    public final p63 G() {
        p63 p63VarA = p63.a(this.zzf);
        return p63VarA == null ? p63.ENUM_FALSE : p63VarA;
    }

    public final long H() {
        return this.zzg;
    }

    public final long I() {
        return this.zzh;
    }

    public final List<x53> J() {
        return new lj2(this.zzi, zzj);
    }

    public final g73 L() {
        g73 g73Var = this.zzk;
        return g73Var == null ? g73.I() : g73Var;
    }

    public final p63 M() {
        p63 p63VarA = p63.a(this.zzl);
        return p63VarA == null ? p63.ENUM_FALSE : p63VarA;
    }

    public final p63 N() {
        p63 p63VarA = p63.a(this.zzm);
        return p63VarA == null ? p63.ENUM_FALSE : p63VarA;
    }

    public final p63 O() {
        p63 p63VarA = p63.a(this.zzn);
        return p63VarA == null ? p63.ENUM_FALSE : p63VarA;
    }

    public final int P() {
        return this.zzo;
    }

    public final p63 Q() {
        p63 p63VarA = p63.a(this.zzp);
        return p63VarA == null ? p63.ENUM_FALSE : p63VarA;
    }

    public final p73 R() {
        p73 p73VarA = p73.a(this.zzq);
        return p73VarA == null ? p73.UNSPECIFIED : p73VarA;
    }
}