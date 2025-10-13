package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class t21 implements vs1 {
    private final x21 a;

    /* renamed from: b */
    private final jr f9065b;

    /* renamed from: c */
    private final String f9066c;

    t21(x21 x21Var, jr jrVar, String str) {
        this.a = x21Var;
        this.f9065b = jrVar;
        this.f9066c = str;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final Object zza(Object obj) {
        this.a.c((SQLiteDatabase) obj, this.f9065b, this.f9066c);
        return null;
    }
}