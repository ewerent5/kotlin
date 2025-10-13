package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum sr2 implements gj2 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    UNKNOWN(999);


    /* renamed from: k, reason: collision with root package name */
    private static final hj2<sr2> f8973k = new hj2<sr2>() { // from class: com.google.android.gms.internal.ads.rr2
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f8975m;

    sr2(int i2) {
        this.f8975m = i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + sr2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8975m + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f8975m;
    }
}