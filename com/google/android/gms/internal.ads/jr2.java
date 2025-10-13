package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jr2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private final nq2 f6826i;

    /* renamed from: j, reason: collision with root package name */
    private long f6827j;

    public jr2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3, nq2 nq2Var) {
        super(gq2Var, "dsBT0/C86X4nvrUnBzUMEal+ojVYRI4vej5Xuqa9imNJ0J9pVwFR29C2xyAk2Th3", "9lTHSJcuaKoP0vq0QstvDSkZiAsCy7DV03ujHiOCPWw=", eu0Var, i2, 53);
        this.f6826i = nq2Var;
        if (nq2Var != null) {
            this.f6827j = nq2Var.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        if (this.f6826i != null) {
            this.f8256e.z(((Long) this.f8257f.invoke(null, Long.valueOf(this.f6827j))).longValue());
        }
    }
}