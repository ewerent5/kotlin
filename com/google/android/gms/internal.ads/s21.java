package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class s21 implements Runnable {

    /* renamed from: e */
    private final SQLiteDatabase f8810e;

    /* renamed from: f */
    private final String f8811f;

    /* renamed from: g */
    private final jr f8812g;

    s21(SQLiteDatabase sQLiteDatabase, String str, jr jrVar) {
        this.f8810e = sQLiteDatabase;
        this.f8811f = str;
        this.f8812g = jrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x21.q(this.f8810e, this.f8811f, this.f8812g);
    }
}