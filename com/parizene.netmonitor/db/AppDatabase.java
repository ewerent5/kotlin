package com.parizene.netmonitor.db;

import android.content.Context;
import androidx.room.p0;
import androidx.room.q0;

/* loaded from: classes.dex */
public abstract class AppDatabase extends q0 {
    private static final androidx.room.b1.a n = new a(1, 2);
    private static final androidx.room.b1.a o = new b(2, 3);
    private static final androidx.room.b1.a p = new c(3, 4);
    private static final androidx.room.b1.a q = new d(5, 6);
    private static final androidx.room.b1.a r = new e(6, 7);
    private static final q0.b s = new f();

    class a extends androidx.room.b1.a {
        a(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.b1.a
        public void a(c.r.a.b bVar) {
        }
    }

    class b extends androidx.room.b1.a {
        b(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.b1.a
        public void a(c.r.a.b bVar) {
            bVar.k();
            try {
                bVar.p("DROP TABLE IF EXISTS cell_table");
                bVar.p("CREATE TABLE cell_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, mcc TEXT, mnc_sid TEXT, lac_nid INTEGER DEFAULT -1, cid_bid INTEGER DEFAULT -1, rnc_lat INTEGER, psc_lon INTEGER, cell_lat INTEGER, cell_lon INTEGER, location_src INTEGER, cell_info TEXT, info_src INTEGER, was_current INTEGER, last_mentioned INTEGER, network_type INTEGER DEFAULT 0)");
                bVar.p("INSERT INTO cell_table DEFAULT VALUES");
                bVar.p("DROP TABLE IF EXISTS log_table");
                bVar.p("CREATE TABLE log_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, cell_id INTEGER, change_type INTEGER, dbm INTEGER, gps_lat INTEGER, gps_lon INTEGER, gps_acc INTEGER, timestamp INTEGER)");
                bVar.S();
            } finally {
                bVar.i0();
            }
        }
    }

    class c extends androidx.room.b1.a {
        c(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.b1.a
        public void a(c.r.a.b bVar) {
            bVar.p("ALTER TABLE cell_table ADD network_type INTEGER DEFAULT 0");
        }
    }

    class d extends androidx.room.b1.a {
        d(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.b1.a
        public void a(c.r.a.b bVar) {
            bVar.p("CREATE TRIGGER delete_from_cell AFTER DELETE ON cell FOR EACH ROW BEGIN DELETE FROM log WHERE cell_id = OLD._id; END");
            bVar.p("CREATE INDEX log_search ON log (cell_id)");
        }
    }

    class e extends androidx.room.b1.a {
        e(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.b1.a
        public void a(c.r.a.b bVar) {
            bVar.p("ALTER TABLE geolocation ADD source INTEGER NOT NULL DEFAULT 0");
        }
    }

    class f extends q0.b {
        f() {
        }

        @Override // androidx.room.q0.b
        public void a(c.r.a.b bVar) {
            bVar.p("INSERT INTO cell VALUES (1, '0', '0', 0, 0, -1, 0, 0, 0, 0, 0, -1, 0)");
            bVar.p("CREATE TRIGGER delete_from_cell AFTER DELETE ON cell FOR EACH ROW BEGIN DELETE FROM log WHERE cell_id = OLD._id; END");
        }
    }

    private static class g extends androidx.room.b1.a {

        /* renamed from: c, reason: collision with root package name */
        private Context f13024c;

        /* renamed from: d, reason: collision with root package name */
        private com.parizene.netmonitor.m0.d0.d f13025d;

        /* renamed from: e, reason: collision with root package name */
        private f.a<com.google.firebase.crashlytics.c> f13026e;

        public g(Context context, com.parizene.netmonitor.m0.d0.d dVar, f.a<com.google.firebase.crashlytics.c> aVar) {
            super(4, 5);
            this.f13024c = context;
            this.f13025d = dVar;
            this.f13026e = aVar;
        }

        private void b(c.r.a.b bVar) {
            bVar.p("CREATE TABLE geolocation (mcc INTEGER NOT NULL, mnc INTEGER NOT NULL, lac INTEGER NOT NULL, cid INTEGER NOT NULL, latitude INTEGER NOT NULL DEFAULT 0, longitude INTEGER NOT NULL DEFAULT 0, accuracy INTEGER NOT NULL DEFAULT 0, info TEXT DEFAULT NULL, status INTEGER NOT NULL DEFAULT 0, timestamp INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (mcc, mnc, lac, cid))");
            bVar.p("CREATE UNIQUE INDEX geolocation_search ON geolocation (mcc, mnc, lac, cid)");
            bVar.p("CREATE TABLE clf (mcc TEXT NOT NULL, mnc TEXT NOT NULL, lac INTEGER NOT NULL, cid INTEGER NOT NULL, latitude INTEGER NOT NULL DEFAULT 0, longitude INTEGER NOT NULL DEFAULT 0, info TEXT DEFAULT NULL, PRIMARY KEY (mcc, mnc, lac, cid))");
            bVar.p("CREATE UNIQUE INDEX clf_search ON clf (mcc, mnc, lac, cid)");
            bVar.p("CREATE INDEX clf_search_without_lac ON clf (mcc, mnc, cid)");
            bVar.p("CREATE TABLE cell (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mcc TEXT NOT NULL, mnc TEXT NOT NULL, lac INTEGER NOT NULL, cid INTEGER NOT NULL, psc INTEGER NOT NULL DEFAULT -1, cdma_latitude INTEGER NOT NULL DEFAULT 0, cdma_longitude INTEGER NOT NULL DEFAULT 0, was_current INTEGER NOT NULL, last_mentioned INTEGER NOT NULL, network_type INTEGER NOT NULL, channel INTEGER NOT NULL DEFAULT -1, flags INTEGER NOT NULL DEFAULT 0, UNIQUE(mcc, mnc, lac, cid) ON CONFLICT REPLACE)");
            bVar.p("CREATE UNIQUE INDEX cell_search ON cell (mcc, mnc, lac, cid)");
            bVar.p("INSERT INTO cell VALUES (1, '0', '0', 0, 0, -1, 0, 0, 0, 0, 0, -1, 0)");
            bVar.p("CREATE TABLE log (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, cell_id INTEGER NOT NULL, change_type INTEGER NOT NULL, dbm INTEGER NOT NULL, gps_lat INTEGER NOT NULL, gps_lon INTEGER NOT NULL, gps_acc INTEGER NOT NULL, timestamp INTEGER NOT NULL, FOREIGN KEY(cell_id) REFERENCES cell(_id) ON DELETE CASCADE)");
        }

        private void c(c.r.a.b bVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT OR REPLACE INTO cell (_id, mcc, mnc, lac, cid, psc, was_current, last_mentioned, network_type) SELECT _id, mcc, mnc_sid, lac_nid, cid_bid, psc_lon, was_current, last_mentioned, network_type FROM cell_table WHERE ((network_type=0 AND 1=");
            sb.append(this.f13025d.u() == 1 ? 1 : 0);
            sb.append(") OR network_type=1 OR network_type=2 OR network_type=3)");
            bVar.p(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("INSERT OR REPLACE INTO cell (_id, mcc, mnc, lac, cid, cdma_latitude, cdma_longitude, was_current, last_mentioned, network_type) SELECT _id, mcc, mnc_sid, lac_nid, cid_bid, rnc_lat, psc_lon, was_current, last_mentioned, network_type FROM cell_table WHERE ((network_type=0 AND 1=");
            sb2.append(this.f13025d.u() == 2 ? 1 : 0);
            sb2.append(") OR network_type=4)");
            bVar.p(sb2.toString());
            bVar.p("DROP TABLE cell_table");
        }

        private void d(c.r.a.b bVar) {
            bVar.p("INSERT INTO log (_id, cell_id, change_type, dbm, gps_lat, gps_lon, gps_acc, timestamp) SELECT _id, cell_id, change_type, dbm, gps_lat, gps_lon, gps_acc, timestamp FROM log_table");
            bVar.p("DROP TABLE log_table");
        }

        private void e(c.r.a.b bVar) {
            bVar.p("INSERT OR REPLACE INTO clf (mcc, mnc, lac, cid, latitude, longitude, info) SELECT mcc, mnc_sid, lac_nid, cid_bid, cell_lat, cell_lon, cell_info FROM cell_table WHERE location_src=1 AND info_src=1");
            bVar.p("INSERT OR REPLACE INTO clf (mcc, mnc, lac, cid, latitude, longitude) SELECT mcc, mnc_sid, lac_nid, cid_bid, cell_lat, cell_lon FROM cell_table WHERE location_src=1 AND info_src<>1");
            bVar.p("INSERT OR REPLACE INTO clf (mcc, mnc, lac, cid, info) SELECT mcc, mnc_sid, lac_nid, cid_bid, cell_info FROM cell_table WHERE location_src<>1 AND info_src=1");
        }

        private void f(c.r.a.b bVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT OR REPLACE INTO geolocation (mcc, mnc, lac, cid, latitude, longitude, info) SELECT CAST(mcc AS INTEGER), CAST(mnc_sid AS INTEGER), lac_nid, cid_bid | (rnc_lat << 16), cell_lat, cell_lon, cell_info FROM cell_table WHERE location_src=2 AND info_src=2 AND ((network_type=0 AND 1=");
            sb.append(this.f13025d.u() == 1 ? 1 : 0);
            sb.append(") OR network_type=1 OR network_type=2 OR network_type=3)");
            bVar.p(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("INSERT OR REPLACE INTO geolocation (mcc, mnc, lac, cid, latitude, longitude) SELECT CAST(mcc AS INTEGER), CAST(mnc_sid AS INTEGER), lac_nid, cid_bid | (rnc_lat << 16), cell_lat, cell_lon FROM cell_table WHERE location_src=2 AND info_src<>2 AND ((network_type=0 AND 1=");
            sb2.append(this.f13025d.u() == 1 ? 1 : 0);
            sb2.append(") OR network_type=1 OR network_type=2 OR network_type=3)");
            bVar.p(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("INSERT OR REPLACE INTO geolocation (mcc, mnc, lac, cid, info) SELECT CAST(mcc AS INTEGER), CAST(mnc_sid AS INTEGER), lac_nid, cid_bid | (rnc_lat << 16), cell_info FROM cell_table WHERE location_src<>2 AND info_src=2 AND ((network_type=0 AND 1=");
            sb3.append(this.f13025d.u() == 1 ? 1 : 0);
            sb3.append(") OR network_type=1 OR network_type=2 OR network_type=3)");
            bVar.p(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("INSERT OR REPLACE INTO geolocation (mcc, mnc, lac, cid, latitude, longitude, info) SELECT CAST(mcc AS INTEGER), CAST(mnc_sid AS INTEGER), lac_nid, cid_bid, cell_lat, cell_lon, cell_info FROM cell_table WHERE location_src=2 AND info_src=2 AND ((network_type=0 AND 1=");
            sb4.append(this.f13025d.u() == 2 ? 1 : 0);
            sb4.append(") OR network_type=4)");
            bVar.p(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("INSERT OR REPLACE INTO geolocation (mcc, mnc, lac, cid, latitude, longitude) SELECT CAST(mcc AS INTEGER), CAST(mnc_sid AS INTEGER), lac_nid, cid_bid, cell_lat, cell_lon FROM cell_table WHERE location_src=2 AND info_src<>2 AND ((network_type=0 AND 1=");
            sb5.append(this.f13025d.u() == 2 ? 1 : 0);
            sb5.append(") OR network_type=4)");
            bVar.p(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("INSERT OR REPLACE INTO geolocation (mcc, mnc, lac, cid, info) SELECT CAST(mcc AS INTEGER), CAST(mnc_sid AS INTEGER), lac_nid, cid_bid, cell_info FROM cell_table WHERE location_src<>2 AND info_src=2 AND ((network_type=0 AND 1=");
            sb6.append(this.f13025d.u() == 2 ? 1 : 0);
            sb6.append(") OR network_type=4)");
            bVar.p(sb6.toString());
        }

        @Override // androidx.room.b1.a
        public void a(c.r.a.b bVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            bVar.k();
            try {
                try {
                    b(bVar);
                    bVar.p("DELETE FROM cell_table WHERE mcc IS NULL OR mnc_sid IS NULL OR CAST(mcc AS INTEGER) IS NULL OR CAST(mnc_sid AS INTEGER) IS NULL OR lac_nid=65535");
                    StringBuilder sb = new StringBuilder();
                    sb.append("UPDATE cell_table SET rnc_lat=0 WHERE (rnc_lat < 0 OR rnc_lat > 4095) AND ((network_type=0 AND 1=");
                    sb.append(this.f13025d.u() == 1 ? 1 : 0);
                    sb.append(") OR network_type=1 OR network_type=2 OR network_type=3)");
                    bVar.p(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("UPDATE cell_table SET network_type=2, cid_bid = cid_bid | (rnc_lat << 16) WHERE rnc_lat > 0 AND ((network_type=0 AND 1=");
                    sb2.append(this.f13025d.u() == 1 ? 1 : 0);
                    sb2.append(") OR network_type=1 OR network_type=2 OR network_type=3)");
                    bVar.p(sb2.toString());
                    bVar.p("UPDATE cell_table SET cell_info=NULL WHERE cell_info=''");
                    e(bVar);
                    f(bVar);
                    c(bVar);
                    d(bVar);
                    bVar.S();
                } catch (Exception e2) {
                    m.a.a.g(e2);
                    this.f13026e.get().c(e2);
                    this.f13024c.getDatabasePath("cell_log.db").delete();
                }
                bVar.i0();
                this.f13024c.getDatabasePath("import_cell.db").delete();
                m.a.a.a("time=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Throwable th) {
                bVar.i0();
                this.f13024c.getDatabasePath("import_cell.db").delete();
                throw th;
            }
        }
    }

    public static AppDatabase I(Context context, com.parizene.netmonitor.m0.d0.d dVar, f.a<com.google.firebase.crashlytics.c> aVar) {
        return (AppDatabase) p0.a(context, AppDatabase.class, "cell_log.db").b(n, o, p, new g(context, dVar, aVar), q, r).a(s).d();
    }

    public abstract com.parizene.netmonitor.db.a F();

    public abstract com.parizene.netmonitor.db.c G();

    public abstract com.parizene.netmonitor.db.e H();

    public abstract com.parizene.netmonitor.db.g J();
}