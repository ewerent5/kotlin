package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.e0;
import androidx.room.q0;
import androidx.room.u0;
import androidx.room.y0;
import androidx.work.impl.l.j;
import androidx.work.n;
import ch.qos.logback.classic.spi.CallerData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class l implements k {
    private final q0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f2318b;

    /* renamed from: c, reason: collision with root package name */
    private final y0 f2319c;

    /* renamed from: d, reason: collision with root package name */
    private final y0 f2320d;

    /* renamed from: e, reason: collision with root package name */
    private final y0 f2321e;

    /* renamed from: f, reason: collision with root package name */
    private final y0 f2322f;

    /* renamed from: g, reason: collision with root package name */
    private final y0 f2323g;

    /* renamed from: h, reason: collision with root package name */
    private final y0 f2324h;

    /* renamed from: i, reason: collision with root package name */
    private final y0 f2325i;

    /* renamed from: j, reason: collision with root package name */
    private final y0 f2326j;

    /* compiled from: WorkSpecDao_Impl.java */
    class a extends e0<j> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, j jVar) throws Throwable {
            String str = jVar.f2302c;
            if (str == null) {
                fVar.t0(1);
            } else {
                fVar.r(1, str);
            }
            fVar.R(2, p.h(jVar.f2303d));
            String str2 = jVar.f2304e;
            if (str2 == null) {
                fVar.t0(3);
            } else {
                fVar.r(3, str2);
            }
            String str3 = jVar.f2305f;
            if (str3 == null) {
                fVar.t0(4);
            } else {
                fVar.r(4, str3);
            }
            byte[] bArrK = androidx.work.e.k(jVar.f2306g);
            if (bArrK == null) {
                fVar.t0(5);
            } else {
                fVar.X(5, bArrK);
            }
            byte[] bArrK2 = androidx.work.e.k(jVar.f2307h);
            if (bArrK2 == null) {
                fVar.t0(6);
            } else {
                fVar.X(6, bArrK2);
            }
            fVar.R(7, jVar.f2308i);
            fVar.R(8, jVar.f2309j);
            fVar.R(9, jVar.f2310k);
            fVar.R(10, jVar.f2312m);
            fVar.R(11, p.a(jVar.n));
            fVar.R(12, jVar.o);
            fVar.R(13, jVar.p);
            fVar.R(14, jVar.q);
            fVar.R(15, jVar.r);
            androidx.work.c cVar = jVar.f2311l;
            if (cVar == null) {
                fVar.t0(16);
                fVar.t0(17);
                fVar.t0(18);
                fVar.t0(19);
                fVar.t0(20);
                fVar.t0(21);
                fVar.t0(22);
                fVar.t0(23);
                return;
            }
            fVar.R(16, p.g(cVar.b()));
            fVar.R(17, cVar.g() ? 1L : 0L);
            fVar.R(18, cVar.h() ? 1L : 0L);
            fVar.R(19, cVar.f() ? 1L : 0L);
            fVar.R(20, cVar.i() ? 1L : 0L);
            fVar.R(21, cVar.c());
            fVar.R(22, cVar.d());
            byte[] bArrC = p.c(cVar.a());
            if (bArrC == null) {
                fVar.t0(23);
            } else {
                fVar.X(23, bArrC);
            }
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class b extends y0 {
        b(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class c extends y0 {
        c(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class d extends y0 {
        d(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class e extends y0 {
        e(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class f extends y0 {
        f(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class g extends y0 {
        g(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class h extends y0 {
        h(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    class i extends y0 {
        i(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public l(q0 q0Var) {
        this.a = q0Var;
        this.f2318b = new a(q0Var);
        this.f2319c = new b(q0Var);
        this.f2320d = new c(q0Var);
        this.f2321e = new d(q0Var);
        this.f2322f = new e(q0Var);
        this.f2323g = new f(q0Var);
        this.f2324h = new g(q0Var);
        this.f2325i = new h(q0Var);
        this.f2326j = new i(q0Var);
    }

    @Override // androidx.work.impl.l.k
    public int a(n.a aVar, String... strArr) {
        this.a.b();
        StringBuilder sbB = androidx.room.c1.f.b();
        sbB.append("UPDATE workspec SET state=");
        sbB.append(CallerData.NA);
        sbB.append(" WHERE id IN (");
        androidx.room.c1.f.a(sbB, strArr.length);
        sbB.append(")");
        c.r.a.f fVarE = this.a.e(sbB.toString());
        fVarE.R(1, p.h(aVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                fVarE.t0(i2);
            } else {
                fVarE.r(i2, str);
            }
            i2++;
        }
        this.a.c();
        try {
            int iW = fVarE.w();
            this.a.D();
            return iW;
        } finally {
            this.a.h();
        }
    }

    @Override // androidx.work.impl.l.k
    public int b(String str, long j2) {
        this.a.b();
        c.r.a.f fVarA = this.f2324h.a();
        fVarA.R(1, j2);
        if (str == null) {
            fVarA.t0(2);
        } else {
            fVarA.r(2, str);
        }
        this.a.c();
        try {
            int iW = fVarA.w();
            this.a.D();
            return iW;
        } finally {
            this.a.h();
            this.f2324h.f(fVarA);
        }
    }

    @Override // androidx.work.impl.l.k
    public List<j.b> c(String str) {
        u0 u0VarD = u0.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        this.a.b();
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            int iE = androidx.room.c1.b.e(cursorB, "id");
            int iE2 = androidx.room.c1.b.e(cursorB, "state");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                j.b bVar = new j.b();
                bVar.a = cursorB.getString(iE);
                bVar.f2313b = p.f(cursorB.getInt(iE2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            cursorB.close();
            u0VarD.j();
        }
    }

    @Override // androidx.work.impl.l.k
    public List<j> d(int i2) throws Throwable {
        u0 u0Var;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        u0 u0VarD = u0.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        u0VarD.R(1, i2);
        this.a.b();
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            iE = androidx.room.c1.b.e(cursorB, "id");
            iE2 = androidx.room.c1.b.e(cursorB, "state");
            iE3 = androidx.room.c1.b.e(cursorB, "worker_class_name");
            iE4 = androidx.room.c1.b.e(cursorB, "input_merger_class_name");
            iE5 = androidx.room.c1.b.e(cursorB, "input");
            iE6 = androidx.room.c1.b.e(cursorB, "output");
            iE7 = androidx.room.c1.b.e(cursorB, "initial_delay");
            iE8 = androidx.room.c1.b.e(cursorB, "interval_duration");
            iE9 = androidx.room.c1.b.e(cursorB, "flex_duration");
            iE10 = androidx.room.c1.b.e(cursorB, "run_attempt_count");
            iE11 = androidx.room.c1.b.e(cursorB, "backoff_policy");
            iE12 = androidx.room.c1.b.e(cursorB, "backoff_delay_duration");
            iE13 = androidx.room.c1.b.e(cursorB, "period_start_time");
            iE14 = androidx.room.c1.b.e(cursorB, "minimum_retention_duration");
            u0Var = u0VarD;
        } catch (Throwable th) {
            th = th;
            u0Var = u0VarD;
        }
        try {
            int iE15 = androidx.room.c1.b.e(cursorB, "schedule_requested_at");
            int iE16 = androidx.room.c1.b.e(cursorB, "required_network_type");
            int i3 = iE14;
            int iE17 = androidx.room.c1.b.e(cursorB, "requires_charging");
            int i4 = iE13;
            int iE18 = androidx.room.c1.b.e(cursorB, "requires_device_idle");
            int i5 = iE12;
            int iE19 = androidx.room.c1.b.e(cursorB, "requires_battery_not_low");
            int i6 = iE11;
            int iE20 = androidx.room.c1.b.e(cursorB, "requires_storage_not_low");
            int i7 = iE10;
            int iE21 = androidx.room.c1.b.e(cursorB, "trigger_content_update_delay");
            int i8 = iE9;
            int iE22 = androidx.room.c1.b.e(cursorB, "trigger_max_content_delay");
            int i9 = iE8;
            int iE23 = androidx.room.c1.b.e(cursorB, "content_uri_triggers");
            int i10 = iE7;
            int i11 = iE6;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iE);
                int i12 = iE;
                String string2 = cursorB.getString(iE3);
                int i13 = iE3;
                androidx.work.c cVar = new androidx.work.c();
                int i14 = iE16;
                cVar.k(p.e(cursorB.getInt(iE16)));
                cVar.m(cursorB.getInt(iE17) != 0);
                cVar.n(cursorB.getInt(iE18) != 0);
                cVar.l(cursorB.getInt(iE19) != 0);
                cVar.o(cursorB.getInt(iE20) != 0);
                int i15 = iE17;
                int i16 = iE19;
                cVar.p(cursorB.getLong(iE21));
                cVar.q(cursorB.getLong(iE22));
                cVar.j(p.b(cursorB.getBlob(iE23)));
                j jVar = new j(string, string2);
                jVar.f2303d = p.f(cursorB.getInt(iE2));
                jVar.f2305f = cursorB.getString(iE4);
                jVar.f2306g = androidx.work.e.g(cursorB.getBlob(iE5));
                int i17 = i11;
                jVar.f2307h = androidx.work.e.g(cursorB.getBlob(i17));
                int i18 = iE18;
                int i19 = i10;
                jVar.f2308i = cursorB.getLong(i19);
                int i20 = iE4;
                int i21 = i9;
                int i22 = iE5;
                jVar.f2309j = cursorB.getLong(i21);
                int i23 = i8;
                jVar.f2310k = cursorB.getLong(i23);
                int i24 = i7;
                jVar.f2312m = cursorB.getInt(i24);
                int i25 = i6;
                i11 = i17;
                jVar.n = p.d(cursorB.getInt(i25));
                i7 = i24;
                i6 = i25;
                int i26 = i5;
                jVar.o = cursorB.getLong(i26);
                int i27 = i4;
                jVar.p = cursorB.getLong(i27);
                int i28 = i3;
                jVar.q = cursorB.getLong(i28);
                int i29 = iE15;
                jVar.r = cursorB.getLong(i29);
                jVar.f2311l = cVar;
                arrayList.add(jVar);
                i5 = i26;
                iE17 = i15;
                iE = i12;
                iE3 = i13;
                iE19 = i16;
                iE16 = i14;
                i10 = i19;
                i3 = i28;
                iE15 = i29;
                iE4 = i20;
                i4 = i27;
                iE5 = i22;
                i9 = i21;
                i8 = i23;
                iE18 = i18;
            }
            cursorB.close();
            u0Var.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            u0Var.j();
            throw th;
        }
    }

    @Override // androidx.work.impl.l.k
    public void e(String str) {
        this.a.b();
        c.r.a.f fVarA = this.f2319c.a();
        if (str == null) {
            fVarA.t0(1);
        } else {
            fVarA.r(1, str);
        }
        this.a.c();
        try {
            fVarA.w();
            this.a.D();
        } finally {
            this.a.h();
            this.f2319c.f(fVarA);
        }
    }

    @Override // androidx.work.impl.l.k
    public void f(j jVar) {
        this.a.b();
        this.a.c();
        try {
            this.f2318b.h(jVar);
            this.a.D();
        } finally {
            this.a.h();
        }
    }

    @Override // androidx.work.impl.l.k
    public List<j> g() throws Throwable {
        u0 u0Var;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        u0 u0VarD = u0.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            iE = androidx.room.c1.b.e(cursorB, "id");
            iE2 = androidx.room.c1.b.e(cursorB, "state");
            iE3 = androidx.room.c1.b.e(cursorB, "worker_class_name");
            iE4 = androidx.room.c1.b.e(cursorB, "input_merger_class_name");
            iE5 = androidx.room.c1.b.e(cursorB, "input");
            iE6 = androidx.room.c1.b.e(cursorB, "output");
            iE7 = androidx.room.c1.b.e(cursorB, "initial_delay");
            iE8 = androidx.room.c1.b.e(cursorB, "interval_duration");
            iE9 = androidx.room.c1.b.e(cursorB, "flex_duration");
            iE10 = androidx.room.c1.b.e(cursorB, "run_attempt_count");
            iE11 = androidx.room.c1.b.e(cursorB, "backoff_policy");
            iE12 = androidx.room.c1.b.e(cursorB, "backoff_delay_duration");
            iE13 = androidx.room.c1.b.e(cursorB, "period_start_time");
            iE14 = androidx.room.c1.b.e(cursorB, "minimum_retention_duration");
            u0Var = u0VarD;
        } catch (Throwable th) {
            th = th;
            u0Var = u0VarD;
        }
        try {
            int iE15 = androidx.room.c1.b.e(cursorB, "schedule_requested_at");
            int iE16 = androidx.room.c1.b.e(cursorB, "required_network_type");
            int i2 = iE14;
            int iE17 = androidx.room.c1.b.e(cursorB, "requires_charging");
            int i3 = iE13;
            int iE18 = androidx.room.c1.b.e(cursorB, "requires_device_idle");
            int i4 = iE12;
            int iE19 = androidx.room.c1.b.e(cursorB, "requires_battery_not_low");
            int i5 = iE11;
            int iE20 = androidx.room.c1.b.e(cursorB, "requires_storage_not_low");
            int i6 = iE10;
            int iE21 = androidx.room.c1.b.e(cursorB, "trigger_content_update_delay");
            int i7 = iE9;
            int iE22 = androidx.room.c1.b.e(cursorB, "trigger_max_content_delay");
            int i8 = iE8;
            int iE23 = androidx.room.c1.b.e(cursorB, "content_uri_triggers");
            int i9 = iE7;
            int i10 = iE6;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iE);
                int i11 = iE;
                String string2 = cursorB.getString(iE3);
                int i12 = iE3;
                androidx.work.c cVar = new androidx.work.c();
                int i13 = iE16;
                cVar.k(p.e(cursorB.getInt(iE16)));
                cVar.m(cursorB.getInt(iE17) != 0);
                cVar.n(cursorB.getInt(iE18) != 0);
                cVar.l(cursorB.getInt(iE19) != 0);
                cVar.o(cursorB.getInt(iE20) != 0);
                int i14 = iE17;
                int i15 = iE18;
                cVar.p(cursorB.getLong(iE21));
                cVar.q(cursorB.getLong(iE22));
                cVar.j(p.b(cursorB.getBlob(iE23)));
                j jVar = new j(string, string2);
                jVar.f2303d = p.f(cursorB.getInt(iE2));
                jVar.f2305f = cursorB.getString(iE4);
                jVar.f2306g = androidx.work.e.g(cursorB.getBlob(iE5));
                int i16 = i10;
                jVar.f2307h = androidx.work.e.g(cursorB.getBlob(i16));
                int i17 = iE4;
                int i18 = i9;
                int i19 = iE5;
                jVar.f2308i = cursorB.getLong(i18);
                int i20 = i8;
                jVar.f2309j = cursorB.getLong(i20);
                int i21 = i7;
                jVar.f2310k = cursorB.getLong(i21);
                int i22 = i6;
                jVar.f2312m = cursorB.getInt(i22);
                int i23 = i5;
                i10 = i16;
                jVar.n = p.d(cursorB.getInt(i23));
                int i24 = i4;
                jVar.o = cursorB.getLong(i24);
                i6 = i22;
                int i25 = i3;
                jVar.p = cursorB.getLong(i25);
                i3 = i25;
                int i26 = i2;
                jVar.q = cursorB.getLong(i26);
                i2 = i26;
                int i27 = iE15;
                jVar.r = cursorB.getLong(i27);
                jVar.f2311l = cVar;
                arrayList.add(jVar);
                iE15 = i27;
                iE4 = i17;
                iE17 = i14;
                iE5 = i19;
                iE3 = i12;
                iE18 = i15;
                i7 = i21;
                i9 = i18;
                i4 = i24;
                i8 = i20;
                iE = i11;
                i5 = i23;
                iE16 = i13;
            }
            cursorB.close();
            u0Var.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            u0Var.j();
            throw th;
        }
    }

    @Override // androidx.work.impl.l.k
    public void h(String str, androidx.work.e eVar) throws Throwable {
        this.a.b();
        c.r.a.f fVarA = this.f2320d.a();
        byte[] bArrK = androidx.work.e.k(eVar);
        if (bArrK == null) {
            fVarA.t0(1);
        } else {
            fVarA.X(1, bArrK);
        }
        if (str == null) {
            fVarA.t0(2);
        } else {
            fVarA.r(2, str);
        }
        this.a.c();
        try {
            fVarA.w();
            this.a.D();
        } finally {
            this.a.h();
            this.f2320d.f(fVarA);
        }
    }

    @Override // androidx.work.impl.l.k
    public List<j> i() throws Throwable {
        u0 u0Var;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        u0 u0VarD = u0.d("SELECT * FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            iE = androidx.room.c1.b.e(cursorB, "id");
            iE2 = androidx.room.c1.b.e(cursorB, "state");
            iE3 = androidx.room.c1.b.e(cursorB, "worker_class_name");
            iE4 = androidx.room.c1.b.e(cursorB, "input_merger_class_name");
            iE5 = androidx.room.c1.b.e(cursorB, "input");
            iE6 = androidx.room.c1.b.e(cursorB, "output");
            iE7 = androidx.room.c1.b.e(cursorB, "initial_delay");
            iE8 = androidx.room.c1.b.e(cursorB, "interval_duration");
            iE9 = androidx.room.c1.b.e(cursorB, "flex_duration");
            iE10 = androidx.room.c1.b.e(cursorB, "run_attempt_count");
            iE11 = androidx.room.c1.b.e(cursorB, "backoff_policy");
            iE12 = androidx.room.c1.b.e(cursorB, "backoff_delay_duration");
            iE13 = androidx.room.c1.b.e(cursorB, "period_start_time");
            iE14 = androidx.room.c1.b.e(cursorB, "minimum_retention_duration");
            u0Var = u0VarD;
        } catch (Throwable th) {
            th = th;
            u0Var = u0VarD;
        }
        try {
            int iE15 = androidx.room.c1.b.e(cursorB, "schedule_requested_at");
            int iE16 = androidx.room.c1.b.e(cursorB, "required_network_type");
            int i2 = iE14;
            int iE17 = androidx.room.c1.b.e(cursorB, "requires_charging");
            int i3 = iE13;
            int iE18 = androidx.room.c1.b.e(cursorB, "requires_device_idle");
            int i4 = iE12;
            int iE19 = androidx.room.c1.b.e(cursorB, "requires_battery_not_low");
            int i5 = iE11;
            int iE20 = androidx.room.c1.b.e(cursorB, "requires_storage_not_low");
            int i6 = iE10;
            int iE21 = androidx.room.c1.b.e(cursorB, "trigger_content_update_delay");
            int i7 = iE9;
            int iE22 = androidx.room.c1.b.e(cursorB, "trigger_max_content_delay");
            int i8 = iE8;
            int iE23 = androidx.room.c1.b.e(cursorB, "content_uri_triggers");
            int i9 = iE7;
            int i10 = iE6;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iE);
                int i11 = iE;
                String string2 = cursorB.getString(iE3);
                int i12 = iE3;
                androidx.work.c cVar = new androidx.work.c();
                int i13 = iE16;
                cVar.k(p.e(cursorB.getInt(iE16)));
                cVar.m(cursorB.getInt(iE17) != 0);
                cVar.n(cursorB.getInt(iE18) != 0);
                cVar.l(cursorB.getInt(iE19) != 0);
                cVar.o(cursorB.getInt(iE20) != 0);
                int i14 = iE17;
                int i15 = iE18;
                cVar.p(cursorB.getLong(iE21));
                cVar.q(cursorB.getLong(iE22));
                cVar.j(p.b(cursorB.getBlob(iE23)));
                j jVar = new j(string, string2);
                jVar.f2303d = p.f(cursorB.getInt(iE2));
                jVar.f2305f = cursorB.getString(iE4);
                jVar.f2306g = androidx.work.e.g(cursorB.getBlob(iE5));
                int i16 = i10;
                jVar.f2307h = androidx.work.e.g(cursorB.getBlob(i16));
                int i17 = iE4;
                int i18 = i9;
                int i19 = iE5;
                jVar.f2308i = cursorB.getLong(i18);
                int i20 = i8;
                jVar.f2309j = cursorB.getLong(i20);
                int i21 = i7;
                jVar.f2310k = cursorB.getLong(i21);
                int i22 = i6;
                jVar.f2312m = cursorB.getInt(i22);
                int i23 = i5;
                i10 = i16;
                jVar.n = p.d(cursorB.getInt(i23));
                int i24 = i4;
                jVar.o = cursorB.getLong(i24);
                i6 = i22;
                int i25 = i3;
                jVar.p = cursorB.getLong(i25);
                i3 = i25;
                int i26 = i2;
                jVar.q = cursorB.getLong(i26);
                i2 = i26;
                int i27 = iE15;
                jVar.r = cursorB.getLong(i27);
                jVar.f2311l = cVar;
                arrayList.add(jVar);
                iE15 = i27;
                iE4 = i17;
                iE17 = i14;
                iE5 = i19;
                iE3 = i12;
                iE18 = i15;
                i7 = i21;
                i9 = i18;
                i4 = i24;
                i8 = i20;
                iE = i11;
                i5 = i23;
                iE16 = i13;
            }
            cursorB.close();
            u0Var.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            u0Var.j();
            throw th;
        }
    }

    @Override // androidx.work.impl.l.k
    public List<String> j() {
        u0 u0VarD = u0.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.b();
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            u0VarD.j();
        }
    }

    @Override // androidx.work.impl.l.k
    public List<String> k(String str) {
        u0 u0VarD = u0.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        this.a.b();
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            u0VarD.j();
        }
    }

    @Override // androidx.work.impl.l.k
    public n.a l(String str) {
        u0 u0VarD = u0.d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        this.a.b();
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            return cursorB.moveToFirst() ? p.f(cursorB.getInt(0)) : null;
        } finally {
            cursorB.close();
            u0VarD.j();
        }
    }

    @Override // androidx.work.impl.l.k
    public j m(String str) throws Throwable {
        u0 u0Var;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        j jVar;
        u0 u0VarD = u0.d("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        this.a.b();
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            iE = androidx.room.c1.b.e(cursorB, "id");
            iE2 = androidx.room.c1.b.e(cursorB, "state");
            iE3 = androidx.room.c1.b.e(cursorB, "worker_class_name");
            iE4 = androidx.room.c1.b.e(cursorB, "input_merger_class_name");
            iE5 = androidx.room.c1.b.e(cursorB, "input");
            iE6 = androidx.room.c1.b.e(cursorB, "output");
            iE7 = androidx.room.c1.b.e(cursorB, "initial_delay");
            iE8 = androidx.room.c1.b.e(cursorB, "interval_duration");
            iE9 = androidx.room.c1.b.e(cursorB, "flex_duration");
            iE10 = androidx.room.c1.b.e(cursorB, "run_attempt_count");
            iE11 = androidx.room.c1.b.e(cursorB, "backoff_policy");
            iE12 = androidx.room.c1.b.e(cursorB, "backoff_delay_duration");
            iE13 = androidx.room.c1.b.e(cursorB, "period_start_time");
            iE14 = androidx.room.c1.b.e(cursorB, "minimum_retention_duration");
            u0Var = u0VarD;
        } catch (Throwable th) {
            th = th;
            u0Var = u0VarD;
        }
        try {
            int iE15 = androidx.room.c1.b.e(cursorB, "schedule_requested_at");
            int iE16 = androidx.room.c1.b.e(cursorB, "required_network_type");
            int iE17 = androidx.room.c1.b.e(cursorB, "requires_charging");
            int iE18 = androidx.room.c1.b.e(cursorB, "requires_device_idle");
            int iE19 = androidx.room.c1.b.e(cursorB, "requires_battery_not_low");
            int iE20 = androidx.room.c1.b.e(cursorB, "requires_storage_not_low");
            int iE21 = androidx.room.c1.b.e(cursorB, "trigger_content_update_delay");
            int iE22 = androidx.room.c1.b.e(cursorB, "trigger_max_content_delay");
            int iE23 = androidx.room.c1.b.e(cursorB, "content_uri_triggers");
            if (cursorB.moveToFirst()) {
                String string = cursorB.getString(iE);
                String string2 = cursorB.getString(iE3);
                androidx.work.c cVar = new androidx.work.c();
                cVar.k(p.e(cursorB.getInt(iE16)));
                cVar.m(cursorB.getInt(iE17) != 0);
                cVar.n(cursorB.getInt(iE18) != 0);
                cVar.l(cursorB.getInt(iE19) != 0);
                cVar.o(cursorB.getInt(iE20) != 0);
                cVar.p(cursorB.getLong(iE21));
                cVar.q(cursorB.getLong(iE22));
                cVar.j(p.b(cursorB.getBlob(iE23)));
                jVar = new j(string, string2);
                jVar.f2303d = p.f(cursorB.getInt(iE2));
                jVar.f2305f = cursorB.getString(iE4);
                jVar.f2306g = androidx.work.e.g(cursorB.getBlob(iE5));
                jVar.f2307h = androidx.work.e.g(cursorB.getBlob(iE6));
                jVar.f2308i = cursorB.getLong(iE7);
                jVar.f2309j = cursorB.getLong(iE8);
                jVar.f2310k = cursorB.getLong(iE9);
                jVar.f2312m = cursorB.getInt(iE10);
                jVar.n = p.d(cursorB.getInt(iE11));
                jVar.o = cursorB.getLong(iE12);
                jVar.p = cursorB.getLong(iE13);
                jVar.q = cursorB.getLong(iE14);
                jVar.r = cursorB.getLong(iE15);
                jVar.f2311l = cVar;
            } else {
                jVar = null;
            }
            cursorB.close();
            u0Var.j();
            return jVar;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            u0Var.j();
            throw th;
        }
    }

    @Override // androidx.work.impl.l.k
    public int n(String str) {
        this.a.b();
        c.r.a.f fVarA = this.f2323g.a();
        if (str == null) {
            fVarA.t0(1);
        } else {
            fVarA.r(1, str);
        }
        this.a.c();
        try {
            int iW = fVarA.w();
            this.a.D();
            return iW;
        } finally {
            this.a.h();
            this.f2323g.f(fVarA);
        }
    }

    @Override // androidx.work.impl.l.k
    public List<String> o(String str) {
        u0 u0VarD = u0.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        this.a.b();
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            u0VarD.j();
        }
    }

    @Override // androidx.work.impl.l.k
    public List<androidx.work.e> p(String str) {
        u0 u0VarD = u0.d("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        this.a.b();
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(androidx.work.e.g(cursorB.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            u0VarD.j();
        }
    }

    @Override // androidx.work.impl.l.k
    public int q(String str) {
        this.a.b();
        c.r.a.f fVarA = this.f2322f.a();
        if (str == null) {
            fVarA.t0(1);
        } else {
            fVarA.r(1, str);
        }
        this.a.c();
        try {
            int iW = fVarA.w();
            this.a.D();
            return iW;
        } finally {
            this.a.h();
            this.f2322f.f(fVarA);
        }
    }

    @Override // androidx.work.impl.l.k
    public void r(String str, long j2) {
        this.a.b();
        c.r.a.f fVarA = this.f2321e.a();
        fVarA.R(1, j2);
        if (str == null) {
            fVarA.t0(2);
        } else {
            fVarA.r(2, str);
        }
        this.a.c();
        try {
            fVarA.w();
            this.a.D();
        } finally {
            this.a.h();
            this.f2321e.f(fVarA);
        }
    }

    @Override // androidx.work.impl.l.k
    public int s() {
        this.a.b();
        c.r.a.f fVarA = this.f2325i.a();
        this.a.c();
        try {
            int iW = fVarA.w();
            this.a.D();
            return iW;
        } finally {
            this.a.h();
            this.f2325i.f(fVarA);
        }
    }
}