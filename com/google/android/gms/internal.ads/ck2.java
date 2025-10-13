package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ck2 implements jk2 {
    private final jk2[] a;

    ck2(jk2... jk2VarArr) {
        this.a = jk2VarArr;
    }

    @Override // com.google.android.gms.internal.ads.jk2
    public final boolean b(Class<?> cls) {
        jk2[] jk2VarArr = this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            if (jk2VarArr[i2].b(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jk2
    public final ik2 c(Class<?> cls) {
        jk2[] jk2VarArr = this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            jk2 jk2Var = jk2VarArr[i2];
            if (jk2Var.b(cls)) {
                return jk2Var.c(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}