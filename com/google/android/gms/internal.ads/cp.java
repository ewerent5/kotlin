package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class cp implements jp {
    private final Context a;

    /* renamed from: b */
    private final String f5345b;

    cp(Context context, String str) {
        this.a = context;
        this.f5345b = str;
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void a(xx xxVar) {
        Context context = this.a;
        xxVar.z1(e.c.b.b.b.d.m4(context), this.f5345b, context.getPackageName());
    }
}