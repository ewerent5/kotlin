package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class gk2 {
    gk2() {
    }

    public static final int a(int i2, Object obj, Object obj2) {
        fk2 fk2Var = (fk2) obj;
        if (fk2Var.isEmpty()) {
            return 0;
        }
        Iterator it = fk2Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean b(Object obj) {
        return !((fk2) obj).f();
    }

    public static final Object c(Object obj, Object obj2) {
        fk2 fk2VarD = (fk2) obj;
        fk2 fk2Var = (fk2) obj2;
        if (!fk2Var.isEmpty()) {
            if (!fk2VarD.f()) {
                fk2VarD = fk2VarD.d();
            }
            fk2VarD.b(fk2Var);
        }
        return fk2VarD;
    }
}