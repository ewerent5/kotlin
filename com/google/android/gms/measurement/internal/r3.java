package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class r3 extends f5 {

    /* renamed from: c, reason: collision with root package name */
    private final u3 f11173c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11174d;

    r3(z4 z4Var) {
        super(z4Var);
        this.f11173c = new u3(this, zzm(), "google_app_measurement_local.db");
    }

    private final SQLiteDatabase F() {
        if (this.f11174d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f11173c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f11174d = true;
        return null;
    }

    private final boolean G() {
        return zzm().getDatabasePath("google_app_measurement_local.db").exists();
    }

    private static long w(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j2 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean y(int r17, byte[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r3.y(int, byte[]):boolean");
    }

    public final boolean A(ca caVar) {
        Parcel parcelObtain = Parcel.obtain();
        caVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return y(1, bArrMarshall);
        }
        zzq().B().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean B(wa waVar) {
        g();
        byte[] bArrK0 = da.k0(waVar);
        if (bArrK0.length <= 131072) {
            return y(2, bArrK0);
        }
        zzq().B().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final void C() {
        d();
        try {
            int iDelete = F().delete("messages", null, null) + 0;
            if (iDelete > 0) {
                zzq().I().b("Reset local analytics data. records", Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e2) {
            zzq().A().b("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean D() {
        return y(3, new byte[0]);
    }

    public final boolean E() {
        d();
        if (this.f11174d || !G()) {
            return false;
        }
        int i2 = 5;
        for (int i3 = 0; i3 < 5; i3++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabaseF = F();
                    if (sQLiteDatabaseF == null) {
                        this.f11174d = true;
                        if (sQLiteDatabaseF != null) {
                            sQLiteDatabaseF.close();
                        }
                        return false;
                    }
                    sQLiteDatabaseF.beginTransaction();
                    sQLiteDatabaseF.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    sQLiteDatabaseF.setTransactionSuccessful();
                    sQLiteDatabaseF.endTransaction();
                    sQLiteDatabaseF.close();
                    return true;
                } catch (SQLiteFullException e2) {
                    zzq().A().b("Error deleting app launch break from local database", e2);
                    this.f11174d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e3) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    zzq().A().b("Error deleting app launch break from local database", e3);
                    this.f11174d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i2);
                i2 += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        zzq().D().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ t3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ da g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ i4 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ c i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ a j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ i6 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s3 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ y7 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ p7 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ r3 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ e9 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean u() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.common.internal.w.a> x(int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r3.x(int):java.util.List");
    }

    public final boolean z(r rVar) {
        Parcel parcelObtain = Parcel.obtain();
        rVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return y(0, bArrMarshall);
        }
        zzq().B().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.f zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ w4 zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ v3 zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ ta zzt() {
        return super.zzt();
    }
}