package com.parizene.netmonitor.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.d0;
import androidx.room.e0;
import androidx.room.q0;
import androidx.room.u0;
import androidx.room.y0;
import androidx.room.z;
import com.parizene.netmonitor.db.a;
import com.parizene.netmonitor.db.celllog.i.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: CellDao_Impl.java */
/* loaded from: classes.dex */
public final class b implements com.parizene.netmonitor.db.a {

    /* renamed from: b, reason: collision with root package name */
    private final q0 f13028b;

    /* renamed from: c, reason: collision with root package name */
    private final e0<com.parizene.netmonitor.db.celllog.i.b> f13029c;

    /* renamed from: d, reason: collision with root package name */
    private final e0<com.parizene.netmonitor.db.celllog.i.b> f13030d;

    /* renamed from: e, reason: collision with root package name */
    private final d0<com.parizene.netmonitor.db.celllog.i.b> f13031e;

    /* renamed from: f, reason: collision with root package name */
    private final y0 f13032f;

    /* renamed from: g, reason: collision with root package name */
    private final y0 f13033g;

    /* compiled from: CellDao_Impl.java */
    class a extends e0<com.parizene.netmonitor.db.celllog.i.b> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR IGNORE INTO `cell` (`_id`,`mcc`,`mnc`,`lac`,`cid`,`psc`,`cdma_latitude`,`cdma_longitude`,`was_current`,`last_mentioned`,`network_type`,`channel`,`flags`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, com.parizene.netmonitor.db.celllog.i.b bVar) {
            fVar.R(1, bVar.a);
            String str = bVar.f13088b;
            if (str == null) {
                fVar.t0(2);
            } else {
                fVar.r(2, str);
            }
            String str2 = bVar.f13089c;
            if (str2 == null) {
                fVar.t0(3);
            } else {
                fVar.r(3, str2);
            }
            fVar.R(4, bVar.f13090d);
            fVar.R(5, bVar.f13091e);
            fVar.R(6, bVar.f13092f);
            fVar.R(7, bVar.f13093g);
            fVar.R(8, bVar.f13094h);
            fVar.R(9, bVar.f13095i ? 1L : 0L);
            fVar.R(10, bVar.f13096j);
            fVar.R(11, bVar.f13097k);
            fVar.R(12, bVar.f13098l);
            fVar.R(13, bVar.f13099m);
        }
    }

    /* compiled from: CellDao_Impl.java */
    /* renamed from: com.parizene.netmonitor.db.b$b, reason: collision with other inner class name */
    class C0156b extends e0<com.parizene.netmonitor.db.celllog.i.b> {
        C0156b(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR ABORT INTO `cell` (`_id`,`mcc`,`mnc`,`lac`,`cid`,`psc`,`cdma_latitude`,`cdma_longitude`,`was_current`,`last_mentioned`,`network_type`,`channel`,`flags`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, com.parizene.netmonitor.db.celllog.i.b bVar) {
            fVar.R(1, bVar.a);
            String str = bVar.f13088b;
            if (str == null) {
                fVar.t0(2);
            } else {
                fVar.r(2, str);
            }
            String str2 = bVar.f13089c;
            if (str2 == null) {
                fVar.t0(3);
            } else {
                fVar.r(3, str2);
            }
            fVar.R(4, bVar.f13090d);
            fVar.R(5, bVar.f13091e);
            fVar.R(6, bVar.f13092f);
            fVar.R(7, bVar.f13093g);
            fVar.R(8, bVar.f13094h);
            fVar.R(9, bVar.f13095i ? 1L : 0L);
            fVar.R(10, bVar.f13096j);
            fVar.R(11, bVar.f13097k);
            fVar.R(12, bVar.f13098l);
            fVar.R(13, bVar.f13099m);
        }
    }

    /* compiled from: CellDao_Impl.java */
    class c extends d0<com.parizene.netmonitor.db.celllog.i.b> {
        c(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "UPDATE OR ABORT `cell` SET `_id` = ?,`mcc` = ?,`mnc` = ?,`lac` = ?,`cid` = ?,`psc` = ?,`cdma_latitude` = ?,`cdma_longitude` = ?,`was_current` = ?,`last_mentioned` = ?,`network_type` = ?,`channel` = ?,`flags` = ? WHERE `_id` = ?";
        }

        @Override // androidx.room.d0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, com.parizene.netmonitor.db.celllog.i.b bVar) {
            fVar.R(1, bVar.a);
            String str = bVar.f13088b;
            if (str == null) {
                fVar.t0(2);
            } else {
                fVar.r(2, str);
            }
            String str2 = bVar.f13089c;
            if (str2 == null) {
                fVar.t0(3);
            } else {
                fVar.r(3, str2);
            }
            fVar.R(4, bVar.f13090d);
            fVar.R(5, bVar.f13091e);
            fVar.R(6, bVar.f13092f);
            fVar.R(7, bVar.f13093g);
            fVar.R(8, bVar.f13094h);
            fVar.R(9, bVar.f13095i ? 1L : 0L);
            fVar.R(10, bVar.f13096j);
            fVar.R(11, bVar.f13097k);
            fVar.R(12, bVar.f13098l);
            fVar.R(13, bVar.f13099m);
            fVar.R(14, bVar.a);
        }
    }

    /* compiled from: CellDao_Impl.java */
    class d extends y0 {
        d(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "DELETE FROM cell WHERE _id = ?";
        }
    }

    /* compiled from: CellDao_Impl.java */
    class e extends y0 {
        e(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "DELETE FROM cell WHERE _id <> 1";
        }
    }

    /* compiled from: CellDao_Impl.java */
    class f implements Callable<Integer> {
        final /* synthetic */ long a;

        f(long j2) {
            this.a = j2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            c.r.a.f fVarA = b.this.f13032f.a();
            fVarA.R(1, this.a);
            b.this.f13028b.c();
            try {
                Integer numValueOf = Integer.valueOf(fVarA.w());
                b.this.f13028b.D();
                return numValueOf;
            } finally {
                b.this.f13028b.h();
                b.this.f13032f.f(fVarA);
            }
        }
    }

    /* compiled from: CellDao_Impl.java */
    class g implements Callable<List<com.parizene.netmonitor.db.celllog.i.e>> {
        final /* synthetic */ u0 a;

        g(u0 u0Var) {
            this.a = u0Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<com.parizene.netmonitor.db.celllog.i.e> call() {
            int i2;
            int i3;
            Cursor cursorC = androidx.room.c1.c.c(b.this.f13028b, this.a, false, null);
            try {
                int iE = androidx.room.c1.b.e(cursorC, "_id");
                int iE2 = androidx.room.c1.b.e(cursorC, "mcc");
                int iE3 = androidx.room.c1.b.e(cursorC, "mnc");
                int iE4 = androidx.room.c1.b.e(cursorC, "lac");
                int iE5 = androidx.room.c1.b.e(cursorC, "cid");
                int iE6 = androidx.room.c1.b.e(cursorC, "psc");
                int iE7 = androidx.room.c1.b.e(cursorC, "cdma_latitude");
                int iE8 = androidx.room.c1.b.e(cursorC, "cdma_longitude");
                int iE9 = androidx.room.c1.b.e(cursorC, "was_current");
                int iE10 = androidx.room.c1.b.e(cursorC, "last_mentioned");
                int iE11 = androidx.room.c1.b.e(cursorC, "network_type");
                int iE12 = androidx.room.c1.b.e(cursorC, "channel");
                int iE13 = androidx.room.c1.b.e(cursorC, "flags");
                int iE14 = androidx.room.c1.b.e(cursorC, "geolocation_latitude");
                int iE15 = androidx.room.c1.b.e(cursorC, "geolocation_longitude");
                int iE16 = androidx.room.c1.b.e(cursorC, "geolocation_accuracy");
                int iE17 = androidx.room.c1.b.e(cursorC, "geolocation_info");
                int iE18 = androidx.room.c1.b.e(cursorC, "clf_latitude");
                int iE19 = androidx.room.c1.b.e(cursorC, "clf_longitude");
                int iE20 = androidx.room.c1.b.e(cursorC, "clf_info");
                int i4 = iE14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    com.parizene.netmonitor.db.celllog.i.e eVar = new com.parizene.netmonitor.db.celllog.i.e(cursorC.isNull(iE2) ? null : cursorC.getString(iE2), cursorC.isNull(iE3) ? null : cursorC.getString(iE3), cursorC.getInt(iE4), cursorC.getLong(iE5), cursorC.getInt(iE6), cursorC.getInt(iE7), cursorC.getInt(iE8), cursorC.getInt(iE9) != 0, cursorC.getLong(iE10), cursorC.getInt(iE11), cursorC.getInt(iE12));
                    int i5 = iE2;
                    int i6 = iE3;
                    eVar.a = cursorC.getLong(iE);
                    eVar.f13099m = cursorC.getLong(iE13);
                    int i7 = i4;
                    eVar.n = cursorC.getInt(i7);
                    int i8 = iE15;
                    int i9 = iE;
                    eVar.o = cursorC.getInt(i8);
                    int i10 = iE16;
                    int i11 = iE13;
                    eVar.p = cursorC.getInt(i10);
                    int i12 = iE17;
                    if (cursorC.isNull(i12)) {
                        i2 = i10;
                        eVar.q = null;
                    } else {
                        i2 = i10;
                        eVar.q = cursorC.getString(i12);
                    }
                    int i13 = iE18;
                    eVar.r = cursorC.getInt(i13);
                    int i14 = iE19;
                    eVar.s = cursorC.getInt(i14);
                    int i15 = iE20;
                    if (cursorC.isNull(i15)) {
                        i3 = i14;
                        eVar.t = null;
                    } else {
                        i3 = i14;
                        eVar.t = cursorC.getString(i15);
                    }
                    arrayList.add(eVar);
                    i4 = i7;
                    iE13 = i11;
                    iE16 = i2;
                    iE17 = i12;
                    iE18 = i13;
                    iE19 = i3;
                    iE2 = i5;
                    iE20 = i15;
                    iE = i9;
                    iE15 = i8;
                    iE3 = i6;
                }
                return arrayList;
            } finally {
                cursorC.close();
            }
        }

        protected void finalize() {
            this.a.j();
        }
    }

    /* compiled from: CellDao_Impl.java */
    class h implements Callable<List<com.parizene.netmonitor.db.celllog.i.e>> {
        final /* synthetic */ u0 a;

        h(u0 u0Var) {
            this.a = u0Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<com.parizene.netmonitor.db.celllog.i.e> call() {
            int i2;
            int i3;
            Cursor cursorC = androidx.room.c1.c.c(b.this.f13028b, this.a, false, null);
            try {
                int iE = androidx.room.c1.b.e(cursorC, "_id");
                int iE2 = androidx.room.c1.b.e(cursorC, "mcc");
                int iE3 = androidx.room.c1.b.e(cursorC, "mnc");
                int iE4 = androidx.room.c1.b.e(cursorC, "lac");
                int iE5 = androidx.room.c1.b.e(cursorC, "cid");
                int iE6 = androidx.room.c1.b.e(cursorC, "psc");
                int iE7 = androidx.room.c1.b.e(cursorC, "cdma_latitude");
                int iE8 = androidx.room.c1.b.e(cursorC, "cdma_longitude");
                int iE9 = androidx.room.c1.b.e(cursorC, "was_current");
                int iE10 = androidx.room.c1.b.e(cursorC, "last_mentioned");
                int iE11 = androidx.room.c1.b.e(cursorC, "network_type");
                int iE12 = androidx.room.c1.b.e(cursorC, "channel");
                int iE13 = androidx.room.c1.b.e(cursorC, "flags");
                int iE14 = androidx.room.c1.b.e(cursorC, "geolocation_latitude");
                int iE15 = androidx.room.c1.b.e(cursorC, "geolocation_longitude");
                int iE16 = androidx.room.c1.b.e(cursorC, "geolocation_accuracy");
                int iE17 = androidx.room.c1.b.e(cursorC, "geolocation_info");
                int iE18 = androidx.room.c1.b.e(cursorC, "clf_latitude");
                int iE19 = androidx.room.c1.b.e(cursorC, "clf_longitude");
                int iE20 = androidx.room.c1.b.e(cursorC, "clf_info");
                int i4 = iE14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    com.parizene.netmonitor.db.celllog.i.e eVar = new com.parizene.netmonitor.db.celllog.i.e(cursorC.isNull(iE2) ? null : cursorC.getString(iE2), cursorC.isNull(iE3) ? null : cursorC.getString(iE3), cursorC.getInt(iE4), cursorC.getLong(iE5), cursorC.getInt(iE6), cursorC.getInt(iE7), cursorC.getInt(iE8), cursorC.getInt(iE9) != 0, cursorC.getLong(iE10), cursorC.getInt(iE11), cursorC.getInt(iE12));
                    int i5 = iE2;
                    int i6 = iE3;
                    eVar.a = cursorC.getLong(iE);
                    eVar.f13099m = cursorC.getLong(iE13);
                    int i7 = i4;
                    eVar.n = cursorC.getInt(i7);
                    int i8 = iE15;
                    int i9 = iE;
                    eVar.o = cursorC.getInt(i8);
                    int i10 = iE16;
                    int i11 = iE13;
                    eVar.p = cursorC.getInt(i10);
                    int i12 = iE17;
                    if (cursorC.isNull(i12)) {
                        i2 = i10;
                        eVar.q = null;
                    } else {
                        i2 = i10;
                        eVar.q = cursorC.getString(i12);
                    }
                    int i13 = iE18;
                    eVar.r = cursorC.getInt(i13);
                    int i14 = iE19;
                    eVar.s = cursorC.getInt(i14);
                    int i15 = iE20;
                    if (cursorC.isNull(i15)) {
                        i3 = i14;
                        eVar.t = null;
                    } else {
                        i3 = i14;
                        eVar.t = cursorC.getString(i15);
                    }
                    arrayList.add(eVar);
                    i4 = i7;
                    iE13 = i11;
                    iE16 = i2;
                    iE17 = i12;
                    iE18 = i13;
                    iE19 = i3;
                    iE2 = i5;
                    iE20 = i15;
                    iE = i9;
                    iE15 = i8;
                    iE3 = i6;
                }
                return arrayList;
            } finally {
                cursorC.close();
            }
        }

        protected void finalize() {
            this.a.j();
        }
    }

    public b(q0 q0Var) {
        this.f13028b = q0Var;
        this.f13029c = new a(q0Var);
        this.f13030d = new C0156b(q0Var);
        this.f13031e = new c(q0Var);
        this.f13032f = new d(q0Var);
        this.f13033g = new e(q0Var);
    }

    public static List<Class<?>> r() {
        return Collections.emptyList();
    }

    @Override // com.parizene.netmonitor.db.a
    public int a() {
        this.f13028b.b();
        c.r.a.f fVarA = this.f13033g.a();
        this.f13028b.c();
        try {
            int iW = fVarA.w();
            this.f13028b.D();
            return iW;
        } finally {
            this.f13028b.h();
            this.f13033g.f(fVarA);
        }
    }

    @Override // com.parizene.netmonitor.db.a
    public long[] b(List<? extends com.parizene.netmonitor.db.celllog.i.b> list) {
        this.f13028b.b();
        this.f13028b.c();
        try {
            long[] jArrJ = this.f13029c.j(list);
            this.f13028b.D();
            return jArrJ;
        } finally {
            this.f13028b.h();
        }
    }

    @Override // com.parizene.netmonitor.db.a
    public List<com.parizene.netmonitor.db.celllog.i.b> c(long j2, long j3) throws Throwable {
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
        u0 u0VarD = u0.d("SELECT * FROM cell WHERE cell._id <> 1 LIMIT ?, ?", 2);
        u0VarD.R(1, j2);
        u0VarD.R(2, j3);
        this.f13028b.b();
        Cursor cursorC = androidx.room.c1.c.c(this.f13028b, u0VarD, false, null);
        try {
            iE = androidx.room.c1.b.e(cursorC, "_id");
            iE2 = androidx.room.c1.b.e(cursorC, "mcc");
            iE3 = androidx.room.c1.b.e(cursorC, "mnc");
            iE4 = androidx.room.c1.b.e(cursorC, "lac");
            iE5 = androidx.room.c1.b.e(cursorC, "cid");
            iE6 = androidx.room.c1.b.e(cursorC, "psc");
            iE7 = androidx.room.c1.b.e(cursorC, "cdma_latitude");
            iE8 = androidx.room.c1.b.e(cursorC, "cdma_longitude");
            iE9 = androidx.room.c1.b.e(cursorC, "was_current");
            iE10 = androidx.room.c1.b.e(cursorC, "last_mentioned");
            iE11 = androidx.room.c1.b.e(cursorC, "network_type");
            iE12 = androidx.room.c1.b.e(cursorC, "channel");
            iE13 = androidx.room.c1.b.e(cursorC, "flags");
            u0Var = u0VarD;
        } catch (Throwable th) {
            th = th;
            u0Var = u0VarD;
        }
        try {
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                com.parizene.netmonitor.db.celllog.i.b bVar = new com.parizene.netmonitor.db.celllog.i.b(cursorC.isNull(iE2) ? null : cursorC.getString(iE2), cursorC.isNull(iE3) ? null : cursorC.getString(iE3), cursorC.getInt(iE4), cursorC.getLong(iE5), cursorC.getInt(iE6), cursorC.getInt(iE7), cursorC.getInt(iE8), cursorC.getInt(iE9) != 0, cursorC.getLong(iE10), cursorC.getInt(iE11), cursorC.getInt(iE12), cursorC.getLong(iE13));
                int i2 = iE12;
                int i3 = iE13;
                bVar.a = cursorC.getLong(iE);
                arrayList.add(bVar);
                iE12 = i2;
                iE13 = i3;
            }
            cursorC.close();
            u0Var.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorC.close();
            u0Var.j();
            throw th;
        }
    }

    @Override // com.parizene.netmonitor.db.a
    public List<com.parizene.netmonitor.db.celllog.i.e> d(boolean z, boolean z2, long j2, long j3) throws Throwable {
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
        int i2;
        u0 u0VarD = u0.d("SELECT cell.*, IFNULL(G.latitude, 0) AS geolocation_latitude, IFNULL(G.longitude, 0) AS geolocation_longitude, IFNULL(G.accuracy, 0) AS geolocation_accuracy, G.info AS geolocation_info, IFNULL(COALESCE(L1.latitude, L2.latitude), 0) AS clf_latitude, IFNULL(COALESCE(L1.longitude, L2.longitude), 0) AS clf_longitude, COALESCE(L1.info, CASE WHEN ? AND ? AND L2.latitude IS NOT NULL AND L2.longitude IS NOT NULL THEN '*:' || COALESCE(L2.info, '') ELSE L2.info END) AS clf_info  FROM cell LEFT JOIN geolocation AS G ON CAST(cell.mcc AS INTEGER) = G.mcc AND CAST(cell.mnc AS INTEGER) = G.mnc AND cell.lac = G.lac AND cell.cid = G.cid LEFT JOIN clf AS L1 ON cell.mcc = L1.mcc AND cell.mnc = L1.mnc AND cell.lac = L1.lac AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = L1.cid LEFT JOIN clf AS L2 ON ? AND L1.latitude IS NULL AND L1.longitude IS NULL AND L1.info IS NULL AND cell.mcc = L2.mcc AND cell.mnc = L2.mnc AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = L2.cid AND L2.lac = (SELECT lac FROM clf WHERE cell.mcc = clf.mcc AND cell.mnc = clf.mnc AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = clf.cid LIMIT 1) ORDER BY cell.mcc ASC, cell.mnc ASC, cell.lac ASC, cell.cid ASC LIMIT ?, ?", 5);
        u0VarD.R(1, z ? 1L : 0L);
        u0VarD.R(2, z2 ? 1L : 0L);
        u0VarD.R(3, z ? 1L : 0L);
        u0VarD.R(4, j2);
        u0VarD.R(5, j3);
        this.f13028b.b();
        Cursor cursorC = androidx.room.c1.c.c(this.f13028b, u0VarD, false, null);
        try {
            iE = androidx.room.c1.b.e(cursorC, "_id");
            iE2 = androidx.room.c1.b.e(cursorC, "mcc");
            iE3 = androidx.room.c1.b.e(cursorC, "mnc");
            iE4 = androidx.room.c1.b.e(cursorC, "lac");
            iE5 = androidx.room.c1.b.e(cursorC, "cid");
            iE6 = androidx.room.c1.b.e(cursorC, "psc");
            iE7 = androidx.room.c1.b.e(cursorC, "cdma_latitude");
            iE8 = androidx.room.c1.b.e(cursorC, "cdma_longitude");
            iE9 = androidx.room.c1.b.e(cursorC, "was_current");
            iE10 = androidx.room.c1.b.e(cursorC, "last_mentioned");
            iE11 = androidx.room.c1.b.e(cursorC, "network_type");
            iE12 = androidx.room.c1.b.e(cursorC, "channel");
            iE13 = androidx.room.c1.b.e(cursorC, "flags");
            iE14 = androidx.room.c1.b.e(cursorC, "geolocation_latitude");
            u0Var = u0VarD;
        } catch (Throwable th) {
            th = th;
            u0Var = u0VarD;
        }
        try {
            int iE15 = androidx.room.c1.b.e(cursorC, "geolocation_longitude");
            int iE16 = androidx.room.c1.b.e(cursorC, "geolocation_accuracy");
            int iE17 = androidx.room.c1.b.e(cursorC, "geolocation_info");
            int iE18 = androidx.room.c1.b.e(cursorC, "clf_latitude");
            int iE19 = androidx.room.c1.b.e(cursorC, "clf_longitude");
            int iE20 = androidx.room.c1.b.e(cursorC, "clf_info");
            int i3 = iE14;
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                com.parizene.netmonitor.db.celllog.i.e eVar = new com.parizene.netmonitor.db.celllog.i.e(cursorC.isNull(iE2) ? null : cursorC.getString(iE2), cursorC.isNull(iE3) ? null : cursorC.getString(iE3), cursorC.getInt(iE4), cursorC.getLong(iE5), cursorC.getInt(iE6), cursorC.getInt(iE7), cursorC.getInt(iE8), cursorC.getInt(iE9) != 0, cursorC.getLong(iE10), cursorC.getInt(iE11), cursorC.getInt(iE12));
                int i4 = iE12;
                int i5 = iE2;
                eVar.a = cursorC.getLong(iE);
                eVar.f13099m = cursorC.getLong(iE13);
                int i6 = i3;
                eVar.n = cursorC.getInt(i6);
                int i7 = iE15;
                int i8 = iE;
                eVar.o = cursorC.getInt(i7);
                int i9 = iE16;
                int i10 = iE11;
                eVar.p = cursorC.getInt(i9);
                int i11 = iE17;
                if (cursorC.isNull(i11)) {
                    i2 = i9;
                    eVar.q = null;
                } else {
                    i2 = i9;
                    eVar.q = cursorC.getString(i11);
                }
                int i12 = iE18;
                iE17 = i11;
                eVar.r = cursorC.getInt(i12);
                iE18 = i12;
                int i13 = iE19;
                eVar.s = cursorC.getInt(i13);
                int i14 = iE20;
                if (cursorC.isNull(i14)) {
                    iE19 = i13;
                    eVar.t = null;
                } else {
                    iE19 = i13;
                    eVar.t = cursorC.getString(i14);
                }
                arrayList.add(eVar);
                iE11 = i10;
                iE20 = i14;
                iE16 = i2;
                iE = i8;
                i3 = i6;
                iE15 = i7;
                iE2 = i5;
                iE12 = i4;
            }
            cursorC.close();
            u0Var.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorC.close();
            u0Var.j();
            throw th;
        }
    }

    @Override // com.parizene.netmonitor.db.a
    public List<com.parizene.netmonitor.db.celllog.i.f> e(boolean z, boolean z2, com.parizene.netmonitor.db.celllog.i.g gVar, long j2, long j3) throws Throwable {
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
        u0 u0VarD = u0.d("SELECT cell.*, IFNULL(G.latitude, 0) AS geolocation_latitude, IFNULL(G.longitude, 0) AS geolocation_longitude, IFNULL(G.accuracy, 0) AS geolocation_accuracy, G.info AS geolocation_info, IFNULL(COALESCE(L1.latitude, L2.latitude), 0) AS clf_latitude, IFNULL(COALESCE(L1.longitude, L2.longitude), 0) AS clf_longitude, COALESCE(L1.info, CASE WHEN ? AND ? AND L2.latitude IS NOT NULL AND L2.longitude IS NOT NULL THEN '*:' || COALESCE(L2.info, '') ELSE L2.info END) AS clf_info , log.* FROM log INNER JOIN cell ON log.cell_id = cell._id LEFT JOIN geolocation AS G ON CAST(cell.mcc AS INTEGER) = G.mcc AND CAST(cell.mnc AS INTEGER) = G.mnc AND cell.lac = G.lac AND cell.cid = G.cid LEFT JOIN clf AS L1 ON cell.mcc = L1.mcc AND cell.mnc = L1.mnc AND cell.lac = L1.lac AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = L1.cid LEFT JOIN clf AS L2 ON ? AND L1.latitude IS NULL AND L1.longitude IS NULL AND L1.info IS NULL AND cell.mcc = L2.mcc AND cell.mnc = L2.mnc AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = L2.cid AND L2.lac = (SELECT lac FROM clf WHERE cell.mcc = clf.mcc AND cell.mnc = clf.mnc AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = clf.cid LIMIT 1) WHERE change_type = ? LIMIT ?, ?", 6);
        u0VarD.R(1, z ? 1L : 0L);
        u0VarD.R(2, z2 ? 1L : 0L);
        u0VarD.R(3, z ? 1L : 0L);
        u0VarD.R(4, com.parizene.netmonitor.db.celllog.i.h.b(gVar));
        u0VarD.R(5, j2);
        u0VarD.R(6, j3);
        this.f13028b.b();
        Cursor cursorC = androidx.room.c1.c.c(this.f13028b, u0VarD, false, null);
        try {
            iE = androidx.room.c1.b.e(cursorC, "_id");
            iE2 = androidx.room.c1.b.e(cursorC, "mcc");
            iE3 = androidx.room.c1.b.e(cursorC, "mnc");
            iE4 = androidx.room.c1.b.e(cursorC, "lac");
            iE5 = androidx.room.c1.b.e(cursorC, "cid");
            iE6 = androidx.room.c1.b.e(cursorC, "psc");
            iE7 = androidx.room.c1.b.e(cursorC, "cdma_latitude");
            iE8 = androidx.room.c1.b.e(cursorC, "cdma_longitude");
            iE9 = androidx.room.c1.b.e(cursorC, "was_current");
            iE10 = androidx.room.c1.b.e(cursorC, "last_mentioned");
            iE11 = androidx.room.c1.b.e(cursorC, "network_type");
            iE12 = androidx.room.c1.b.e(cursorC, "channel");
            iE13 = androidx.room.c1.b.e(cursorC, "flags");
            u0Var = u0VarD;
        } catch (Throwable th) {
            th = th;
            u0Var = u0VarD;
        }
        try {
            int iE14 = androidx.room.c1.b.e(cursorC, "geolocation_latitude");
            int iE15 = androidx.room.c1.b.e(cursorC, "geolocation_longitude");
            int iE16 = androidx.room.c1.b.e(cursorC, "geolocation_accuracy");
            int iE17 = androidx.room.c1.b.e(cursorC, "geolocation_info");
            int iE18 = androidx.room.c1.b.e(cursorC, "clf_latitude");
            int iE19 = androidx.room.c1.b.e(cursorC, "clf_longitude");
            int iE20 = androidx.room.c1.b.e(cursorC, "clf_info");
            int iE21 = androidx.room.c1.b.e(cursorC, "_id");
            int iE22 = androidx.room.c1.b.e(cursorC, "cell_id");
            int iE23 = androidx.room.c1.b.e(cursorC, "change_type");
            int iE24 = androidx.room.c1.b.e(cursorC, "dbm");
            int iE25 = androidx.room.c1.b.e(cursorC, "gps_lat");
            int iE26 = androidx.room.c1.b.e(cursorC, "gps_lon");
            int iE27 = androidx.room.c1.b.e(cursorC, "gps_acc");
            int iE28 = androidx.room.c1.b.e(cursorC, "timestamp");
            int i2 = iE20;
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                com.parizene.netmonitor.db.celllog.i.f fVar = new com.parizene.netmonitor.db.celllog.i.f(cursorC.isNull(iE2) ? null : cursorC.getString(iE2), cursorC.isNull(iE3) ? null : cursorC.getString(iE3), cursorC.getInt(iE4), cursorC.getLong(iE5), cursorC.getInt(iE6), cursorC.getInt(iE7), cursorC.getInt(iE8), cursorC.getInt(iE9) != 0, cursorC.getLong(iE10), cursorC.getInt(iE11), cursorC.getInt(iE12));
                int i3 = iE10;
                int i4 = iE12;
                fVar.a = cursorC.getLong(iE);
                fVar.f13099m = cursorC.getLong(iE13);
                int i5 = iE14;
                fVar.n = cursorC.getInt(i5);
                int i6 = iE15;
                int i7 = iE;
                fVar.o = cursorC.getInt(i6);
                int i8 = iE16;
                int i9 = iE13;
                fVar.p = cursorC.getInt(i8);
                int i10 = iE17;
                if (cursorC.isNull(i10)) {
                    iE16 = i8;
                    fVar.q = null;
                } else {
                    iE16 = i8;
                    fVar.q = cursorC.getString(i10);
                }
                int i11 = iE18;
                iE17 = i10;
                fVar.r = cursorC.getInt(i11);
                iE18 = i11;
                int i12 = iE19;
                fVar.s = cursorC.getInt(i12);
                int i13 = i2;
                if (cursorC.isNull(i13)) {
                    iE19 = i12;
                    fVar.t = null;
                } else {
                    iE19 = i12;
                    fVar.t = cursorC.getString(i13);
                }
                int i14 = iE21;
                fVar.a = cursorC.getLong(i14);
                int i15 = iE22;
                fVar.u = cursorC.getLong(i15);
                int i16 = iE23;
                fVar.v = com.parizene.netmonitor.db.celllog.i.h.a(cursorC.getInt(i16));
                iE23 = i16;
                int i17 = iE24;
                fVar.w = cursorC.getInt(i17);
                iE24 = i17;
                int i18 = iE25;
                fVar.x = cursorC.getInt(i18);
                iE25 = i18;
                int i19 = iE26;
                fVar.y = cursorC.getInt(i19);
                iE26 = i19;
                int i20 = iE27;
                fVar.z = cursorC.getInt(i20);
                int i21 = iE28;
                fVar.A = cursorC.getLong(i21);
                arrayList.add(fVar);
                iE10 = i3;
                iE12 = i4;
                iE = i7;
                iE14 = i5;
                iE21 = i14;
                iE22 = i15;
                iE27 = i20;
                iE13 = i9;
                iE15 = i6;
                i2 = i13;
                iE28 = i21;
            }
            cursorC.close();
            u0Var.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorC.close();
            u0Var.j();
            throw th;
        }
    }

    @Override // com.parizene.netmonitor.db.a
    public int f(long j2) {
        u0 u0VarD = u0.d("SELECT EXISTS (SELECT * FROM cell WHERE cell._id = ? LIMIT 1)", 1);
        u0VarD.R(1, j2);
        this.f13028b.b();
        Cursor cursorC = androidx.room.c1.c.c(this.f13028b, u0VarD, false, null);
        try {
            return cursorC.moveToFirst() ? cursorC.getInt(0) : 0;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.a
    public Object g(long j2, i.v.d<? super Integer> dVar) {
        return z.b(this.f13028b, true, new f(j2), dVar);
    }

    @Override // com.parizene.netmonitor.db.a
    public com.parizene.netmonitor.db.celllog.i.e h(String str, String str2, int i2, long j2, boolean z, boolean z2) throws Throwable {
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
        com.parizene.netmonitor.db.celllog.i.e eVar;
        u0 u0VarD = u0.d("SELECT cell.*, IFNULL(G.latitude, 0) AS geolocation_latitude, IFNULL(G.longitude, 0) AS geolocation_longitude, IFNULL(G.accuracy, 0) AS geolocation_accuracy, G.info AS geolocation_info, IFNULL(COALESCE(L1.latitude, L2.latitude), 0) AS clf_latitude, IFNULL(COALESCE(L1.longitude, L2.longitude), 0) AS clf_longitude, COALESCE(L1.info, CASE WHEN ? AND ? AND L2.latitude IS NOT NULL AND L2.longitude IS NOT NULL THEN '*:' || COALESCE(L2.info, '') ELSE L2.info END) AS clf_info  FROM cell LEFT JOIN geolocation AS G ON CAST(cell.mcc AS INTEGER) = G.mcc AND CAST(cell.mnc AS INTEGER) = G.mnc AND cell.lac = G.lac AND cell.cid = G.cid LEFT JOIN clf AS L1 ON cell.mcc = L1.mcc AND cell.mnc = L1.mnc AND cell.lac = L1.lac AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = L1.cid LEFT JOIN clf AS L2 ON ? AND L1.latitude IS NULL AND L1.longitude IS NULL AND L1.info IS NULL AND cell.mcc = L2.mcc AND cell.mnc = L2.mnc AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = L2.cid AND L2.lac = (SELECT lac FROM clf WHERE cell.mcc = clf.mcc AND cell.mnc = clf.mnc AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = clf.cid LIMIT 1) WHERE cell.mcc = ? AND cell.mnc = ? AND cell.lac = ? AND cell.cid = ?", 7);
        u0VarD.R(1, z ? 1L : 0L);
        u0VarD.R(2, z2 ? 1L : 0L);
        u0VarD.R(3, z ? 1L : 0L);
        if (str == null) {
            u0VarD.t0(4);
        } else {
            u0VarD.r(4, str);
        }
        if (str2 == null) {
            u0VarD.t0(5);
        } else {
            u0VarD.r(5, str2);
        }
        u0VarD.R(6, i2);
        u0VarD.R(7, j2);
        this.f13028b.b();
        Cursor cursorC = androidx.room.c1.c.c(this.f13028b, u0VarD, false, null);
        try {
            iE = androidx.room.c1.b.e(cursorC, "_id");
            iE2 = androidx.room.c1.b.e(cursorC, "mcc");
            iE3 = androidx.room.c1.b.e(cursorC, "mnc");
            iE4 = androidx.room.c1.b.e(cursorC, "lac");
            iE5 = androidx.room.c1.b.e(cursorC, "cid");
            iE6 = androidx.room.c1.b.e(cursorC, "psc");
            iE7 = androidx.room.c1.b.e(cursorC, "cdma_latitude");
            iE8 = androidx.room.c1.b.e(cursorC, "cdma_longitude");
            iE9 = androidx.room.c1.b.e(cursorC, "was_current");
            iE10 = androidx.room.c1.b.e(cursorC, "last_mentioned");
            iE11 = androidx.room.c1.b.e(cursorC, "network_type");
            iE12 = androidx.room.c1.b.e(cursorC, "channel");
            iE13 = androidx.room.c1.b.e(cursorC, "flags");
            iE14 = androidx.room.c1.b.e(cursorC, "geolocation_latitude");
            u0Var = u0VarD;
        } catch (Throwable th) {
            th = th;
            u0Var = u0VarD;
        }
        try {
            int iE15 = androidx.room.c1.b.e(cursorC, "geolocation_longitude");
            int iE16 = androidx.room.c1.b.e(cursorC, "geolocation_accuracy");
            int iE17 = androidx.room.c1.b.e(cursorC, "geolocation_info");
            int iE18 = androidx.room.c1.b.e(cursorC, "clf_latitude");
            int iE19 = androidx.room.c1.b.e(cursorC, "clf_longitude");
            int iE20 = androidx.room.c1.b.e(cursorC, "clf_info");
            if (cursorC.moveToFirst()) {
                com.parizene.netmonitor.db.celllog.i.e eVar2 = new com.parizene.netmonitor.db.celllog.i.e(cursorC.isNull(iE2) ? null : cursorC.getString(iE2), cursorC.isNull(iE3) ? null : cursorC.getString(iE3), cursorC.getInt(iE4), cursorC.getLong(iE5), cursorC.getInt(iE6), cursorC.getInt(iE7), cursorC.getInt(iE8), cursorC.getInt(iE9) != 0, cursorC.getLong(iE10), cursorC.getInt(iE11), cursorC.getInt(iE12));
                eVar2.a = cursorC.getLong(iE);
                eVar2.f13099m = cursorC.getLong(iE13);
                eVar2.n = cursorC.getInt(iE14);
                eVar2.o = cursorC.getInt(iE15);
                eVar2.p = cursorC.getInt(iE16);
                if (cursorC.isNull(iE17)) {
                    eVar2.q = null;
                } else {
                    eVar2.q = cursorC.getString(iE17);
                }
                eVar2.r = cursorC.getInt(iE18);
                eVar2.s = cursorC.getInt(iE19);
                if (cursorC.isNull(iE20)) {
                    eVar2.t = null;
                } else {
                    eVar2.t = cursorC.getString(iE20);
                }
                eVar = eVar2;
            } else {
                eVar = null;
            }
            cursorC.close();
            u0Var.j();
            return eVar;
        } catch (Throwable th2) {
            th = th2;
            cursorC.close();
            u0Var.j();
            throw th;
        }
    }

    @Override // com.parizene.netmonitor.db.a
    public List<o> i() {
        u0 u0VarD = u0.d("SELECT DISTINCT mcc, mnc FROM cell WHERE cell._id <> 1", 0);
        this.f13028b.b();
        Cursor cursorC = androidx.room.c1.c.c(this.f13028b, u0VarD, false, null);
        try {
            int iE = androidx.room.c1.b.e(cursorC, "mcc");
            int iE2 = androidx.room.c1.b.e(cursorC, "mnc");
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                o oVar = new o();
                if (cursorC.isNull(iE)) {
                    oVar.a = null;
                } else {
                    oVar.a = cursorC.getString(iE);
                }
                if (cursorC.isNull(iE2)) {
                    oVar.f13135b = null;
                } else {
                    oVar.f13135b = cursorC.getString(iE2);
                }
                arrayList.add(oVar);
            }
            return arrayList;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.a
    public LiveData<List<com.parizene.netmonitor.db.celllog.i.e>> j(boolean z, boolean z2, int i2, int i3, int i4, int i5) {
        u0 u0VarD = u0.d("SELECT cell.*, IFNULL(G.latitude, 0) AS geolocation_latitude, IFNULL(G.longitude, 0) AS geolocation_longitude, IFNULL(G.accuracy, 0) AS geolocation_accuracy, G.info AS geolocation_info, IFNULL(COALESCE(L1.latitude, L2.latitude), 0) AS clf_latitude, IFNULL(COALESCE(L1.longitude, L2.longitude), 0) AS clf_longitude, COALESCE(L1.info, CASE WHEN ? AND ? AND L2.latitude IS NOT NULL AND L2.longitude IS NOT NULL THEN '*:' || COALESCE(L2.info, '') ELSE L2.info END) AS clf_info  FROM cell LEFT JOIN geolocation AS G ON CAST(cell.mcc AS INTEGER) = G.mcc AND CAST(cell.mnc AS INTEGER) = G.mnc AND cell.lac = G.lac AND cell.cid = G.cid LEFT JOIN clf AS L1 ON cell.mcc = L1.mcc AND cell.mnc = L1.mnc AND cell.lac = L1.lac AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = L1.cid LEFT JOIN clf AS L2 ON ? AND L1.latitude IS NULL AND L1.longitude IS NULL AND L1.info IS NULL AND cell.mcc = L2.mcc AND cell.mnc = L2.mnc AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = L2.cid AND L2.lac = (SELECT lac FROM clf WHERE cell.mcc = clf.mcc AND cell.mnc = clf.mnc AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = clf.cid LIMIT 1) WHERE _id <> 1 AND ((clf_latitude <> 0 AND clf_longitude <> 0 AND clf_latitude >= ? AND clf_latitude <= ? AND clf_longitude >= ? AND clf_longitude <= ?) OR (geolocation_latitude <> 0 AND geolocation_longitude <> 0 AND geolocation_latitude >= ? AND geolocation_latitude <= ? AND geolocation_longitude >= ? AND geolocation_longitude <= ?) OR (cdma_latitude <> 0 AND cdma_longitude <> 0 AND cdma_latitude >= ? AND cdma_latitude <= ? AND cdma_longitude >= ? AND cdma_longitude <= ?))", 15);
        u0VarD.R(1, z ? 1L : 0L);
        u0VarD.R(2, z2 ? 1L : 0L);
        u0VarD.R(3, z ? 1L : 0L);
        long j2 = i2;
        u0VarD.R(4, j2);
        long j3 = i5;
        u0VarD.R(5, j3);
        long j4 = i3;
        u0VarD.R(6, j4);
        long j5 = i4;
        u0VarD.R(7, j5);
        u0VarD.R(8, j2);
        u0VarD.R(9, j3);
        u0VarD.R(10, j4);
        u0VarD.R(11, j5);
        u0VarD.R(12, j2);
        u0VarD.R(13, j3);
        u0VarD.R(14, j4);
        u0VarD.R(15, j5);
        return this.f13028b.k().e(new String[]{"cell", "geolocation", "clf"}, false, new h(u0VarD));
    }

    @Override // com.parizene.netmonitor.db.a
    public long k(com.parizene.netmonitor.db.celllog.i.b bVar) {
        this.f13028b.b();
        this.f13028b.c();
        try {
            long jI = this.f13030d.i(bVar);
            this.f13028b.D();
            return jI;
        } finally {
            this.f13028b.h();
        }
    }

    @Override // com.parizene.netmonitor.db.a
    public int l(com.parizene.netmonitor.db.celllog.i.b bVar) {
        this.f13028b.b();
        this.f13028b.c();
        try {
            int iH = this.f13031e.h(bVar) + 0;
            this.f13028b.D();
            return iH;
        } finally {
            this.f13028b.h();
        }
    }

    @Override // com.parizene.netmonitor.db.a
    public int m() {
        u0 u0VarD = u0.d("SELECT COUNT(*) FROM cell", 0);
        this.f13028b.b();
        Cursor cursorC = androidx.room.c1.c.c(this.f13028b, u0VarD, false, null);
        try {
            return cursorC.moveToFirst() ? cursorC.getInt(0) : 0;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.a
    public kotlinx.coroutines.r2.c<List<com.parizene.netmonitor.db.celllog.i.e>> n(String str, String str2, String str3, boolean z, boolean z2, int i2, int i3) {
        u0 u0VarD = u0.d("SELECT cell.*, IFNULL(G.latitude, 0) AS geolocation_latitude, IFNULL(G.longitude, 0) AS geolocation_longitude, IFNULL(G.accuracy, 0) AS geolocation_accuracy, G.info AS geolocation_info, IFNULL(COALESCE(L1.latitude, L2.latitude), 0) AS clf_latitude, IFNULL(COALESCE(L1.longitude, L2.longitude), 0) AS clf_longitude, COALESCE(L1.info, CASE WHEN ? AND ? AND L2.latitude IS NOT NULL AND L2.longitude IS NOT NULL THEN '*:' || COALESCE(L2.info, '') ELSE L2.info END) AS clf_info  FROM cell LEFT JOIN geolocation AS G ON CAST(cell.mcc AS INTEGER) = G.mcc AND CAST(cell.mnc AS INTEGER) = G.mnc AND cell.lac = G.lac AND cell.cid = G.cid LEFT JOIN clf AS L1 ON cell.mcc = L1.mcc AND cell.mnc = L1.mnc AND cell.lac = L1.lac AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = L1.cid LEFT JOIN clf AS L2 ON ? AND L1.latitude IS NULL AND L1.longitude IS NULL AND L1.info IS NULL AND cell.mcc = L2.mcc AND cell.mnc = L2.mnc AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = L2.cid AND L2.lac = (SELECT lac FROM clf WHERE cell.mcc = clf.mcc AND cell.mnc = clf.mnc AND CASE WHEN cell.network_type=2 THEN cell.cid & 65535 ELSE cell.cid END = clf.cid LIMIT 1) WHERE cell._id <> 1 AND CASE WHEN ? IS NOT NULL AND ? IS NOT NULL THEN cell.mcc = ? AND cell.mnc = ? ELSE 1 END AND CASE WHEN ? IS NOT NULL THEN cell.psc = CAST(? AS INTEGER) ELSE 1 END ORDER BY CASE WHEN ?=0 THEN cell.last_mentioned END DESC, CASE WHEN ?=1 THEN cell.last_mentioned END ASC, CASE WHEN ?=2 THEN cell._id END DESC, CASE WHEN ?=3 THEN cell._id END ASC LIMIT ?", 14);
        u0VarD.R(1, z ? 1L : 0L);
        u0VarD.R(2, z2 ? 1L : 0L);
        u0VarD.R(3, z ? 1L : 0L);
        if (str == null) {
            u0VarD.t0(4);
        } else {
            u0VarD.r(4, str);
        }
        if (str2 == null) {
            u0VarD.t0(5);
        } else {
            u0VarD.r(5, str2);
        }
        if (str == null) {
            u0VarD.t0(6);
        } else {
            u0VarD.r(6, str);
        }
        if (str2 == null) {
            u0VarD.t0(7);
        } else {
            u0VarD.r(7, str2);
        }
        if (str3 == null) {
            u0VarD.t0(8);
        } else {
            u0VarD.r(8, str3);
        }
        if (str3 == null) {
            u0VarD.t0(9);
        } else {
            u0VarD.r(9, str3);
        }
        long j2 = i2;
        u0VarD.R(10, j2);
        u0VarD.R(11, j2);
        u0VarD.R(12, j2);
        u0VarD.R(13, j2);
        u0VarD.R(14, i3);
        return z.a(this.f13028b, false, new String[]{"cell", "geolocation", "clf"}, new g(u0VarD));
    }

    @Override // com.parizene.netmonitor.db.a
    public kotlinx.coroutines.r2.c<List<com.parizene.netmonitor.db.celllog.i.e>> o(String str, String str2, String str3, boolean z, boolean z2, int i2, int i3) {
        return a.b.a(this, str, str2, str3, z, z2, i2, i3);
    }
}