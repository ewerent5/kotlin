package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class c4 {
    public static final void a(b4 b4Var, z3 z3Var) {
        if (z3Var.b() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(z3Var.c())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        b4Var.a(z3Var.b(), z3Var.c(), z3Var.a(), z3Var.d());
    }
}