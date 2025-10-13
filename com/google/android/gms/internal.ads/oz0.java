package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class oz0 implements jd0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f8040e;

    /* renamed from: f, reason: collision with root package name */
    private final kp f8041f;

    oz0(Context context, kp kpVar) {
        this.f8040e = context;
        this.f8041f = kpVar;
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void R(kp1 kp1Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (TextUtils.isEmpty(kp1Var.f7035b.f6562b.f4969d)) {
            return;
        }
        this.f8041f.i(this.f8040e, kp1Var.a.a.f8427d);
        this.f8041f.u(this.f8040e, kp1Var.f7035b.f6562b.f4969d);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void f(ql qlVar) {
    }
}