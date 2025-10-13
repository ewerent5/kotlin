package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdRequest;
import j$.util.Spliterator;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class u91 extends ej2<u91, eu0> implements mk2 {
    private static final u91 zzaH;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private wb1 zzM;
    private long zzaA;
    private boolean zzaD;
    private long zzaF;
    private jp1 zzaG;
    private q61 zzae;
    private t81 zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private lr1 zzau;
    private int zzb;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = CoreConstants.MILLIS_IN_ONE_SECOND;
    private int zzX = CoreConstants.MILLIS_IN_ONE_SECOND;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = CoreConstants.MILLIS_IN_ONE_SECOND;
    private nj2<q61> zzaf = ej2.p();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = CoreConstants.MILLIS_IN_ONE_SECOND;
    private int zzax = CoreConstants.MILLIS_IN_ONE_SECOND;
    private String zzay = "D";
    private nj2<o41> zzaz = ej2.p();
    private String zzaB = "";
    private int zzaC = 2;
    private String zzaE = "";

    static {
        u91 u91Var = new u91();
        zzaH = u91Var;
        ej2.A(u91.class, u91Var);
    }

    private u91() {
    }

    public static u91 A0() {
        return zzaH;
    }

    static /* synthetic */ void C0(u91 u91Var, String str) {
        str.getClass();
        u91Var.zzb |= 1;
        u91Var.zzg = str;
    }

    static /* synthetic */ void D(u91 u91Var, String str) {
        str.getClass();
        u91Var.zzb |= 4194304;
        u91Var.zzC = str;
    }

    static /* synthetic */ void D0(u91 u91Var, String str) {
        str.getClass();
        u91Var.zzb |= 2;
        u91Var.zzh = str;
    }

    static /* synthetic */ void E(u91 u91Var, String str) {
        str.getClass();
        u91Var.zzb |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        u91Var.zzE = str;
    }

    static /* synthetic */ void E0(u91 u91Var, long j2) {
        u91Var.zzb |= 4;
        u91Var.zzi = j2;
    }

    static /* synthetic */ void F(u91 u91Var, long j2) {
        u91Var.zzb |= 33554432;
        u91Var.zzF = j2;
    }

    static /* synthetic */ void F0(u91 u91Var, long j2) {
        u91Var.zzb |= 16;
        u91Var.zzk = j2;
    }

    static /* synthetic */ void G(u91 u91Var, long j2) {
        u91Var.zzb |= 67108864;
        u91Var.zzG = j2;
    }

    static /* synthetic */ void H(u91 u91Var, long j2) {
        u91Var.zzb |= 134217728;
        u91Var.zzH = j2;
    }

    static /* synthetic */ void H0(u91 u91Var, long j2) {
        u91Var.zzb |= 32;
        u91Var.zzl = j2;
    }

    static /* synthetic */ void I(u91 u91Var, String str) {
        str.getClass();
        u91Var.zzb |= 268435456;
        u91Var.zzI = str;
    }

    static /* synthetic */ void I0(u91 u91Var, long j2) {
        u91Var.zzb |= Spliterator.IMMUTABLE;
        u91Var.zzq = j2;
    }

    static /* synthetic */ void J(u91 u91Var, long j2) {
        u91Var.zzb |= 536870912;
        u91Var.zzJ = j2;
    }

    static /* synthetic */ void J0(u91 u91Var, long j2) {
        u91Var.zzb |= 2048;
        u91Var.zzr = j2;
    }

    static /* synthetic */ void K0(u91 u91Var, long j2) {
        u91Var.zzb |= 8192;
        u91Var.zzt = j2;
    }

    static /* synthetic */ void L(u91 u91Var, long j2) {
        u91Var.zzb |= 1073741824;
        u91Var.zzK = j2;
    }

    static /* synthetic */ void L0(u91 u91Var, long j2) {
        u91Var.zzb |= 16384;
        u91Var.zzu = j2;
    }

    static /* synthetic */ void M(u91 u91Var, long j2) {
        u91Var.zzb |= Level.ALL_INT;
        u91Var.zzL = j2;
    }

    static /* synthetic */ void M0(u91 u91Var, long j2) {
        u91Var.zzb |= 32768;
        u91Var.zzv = j2;
    }

    static /* synthetic */ void N(u91 u91Var, long j2) {
        u91Var.zze |= 2;
        u91Var.zzN = j2;
    }

    static /* synthetic */ void N0(u91 u91Var, long j2) {
        u91Var.zzb |= 65536;
        u91Var.zzw = j2;
    }

    static /* synthetic */ void O(u91 u91Var, long j2) {
        u91Var.zze |= 4;
        u91Var.zzO = j2;
    }

    static /* synthetic */ void O0(u91 u91Var, long j2) {
        u91Var.zzb |= 524288;
        u91Var.zzz = j2;
    }

    static /* synthetic */ void P(u91 u91Var, long j2) {
        u91Var.zze |= 8;
        u91Var.zzP = j2;
    }

    static /* synthetic */ void P0(u91 u91Var, long j2) {
        u91Var.zzb |= 1048576;
        u91Var.zzA = j2;
    }

    static /* synthetic */ void Q(u91 u91Var, long j2) {
        u91Var.zze |= 16;
        u91Var.zzQ = j2;
    }

    static /* synthetic */ void Q0(u91 u91Var, long j2) {
        u91Var.zzb |= 2097152;
        u91Var.zzB = j2;
    }

    static /* synthetic */ void R(u91 u91Var, long j2) {
        u91Var.zze |= 32;
        u91Var.zzR = j2;
    }

    static /* synthetic */ void S(u91 u91Var, long j2) {
        u91Var.zze |= 64;
        u91Var.zzS = j2;
    }

    static /* synthetic */ void T(u91 u91Var, String str) {
        str.getClass();
        u91Var.zze |= 128;
        u91Var.zzT = str;
    }

    static /* synthetic */ void U(u91 u91Var, String str) {
        str.getClass();
        u91Var.zze |= 256;
        u91Var.zzU = str;
    }

    static /* synthetic */ void V(u91 u91Var, ek1 ek1Var) {
        u91Var.zzW = ek1Var.zza();
        u91Var.zze |= Spliterator.IMMUTABLE;
    }

    static /* synthetic */ void W(u91 u91Var, ek1 ek1Var) {
        u91Var.zzX = ek1Var.zza();
        u91Var.zze |= 2048;
    }

    static /* synthetic */ void X(u91 u91Var, long j2) {
        u91Var.zze |= Spliterator.CONCURRENT;
        u91Var.zzY = j2;
    }

    static /* synthetic */ void Y(u91 u91Var, long j2) {
        u91Var.zze |= 8192;
        u91Var.zzZ = j2;
    }

    static /* synthetic */ void Z(u91 u91Var, long j2) {
        u91Var.zze |= 16384;
        u91Var.zzaa = j2;
    }

    static /* synthetic */ void a0(u91 u91Var, ek1 ek1Var) {
        u91Var.zzad = ek1Var.zza();
        u91Var.zze |= 131072;
    }

    static /* synthetic */ void b0(u91 u91Var, q61 q61Var) {
        q61Var.getClass();
        u91Var.zzae = q61Var;
        u91Var.zze |= 262144;
    }

    static /* synthetic */ void c0(u91 u91Var, q61 q61Var) {
        q61Var.getClass();
        nj2<q61> nj2Var = u91Var.zzaf;
        if (!nj2Var.zza()) {
            u91Var.zzaf = ej2.q(nj2Var);
        }
        u91Var.zzaf.add(q61Var);
    }

    static /* synthetic */ void f0(u91 u91Var, t81 t81Var) {
        t81Var.getClass();
        u91Var.zzag = t81Var;
        u91Var.zze |= 524288;
    }

    static /* synthetic */ void g0(u91 u91Var, long j2) {
        u91Var.zze |= 2097152;
        u91Var.zzai = j2;
    }

    static /* synthetic */ void h0(u91 u91Var, long j2) {
        u91Var.zze |= 4194304;
        u91Var.zzaj = j2;
    }

    static /* synthetic */ void i0(u91 u91Var, long j2) {
        u91Var.zze |= 8388608;
        u91Var.zzak = j2;
    }

    static /* synthetic */ void j0(u91 u91Var, long j2) {
        u91Var.zze |= 67108864;
        u91Var.zzan = j2;
    }

    static /* synthetic */ void k0(u91 u91Var, long j2) {
        u91Var.zze |= 134217728;
        u91Var.zzao = j2;
    }

    static /* synthetic */ void l0(u91 u91Var, String str) {
        str.getClass();
        u91Var.zze |= 268435456;
        u91Var.zzap = str;
    }

    static /* synthetic */ void m0(u91 u91Var, ek1 ek1Var) {
        u91Var.zzaw = ek1Var.zza();
        u91Var.zzf |= 8;
    }

    static /* synthetic */ void n0(u91 u91Var, ek1 ek1Var) {
        u91Var.zzax = ek1Var.zza();
        u91Var.zzf |= 16;
    }

    static /* synthetic */ void o0(u91 u91Var, String str) {
        str.getClass();
        u91Var.zzf |= 128;
        u91Var.zzaB = str;
    }

    static /* synthetic */ void p0(u91 u91Var, k01 k01Var) {
        u91Var.zzaC = k01Var.zza();
        u91Var.zzf |= 256;
    }

    static /* synthetic */ void q0(u91 u91Var, boolean z) {
        u91Var.zzf |= AdRequest.MAX_CONTENT_URL_LENGTH;
        u91Var.zzaD = z;
    }

    static /* synthetic */ void r0(u91 u91Var, long j2) {
        u91Var.zzf |= 2048;
        u91Var.zzaF = j2;
    }

    public static u91 y0(byte[] bArr, qi2 qi2Var) {
        return (u91) ej2.v(zzaH, bArr, qi2Var);
    }

    public static eu0 z0() {
        return zzaH.w();
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzaH, "\u0001O\u0000\u0003\u0001ÉO\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂF\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈG\u0019ဂK\u001aဌH\u001bဈ\u0016\u001cဇI\u001dဈ\u0018\u001eဈJ\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bÉဉL", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaA", "zzA", "zzB", "zzaB", "zzaF", "zzaC", k01.b(), "zzC", "zzaD", "zzE", "zzaE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", q61.class, "zzR", "zzS", "zzT", "zzU", "zzW", ek1.b(), "zzX", ek1.b(), "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", ek1.b(), "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", bh1.b(), "zzas", hn1.b(), "zzap", "zzat", hx0.b(), "zzau", "zzav", "zzal", "zzam", "zzaw", ek1.b(), "zzV", "zzD", "zzax", ek1.b(), "zzay", "zzaz", o41.class, "zzaG"});
        }
        if (i3 == 3) {
            return new u91();
        }
        dt0 dt0Var = null;
        if (i3 == 4) {
            return new eu0(dt0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzaH;
    }

    public final boolean e0() {
        return (this.zzb & 4194304) != 0;
    }

    public final String s0() {
        return this.zzC;
    }

    public final String t0() {
        return this.zzaB;
    }

    public final k01 u0() {
        k01 k01VarA = k01.a(this.zzaC);
        return k01VarA == null ? k01.DEVICE_IDENTIFIER_GLOBAL_ID : k01VarA;
    }

    public final boolean v0() {
        return this.zzaD;
    }

    public final boolean w0() {
        return (this.zzf & Spliterator.CONCURRENT) != 0;
    }

    public final jp1 x0() {
        jp1 jp1Var = this.zzaG;
        return jp1Var == null ? jp1.F() : jp1Var;
    }
}