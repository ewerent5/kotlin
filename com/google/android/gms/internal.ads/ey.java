package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ey {
    private kr a;

    /* renamed from: b, reason: collision with root package name */
    private Context f5741b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f5742c;

    public final ey a(kr krVar) {
        this.a = krVar;
        return this;
    }

    public final ey b(Context context) {
        this.f5742c = new WeakReference<>(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f5741b = context;
        return this;
    }
}