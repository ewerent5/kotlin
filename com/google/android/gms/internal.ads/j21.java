package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class j21 {
    public static ArrayList<l73> a(SQLiteDatabase sQLiteDatabase) {
        ArrayList<l73> arrayList = new ArrayList<>();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(l73.S(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (qj2 e2) {
                er.zzf("Unable to deserialize proto from offline signals database:");
                er.zzf(e2.getMessage());
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static int b(SQLiteDatabase sQLiteDatabase, int i2) {
        int i3;
        Cursor cursorD = d(sQLiteDatabase, i2);
        if (cursorD.getCount() > 0) {
            cursorD.moveToNext();
            i3 = cursorD.getInt(cursorD.getColumnIndexOrThrow("value"));
        } else {
            i3 = 0;
        }
        cursorD.close();
        return i3;
    }

    public static long c(SQLiteDatabase sQLiteDatabase, int i2) {
        long j2;
        Cursor cursorD = d(sQLiteDatabase, 2);
        if (cursorD.getCount() > 0) {
            cursorD.moveToNext();
            j2 = cursorD.getLong(cursorD.getColumnIndexOrThrow("value"));
        } else {
            j2 = 0;
        }
        cursorD.close();
        return j2;
    }

    private static Cursor d(SQLiteDatabase sQLiteDatabase, int i2) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i2 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i2 != 1) {
            strArr2[0] = "last_successful_request_time";
        } else {
            strArr2[0] = "total_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }
}