package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x21 extends SQLiteOpenHelper {

    /* renamed from: e, reason: collision with root package name */
    private final Context f10109e;

    /* renamed from: f, reason: collision with root package name */
    private final h52 f10110f;

    public x21(Context context, h52 h52Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) c.c().b(w3.z5)).intValue());
        this.f10109e = context;
        this.f10110f = h52Var;
    }

    private static void A(SQLiteDatabase sQLiteDatabase, jr jrVar) {
        sQLiteDatabase.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("event_state = ");
            sb.append(1);
            Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, sb.toString(), null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i2 = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i2] = cursorQuery.getString(columnIndex);
                }
                i2++;
            }
            cursorQuery.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i3 = 0; i3 < count; i3++) {
                jrVar.zza(strArr[i3]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    static final /* synthetic */ void q(SQLiteDatabase sQLiteDatabase, String str, jr jrVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        A(sQLiteDatabase, jrVar);
    }

    static final /* synthetic */ Void s(jr jrVar, SQLiteDatabase sQLiteDatabase) {
        A(sQLiteDatabase, jrVar);
        return null;
    }

    static final void v(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    final void b(vs1<SQLiteDatabase, Void> vs1Var) {
        y42.o(this.f10110f.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.q21
            private final x21 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.getWritableDatabase();
            }
        }), new w21(this, vs1Var), this.f10110f);
    }

    final void c(final SQLiteDatabase sQLiteDatabase, final jr jrVar, final String str) {
        this.f10110f.execute(new Runnable(sQLiteDatabase, str, jrVar) { // from class: com.google.android.gms.internal.ads.s21

            /* renamed from: e, reason: collision with root package name */
            private final SQLiteDatabase f8810e;

            /* renamed from: f, reason: collision with root package name */
            private final String f8811f;

            /* renamed from: g, reason: collision with root package name */
            private final jr f8812g;

            {
                this.f8810e = sQLiteDatabase;
                this.f8811f = str;
                this.f8812g = jrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x21.q(this.f8810e, this.f8811f, this.f8812g);
            }
        });
    }

    public final void d(final jr jrVar, final String str) {
        b(new vs1(this, jrVar, str) { // from class: com.google.android.gms.internal.ads.t21
            private final x21 a;

            /* renamed from: b, reason: collision with root package name */
            private final jr f9065b;

            /* renamed from: c, reason: collision with root package name */
            private final String f9066c;

            {
                this.a = this;
                this.f9065b = jrVar;
                this.f9066c = str;
            }

            @Override // com.google.android.gms.internal.ads.vs1
            public final Object zza(Object obj) {
                this.a.c((SQLiteDatabase) obj, this.f9065b, this.f9066c);
                return null;
            }
        });
    }

    public final void g(final String str) {
        b(new vs1(this, str) { // from class: com.google.android.gms.internal.ads.u21
            private final x21 a;

            /* renamed from: b, reason: collision with root package name */
            private final String f9359b;

            {
                this.a = this;
                this.f9359b = str;
            }

            @Override // com.google.android.gms.internal.ads.vs1
            public final Object zza(Object obj) {
                x21.v((SQLiteDatabase) obj, this.f9359b);
                return null;
            }
        });
    }

    public final void i(final z21 z21Var) {
        b(new vs1(this, z21Var) { // from class: com.google.android.gms.internal.ads.v21
            private final x21 a;

            /* renamed from: b, reason: collision with root package name */
            private final z21 f9625b;

            {
                this.a = this;
                this.f9625b = z21Var;
            }

            @Override // com.google.android.gms.internal.ads.vs1
            public final Object zza(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.a.j(this.f9625b, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final /* synthetic */ Void j(z21 z21Var, SQLiteDatabase sQLiteDatabase) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(z21Var.a));
        contentValues.put("gws_query_id", z21Var.f10533b);
        contentValues.put("url", z21Var.f10534c);
        contentValues.put("event_state", Integer.valueOf(z21Var.f10535d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        zzs.zzc();
        zzbh zzbhVarZzC = zzr.zzC(this.f10109e);
        if (zzbhVarZzC != null) {
            try {
                zzbhVarZzC.zzf(e.c.b.b.b.d.m4(this.f10109e));
            } catch (RemoteException e2) {
                zze.zzb("Failed to schedule offline ping sender.", e2);
            }
        }
        return null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}