package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.joran.action.Action;
import e.c.b.b.c.e.k1;
import e.c.b.b.c.e.o0;
import e.c.b.b.c.e.o7;
import e.c.b.b.c.e.p0;
import e.c.b.b.c.e.pd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.Marker;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class g extends q9 {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f10877d = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f10878e = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f10879f = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f10880g = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f10881h = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f10882i = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f10883j = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f10884k = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: l, reason: collision with root package name */
    private final h f10885l;

    /* renamed from: m, reason: collision with root package name */
    private final m9 f10886m;

    g(t9 t9Var) {
        super(t9Var);
        this.f10886m = new m9(zzl());
        this.f10885l = new h(this, zzm(), "google_app_measurement.db");
    }

    private final Object D(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            zzq().A().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            zzq().A().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzq().A().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    private final String F(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = t().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return str2;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e2) {
                zzq().A().c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    private static void K(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.j(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    private final boolean T(String str, int i2, e.c.b.b.c.e.p0 p0Var) {
        p();
        d();
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.j(p0Var);
        if (TextUtils.isEmpty(p0Var.F())) {
            zzq().D().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", v3.s(str), Integer.valueOf(i2), String.valueOf(p0Var.D() ? Integer.valueOf(p0Var.E()) : null));
            return false;
        }
        byte[] bArrI = p0Var.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", p0Var.D() ? Integer.valueOf(p0Var.E()) : null);
        contentValues.put("event_name", p0Var.F());
        contentValues.put("session_scoped", p0Var.M() ? Boolean.valueOf(p0Var.N()) : null);
        contentValues.put("data", bArrI);
        try {
            if (t().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzq().A().b("Failed to insert event filter (got -1). appId", v3.s(str));
            return true;
        } catch (SQLiteException e2) {
            zzq().A().c("Error storing event filter. appId", v3.s(str), e2);
            return false;
        }
    }

    private final boolean U(String str, int i2, e.c.b.b.c.e.s0 s0Var) {
        p();
        d();
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.j(s0Var);
        if (TextUtils.isEmpty(s0Var.C())) {
            zzq().D().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", v3.s(str), Integer.valueOf(i2), String.valueOf(s0Var.A() ? Integer.valueOf(s0Var.B()) : null));
            return false;
        }
        byte[] bArrI = s0Var.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", s0Var.A() ? Integer.valueOf(s0Var.B()) : null);
        contentValues.put("property_name", s0Var.C());
        contentValues.put("session_scoped", s0Var.G() ? Boolean.valueOf(s0Var.H()) : null);
        contentValues.put("data", bArrI);
        try {
            if (t().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzq().A().b("Failed to insert property filter (got -1). appId", v3.s(str));
            return false;
        } catch (SQLiteException e2) {
            zzq().A().c("Error storing property filter. appId", v3.s(str), e2);
            return false;
        }
    }

    private final boolean f0() {
        return zzm().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long g0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = t().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e2) {
                zzq().A().c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean k0(String str, List<Integer> list) {
        com.google.android.gms.common.internal.p.f(str);
        p();
        d();
        SQLiteDatabase sQLiteDatabaseT = t();
        try {
            long jG0 = g0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, i().q(str, t.G)));
            if (jG0 <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String strJoin = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 140);
            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append(string);
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseT.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e2) {
            zzq().A().c("Database error querying filters. appId", v3.s(str), e2);
            return false;
        }
    }

    private final long x(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = t().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j2;
                }
                long j3 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j3;
            } catch (SQLiteException e2) {
                zzq().A().c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final f A(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return z(j2, str, 1L, false, false, z3, false, z5);
    }

    public final d A0(String str) {
        com.google.android.gms.common.internal.p.j(str);
        d();
        p();
        return d.b(F("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0147: MOVE (r18 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:64:0x0147 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.n B(java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.B(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.n");
    }

    final void B0() {
        int iDelete;
        d();
        p();
        if (f0()) {
            long jA = h().f10929i.a();
            long jC = zzl().c();
            if (Math.abs(jC - jA) > t.z.a(null).longValue()) {
                h().f10929i.b(jC);
                d();
                p();
                if (!f0() || (iDelete = t().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzl().a()), String.valueOf(c.K())})) <= 0) {
                    return;
                }
                zzq().I().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    public final long C0() {
        return x("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long D0() {
        return x("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String E(long r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r4.d()
            r4.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.t()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            if (r1 != 0) goto L32
            com.google.android.gms.measurement.internal.v3 r6 = r4.zzq()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.x3 r6 = r6.I()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r0
        L32:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r6
        L3a:
            r6 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L55
        L3e:
            r6 = move-exception
            r5 = r0
        L40:
            com.google.android.gms.measurement.internal.v3 r1 = r4.zzq()     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.x3 r1 = r1.A()     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L52
            r5.close()
        L52:
            return r0
        L53:
            r6 = move-exception
            r0 = r5
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.E(long):java.lang.String");
    }

    public final boolean E0() {
        return g0("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean F0() {
        return g0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00b6: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:37:0x00b6 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.ea> G(java.lang.String r14) throws java.lang.Throwable {
        /*
            r13 = this;
            com.google.android.gms.common.internal.p.f(r14)
            r13.d()
            r13.p()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.t()     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L80
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L80
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L80
            r12 = 0
            r6[r12] = r14     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L80
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L80
            boolean r3 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            if (r3 != 0) goto L3d
            r2.close()
            return r0
        L3d:
            java.lang.String r7 = r2.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            java.lang.String r3 = r2.getString(r11)     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            if (r3 != 0) goto L49
            java.lang.String r3 = ""
        L49:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            r3 = 3
            java.lang.Object r10 = r13.D(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            if (r10 != 0) goto L68
            com.google.android.gms.measurement.internal.v3 r3 = r13.zzq()     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            com.google.android.gms.measurement.internal.x3 r3 = r3.A()     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.v3.s(r14)     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            r3.b(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            goto L72
        L68:
            com.google.android.gms.measurement.internal.ea r3 = new com.google.android.gms.measurement.internal.ea     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            r0.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
        L72:
            boolean r3 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7c java.lang.Throwable -> Lb5
            if (r3 != 0) goto L3d
            r2.close()
            return r0
        L7c:
            r0 = move-exception
            goto L82
        L7e:
            r14 = move-exception
            goto Lb7
        L80:
            r0 = move-exception
            r2 = r1
        L82:
            com.google.android.gms.measurement.internal.v3 r3 = r13.zzq()     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.measurement.internal.x3 r3 = r3.A()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.v3.s(r14)     // Catch: java.lang.Throwable -> Lb5
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> Lb5
            boolean r0 = e.c.b.b.c.e.xc.a()     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto Laf
            com.google.android.gms.measurement.internal.c r0 = r13.i()     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.measurement.internal.o3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.t.H0     // Catch: java.lang.Throwable -> Lb5
            boolean r14 = r0.y(r14, r3)     // Catch: java.lang.Throwable -> Lb5
            if (r14 == 0) goto Laf
            java.util.List r14 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto Lae
            r2.close()
        Lae:
            return r14
        Laf:
            if (r2 == 0) goto Lb4
            r2.close()
        Lb4:
            return r1
        Lb5:
            r14 = move-exception
            r1 = r2
        Lb7:
            if (r1 == 0) goto Lbc
            r1.close()
        Lbc:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.G(java.lang.String):java.util.List");
    }

    public final long G0() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = t().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e2) {
                zzq().A().b("Error querying raw events", e2);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final List<Pair<e.c.b.b.c.e.k1, Long>> H(String str, int i2, int i3) {
        byte[] bArrT;
        d();
        p();
        com.google.android.gms.common.internal.p.a(i2 > 0);
        com.google.android.gms.common.internal.p.a(i3 > 0);
        com.google.android.gms.common.internal.p.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = t().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
                if (!cursorQuery.moveToFirst()) {
                    List<Pair<e.c.b.b.c.e.k1, Long>> listEmptyList = Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                do {
                    long j2 = cursorQuery.getLong(0);
                    try {
                        bArrT = j().T(cursorQuery.getBlob(1));
                    } catch (IOException e2) {
                        zzq().A().c("Failed to unzip queued bundle. appId", v3.s(str), e2);
                    }
                    if (!arrayList.isEmpty() && bArrT.length + length > i3) {
                        break;
                    }
                    try {
                        k1.a aVar = (k1.a) z9.x(e.c.b.b.c.e.k1.Q0(), bArrT);
                        if (!cursorQuery.isNull(2)) {
                            aVar.m0(cursorQuery.getInt(2));
                        }
                        length += bArrT.length;
                        arrayList.add(Pair.create((e.c.b.b.c.e.k1) ((e.c.b.b.c.e.o7) aVar.zzy()), Long.valueOf(j2)));
                    } catch (IOException e3) {
                        zzq().A().c("Failed to merge queued bundle. appId", v3.s(str), e3);
                    }
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                } while (length <= i3);
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e4) {
                zzq().A().c("Error querying bundles. appId", v3.s(str), e4);
                List<Pair<e.c.b.b.c.e.k1, Long>> listEmptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        zzq().A().b("Read more than the max allowed user properties, ignoring excess", java.lang.Integer.valueOf(ch.qos.logback.core.CoreConstants.MILLIS_IN_ONE_SECOND));
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.ea> I(java.lang.String r21, java.lang.String r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.I(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        zzq().A().b("Read more than the max allowed conditional properties, ignoring extra", java.lang.Integer.valueOf(ch.qos.logback.core.CoreConstants.MILLIS_IN_ONE_SECOND));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.wa> J(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.J(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void L(n nVar) {
        com.google.android.gms.common.internal.p.j(nVar);
        d();
        p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", nVar.a);
        contentValues.put(Action.NAME_ATTRIBUTE, nVar.f11041b);
        contentValues.put("lifetime_count", Long.valueOf(nVar.f11042c));
        contentValues.put("current_bundle_count", Long.valueOf(nVar.f11043d));
        contentValues.put("last_fire_timestamp", Long.valueOf(nVar.f11045f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(nVar.f11046g));
        contentValues.put("last_bundled_day", nVar.f11047h);
        contentValues.put("last_sampled_complex_event_id", nVar.f11048i);
        contentValues.put("last_sampling_rate", nVar.f11049j);
        contentValues.put("current_session_count", Long.valueOf(nVar.f11044e));
        Boolean bool = nVar.f11050k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (t().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzq().A().b("Failed to insert/update event aggregates (got -1). appId", v3.s(nVar.a));
            }
        } catch (SQLiteException e2) {
            zzq().A().c("Error storing event aggregates. appId", v3.s(nVar.a), e2);
        }
    }

    public final void M(f4 f4Var) {
        com.google.android.gms.common.internal.p.j(f4Var);
        d();
        p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f4Var.t());
        contentValues.put("app_instance_id", f4Var.x());
        contentValues.put("gmp_app_id", f4Var.A());
        contentValues.put("resettable_device_id_hash", f4Var.J());
        contentValues.put("last_bundle_index", Long.valueOf(f4Var.f0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(f4Var.P()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(f4Var.R()));
        contentValues.put("app_version", f4Var.T());
        contentValues.put("app_store", f4Var.X());
        contentValues.put("gmp_version", Long.valueOf(f4Var.Z()));
        contentValues.put("dev_cert_hash", Long.valueOf(f4Var.b0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(f4Var.e0()));
        contentValues.put("day", Long.valueOf(f4Var.j0()));
        contentValues.put("daily_public_events_count", Long.valueOf(f4Var.k0()));
        contentValues.put("daily_events_count", Long.valueOf(f4Var.l0()));
        contentValues.put("daily_conversions_count", Long.valueOf(f4Var.m0()));
        contentValues.put("config_fetched_time", Long.valueOf(f4Var.g0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(f4Var.h0()));
        contentValues.put("app_version_int", Long.valueOf(f4Var.V()));
        contentValues.put("firebase_instance_id", f4Var.M());
        contentValues.put("daily_error_events_count", Long.valueOf(f4Var.h()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(f4Var.g()));
        contentValues.put("health_monitor_sample", f4Var.i());
        contentValues.put("android_id", Long.valueOf(f4Var.k()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(f4Var.l()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(f4Var.m()));
        contentValues.put("admob_app_id", f4Var.D());
        contentValues.put("dynamite_version", Long.valueOf(f4Var.d0()));
        if (f4Var.o() != null) {
            if (f4Var.o().size() == 0) {
                zzq().D().b("Safelisted events should not be an empty list. appId", f4Var.t());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", f4Var.o()));
            }
        }
        if (pd.a() && i().y(f4Var.t(), t.k0)) {
            contentValues.put("ga_app_id", f4Var.G());
        }
        try {
            SQLiteDatabase sQLiteDatabaseT = t();
            if (sQLiteDatabaseT.update("apps", contentValues, "app_id = ?", new String[]{f4Var.t()}) == 0 && sQLiteDatabaseT.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzq().A().b("Failed to insert/update app (got -1). appId", v3.s(f4Var.t()));
            }
        } catch (SQLiteException e2) {
            zzq().A().c("Error storing app. appId", v3.s(f4Var.t()), e2);
        }
    }

    final void N(String str, List<e.c.b.b.c.e.o0> list) {
        boolean z;
        boolean z2;
        com.google.android.gms.common.internal.p.j(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            o0.a aVarU = list.get(i2).u();
            if (aVarU.u() != 0) {
                for (int i3 = 0; i3 < aVarU.u(); i3++) {
                    p0.a aVarU2 = aVarU.v(i3).u();
                    p0.a aVar = (p0.a) ((o7.b) aVarU2.clone());
                    String strB = b6.b(aVarU2.t());
                    if (strB != null) {
                        aVar.r(strB);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i4 = 0; i4 < aVarU2.u(); i4++) {
                        e.c.b.b.c.e.q0 q0VarS = aVarU2.s(i4);
                        String strA = a6.a(q0VarS.H());
                        if (strA != null) {
                            aVar.q(i4, (e.c.b.b.c.e.q0) ((e.c.b.b.c.e.o7) q0VarS.u().q(strA).zzy()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        aVarU = aVarU.r(i3, aVar);
                        list.set(i2, (e.c.b.b.c.e.o0) ((e.c.b.b.c.e.o7) aVarU.zzy()));
                    }
                }
            }
            if (aVarU.q() != 0) {
                for (int i5 = 0; i5 < aVarU.q(); i5++) {
                    e.c.b.b.c.e.s0 s0VarT = aVarU.t(i5);
                    String strA2 = d6.a(s0VarT.C());
                    if (strA2 != null) {
                        aVarU = aVarU.s(i5, s0VarT.u().q(strA2));
                        list.set(i2, (e.c.b.b.c.e.o0) ((e.c.b.b.c.e.o7) aVarU.zzy()));
                    }
                }
            }
        }
        p();
        d();
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.j(list);
        SQLiteDatabase sQLiteDatabaseT = t();
        sQLiteDatabaseT.beginTransaction();
        try {
            p();
            d();
            com.google.android.gms.common.internal.p.f(str);
            SQLiteDatabase sQLiteDatabaseT2 = t();
            sQLiteDatabaseT2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseT2.delete("event_filters", "app_id=?", new String[]{str});
            for (e.c.b.b.c.e.o0 o0Var : list) {
                p();
                d();
                com.google.android.gms.common.internal.p.f(str);
                com.google.android.gms.common.internal.p.j(o0Var);
                if (o0Var.D()) {
                    int iE = o0Var.E();
                    Iterator<e.c.b.b.c.e.p0> it = o0Var.I().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().D()) {
                                zzq().D().c("Event filter with no ID. Audience definition ignored. appId, audienceId", v3.s(str), Integer.valueOf(iE));
                                break;
                            }
                        } else {
                            Iterator<e.c.b.b.c.e.s0> it2 = o0Var.G().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().A()) {
                                        zzq().D().c("Property filter with no ID. Audience definition ignored. appId, audienceId", v3.s(str), Integer.valueOf(iE));
                                        break;
                                    }
                                } else {
                                    Iterator<e.c.b.b.c.e.p0> it3 = o0Var.I().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!T(str, iE, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<e.c.b.b.c.e.s0> it4 = o0Var.G().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!U(str, iE, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        p();
                                        d();
                                        com.google.android.gms.common.internal.p.f(str);
                                        SQLiteDatabase sQLiteDatabaseT3 = t();
                                        sQLiteDatabaseT3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iE)});
                                        sQLiteDatabaseT3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iE)});
                                    }
                                }
                            }
                        }
                    }
                } else {
                    zzq().D().b("Audience with no ID. appId", v3.s(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (e.c.b.b.c.e.o0 o0Var2 : list) {
                arrayList.add(o0Var2.D() ? Integer.valueOf(o0Var2.E()) : null);
            }
            k0(str, arrayList);
            sQLiteDatabaseT.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseT.endTransaction();
        }
    }

    final void O(List<Long> list) throws SQLException {
        d();
        p();
        com.google.android.gms.common.internal.p.j(list);
        com.google.android.gms.common.internal.p.l(list.size());
        if (f0()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (g0(sb2.toString(), null) > 0) {
                zzq().D().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseT = t();
                StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseT.execSQL(sb3.toString());
            } catch (SQLiteException e2) {
                zzq().A().b("Error incrementing retry count. error", e2);
            }
        }
    }

    public final boolean P(e.c.b.b.c.e.k1 k1Var, boolean z) {
        d();
        p();
        com.google.android.gms.common.internal.p.j(k1Var);
        com.google.android.gms.common.internal.p.f(k1Var.V2());
        com.google.android.gms.common.internal.p.m(k1Var.u2());
        B0();
        long jA = zzl().a();
        if (k1Var.v2() < jA - c.K() || k1Var.v2() > c.K() + jA) {
            zzq().D().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", v3.s(k1Var.V2()), Long.valueOf(jA), Long.valueOf(k1Var.v2()));
        }
        try {
            byte[] bArrU = j().U(k1Var.i());
            zzq().I().b("Saving bundle, size", Integer.valueOf(bArrU.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", k1Var.V2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(k1Var.v2()));
            contentValues.put("data", bArrU);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (k1Var.v0()) {
                contentValues.put("retry_count", Integer.valueOf(k1Var.J0()));
            }
            try {
                if (t().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzq().A().b("Failed to insert bundle (got -1). appId", v3.s(k1Var.V2()));
                return false;
            } catch (SQLiteException e2) {
                zzq().A().c("Error storing bundle. appId", v3.s(k1Var.V2()), e2);
                return false;
            }
        } catch (IOException e3) {
            zzq().A().c("Data loss. Failed to serialize bundle. appId", v3.s(k1Var.V2()), e3);
            return false;
        }
    }

    public final boolean Q(o oVar, long j2, boolean z) {
        d();
        p();
        com.google.android.gms.common.internal.p.j(oVar);
        com.google.android.gms.common.internal.p.f(oVar.a);
        byte[] bArrI = j().v(oVar).i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", oVar.a);
        contentValues.put(Action.NAME_ATTRIBUTE, oVar.f11067b);
        contentValues.put("timestamp", Long.valueOf(oVar.f11069d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", bArrI);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (t().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzq().A().b("Failed to insert raw event (got -1). appId", v3.s(oVar.a));
            return false;
        } catch (SQLiteException e2) {
            zzq().A().c("Error storing raw event. appId", v3.s(oVar.a), e2);
            return false;
        }
    }

    public final boolean R(ea eaVar) {
        com.google.android.gms.common.internal.p.j(eaVar);
        d();
        p();
        if (m0(eaVar.a, eaVar.f10849c) == null) {
            if (da.Z(eaVar.f10849c)) {
                if (g0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{eaVar.a}) >= i().u(eaVar.a)) {
                    return false;
                }
            } else if (!"_npa".equals(eaVar.f10849c) && g0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{eaVar.a, eaVar.f10848b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", eaVar.a);
        contentValues.put("origin", eaVar.f10848b);
        contentValues.put(Action.NAME_ATTRIBUTE, eaVar.f10849c);
        contentValues.put("set_timestamp", Long.valueOf(eaVar.f10850d));
        K(contentValues, "value", eaVar.f10851e);
        try {
            if (t().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzq().A().b("Failed to insert/update user property (got -1). appId", v3.s(eaVar.a));
            }
        } catch (SQLiteException e2) {
            zzq().A().c("Error storing user property. appId", v3.s(eaVar.a), e2);
        }
        return true;
    }

    public final boolean S(wa waVar) {
        com.google.android.gms.common.internal.p.j(waVar);
        d();
        p();
        if (m0(waVar.f11318e, waVar.f11320g.f10792f) == null && g0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{waVar.f11318e}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", waVar.f11318e);
        contentValues.put("origin", waVar.f11319f);
        contentValues.put(Action.NAME_ATTRIBUTE, waVar.f11320g.f10792f);
        K(contentValues, "value", waVar.f11320g.c());
        contentValues.put("active", Boolean.valueOf(waVar.f11322i));
        contentValues.put("trigger_event_name", waVar.f11323j);
        contentValues.put("trigger_timeout", Long.valueOf(waVar.f11325l));
        g();
        contentValues.put("timed_out_event", da.k0(waVar.f11324k));
        contentValues.put("creation_timestamp", Long.valueOf(waVar.f11321h));
        g();
        contentValues.put("triggered_event", da.k0(waVar.f11326m));
        contentValues.put("triggered_timestamp", Long.valueOf(waVar.f11320g.f10793g));
        contentValues.put("time_to_live", Long.valueOf(waVar.n));
        g();
        contentValues.put("expired_event", da.k0(waVar.o));
        try {
            if (t().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzq().A().b("Failed to insert/update conditional user property (got -1)", v3.s(waVar.f11318e));
            }
        } catch (SQLiteException e2) {
            zzq().A().c("Error storing conditional user property", v3.s(waVar.f11318e), e2);
        }
        return true;
    }

    final boolean V(String str, Bundle bundle) {
        d();
        p();
        byte[] bArrI = j().v(new o(this.a, "", str, "dep", 0L, 0L, bundle)).i();
        zzq().I().c("Saving default event parameters, appId, data size", f().r(str), Integer.valueOf(bArrI.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrI);
        try {
            if (t().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzq().A().b("Failed to insert default event parameters (got -1). appId", v3.s(str));
            return false;
        } catch (SQLiteException e2) {
            zzq().A().c("Error storing default event parameters. appId", v3.s(str), e2);
            return false;
        }
    }

    public final boolean W(String str, Long l2, long j2, e.c.b.b.c.e.g1 g1Var) {
        d();
        p();
        com.google.android.gms.common.internal.p.j(g1Var);
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.j(l2);
        byte[] bArrI = g1Var.i();
        zzq().I().c("Saving complex main event, appId, data size", f().r(str), Integer.valueOf(bArrI.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrI);
        try {
            if (t().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzq().A().b("Failed to insert complex main event (got -1). appId", v3.s(str));
            return false;
        } catch (SQLiteException e2) {
            zzq().A().c("Error storing complex main event. appId", v3.s(str), e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.f4 h0(java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.h0(java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    public final List<wa> i0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.p.f(str);
        d();
        p();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Marker.ANY_MARKER));
            sb.append(" and name glob ?");
        }
        return J(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void j0(String str, String str2) {
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.f(str2);
        d();
        p();
        try {
            t().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            zzq().A().d("Error deleting user property. appId", v3.s(str), f().v(str2), e2);
        }
    }

    public final long l0(String str) {
        com.google.android.gms.common.internal.p.f(str);
        d();
        p();
        try {
            return t().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, i().q(str, t.q))))});
        } catch (SQLiteException e2) {
            zzq().A().c("Error deleting over the limit events. appId", v3.s(str), e2);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.ea m0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.p.f(r19)
            com.google.android.gms.common.internal.p.f(r20)
            r18.d()
            r18.p()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.t()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7e
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7e
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7e
            r1 = 0
            r14[r1] = r19     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7e
            r2 = 1
            r14[r2] = r8     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7e
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7e
            boolean r3 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L76
            if (r3 != 0) goto L3d
            r10.close()
            return r9
        L3d:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L76
            r11 = r18
            java.lang.Object r7 = r11.D(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> La1
            java.lang.String r3 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.ea r0 = new com.google.android.gms.measurement.internal.ea     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> La1
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> La1
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> La1
            if (r1 == 0) goto L6c
            com.google.android.gms.measurement.internal.v3 r1 = r18.zzq()     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.x3 r1 = r1.A()     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> La1
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.v3.s(r19)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> La1
            r1.b(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> La1
        L6c:
            r10.close()
            return r0
        L70:
            r0 = move-exception
            goto L82
        L72:
            r0 = move-exception
            r11 = r18
            goto La2
        L76:
            r0 = move-exception
            r11 = r18
            goto L82
        L7a:
            r0 = move-exception
            r11 = r18
            goto La3
        L7e:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L82:
            com.google.android.gms.measurement.internal.v3 r1 = r18.zzq()     // Catch: java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.x3 r1 = r1.A()     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.v3.s(r19)     // Catch: java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.t3 r4 = r18.f()     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = r4.v(r8)     // Catch: java.lang.Throwable -> La1
            r1.d(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> La1
            if (r10 == 0) goto La0
            r10.close()
        La0:
            return r9
        La1:
            r0 = move-exception
        La2:
            r9 = r10
        La3:
            if (r9 == 0) goto La8
            r9.close()
        La8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.m0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ea");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.wa n0(java.lang.String r30, java.lang.String r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.n0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.wa");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:24:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] o0(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            com.google.android.gms.common.internal.p.f(r11)
            r10.d()
            r10.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.t()     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            r9 = 0
            r5[r9] = r11     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            if (r2 != 0) goto L2f
            r1.close()
            return r0
        L2f:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            if (r3 == 0) goto L4a
            com.google.android.gms.measurement.internal.v3 r3 = r10.zzq()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.x3 r3 = r3.A()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.v3.s(r11)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            r3.b(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
        L4a:
            r1.close()
            return r2
        L4e:
            r2 = move-exception
            goto L54
        L50:
            r11 = move-exception
            goto L6d
        L52:
            r2 = move-exception
            r1 = r0
        L54:
            com.google.android.gms.measurement.internal.v3 r3 = r10.zzq()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.x3 r3 = r3.A()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.v3.s(r11)     // Catch: java.lang.Throwable -> L6b
            r3.c(r4, r11, r2)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L6a
            r1.close()
        L6a:
            return r0
        L6b:
            r11 = move-exception
            r0 = r1
        L6d:
            if (r0 == 0) goto L72
            r0.close()
        L72:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.o0(java.lang.String):byte[]");
    }

    public final int p0(String str, String str2) {
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.f(str2);
        d();
        p();
        try {
            return t().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            zzq().A().d("Error deleting conditional property", v3.s(str), f().v(str2), e2);
            return 0;
        }
    }

    final Map<Integer, List<e.c.b.b.c.e.p0>> q0(String str) {
        com.google.android.gms.common.internal.p.f(str);
        c.e.a aVar = new c.e.a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = t().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<e.c.b.b.c.e.p0>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        e.c.b.b.c.e.p0 p0Var = (e.c.b.b.c.e.p0) ((e.c.b.b.c.e.o7) ((p0.a) z9.x(e.c.b.b.c.e.p0.O(), cursorQuery.getBlob(1))).zzy());
                        if (p0Var.I()) {
                            int i2 = cursorQuery.getInt(0);
                            List arrayList = (List) aVar.get(Integer.valueOf(i2));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                aVar.put(Integer.valueOf(i2), arrayList);
                            }
                            arrayList.add(p0Var);
                        }
                    } catch (IOException e2) {
                        zzq().A().c("Failed to merge filter. appId", v3.s(str), e2);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return aVar;
            } catch (SQLiteException e3) {
                zzq().A().c("Database error querying filters. appId", v3.s(str), e3);
                Map<Integer, List<e.c.b.b.c.e.p0>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.measurement.internal.q9
    protected final boolean r() {
        return false;
    }

    public final void r0() {
        p();
        t().beginTransaction();
    }

    public final void s() {
        p();
        t().setTransactionSuccessful();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> s0(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.p()
            r7.d()
            com.google.android.gms.common.internal.p.f(r8)
            c.e.a r0 = new c.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.t()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteException -> L65
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteException -> L65
            r6 = 1
            r4[r6] = r8     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteException -> L65
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteException -> L65
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            if (r3 != 0) goto L30
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            r1.close()
            return r8
        L30:
            int r3 = r1.getInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            if (r4 != 0) goto L4c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
        L4c:
            int r3 = r1.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L9a
            if (r3 != 0) goto L30
            r1.close()
            return r0
        L61:
            r0 = move-exception
            goto L67
        L63:
            r8 = move-exception
            goto L9c
        L65:
            r0 = move-exception
            r1 = r2
        L67:
            com.google.android.gms.measurement.internal.v3 r3 = r7.zzq()     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.measurement.internal.x3 r3 = r3.A()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.v3.s(r8)     // Catch: java.lang.Throwable -> L9a
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> L9a
            boolean r0 = e.c.b.b.c.e.xc.a()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L94
            com.google.android.gms.measurement.internal.c r0 = r7.i()     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.measurement.internal.o3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.t.H0     // Catch: java.lang.Throwable -> L9a
            boolean r8 = r0.y(r8, r3)     // Catch: java.lang.Throwable -> L9a
            if (r8 == 0) goto L94
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L93
            r1.close()
        L93:
            return r8
        L94:
            if (r1 == 0) goto L99
            r1.close()
        L99:
            return r2
        L9a:
            r8 = move-exception
            r2 = r1
        L9c:
            if (r2 == 0) goto La1
            r2.close()
        La1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.s0(java.lang.String):java.util.Map");
    }

    final SQLiteDatabase t() {
        d();
        try {
            return this.f10885l.getWritableDatabase();
        } catch (SQLiteException e2) {
            zzq().D().b("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.Map<java.lang.Integer, java.util.List<e.c.b.b.c.e.p0>> t0(java.lang.String r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r12.p()
            r12.d()
            com.google.android.gms.common.internal.p.f(r13)
            com.google.android.gms.common.internal.p.f(r14)
            c.e.a r0 = new c.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.t()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r10 = 0
            r5[r10] = r13     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r11 = 1
            r5[r11] = r14     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            if (r1 != 0) goto L40
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r14.close()
            return r13
        L40:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.p0$a r2 = e.c.b.b.c.e.p0.O()     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.a9 r1 = com.google.android.gms.measurement.internal.z9.x(r2, r1)     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.p0$a r1 = (e.c.b.b.c.e.p0.a) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.b9 r1 = r1.zzy()     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.o7 r1 = (e.c.b.b.c.e.o7) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.p0 r1 = (e.c.b.b.c.e.p0) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            if (r3 != 0) goto L72
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
        L72:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            goto L88
        L76:
            r1 = move-exception
            com.google.android.gms.measurement.internal.v3 r2 = r12.zzq()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            com.google.android.gms.measurement.internal.x3 r2 = r2.A()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.v3.s(r13)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r2.c(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
        L88:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            if (r1 != 0) goto L40
            r14.close()
            return r0
        L92:
            r0 = move-exception
            goto L98
        L94:
            r13 = move-exception
            goto Lcd
        L96:
            r0 = move-exception
            r14 = r9
        L98:
            com.google.android.gms.measurement.internal.v3 r1 = r12.zzq()     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.measurement.internal.x3 r1 = r1.A()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.v3.s(r13)     // Catch: java.lang.Throwable -> Lcb
            r1.c(r2, r3, r0)     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = e.c.b.b.c.e.xc.a()     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto Lc5
            com.google.android.gms.measurement.internal.c r0 = r12.i()     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.measurement.internal.o3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.t.H0     // Catch: java.lang.Throwable -> Lcb
            boolean r13 = r0.y(r13, r1)     // Catch: java.lang.Throwable -> Lcb
            if (r13 == 0) goto Lc5
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Lcb
            if (r14 == 0) goto Lc4
            r14.close()
        Lc4:
            return r13
        Lc5:
            if (r14 == 0) goto Lca
            r14.close()
        Lca:
            return r9
        Lcb:
            r13 = move-exception
            r9 = r14
        Lcd:
            if (r9 == 0) goto Ld2
            r9.close()
        Ld2:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.t0(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String u() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.t()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L25
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L27
        L20:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3b
        L25:
            r2 = move-exception
            r0 = r1
        L27:
            com.google.android.gms.measurement.internal.v3 r3 = r6.zzq()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.x3 r3 = r3.A()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()
        L40:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.u():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.Map<java.lang.Integer, e.c.b.b.c.e.m1> u0(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            r11.p()
            r11.d()
            com.google.android.gms.common.internal.p.f(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.t()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r10 = 0
            r4[r10] = r12     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            if (r1 != 0) goto L4b
            boolean r1 = e.c.b.b.c.e.xc.a()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            if (r1 == 0) goto L47
            com.google.android.gms.measurement.internal.c r1 = r11.i()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            com.google.android.gms.measurement.internal.o3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.t.H0     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            boolean r1 = r1.y(r12, r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            if (r1 == 0) goto L47
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r0.close()
            return r12
        L47:
            r0.close()
            return r8
        L4b:
            c.e.a r1 = new c.e.a     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
        L50:
            int r2 = r0.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            byte[] r3 = r0.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.m1$a r4 = e.c.b.b.c.e.m1.X()     // Catch: java.io.IOException -> L72 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.a9 r3 = com.google.android.gms.measurement.internal.z9.x(r4, r3)     // Catch: java.io.IOException -> L72 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.m1$a r3 = (e.c.b.b.c.e.m1.a) r3     // Catch: java.io.IOException -> L72 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.b9 r3 = r3.zzy()     // Catch: java.io.IOException -> L72 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.o7 r3 = (e.c.b.b.c.e.o7) r3     // Catch: java.io.IOException -> L72 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.m1 r3 = (e.c.b.b.c.e.m1) r3     // Catch: java.io.IOException -> L72 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            goto L88
        L72:
            r3 = move-exception
            com.google.android.gms.measurement.internal.v3 r4 = r11.zzq()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            com.google.android.gms.measurement.internal.x3 r4 = r4.A()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.v3.s(r12)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r4.d(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
        L88:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            if (r2 != 0) goto L50
            r0.close()
            return r1
        L92:
            r1 = move-exception
            goto L98
        L94:
            r12 = move-exception
            goto Lcd
        L96:
            r1 = move-exception
            r0 = r8
        L98:
            com.google.android.gms.measurement.internal.v3 r2 = r11.zzq()     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.measurement.internal.x3 r2 = r2.A()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.v3.s(r12)     // Catch: java.lang.Throwable -> Lcb
            r2.c(r3, r4, r1)     // Catch: java.lang.Throwable -> Lcb
            boolean r1 = e.c.b.b.c.e.xc.a()     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto Lc5
            com.google.android.gms.measurement.internal.c r1 = r11.i()     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.measurement.internal.o3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.t.H0     // Catch: java.lang.Throwable -> Lcb
            boolean r12 = r1.y(r12, r2)     // Catch: java.lang.Throwable -> Lcb
            if (r12 == 0) goto Lc5
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto Lc4
            r0.close()
        Lc4:
            return r12
        Lc5:
            if (r0 == 0) goto Lca
            r0.close()
        Lca:
            return r8
        Lcb:
            r12 = move-exception
            r8 = r0
        Lcd:
            if (r8 == 0) goto Ld2
            r8.close()
        Ld2:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.u0(java.lang.String):java.util.Map");
    }

    public final boolean v() {
        return g0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.Map<java.lang.Integer, java.util.List<e.c.b.b.c.e.s0>> v0(java.lang.String r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r12.p()
            r12.d()
            com.google.android.gms.common.internal.p.f(r13)
            com.google.android.gms.common.internal.p.f(r14)
            c.e.a r0 = new c.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.t()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r10 = 0
            r5[r10] = r13     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r11 = 1
            r5[r11] = r14     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            if (r1 != 0) goto L40
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r14.close()
            return r13
        L40:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.s0$a r2 = e.c.b.b.c.e.s0.I()     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.a9 r1 = com.google.android.gms.measurement.internal.z9.x(r2, r1)     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.s0$a r1 = (e.c.b.b.c.e.s0.a) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.b9 r1 = r1.zzy()     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.o7 r1 = (e.c.b.b.c.e.o7) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            e.c.b.b.c.e.s0 r1 = (e.c.b.b.c.e.s0) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            if (r3 != 0) goto L72
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
        L72:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            goto L88
        L76:
            r1 = move-exception
            com.google.android.gms.measurement.internal.v3 r2 = r12.zzq()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            com.google.android.gms.measurement.internal.x3 r2 = r2.A()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.v3.s(r13)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            r2.c(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
        L88:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lcb
            if (r1 != 0) goto L40
            r14.close()
            return r0
        L92:
            r0 = move-exception
            goto L98
        L94:
            r13 = move-exception
            goto Lcd
        L96:
            r0 = move-exception
            r14 = r9
        L98:
            com.google.android.gms.measurement.internal.v3 r1 = r12.zzq()     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.measurement.internal.x3 r1 = r1.A()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.v3.s(r13)     // Catch: java.lang.Throwable -> Lcb
            r1.c(r2, r3, r0)     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = e.c.b.b.c.e.xc.a()     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto Lc5
            com.google.android.gms.measurement.internal.c r0 = r12.i()     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.measurement.internal.o3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.t.H0     // Catch: java.lang.Throwable -> Lcb
            boolean r13 = r0.y(r13, r1)     // Catch: java.lang.Throwable -> Lcb
            if (r13 == 0) goto Lc5
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Lcb
            if (r14 == 0) goto Lc4
            r14.close()
        Lc4:
            return r13
        Lc5:
            if (r14 == 0) goto Lca
            r14.close()
        Lca:
            return r9
        Lcb:
            r13 = move-exception
            r9 = r14
        Lcd:
            if (r9 == 0) goto Ld2
            r9.close()
        Ld2:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.v0(java.lang.String, java.lang.String):java.util.Map");
    }

    public final long w(e.c.b.b.c.e.k1 k1Var) {
        d();
        p();
        com.google.android.gms.common.internal.p.j(k1Var);
        com.google.android.gms.common.internal.p.f(k1Var.V2());
        byte[] bArrI = k1Var.i();
        long jT = j().t(bArrI);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", k1Var.V2());
        contentValues.put("metadata_fingerprint", Long.valueOf(jT));
        contentValues.put("metadata", bArrI);
        try {
            t().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jT;
        } catch (SQLiteException e2) {
            zzq().A().c("Error storing raw event metadata. appId", v3.s(k1Var.V2()), e2);
            throw e2;
        }
    }

    public final void w0() {
        p();
        t().endTransaction();
    }

    public final long x0(String str) {
        com.google.android.gms.common.internal.p.f(str);
        return x("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x008b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x008b */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<e.c.b.b.c.e.g1, java.lang.Long> y(java.lang.String r8, java.lang.Long r9) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.d()
            r7.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.t()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.v3 r8 = r7.zzq()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.x3 r8 = r8.I()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L35:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            e.c.b.b.c.e.g1$a r4 = e.c.b.b.c.e.g1.Y()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            e.c.b.b.c.e.a9 r2 = com.google.android.gms.measurement.internal.z9.x(r4, r2)     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            e.c.b.b.c.e.g1$a r2 = (e.c.b.b.c.e.g1.a) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            e.c.b.b.c.e.b9 r2 = r2.zzy()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            e.c.b.b.c.e.o7 r2 = (e.c.b.b.c.e.o7) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            e.c.b.b.c.e.g1 r2 = (e.c.b.b.c.e.g1) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r8
        L5b:
            r2 = move-exception
            com.google.android.gms.measurement.internal.v3 r3 = r7.zzq()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.x3 r3 = r3.A()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.v3.s(r8)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r3.d(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L71:
            r8 = move-exception
            goto L77
        L73:
            r8 = move-exception
            goto L8c
        L75:
            r8 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.v3 r9 = r7.zzq()     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.x3 r9 = r9.A()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            r8 = move-exception
            r0 = r1
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.y(java.lang.String, java.lang.Long):android.util.Pair");
    }

    protected final long y0(String str, String str2) throws Throwable {
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.f(str2);
        d();
        p();
        SQLiteDatabase sQLiteDatabaseT = t();
        sQLiteDatabaseT.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    long jX = x(sb.toString(), new String[]{str}, -1L);
                    if (jX == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (sQLiteDatabaseT.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            zzq().A().c("Failed to insert column (got -1). appId", v3.s(str), str2);
                            sQLiteDatabaseT.endTransaction();
                            return -1L;
                        }
                        jX = 0;
                    }
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str);
                        contentValues2.put(str2, Long.valueOf(1 + jX));
                        if (sQLiteDatabaseT.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                            zzq().A().c("Failed to update column (got 0). appId", v3.s(str), str2);
                            sQLiteDatabaseT.endTransaction();
                            return -1L;
                        }
                        sQLiteDatabaseT.setTransactionSuccessful();
                        sQLiteDatabaseT.endTransaction();
                        return jX;
                    } catch (SQLiteException e2) {
                        e = e2;
                        j2 = jX;
                        zzq().A().d("Error inserting column. appId", v3.s(str), str2, e);
                        sQLiteDatabaseT.endTransaction();
                        return j2;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabaseT.endTransaction();
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (SQLiteException e4) {
            e = e4;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final f z(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        com.google.android.gms.common.internal.p.f(str);
        d();
        p();
        String[] strArr = {str};
        f fVar = new f();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseT = t();
                Cursor cursorQuery = sQLiteDatabaseT.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    zzq().D().b("Not updating daily counts, app is not known. appId", v3.s(str));
                    cursorQuery.close();
                    return fVar;
                }
                if (cursorQuery.getLong(0) == j2) {
                    fVar.f10852b = cursorQuery.getLong(1);
                    fVar.a = cursorQuery.getLong(2);
                    fVar.f10853c = cursorQuery.getLong(3);
                    fVar.f10854d = cursorQuery.getLong(4);
                    fVar.f10855e = cursorQuery.getLong(5);
                }
                if (z) {
                    fVar.f10852b += j3;
                }
                if (z2) {
                    fVar.a += j3;
                }
                if (z3) {
                    fVar.f10853c += j3;
                }
                if (z4) {
                    fVar.f10854d += j3;
                }
                if (z5) {
                    fVar.f10855e += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(fVar.a));
                contentValues.put("daily_events_count", Long.valueOf(fVar.f10852b));
                contentValues.put("daily_conversions_count", Long.valueOf(fVar.f10853c));
                contentValues.put("daily_error_events_count", Long.valueOf(fVar.f10854d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(fVar.f10855e));
                sQLiteDatabaseT.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return fVar;
            } catch (SQLiteException e2) {
                zzq().A().c("Error updating daily counts. appId", v3.s(str), e2);
                if (0 != 0) {
                    cursor.close();
                }
                return fVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d0: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d0 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle z0(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.d()
            r7.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.t()     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r2 != 0) goto L2e
            com.google.android.gms.measurement.internal.v3 r8 = r7.zzq()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.x3 r8 = r8.I()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r1.close()
            return r0
        L2e:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            e.c.b.b.c.e.g1$a r3 = e.c.b.b.c.e.g1.Y()     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            e.c.b.b.c.e.a9 r2 = com.google.android.gms.measurement.internal.z9.x(r3, r2)     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            e.c.b.b.c.e.g1$a r2 = (e.c.b.b.c.e.g1.a) r2     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            e.c.b.b.c.e.b9 r2 = r2.zzy()     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            e.c.b.b.c.e.o7 r2 = (e.c.b.b.c.e.o7) r2     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            e.c.b.b.c.e.g1 r2 = (e.c.b.b.c.e.g1) r2     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r7.j()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            java.util.List r8 = r2.z()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
        L54:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r3 == 0) goto L9c
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            e.c.b.b.c.e.i1 r3 = (e.c.b.b.c.e.i1) r3     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            java.lang.String r4 = r3.J()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            boolean r5 = r3.X()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r5 == 0) goto L72
            double r5 = r3.Y()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            goto L54
        L72:
            boolean r5 = r3.V()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r5 == 0) goto L80
            float r3 = r3.W()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            goto L54
        L80:
            boolean r5 = r3.O()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r5 == 0) goto L8e
            java.lang.String r3 = r3.P()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            goto L54
        L8e:
            boolean r5 = r3.T()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r5 == 0) goto L54
            long r5 = r3.U()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            goto L54
        L9c:
            r1.close()
            return r2
        La0:
            r2 = move-exception
            com.google.android.gms.measurement.internal.v3 r3 = r7.zzq()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.x3 r3 = r3.A()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.v3.s(r8)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r3.c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r1.close()
            return r0
        Lb6:
            r8 = move-exception
            goto Lbc
        Lb8:
            r8 = move-exception
            goto Ld1
        Lba:
            r8 = move-exception
            r1 = r0
        Lbc:
            com.google.android.gms.measurement.internal.v3 r2 = r7.zzq()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.x3 r2 = r2.A()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> Lcf
            if (r1 == 0) goto Lce
            r1.close()
        Lce:
            return r0
        Lcf:
            r8 = move-exception
            r0 = r1
        Ld1:
            if (r0 == 0) goto Ld6
            r0.close()
        Ld6:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.z0(java.lang.String):android.os.Bundle");
    }
}