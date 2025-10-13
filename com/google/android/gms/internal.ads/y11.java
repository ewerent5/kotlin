package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class y11 implements dc0, ta0 {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f10335e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static int f10336f;

    /* renamed from: g, reason: collision with root package name */
    private final zzg f10337g;

    /* renamed from: h, reason: collision with root package name */
    private final h21 f10338h;

    public y11(h21 h21Var, zzg zzgVar) {
        this.f10338h = h21Var;
        this.f10337g = zzgVar;
    }

    private final void a(boolean z) {
        int i2;
        int iIntValue;
        if (((Boolean) c.c().b(w3.o4)).booleanValue() && !this.f10337g.zzB()) {
            Object obj = f10335e;
            synchronized (obj) {
                i2 = f10336f;
                iIntValue = ((Integer) c.c().b(w3.p4)).intValue();
            }
            if (i2 >= iIntValue) {
                return;
            }
            this.f10338h.a(z);
            synchronized (obj) {
                f10336f++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(g93 g93Var) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final void b0() {
        a(true);
    }
}