package com.parizene.netmonitor.db;

import androidx.room.b0;
import androidx.room.c1.g;
import androidx.room.i0;
import androidx.room.q0;
import androidx.room.t0;
import c.r.a.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile com.parizene.netmonitor.db.a t;
    private volatile g u;
    private volatile e v;
    private volatile c w;

    class a extends t0.a {
        a(int i2) {
            super(i2);
        }

        @Override // androidx.room.t0.a
        public void a(c.r.a.b bVar) {
            bVar.p("CREATE TABLE IF NOT EXISTS `cell` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mcc` TEXT NOT NULL, `mnc` TEXT NOT NULL, `lac` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `psc` INTEGER NOT NULL, `cdma_latitude` INTEGER NOT NULL, `cdma_longitude` INTEGER NOT NULL, `was_current` INTEGER NOT NULL, `last_mentioned` INTEGER NOT NULL, `network_type` INTEGER NOT NULL, `channel` INTEGER NOT NULL, `flags` INTEGER NOT NULL)");
            bVar.p("CREATE UNIQUE INDEX IF NOT EXISTS `cell_search` ON `cell` (`mcc`, `mnc`, `lac`, `cid`)");
            bVar.p("CREATE TABLE IF NOT EXISTS `log` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cell_id` INTEGER NOT NULL, `change_type` INTEGER NOT NULL, `dbm` INTEGER NOT NULL, `gps_lat` INTEGER NOT NULL, `gps_lon` INTEGER NOT NULL, `gps_acc` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, FOREIGN KEY(`cell_id`) REFERENCES `cell`(`_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            bVar.p("CREATE INDEX IF NOT EXISTS `log_search` ON `log` (`cell_id`)");
            bVar.p("CREATE TABLE IF NOT EXISTS `geolocation` (`mcc` INTEGER NOT NULL, `mnc` INTEGER NOT NULL, `lac` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `latitude` INTEGER NOT NULL, `longitude` INTEGER NOT NULL, `accuracy` INTEGER NOT NULL, `info` TEXT, `status` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `source` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`mcc`, `mnc`, `lac`, `cid`))");
            bVar.p("CREATE UNIQUE INDEX IF NOT EXISTS `geolocation_search` ON `geolocation` (`mcc`, `mnc`, `lac`, `cid`)");
            bVar.p("CREATE TABLE IF NOT EXISTS `clf` (`mcc` TEXT NOT NULL, `mnc` TEXT NOT NULL, `lac` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `latitude` INTEGER NOT NULL, `longitude` INTEGER NOT NULL, `info` TEXT, PRIMARY KEY(`mcc`, `mnc`, `lac`, `cid`))");
            bVar.p("CREATE UNIQUE INDEX IF NOT EXISTS `clf_search` ON `clf` (`mcc`, `mnc`, `lac`, `cid`)");
            bVar.p("CREATE INDEX IF NOT EXISTS `clf_search_without_lac` ON `clf` (`mcc`, `mnc`, `cid`)");
            bVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a5b237ebb13bd3644e53ef9de48b1c8b')");
        }

        @Override // androidx.room.t0.a
        public void b(c.r.a.b bVar) {
            bVar.p("DROP TABLE IF EXISTS `cell`");
            bVar.p("DROP TABLE IF EXISTS `log`");
            bVar.p("DROP TABLE IF EXISTS `geolocation`");
            bVar.p("DROP TABLE IF EXISTS `clf`");
            if (((q0) AppDatabase_Impl.this).f1914h != null) {
                int size = ((q0) AppDatabase_Impl.this).f1914h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((q0.b) ((q0) AppDatabase_Impl.this).f1914h.get(i2)).b(bVar);
                }
            }
        }

        @Override // androidx.room.t0.a
        protected void c(c.r.a.b bVar) {
            if (((q0) AppDatabase_Impl.this).f1914h != null) {
                int size = ((q0) AppDatabase_Impl.this).f1914h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((q0.b) ((q0) AppDatabase_Impl.this).f1914h.get(i2)).a(bVar);
                }
            }
        }

        @Override // androidx.room.t0.a
        public void d(c.r.a.b bVar) {
            ((q0) AppDatabase_Impl.this).a = bVar;
            bVar.p("PRAGMA foreign_keys = ON");
            AppDatabase_Impl.this.u(bVar);
            if (((q0) AppDatabase_Impl.this).f1914h != null) {
                int size = ((q0) AppDatabase_Impl.this).f1914h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((q0.b) ((q0) AppDatabase_Impl.this).f1914h.get(i2)).c(bVar);
                }
            }
        }

        @Override // androidx.room.t0.a
        public void e(c.r.a.b bVar) {
        }

        @Override // androidx.room.t0.a
        public void f(c.r.a.b bVar) {
            androidx.room.c1.c.a(bVar);
        }

        @Override // androidx.room.t0.a
        protected t0.b g(c.r.a.b bVar) {
            HashMap map = new HashMap(13);
            map.put("_id", new g.a("_id", "INTEGER", true, 1, null, 1));
            map.put("mcc", new g.a("mcc", "TEXT", true, 0, null, 1));
            map.put("mnc", new g.a("mnc", "TEXT", true, 0, null, 1));
            map.put("lac", new g.a("lac", "INTEGER", true, 0, null, 1));
            map.put("cid", new g.a("cid", "INTEGER", true, 0, null, 1));
            map.put("psc", new g.a("psc", "INTEGER", true, 0, null, 1));
            map.put("cdma_latitude", new g.a("cdma_latitude", "INTEGER", true, 0, null, 1));
            map.put("cdma_longitude", new g.a("cdma_longitude", "INTEGER", true, 0, null, 1));
            map.put("was_current", new g.a("was_current", "INTEGER", true, 0, null, 1));
            map.put("last_mentioned", new g.a("last_mentioned", "INTEGER", true, 0, null, 1));
            map.put("network_type", new g.a("network_type", "INTEGER", true, 0, null, 1));
            map.put("channel", new g.a("channel", "INTEGER", true, 0, null, 1));
            map.put("flags", new g.a("flags", "INTEGER", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new g.d("cell_search", true, Arrays.asList("mcc", "mnc", "lac", "cid")));
            androidx.room.c1.g gVar = new androidx.room.c1.g("cell", map, hashSet, hashSet2);
            androidx.room.c1.g gVarA = androidx.room.c1.g.a(bVar, "cell");
            if (!gVar.equals(gVarA)) {
                return new t0.b(false, "cell(com.parizene.netmonitor.db.celllog.model.CellEntity).\n Expected:\n" + gVar + "\n Found:\n" + gVarA);
            }
            HashMap map2 = new HashMap(8);
            map2.put("_id", new g.a("_id", "INTEGER", true, 1, null, 1));
            map2.put("cell_id", new g.a("cell_id", "INTEGER", true, 0, null, 1));
            map2.put("change_type", new g.a("change_type", "INTEGER", true, 0, null, 1));
            map2.put("dbm", new g.a("dbm", "INTEGER", true, 0, null, 1));
            map2.put("gps_lat", new g.a("gps_lat", "INTEGER", true, 0, null, 1));
            map2.put("gps_lon", new g.a("gps_lon", "INTEGER", true, 0, null, 1));
            map2.put("gps_acc", new g.a("gps_acc", "INTEGER", true, 0, null, 1));
            map2.put("timestamp", new g.a("timestamp", "INTEGER", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new g.b("cell", "CASCADE", "NO ACTION", Arrays.asList("cell_id"), Arrays.asList("_id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new g.d("log_search", false, Arrays.asList("cell_id")));
            androidx.room.c1.g gVar2 = new androidx.room.c1.g("log", map2, hashSet3, hashSet4);
            androidx.room.c1.g gVarA2 = androidx.room.c1.g.a(bVar, "log");
            if (!gVar2.equals(gVarA2)) {
                return new t0.b(false, "log(com.parizene.netmonitor.db.celllog.model.LogEntity).\n Expected:\n" + gVar2 + "\n Found:\n" + gVarA2);
            }
            HashMap map3 = new HashMap(11);
            map3.put("mcc", new g.a("mcc", "INTEGER", true, 1, null, 1));
            map3.put("mnc", new g.a("mnc", "INTEGER", true, 2, null, 1));
            map3.put("lac", new g.a("lac", "INTEGER", true, 3, null, 1));
            map3.put("cid", new g.a("cid", "INTEGER", true, 4, null, 1));
            map3.put("latitude", new g.a("latitude", "INTEGER", true, 0, null, 1));
            map3.put("longitude", new g.a("longitude", "INTEGER", true, 0, null, 1));
            map3.put("accuracy", new g.a("accuracy", "INTEGER", true, 0, null, 1));
            map3.put("info", new g.a("info", "TEXT", false, 0, null, 1));
            map3.put("status", new g.a("status", "INTEGER", true, 0, null, 1));
            map3.put("timestamp", new g.a("timestamp", "INTEGER", true, 0, null, 1));
            map3.put("source", new g.a("source", "INTEGER", true, 0, "0", 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new g.d("geolocation_search", true, Arrays.asList("mcc", "mnc", "lac", "cid")));
            androidx.room.c1.g gVar3 = new androidx.room.c1.g("geolocation", map3, hashSet5, hashSet6);
            androidx.room.c1.g gVarA3 = androidx.room.c1.g.a(bVar, "geolocation");
            if (!gVar3.equals(gVarA3)) {
                return new t0.b(false, "geolocation(com.parizene.netmonitor.db.celllog.model.GeolocationEntity).\n Expected:\n" + gVar3 + "\n Found:\n" + gVarA3);
            }
            HashMap map4 = new HashMap(7);
            map4.put("mcc", new g.a("mcc", "TEXT", true, 1, null, 1));
            map4.put("mnc", new g.a("mnc", "TEXT", true, 2, null, 1));
            map4.put("lac", new g.a("lac", "INTEGER", true, 3, null, 1));
            map4.put("cid", new g.a("cid", "INTEGER", true, 4, null, 1));
            map4.put("latitude", new g.a("latitude", "INTEGER", true, 0, null, 1));
            map4.put("longitude", new g.a("longitude", "INTEGER", true, 0, null, 1));
            map4.put("info", new g.a("info", "TEXT", false, 0, null, 1));
            HashSet hashSet7 = new HashSet(0);
            HashSet hashSet8 = new HashSet(2);
            hashSet8.add(new g.d("clf_search", true, Arrays.asList("mcc", "mnc", "lac", "cid")));
            hashSet8.add(new g.d("clf_search_without_lac", false, Arrays.asList("mcc", "mnc", "cid")));
            androidx.room.c1.g gVar4 = new androidx.room.c1.g("clf", map4, hashSet7, hashSet8);
            androidx.room.c1.g gVarA4 = androidx.room.c1.g.a(bVar, "clf");
            if (gVar4.equals(gVarA4)) {
                return new t0.b(true, null);
            }
            return new t0.b(false, "clf(com.parizene.netmonitor.db.celllog.model.ClfEntity).\n Expected:\n" + gVar4 + "\n Found:\n" + gVarA4);
        }
    }

    @Override // com.parizene.netmonitor.db.AppDatabase
    public com.parizene.netmonitor.db.a F() {
        com.parizene.netmonitor.db.a aVar;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new b(this);
            }
            aVar = this.t;
        }
        return aVar;
    }

    @Override // com.parizene.netmonitor.db.AppDatabase
    public c G() {
        c cVar;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            if (this.w == null) {
                this.w = new d(this);
            }
            cVar = this.w;
        }
        return cVar;
    }

    @Override // com.parizene.netmonitor.db.AppDatabase
    public e H() {
        e eVar;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            if (this.v == null) {
                this.v = new f(this);
            }
            eVar = this.v;
        }
        return eVar;
    }

    @Override // com.parizene.netmonitor.db.AppDatabase
    public g J() {
        g gVar;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            if (this.u == null) {
                this.u = new h(this);
            }
            gVar = this.u;
        }
        return gVar;
    }

    @Override // androidx.room.q0
    protected i0 f() {
        return new i0(this, new HashMap(0), new HashMap(0), "cell", "log", "geolocation", "clf");
    }

    @Override // androidx.room.q0
    protected c.r.a.c g(b0 b0Var) {
        return b0Var.a.a(c.b.a(b0Var.f1797b).c(b0Var.f1798c).b(new t0(b0Var, new a(7), "a5b237ebb13bd3644e53ef9de48b1c8b", "5012f34feb7951f8c968e966ce02c334")).a());
    }

    @Override // androidx.room.q0
    protected Map<Class<?>, List<Class<?>>> n() {
        HashMap map = new HashMap();
        map.put(com.parizene.netmonitor.db.a.class, b.r());
        map.put(g.class, h.h());
        map.put(e.class, f.h());
        map.put(c.class, d.m());
        return map;
    }
}