package androidx.work.impl;

import androidx.room.b0;
import androidx.room.c1.g;
import androidx.room.i0;
import androidx.room.q0;
import androidx.room.t0;
import androidx.work.impl.l.k;
import androidx.work.impl.l.l;
import androidx.work.impl.l.n;
import androidx.work.impl.l.o;
import c.r.a.c;
import ch.qos.logback.core.joran.action.Action;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile k o;
    private volatile androidx.work.impl.l.b p;
    private volatile n q;
    private volatile androidx.work.impl.l.e r;
    private volatile androidx.work.impl.l.h s;

    class a extends t0.a {
        a(int i2) {
            super(i2);
        }

        @Override // androidx.room.t0.a
        public void a(c.r.a.b bVar) {
            bVar.p("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.p("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.p("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.p("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.p("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.p("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.p("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.p("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.p("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.p("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c84d23ade98552f1cec71088c1f0794c')");
        }

        @Override // androidx.room.t0.a
        public void b(c.r.a.b bVar) {
            bVar.p("DROP TABLE IF EXISTS `Dependency`");
            bVar.p("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.p("DROP TABLE IF EXISTS `WorkTag`");
            bVar.p("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.p("DROP TABLE IF EXISTS `WorkName`");
        }

        @Override // androidx.room.t0.a
        protected void c(c.r.a.b bVar) {
            if (((q0) WorkDatabase_Impl.this).f1914h != null) {
                int size = ((q0) WorkDatabase_Impl.this).f1914h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((q0.b) ((q0) WorkDatabase_Impl.this).f1914h.get(i2)).a(bVar);
                }
            }
        }

        @Override // androidx.room.t0.a
        public void d(c.r.a.b bVar) {
            ((q0) WorkDatabase_Impl.this).a = bVar;
            bVar.p("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.u(bVar);
            if (((q0) WorkDatabase_Impl.this).f1914h != null) {
                int size = ((q0) WorkDatabase_Impl.this).f1914h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((q0.b) ((q0) WorkDatabase_Impl.this).f1914h.get(i2)).c(bVar);
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
        protected void h(c.r.a.b bVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1));
            map.put("prerequisite_id", new g.a("prerequisite_id", "TEXT", true, 2));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new g.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new g.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            androidx.room.c1.g gVar = new androidx.room.c1.g("Dependency", map, hashSet, hashSet2);
            androidx.room.c1.g gVarA = androidx.room.c1.g.a(bVar, "Dependency");
            if (!gVar.equals(gVarA)) {
                throw new IllegalStateException("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar + "\n Found:\n" + gVarA);
            }
            HashMap map2 = new HashMap(23);
            map2.put("id", new g.a("id", "TEXT", true, 1));
            map2.put("state", new g.a("state", "INTEGER", true, 0));
            map2.put("worker_class_name", new g.a("worker_class_name", "TEXT", true, 0));
            map2.put("input_merger_class_name", new g.a("input_merger_class_name", "TEXT", false, 0));
            map2.put("input", new g.a("input", "BLOB", true, 0));
            map2.put("output", new g.a("output", "BLOB", true, 0));
            map2.put("initial_delay", new g.a("initial_delay", "INTEGER", true, 0));
            map2.put("interval_duration", new g.a("interval_duration", "INTEGER", true, 0));
            map2.put("flex_duration", new g.a("flex_duration", "INTEGER", true, 0));
            map2.put("run_attempt_count", new g.a("run_attempt_count", "INTEGER", true, 0));
            map2.put("backoff_policy", new g.a("backoff_policy", "INTEGER", true, 0));
            map2.put("backoff_delay_duration", new g.a("backoff_delay_duration", "INTEGER", true, 0));
            map2.put("period_start_time", new g.a("period_start_time", "INTEGER", true, 0));
            map2.put("minimum_retention_duration", new g.a("minimum_retention_duration", "INTEGER", true, 0));
            map2.put("schedule_requested_at", new g.a("schedule_requested_at", "INTEGER", true, 0));
            map2.put("required_network_type", new g.a("required_network_type", "INTEGER", false, 0));
            map2.put("requires_charging", new g.a("requires_charging", "INTEGER", true, 0));
            map2.put("requires_device_idle", new g.a("requires_device_idle", "INTEGER", true, 0));
            map2.put("requires_battery_not_low", new g.a("requires_battery_not_low", "INTEGER", true, 0));
            map2.put("requires_storage_not_low", new g.a("requires_storage_not_low", "INTEGER", true, 0));
            map2.put("trigger_content_update_delay", new g.a("trigger_content_update_delay", "INTEGER", true, 0));
            map2.put("trigger_max_content_delay", new g.a("trigger_max_content_delay", "INTEGER", true, 0));
            map2.put("content_uri_triggers", new g.a("content_uri_triggers", "BLOB", false, 0));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new g.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            androidx.room.c1.g gVar2 = new androidx.room.c1.g("WorkSpec", map2, hashSet3, hashSet4);
            androidx.room.c1.g gVarA2 = androidx.room.c1.g.a(bVar, "WorkSpec");
            if (!gVar2.equals(gVarA2)) {
                throw new IllegalStateException("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar2 + "\n Found:\n" + gVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new g.a("tag", "TEXT", true, 1));
            map3.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new g.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            androidx.room.c1.g gVar3 = new androidx.room.c1.g("WorkTag", map3, hashSet5, hashSet6);
            androidx.room.c1.g gVarA3 = androidx.room.c1.g.a(bVar, "WorkTag");
            if (!gVar3.equals(gVarA3)) {
                throw new IllegalStateException("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar3 + "\n Found:\n" + gVarA3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1));
            map4.put("system_id", new g.a("system_id", "INTEGER", true, 0));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            androidx.room.c1.g gVar4 = new androidx.room.c1.g("SystemIdInfo", map4, hashSet7, new HashSet(0));
            androidx.room.c1.g gVarA4 = androidx.room.c1.g.a(bVar, "SystemIdInfo");
            if (!gVar4.equals(gVarA4)) {
                throw new IllegalStateException("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar4 + "\n Found:\n" + gVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put(Action.NAME_ATTRIBUTE, new g.a(Action.NAME_ATTRIBUTE, "TEXT", true, 1));
            map5.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new g.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            androidx.room.c1.g gVar5 = new androidx.room.c1.g("WorkName", map5, hashSet8, hashSet9);
            androidx.room.c1.g gVarA5 = androidx.room.c1.g.a(bVar, "WorkName");
            if (gVar5.equals(gVarA5)) {
                return;
            }
            throw new IllegalStateException("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar5 + "\n Found:\n" + gVarA5);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.l.b G() {
        androidx.work.impl.l.b bVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new androidx.work.impl.l.c(this);
            }
            bVar = this.p;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.l.e K() {
        androidx.work.impl.l.e eVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new androidx.work.impl.l.f(this);
            }
            eVar = this.r;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.l.h L() {
        androidx.work.impl.l.h hVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new androidx.work.impl.l.i(this);
            }
            hVar = this.s;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k M() {
        k kVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new l(this);
            }
            kVar = this.o;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public n N() {
        n nVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new o(this);
            }
            nVar = this.q;
        }
        return nVar;
    }

    @Override // androidx.room.q0
    protected i0 f() {
        return new i0(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    @Override // androidx.room.q0
    protected c.r.a.c g(b0 b0Var) {
        return b0Var.a.a(c.b.a(b0Var.f1797b).c(b0Var.f1798c).b(new t0(b0Var, new a(6), "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14")).a());
    }
}