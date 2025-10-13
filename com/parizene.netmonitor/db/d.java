package com.parizene.netmonitor.db;

import android.database.Cursor;
import androidx.room.e0;
import androidx.room.q0;
import androidx.room.r0;
import androidx.room.u0;
import androidx.room.y0;
import androidx.room.z;
import com.parizene.netmonitor.db.c;
import com.parizene.netmonitor.db.celllog.i.i;
import i.s;
import i.y.c.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ClfDao_Impl.java */
/* loaded from: classes.dex */
public final class d implements com.parizene.netmonitor.db.c {
    private final q0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e0<i> f13136b;

    /* renamed from: c, reason: collision with root package name */
    private final e0<i> f13137c;

    /* renamed from: d, reason: collision with root package name */
    private final y0 f13138d;

    /* renamed from: e, reason: collision with root package name */
    private final y0 f13139e;

    /* compiled from: ClfDao_Impl.java */
    class a extends e0<i> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR REPLACE INTO `clf` (`mcc`,`mnc`,`lac`,`cid`,`latitude`,`longitude`,`info`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, i iVar) {
            String str = iVar.a;
            if (str == null) {
                fVar.t0(1);
            } else {
                fVar.r(1, str);
            }
            String str2 = iVar.f13112b;
            if (str2 == null) {
                fVar.t0(2);
            } else {
                fVar.r(2, str2);
            }
            fVar.R(3, iVar.f13113c);
            fVar.R(4, iVar.f13114d);
            fVar.R(5, iVar.f13115e);
            fVar.R(6, iVar.f13116f);
            String str3 = iVar.f13117g;
            if (str3 == null) {
                fVar.t0(7);
            } else {
                fVar.r(7, str3);
            }
        }
    }

    /* compiled from: ClfDao_Impl.java */
    class b extends e0<i> {
        b(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR ABORT INTO `clf` (`mcc`,`mnc`,`lac`,`cid`,`latitude`,`longitude`,`info`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, i iVar) {
            String str = iVar.a;
            if (str == null) {
                fVar.t0(1);
            } else {
                fVar.r(1, str);
            }
            String str2 = iVar.f13112b;
            if (str2 == null) {
                fVar.t0(2);
            } else {
                fVar.r(2, str2);
            }
            fVar.R(3, iVar.f13113c);
            fVar.R(4, iVar.f13114d);
            fVar.R(5, iVar.f13115e);
            fVar.R(6, iVar.f13116f);
            String str3 = iVar.f13117g;
            if (str3 == null) {
                fVar.t0(7);
            } else {
                fVar.r(7, str3);
            }
        }
    }

    /* compiled from: ClfDao_Impl.java */
    class c extends y0 {
        c(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "UPDATE clf SET info=? WHERE mcc = ? AND mnc = ? AND lac = ? AND cid = ?";
        }
    }

    /* compiled from: ClfDao_Impl.java */
    /* renamed from: com.parizene.netmonitor.db.d$d, reason: collision with other inner class name */
    class C0157d extends y0 {
        C0157d(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "DELETE FROM clf";
        }
    }

    /* compiled from: ClfDao_Impl.java */
    class e implements Callable<Long> {
        final /* synthetic */ i a;

        e(i iVar) {
            this.a = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() {
            d.this.a.c();
            try {
                long jI = d.this.f13137c.i(this.a);
                d.this.a.D();
                return Long.valueOf(jI);
            } finally {
                d.this.a.h();
            }
        }
    }

    /* compiled from: ClfDao_Impl.java */
    class f implements l<i.v.d<? super s>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f13145e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f13146f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13147g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f13148h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f13149i;

        f(String str, String str2, int i2, long j2, String str3) {
            this.f13145e = str;
            this.f13146f = str2;
            this.f13147g = i2;
            this.f13148h = j2;
            this.f13149i = str3;
        }

        @Override // i.y.c.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object invoke(i.v.d<? super s> dVar) {
            return c.a.a(d.this, this.f13145e, this.f13146f, this.f13147g, this.f13148h, this.f13149i, dVar);
        }
    }

    /* compiled from: ClfDao_Impl.java */
    class g implements Callable<Integer> {
        final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13151b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13152c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13153d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f13154e;

        g(String str, String str2, String str3, int i2, long j2) {
            this.a = str;
            this.f13151b = str2;
            this.f13152c = str3;
            this.f13153d = i2;
            this.f13154e = j2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            c.r.a.f fVarA = d.this.f13138d.a();
            String str = this.a;
            if (str == null) {
                fVarA.t0(1);
            } else {
                fVarA.r(1, str);
            }
            String str2 = this.f13151b;
            if (str2 == null) {
                fVarA.t0(2);
            } else {
                fVarA.r(2, str2);
            }
            String str3 = this.f13152c;
            if (str3 == null) {
                fVarA.t0(3);
            } else {
                fVarA.r(3, str3);
            }
            fVarA.R(4, this.f13153d);
            fVarA.R(5, this.f13154e);
            d.this.a.c();
            try {
                Integer numValueOf = Integer.valueOf(fVarA.w());
                d.this.a.D();
                return numValueOf;
            } finally {
                d.this.a.h();
                d.this.f13138d.f(fVarA);
            }
        }
    }

    public d(q0 q0Var) {
        this.a = q0Var;
        this.f13136b = new a(q0Var);
        this.f13137c = new b(q0Var);
        this.f13138d = new c(q0Var);
        this.f13139e = new C0157d(q0Var);
    }

    public static List<Class<?>> m() {
        return Collections.emptyList();
    }

    @Override // com.parizene.netmonitor.db.c
    public int a() {
        this.a.b();
        c.r.a.f fVarA = this.f13139e.a();
        this.a.c();
        try {
            int iW = fVarA.w();
            this.a.D();
            return iW;
        } finally {
            this.a.h();
            this.f13139e.f(fVarA);
        }
    }

    @Override // com.parizene.netmonitor.db.c
    public long[] b(List<? extends i> list) {
        this.a.b();
        this.a.c();
        try {
            long[] jArrJ = this.f13136b.j(list);
            this.a.D();
            return jArrJ;
        } finally {
            this.a.h();
        }
    }

    @Override // com.parizene.netmonitor.db.c
    public List<i> c(long j2, long j3) {
        u0 u0VarD = u0.d("SELECT * FROM clf LIMIT ?, ?", 2);
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
            int iE7 = androidx.room.c1.b.e(cursorC, "info");
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(new i(cursorC.isNull(iE) ? null : cursorC.getString(iE), cursorC.isNull(iE2) ? null : cursorC.getString(iE2), cursorC.getInt(iE3), cursorC.getLong(iE4), cursorC.getInt(iE5), cursorC.getInt(iE6), cursorC.isNull(iE7) ? null : cursorC.getString(iE7)));
            }
            return arrayList;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.c
    public Object d(String str, String str2, int i2, long j2, String str3, i.v.d<? super Integer> dVar) {
        return z.b(this.a, true, new g(str3, str, str2, i2, j2), dVar);
    }

    @Override // com.parizene.netmonitor.db.c
    public List<i> e(String str, String str2, long j2, long j3) {
        u0 u0VarD = u0.d("SELECT * FROM clf WHERE mcc = ? AND mnc = ? LIMIT ?, ?", 4);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        if (str2 == null) {
            u0VarD.t0(2);
        } else {
            u0VarD.r(2, str2);
        }
        u0VarD.R(3, j2);
        u0VarD.R(4, j3);
        this.a.b();
        Cursor cursorC = androidx.room.c1.c.c(this.a, u0VarD, false, null);
        try {
            int iE = androidx.room.c1.b.e(cursorC, "mcc");
            int iE2 = androidx.room.c1.b.e(cursorC, "mnc");
            int iE3 = androidx.room.c1.b.e(cursorC, "lac");
            int iE4 = androidx.room.c1.b.e(cursorC, "cid");
            int iE5 = androidx.room.c1.b.e(cursorC, "latitude");
            int iE6 = androidx.room.c1.b.e(cursorC, "longitude");
            int iE7 = androidx.room.c1.b.e(cursorC, "info");
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(new i(cursorC.isNull(iE) ? null : cursorC.getString(iE), cursorC.isNull(iE2) ? null : cursorC.getString(iE2), cursorC.getInt(iE3), cursorC.getLong(iE4), cursorC.getInt(iE5), cursorC.getInt(iE6), cursorC.isNull(iE7) ? null : cursorC.getString(iE7)));
            }
            return arrayList;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.c
    public Object f(i iVar, i.v.d<? super Long> dVar) {
        return z.b(this.a, true, new e(iVar), dVar);
    }

    @Override // com.parizene.netmonitor.db.c
    public int g(String str, String str2) {
        u0 u0VarD = u0.d("SELECT COUNT(*) FROM clf WHERE mcc = ? AND mnc = ?", 2);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        if (str2 == null) {
            u0VarD.t0(2);
        } else {
            u0VarD.r(2, str2);
        }
        this.a.b();
        Cursor cursorC = androidx.room.c1.c.c(this.a, u0VarD, false, null);
        try {
            return cursorC.moveToFirst() ? cursorC.getInt(0) : 0;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.c
    public i h(String str, String str2, int i2, long j2) {
        u0 u0VarD = u0.d("SELECT * FROM clf WHERE mcc = ? AND mnc = ? AND lac = ? AND cid = ?", 4);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        if (str2 == null) {
            u0VarD.t0(2);
        } else {
            u0VarD.r(2, str2);
        }
        u0VarD.R(3, i2);
        u0VarD.R(4, j2);
        this.a.b();
        i iVar = null;
        Cursor cursorC = androidx.room.c1.c.c(this.a, u0VarD, false, null);
        try {
            int iE = androidx.room.c1.b.e(cursorC, "mcc");
            int iE2 = androidx.room.c1.b.e(cursorC, "mnc");
            int iE3 = androidx.room.c1.b.e(cursorC, "lac");
            int iE4 = androidx.room.c1.b.e(cursorC, "cid");
            int iE5 = androidx.room.c1.b.e(cursorC, "latitude");
            int iE6 = androidx.room.c1.b.e(cursorC, "longitude");
            int iE7 = androidx.room.c1.b.e(cursorC, "info");
            if (cursorC.moveToFirst()) {
                iVar = new i(cursorC.isNull(iE) ? null : cursorC.getString(iE), cursorC.isNull(iE2) ? null : cursorC.getString(iE2), cursorC.getInt(iE3), cursorC.getLong(iE4), cursorC.getInt(iE5), cursorC.getInt(iE6), cursorC.isNull(iE7) ? null : cursorC.getString(iE7));
            }
            return iVar;
        } finally {
            cursorC.close();
            u0VarD.j();
        }
    }

    @Override // com.parizene.netmonitor.db.c
    public Object i(String str, String str2, int i2, long j2, String str3, i.v.d<? super s> dVar) {
        return r0.c(this.a, new f(str, str2, i2, j2, str3), dVar);
    }
}