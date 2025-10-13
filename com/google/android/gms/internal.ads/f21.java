package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class f21 implements vs1 {
    private final g21 a;

    /* renamed from: b */
    private final boolean f5775b;

    /* renamed from: c */
    private final ArrayList f5776c;

    /* renamed from: d */
    private final g73 f5777d;

    /* renamed from: e */
    private final p73 f5778e;

    f21(g21 g21Var, boolean z, ArrayList arrayList, g73 g73Var, p73 p73Var) {
        this.a = g21Var;
        this.f5775b = z;
        this.f5776c = arrayList;
        this.f5777d = g73Var;
        this.f5778e = p73Var;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final Object zza(Object obj) throws SQLException {
        g21 g21Var = this.a;
        boolean z = this.f5775b;
        ArrayList arrayList = this.f5776c;
        g73 g73Var = this.f5777d;
        p73 p73Var = this.f5778e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!g21Var.f6019b.f6277g.zzB()) {
            byte[] bArrF = h21.f(g21Var.f6019b, z, arrayList, g73Var, p73Var);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(zzs.zzj().a()));
            contentValues.put("serialized_proto_data", bArrF);
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            if (!z) {
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
            }
        }
        return null;
    }
}