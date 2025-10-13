package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qi2 {
    private static volatile qi2 a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile qi2 f8392b;

    /* renamed from: c, reason: collision with root package name */
    static final qi2 f8393c = new qi2(true);

    /* renamed from: d, reason: collision with root package name */
    private final Map<pi2, dj2<?, ?>> f8394d;

    qi2() {
        this.f8394d = new HashMap();
    }

    public static qi2 a() {
        qi2 qi2Var = a;
        if (qi2Var == null) {
            synchronized (qi2.class) {
                qi2Var = a;
                if (qi2Var == null) {
                    qi2Var = f8393c;
                    a = qi2Var;
                }
            }
        }
        return qi2Var;
    }

    public static qi2 b() {
        qi2 qi2Var = f8392b;
        if (qi2Var != null) {
            return qi2Var;
        }
        synchronized (qi2.class) {
            qi2 qi2Var2 = f8392b;
            if (qi2Var2 != null) {
                return qi2Var2;
            }
            qi2 qi2VarB = zi2.b(qi2.class);
            f8392b = qi2VarB;
            return qi2VarB;
        }
    }

    public final <ContainingType extends lk2> dj2<ContainingType, ?> c(ContainingType containingtype, int i2) {
        return (dj2) this.f8394d.get(new pi2(containingtype, i2));
    }

    qi2(boolean z) {
        this.f8394d = Collections.emptyMap();
    }
}