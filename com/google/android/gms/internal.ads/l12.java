package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
abstract class l12 extends n02<String> {

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f7158g;

    /* renamed from: h, reason: collision with root package name */
    final t02 f7159h;

    /* renamed from: i, reason: collision with root package name */
    int f7160i = 0;

    /* renamed from: j, reason: collision with root package name */
    int f7161j = Integer.MAX_VALUE;

    protected l12(m12 m12Var, CharSequence charSequence) {
        this.f7159h = m12Var.a;
        this.f7158g = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.n02
    protected final /* bridge */ /* synthetic */ String a() {
        int iD;
        int i2 = this.f7160i;
        while (true) {
            int i3 = this.f7160i;
            if (i3 == -1) {
                b();
                return null;
            }
            int iC = c(i3);
            if (iC == -1) {
                iC = this.f7158g.length();
                this.f7160i = -1;
                iD = -1;
            } else {
                iD = d(iC);
                this.f7160i = iD;
            }
            if (iD != i2) {
                if (i2 < iC) {
                    this.f7158g.charAt(i2);
                }
                if (i2 < iC) {
                    this.f7158g.charAt(iC - 1);
                }
                int i4 = this.f7161j;
                if (i4 == 1) {
                    iC = this.f7158g.length();
                    this.f7160i = -1;
                    if (iC > i2) {
                        this.f7158g.charAt(iC - 1);
                    }
                } else {
                    this.f7161j = i4 - 1;
                }
                return this.f7158g.subSequence(i2, iC).toString();
            }
            int i5 = iD + 1;
            this.f7160i = i5;
            if (i5 > this.f7158g.length()) {
                this.f7160i = -1;
            }
        }
    }

    abstract int c(int i2);

    abstract int d(int i2);
}