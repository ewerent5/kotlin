package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class w21 implements u42<SQLiteDatabase> {
    final /* synthetic */ vs1 a;

    w21(x21 x21Var, vs1 vs1Var) {
        this.a = vs1Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        er.zzf(strValueOf.length() != 0 ? "Failed to get offline buffered ping database: ".concat(strValueOf) : new String("Failed to get offline buffered ping database: "));
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(SQLiteDatabase sQLiteDatabase) {
        try {
            this.a.zza(sQLiteDatabase);
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            er.zzf(strValueOf.length() != 0 ? "Error executing function on offline buffered ping database: ".concat(strValueOf) : new String("Error executing function on offline buffered ping database: "));
        }
    }
}