package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class uq2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private final long f9536i;

    public uq2(gq2 gq2Var, String str, String str2, eu0 eu0Var, long j2, int i2, int i3) {
        super(gq2Var, "Fy+0MnOblzKutA61AaguuQzqgSFwAYgIkg1Nv1jjUsad/m9fCPRM59z2VYO0D4ud", "I4PnVaadHpMjKRcaJl2eH2r6C+XiARMRngguwqwgirg=", eu0Var, i2, 25);
        this.f9536i = j2;
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        long jLongValue = ((Long) this.f8257f.invoke(null, new Object[0])).longValue();
        synchronized (this.f8256e) {
            this.f8256e.S(jLongValue);
            long j2 = this.f9536i;
            if (j2 != 0) {
                this.f8256e.d0(jLongValue - j2);
                this.f8256e.g0(this.f9536i);
            }
        }
    }
}