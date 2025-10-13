package com.parizene.netmonitor.db;

import android.database.Cursor;
import androidx.room.e0;
import androidx.room.q0;
import androidx.room.u0;
import androidx.room.y0;
import com.parizene.netmonitor.db.celllog.i.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: LogDao_Impl.java */
/* loaded from: classes.dex */
public final class h implements g {
    private final q0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e0<l> f13164b;

    /* renamed from: c, reason: collision with root package name */
    private final y0 f13165c;

    /* compiled from: LogDao_Impl.java */
    class a extends e0<l> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR ABORT INTO `log` (`_id`,`cell_id`,`change_type`,`dbm`,`gps_lat`,`gps_lon`,`gps_acc`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, l lVar) {
            fVar.R(1, lVar.a);
            fVar.R(2, lVar.f13128b);
            fVar.R(3, com.parizene.netmonitor.db.celllog.i.h.b(lVar.f13129c));
            fVar.R(4, lVar.f13130d);
            fVar.R(5, lVar.f13131e);
            fVar.R(6, lVar.f13132f);
            fVar.R(7, lVar.f13133g);
            fVar.R(8, lVar.f13134h);
        }
    }

    /* compiled from: LogDao_Impl.java */
    class b extends y0 {
        b(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "DELETE FROM log";
        }
    }

    public h(q0 q0Var) {
        this.a = q0Var;
        this.f13164b = new a(q0Var);
        this.f13165c = new b(q0Var);
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    @Override // com.parizene.netmonitor.db.g
    public int a() {
        this.a.b();
        c.r.a.f fVarA = this.f13165c.a();
        this.a.c();
        try {
            int iW = fVarA.w();
            this.a.D();
            return iW;
        } finally {
            this.a.h();
            this.f13165c.f(fVarA);
        }
    }

    @Override // com.parizene.netmonitor.db.g
    public int b(com.parizene.netmonitor.db.celllog.i.g gVar) {
        u0 u0VarD = u0.d("SELECT COUNT(*) FROM log WHERE change_type = ?", 1);
        u0VarD.R(1, com.parizene.netmonitor.db.celllog.i.h.b(gVar));
        this.a.b();
        Cursor cursorC = androidx.room.c1.c.c(this.a, u0VarD, false, null);
        try {
            return cursorC.moveToFirst() ? cursorC.getInt(0) : 0;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.g
    public List<l> c(long j2, long j3, long j4, long j5) {
        u0 u0VarD = u0.d("SELECT * FROM log WHERE gps_lat <> 0 AND gps_lon <> 0 AND timestamp >= ? AND timestamp <= ? LIMIT ?, ?", 4);
        u0VarD.R(1, j2);
        u0VarD.R(2, j3);
        u0VarD.R(3, j4);
        u0VarD.R(4, j5);
        this.a.b();
        Cursor cursorC = androidx.room.c1.c.c(this.a, u0VarD, false, null);
        try {
            int iE = androidx.room.c1.b.e(cursorC, "_id");
            int iE2 = androidx.room.c1.b.e(cursorC, "cell_id");
            int iE3 = androidx.room.c1.b.e(cursorC, "change_type");
            int iE4 = androidx.room.c1.b.e(cursorC, "dbm");
            int iE5 = androidx.room.c1.b.e(cursorC, "gps_lat");
            int iE6 = androidx.room.c1.b.e(cursorC, "gps_lon");
            int iE7 = androidx.room.c1.b.e(cursorC, "gps_acc");
            int iE8 = androidx.room.c1.b.e(cursorC, "timestamp");
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                l lVar = new l(cursorC.getLong(iE2), com.parizene.netmonitor.db.celllog.i.h.a(cursorC.getInt(iE3)), cursorC.getInt(iE4), cursorC.getInt(iE5), cursorC.getInt(iE6), cursorC.getInt(iE7), cursorC.getLong(iE8));
                lVar.a = cursorC.getLong(iE);
                arrayList.add(lVar);
            }
            return arrayList;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.g
    public List<l> d(long j2, long j3, long j4) {
        u0 u0VarD = u0.d("SELECT * FROM log WHERE cell_id = ? AND gps_lat <> 0 AND gps_lon <> 0 AND timestamp >= ? AND timestamp <= ?", 3);
        u0VarD.R(1, j2);
        u0VarD.R(2, j3);
        u0VarD.R(3, j4);
        this.a.b();
        Cursor cursorC = androidx.room.c1.c.c(this.a, u0VarD, false, null);
        try {
            int iE = androidx.room.c1.b.e(cursorC, "_id");
            int iE2 = androidx.room.c1.b.e(cursorC, "cell_id");
            int iE3 = androidx.room.c1.b.e(cursorC, "change_type");
            int iE4 = androidx.room.c1.b.e(cursorC, "dbm");
            int iE5 = androidx.room.c1.b.e(cursorC, "gps_lat");
            int iE6 = androidx.room.c1.b.e(cursorC, "gps_lon");
            int iE7 = androidx.room.c1.b.e(cursorC, "gps_acc");
            int iE8 = androidx.room.c1.b.e(cursorC, "timestamp");
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                l lVar = new l(cursorC.getLong(iE2), com.parizene.netmonitor.db.celllog.i.h.a(cursorC.getInt(iE3)), cursorC.getInt(iE4), cursorC.getInt(iE5), cursorC.getInt(iE6), cursorC.getInt(iE7), cursorC.getLong(iE8));
                lVar.a = cursorC.getLong(iE);
                arrayList.add(lVar);
            }
            return arrayList;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.g
    public int e(long j2, long j3) {
        u0 u0VarD = u0.d("SELECT COUNT(*) FROM log WHERE gps_lat <> 0 AND gps_lon <> 0 AND timestamp >= ? AND timestamp <= ?", 2);
        u0VarD.R(1, j2);
        u0VarD.R(2, j3);
        this.a.b();
        Cursor cursorC = androidx.room.c1.c.c(this.a, u0VarD, false, null);
        try {
            return cursorC.moveToFirst() ? cursorC.getInt(0) : 0;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.g
    public long f(int i2) {
        u0 u0VarD = u0.d("SELECT timestamp FROM log WHERE gps_lat <> 0 AND gps_lon <> 0 ORDER BY CASE WHEN ?=0 THEN timestamp END ASC, CASE WHEN ?=1 THEN timestamp END DESC LIMIT 1", 2);
        long j2 = i2;
        u0VarD.R(1, j2);
        u0VarD.R(2, j2);
        this.a.b();
        Cursor cursorC = androidx.room.c1.c.c(this.a, u0VarD, false, null);
        try {
            return cursorC.moveToFirst() ? cursorC.getLong(0) : 0L;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.g
    public long g(l lVar) {
        this.a.b();
        this.a.c();
        try {
            long jI = this.f13164b.i(lVar);
            this.a.D();
            return jI;
        } finally {
            this.a.h();
        }
    }
}