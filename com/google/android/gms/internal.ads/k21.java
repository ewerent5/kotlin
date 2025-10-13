package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class k21 implements vs1 {
    private final p21 a;

    /* renamed from: b */
    private final boolean f6929b;

    k21(p21 p21Var, boolean z) {
        this.a = p21Var;
        this.f6929b = z;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final Object zza(Object obj) {
        this.a.b(this.f6929b, (SQLiteDatabase) obj);
        return null;
    }
}