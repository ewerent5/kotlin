package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xv1 {

    @SuppressLint({"StaticFieldLeak"})
    private static final xv1 a = new xv1();

    /* renamed from: b, reason: collision with root package name */
    private Context f10271b;

    private xv1() {
    }

    public static xv1 a() {
        return a;
    }

    public final Context b() {
        return this.f10271b;
    }

    public final void c(Context context) {
        this.f10271b = context != null ? context.getApplicationContext() : null;
    }
}