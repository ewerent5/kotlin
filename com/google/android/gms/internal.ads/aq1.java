package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class aq1 {
    private final xo1 a;

    /* renamed from: b */
    private final ap1 f4982b;

    /* renamed from: c */
    private final x21 f4983c;

    /* renamed from: d */
    private final vu1 f4984d;

    public aq1(x21 x21Var, vu1 vu1Var, xo1 xo1Var, ap1 ap1Var) {
        this.a = xo1Var;
        this.f4982b = ap1Var;
        this.f4983c = x21Var;
        this.f4984d = vu1Var;
    }

    public final void a(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            c(it.next(), 2);
        }
    }

    public final void b(List<String> list, int i2) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            c(it.next(), i2);
        }
    }

    public final void c(String str, int i2) {
        if (!this.a.d0) {
            this.f4984d.b(str);
        } else {
            this.f4983c.i(new z21(zzs.zzj().a(), this.f4982b.f4967b, str, i2));
        }
    }
}