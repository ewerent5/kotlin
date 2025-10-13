package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sq2 extends pr2 {
    public sq2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        super(gq2Var, "QyhSh63pUWyl0E0z6uCQKr++pUXCMXwPXQltRjm6En7YCAlkO5UKsLUcZkA+3Vx8", "eX0g6VwvDvhHx1e1HjsTwSMT1pEPU1lt723kkpn0xZw=", eu0Var, i2, 5);
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        this.f8256e.V(-1L);
        this.f8256e.W(-1L);
        int[] iArr = (int[]) this.f8257f.invoke(null, this.f8253b.b());
        synchronized (this.f8256e) {
            this.f8256e.V(iArr[0]);
            this.f8256e.W(iArr[1]);
            int i2 = iArr[2];
            if (i2 != Integer.MIN_VALUE) {
                this.f8256e.F(i2);
            }
        }
    }
}