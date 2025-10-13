package androidx.work.impl;

import android.content.Context;
import android.os.Build;

/* compiled from: WorkDatabaseMigrations.java */
/* loaded from: classes.dex */
public class g {
    public static androidx.room.b1.a a = new a(1, 2);

    /* renamed from: b, reason: collision with root package name */
    public static androidx.room.b1.a f2218b = new b(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static androidx.room.b1.a f2219c = new c(4, 5);

    /* compiled from: WorkDatabaseMigrations.java */
    static class a extends androidx.room.b1.a {
        a(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.b1.a
        public void a(c.r.a.b bVar) {
            bVar.p("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.p("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.p("DROP TABLE IF EXISTS alarmInfo");
            bVar.p("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    static class b extends androidx.room.b1.a {
        b(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.b1.a
        public void a(c.r.a.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.p("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    static class c extends androidx.room.b1.a {
        c(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.b1.a
        public void a(c.r.a.b bVar) {
            bVar.p("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.p("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    public static class d extends androidx.room.b1.a {

        /* renamed from: c, reason: collision with root package name */
        final Context f2220c;

        public d(Context context, int i2, int i3) {
            super(i2, i3);
            this.f2220c = context;
        }

        @Override // androidx.room.b1.a
        public void a(c.r.a.b bVar) {
            new androidx.work.impl.utils.e(this.f2220c).c(true);
        }
    }
}