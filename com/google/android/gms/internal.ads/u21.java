package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class u21 implements vs1 {
    private final x21 a;

    /* renamed from: b */
    private final String f9359b;

    u21(x21 x21Var, String str) {
        this.a = x21Var;
        this.f9359b = str;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final Object zza(Object obj) {
        x21.v((SQLiteDatabase) obj, this.f9359b);
        return null;
    }
}