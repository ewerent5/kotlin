package com.parizene.netmonitor.db;

import android.database.Cursor;
import androidx.room.d0;
import androidx.room.e0;
import androidx.room.q0;
import androidx.room.u0;
import androidx.room.y0;
import com.parizene.netmonitor.db.celllog.i.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: GeolocationDao_Impl.java */
/* loaded from: classes.dex */
public final class f implements e {
    private final q0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e0<j> f13156b;

    /* renamed from: c, reason: collision with root package name */
    private final e0<j> f13157c;

    /* renamed from: d, reason: collision with root package name */
    private final d0<j> f13158d;

    /* renamed from: e, reason: collision with root package name */
    private final y0 f13159e;

    /* compiled from: GeolocationDao_Impl.java */
    class a extends e0<j> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR REPLACE INTO `geolocation` (`mcc`,`mnc`,`lac`,`cid`,`latitude`,`longitude`,`accuracy`,`info`,`status`,`timestamp`,`source`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, j jVar) {
            fVar.R(1, jVar.a);
            fVar.R(2, jVar.f13118b);
            fVar.R(3, jVar.f13119c);
            fVar.R(4, jVar.f13120d);
            fVar.R(5, jVar.f13121e);
            fVar.R(6, jVar.f13122f);
            fVar.R(7, jVar.f13123g);
            String str = jVar.f13124h;
            if (str == null) {
                fVar.t0(8);
            } else {
                fVar.r(8, str);
            }
            fVar.R(9, jVar.f13125i);
            fVar.R(10, jVar.f13126j);
            fVar.R(11, jVar.f13127k);
        }
    }

    /* compiled from: GeolocationDao_Impl.java */
    class b extends e0<j> {
        b(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR ABORT INTO `geolocation` (`mcc`,`mnc`,`lac`,`cid`,`latitude`,`longitude`,`accuracy`,`info`,`status`,`timestamp`,`source`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, j jVar) {
            fVar.R(1, jVar.a);
            fVar.R(2, jVar.f13118b);
            fVar.R(3, jVar.f13119c);
            fVar.R(4, jVar.f13120d);
            fVar.R(5, jVar.f13121e);
            fVar.R(6, jVar.f13122f);
            fVar.R(7, jVar.f13123g);
            String str = jVar.f13124h;
            if (str == null) {
                fVar.t0(8);
            } else {
                fVar.r(8, str);
            }
            fVar.R(9, jVar.f13125i);
            fVar.R(10, jVar.f13126j);
            fVar.R(11, jVar.f13127k);
        }
    }

    /* compiled from: GeolocationDao_Impl.java */
    class c extends d0<j> {
        c(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "UPDATE OR ABORT `geolocation` SET `mcc` = ?,`mnc` = ?,`lac` = ?,`cid` = ?,`latitude` = ?,`longitude` = ?,`accuracy` = ?,`info` = ?,`status` = ?,`timestamp` = ?,`source` = ? WHERE `mcc` = ? AND `mnc` = ? AND `lac` = ? AND `cid` = ?";
        }

        @Override // androidx.room.d0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, j jVar) {
            fVar.R(1, jVar.a);
            fVar.R(2, jVar.f13118b);
            fVar.R(3, jVar.f13119c);
            fVar.R(4, jVar.f13120d);
            fVar.R(5, jVar.f13121e);
            fVar.R(6, jVar.f13122f);
            fVar.R(7, jVar.f13123g);
            String str = jVar.f13124h;
            if (str == null) {
                fVar.t0(8);
            } else {
                fVar.r(8, str);
            }
            fVar.R(9, jVar.f13125i);
            fVar.R(10, jVar.f13126j);
            fVar.R(11, jVar.f13127k);
            fVar.R(12, jVar.a);
            fVar.R(13, jVar.f13118b);
            fVar.R(14, jVar.f13119c);
            fVar.R(15, jVar.f13120d);
        }
    }

    /* compiled from: GeolocationDao_Impl.java */
    class d extends y0 {
        d(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "DELETE FROM geolocation";
        }
    }

    public f(q0 q0Var) {
        this.a = q0Var;
        this.f13156b = new a(q0Var);
        this.f13157c = new b(q0Var);
        this.f13158d = new c(q0Var);
        this.f13159e = new d(q0Var);
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    @Override // com.parizene.netmonitor.db.e
    public int a() {
        this.a.b();
        c.r.a.f fVarA = this.f13159e.a();
        this.a.c();
        try {
            int iW = fVarA.w();
            this.a.D();
            return iW;
        } finally {
            this.a.h();
            this.f13159e.f(fVarA);
        }
    }

    @Override // com.parizene.netmonitor.db.e
    public long[] b(List<j> list) {
        this.a.b();
        this.a.c();
        try {
            long[] jArrJ = this.f13156b.j(list);
            this.a.D();
            return jArrJ;
        } finally {
            this.a.h();
        }
    }

    @Override // com.parizene.netmonitor.db.e
    public List<j> c(long j2, long j3) {
        u0 u0VarD = u0.d("SELECT * FROM geolocation LIMIT ?, ?", 2);
        u0VarD.R(1, j2);
        u0VarD.R(2, j3);
        this.a.b();
        Cursor cursorC = androidx.room.c1.c.c(this.a, u0VarD, false, null);
        try {
            int iE = androidx.room.c1.b.e(cursorC, "mcc");
            int iE2 = androidx.room.c1.b.e(cursorC, "mnc");
            int iE3 = androidx.room.c1.b.e(cursorC, "lac");
            int iE4 = androidx.room.c1.b.e(cursorC, "cid");
            int iE5 = androidx.room.c1.b.e(cursorC, "latitude");
            int iE6 = androidx.room.c1.b.e(cursorC, "longitude");
            int iE7 = androidx.room.c1.b.e(cursorC, "accuracy");
            int iE8 = androidx.room.c1.b.e(cursorC, "info");
            int iE9 = androidx.room.c1.b.e(cursorC, "status");
            int iE10 = androidx.room.c1.b.e(cursorC, "timestamp");
            int iE11 = androidx.room.c1.b.e(cursorC, "source");
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(new j(cursorC.getInt(iE), cursorC.getInt(iE2), cursorC.getInt(iE3), cursorC.getLong(iE4), cursorC.getInt(iE5), cursorC.getInt(iE6), cursorC.getInt(iE7), cursorC.isNull(iE8) ? null : cursorC.getString(iE8), cursorC.getInt(iE9), cursorC.getLong(iE10), cursorC.getInt(iE11)));
            }
            return arrayList;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.e
    public List<j> d(long j2, long j3) {
        u0 u0VarD = u0.d("SELECT * FROM geolocation WHERE status=0 AND latitude=0 AND longitude=0 LIMIT ?, ?", 2);
        u0VarD.R(1, j2);
        u0VarD.R(2, j3);
        this.a.b();
        Cursor cursorC = androidx.room.c1.c.c(this.a, u0VarD, false, null);
        try {
            int iE = androidx.room.c1.b.e(cursorC, "mcc");
            int iE2 = androidx.room.c1.b.e(cursorC, "mnc");
            int iE3 = androidx.room.c1.b.e(cursorC, "lac");
            int iE4 = androidx.room.c1.b.e(cursorC, "cid");
            int iE5 = androidx.room.c1.b.e(cursorC, "latitude");
            int iE6 = androidx.room.c1.b.e(cursorC, "longitude");
            int iE7 = androidx.room.c1.b.e(cursorC, "accuracy");
            int iE8 = androidx.room.c1.b.e(cursorC, "info");
            int iE9 = androidx.room.c1.b.e(cursorC, "status");
            int iE10 = androidx.room.c1.b.e(cursorC, "timestamp");
            int iE11 = androidx.room.c1.b.e(cursorC, "source");
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(new j(cursorC.getInt(iE), cursorC.getInt(iE2), cursorC.getInt(iE3), cursorC.getLong(iE4), cursorC.getInt(iE5), cursorC.getInt(iE6), cursorC.getInt(iE7), cursorC.isNull(iE8) ? null : cursorC.getString(iE8), cursorC.getInt(iE9), cursorC.getLong(iE10), cursorC.getInt(iE11)));
            }
            return arrayList;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.e
    public j e(int i2, int i3, int i4, long j2) {
        u0 u0VarD = u0.d("SELECT * FROM geolocation WHERE mcc = ? AND mnc = ? AND lac = ? AND cid = ?", 4);
        u0VarD.R(1, i2);
        u0VarD.R(2, i3);
        u0VarD.R(3, i4);
        u0VarD.R(4, j2);
        this.a.b();
        j jVar = null;
        Cursor cursorC = androidx.room.c1.c.c(this.a, u0VarD, false, null);
        try {
            int iE = androidx.room.c1.b.e(cursorC, "mcc");
            int iE2 = androidx.room.c1.b.e(cursorC, "mnc");
            int iE3 = androidx.room.c1.b.e(cursorC, "lac");
            int iE4 = androidx.room.c1.b.e(cursorC, "cid");
            int iE5 = androidx.room.c1.b.e(cursorC, "latitude");
            int iE6 = androidx.room.c1.b.e(cursorC, "longitude");
            int iE7 = androidx.room.c1.b.e(cursorC, "accuracy");
            int iE8 = androidx.room.c1.b.e(cursorC, "info");
            int iE9 = androidx.room.c1.b.e(cursorC, "status");
            int iE10 = androidx.room.c1.b.e(cursorC, "timestamp");
            int iE11 = androidx.room.c1.b.e(cursorC, "source");
            if (cursorC.moveToFirst()) {
                jVar = new j(cursorC.getInt(iE), cursorC.getInt(iE2), cursorC.getInt(iE3), cursorC.getLong(iE4), cursorC.getInt(iE5), cursorC.getInt(iE6), cursorC.getInt(iE7), cursorC.isNull(iE8) ? null : cursorC.getString(iE8), cursorC.getInt(iE9), cursorC.getLong(iE10), cursorC.getInt(iE11));
            }
            return jVar;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.e
    public int f(j jVar) {
        this.a.b();
        this.a.c();
        try {
            int iH = this.f13158d.h(jVar) + 0;
            this.a.D();
            return iH;
        } finally {
            this.a.h();
        }
    }

    @Override // com.parizene.netmonitor.db.e
    public long g(j jVar) {
        this.a.b();
        this.a.c();
        try {
            long jI = this.f13157c.i(jVar);
            this.a.D();
            return jI;
        } finally {
            this.a.h();
        }
    }
}