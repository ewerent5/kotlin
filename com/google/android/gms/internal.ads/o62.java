package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o62 {
    private final ee2 a;

    private o62(ee2 ee2Var) {
        this.a = ee2Var;
    }

    static final o62 a(ee2 ee2Var) throws GeneralSecurityException {
        if (ee2Var == null || ee2Var.F() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new o62(ee2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <P> P b(Class<P> cls) throws GeneralSecurityException {
        Class<?> clsM = f72.m(cls);
        if (clsM == null) {
            String name = cls.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        }
        g72.b(this.a);
        w62 w62VarB = w62.b(clsM);
        for (de2 de2Var : this.a.E()) {
            if (de2Var.F() == td2.ENABLED) {
                u62 u62VarD = w62VarB.d(f72.k(de2Var.E(), clsM), de2Var);
                if (de2Var.G() == this.a.D()) {
                    w62VarB.c(u62VarD);
                }
            }
        }
        return (P) f72.l(w62VarB, cls);
    }

    public final String toString() {
        return g72.a(this.a).toString();
    }
}