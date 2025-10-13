package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class z60 {
    public final List<? extends g52<? extends s60>> a;

    public z60(s60 s60Var) {
        this.a = Collections.singletonList(y42.a(s60Var));
    }

    public z60(List<? extends g52<? extends s60>> list) {
        this.a = list;
    }

    public static j31<z60> a(b61<? extends s60> b61Var) {
        return new k31(b61Var, x60.a);
    }

    public static j31<z60> b(j31<? extends s60> j31Var) {
        return new k31(j31Var, y60.a);
    }
}