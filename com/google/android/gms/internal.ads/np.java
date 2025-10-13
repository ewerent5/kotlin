package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class np implements pp {
    private final qp a;

    /* renamed from: b */
    private final Map f7765b;

    np(qp qpVar, Map map) {
        this.a = qpVar;
        this.f7765b = map;
    }

    @Override // com.google.android.gms.internal.ads.pp
    public final void a(SharedPreferences sharedPreferences, String str, String str2) {
        this.a.c(this.f7765b, sharedPreferences, str, str2);
    }
}