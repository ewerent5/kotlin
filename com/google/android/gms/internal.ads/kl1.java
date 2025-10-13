package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class kl1 implements e42 {
    private final ml1 a;

    /* renamed from: b */
    private final mr1 f7006b;

    /* renamed from: c */
    private final w70 f7007c;

    kl1(ml1 ml1Var, mr1 mr1Var, w70 w70Var) {
        this.a = ml1Var;
        this.f7006b = mr1Var;
        this.f7007c = w70Var;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        mr1 mr1Var = this.f7006b;
        w70 w70Var = this.f7007c;
        kp1 kp1Var = (kp1) obj;
        mr1Var.f7531b = kp1Var;
        Iterator<xo1> it = kp1Var.f7035b.a.iterator();
        boolean z = false;
        loop0: while (true) {
            if (it.hasNext()) {
                Iterator<String> it2 = it.next().a.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().contains("FirstPartyRenderer")) {
                        break loop0;
                    }
                    z = true;
                }
            } else if (z) {
                return w70Var.c(y42.a(kp1Var));
            }
        }
        return y42.a(null);
    }
}