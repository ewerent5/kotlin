package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class k92 {
    private final b62 a;

    /* renamed from: b, reason: collision with root package name */
    private final e62 f6978b;

    public k92(b62 b62Var) {
        this.a = b62Var;
        this.f6978b = null;
    }

    public k92(e62 e62Var) {
        this.a = null;
        this.f6978b = e62Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        b62 b62Var = this.a;
        return b62Var != null ? b62Var.a(bArr, bArr2) : this.f6978b.a(bArr, bArr2);
    }
}