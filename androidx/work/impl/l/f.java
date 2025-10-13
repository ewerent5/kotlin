package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.e0;
import androidx.room.q0;
import androidx.room.u0;
import androidx.room.y0;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class f implements e {
    private final q0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f2294b;

    /* renamed from: c, reason: collision with root package name */
    private final y0 f2295c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    class a extends e0<d> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, d dVar) {
            String str = dVar.a;
            if (str == null) {
                fVar.t0(1);
            } else {
                fVar.r(1, str);
            }
            fVar.R(2, dVar.f2293b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    class b extends y0 {
        b(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public f(q0 q0Var) {
        this.a = q0Var;
        this.f2294b = new a(q0Var);
        this.f2295c = new b(q0Var);
    }

    @Override // androidx.work.impl.l.e
    public void a(d dVar) {
        this.a.b();
        this.a.c();
        try {
            this.f2294b.h(dVar);
            this.a.D();
        } finally {
            this.a.h();
        }
    }

    @Override // androidx.work.impl.l.e
    public d b(String str) {
        u0 u0VarD = u0.d("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        this.a.b();
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            return cursorB.moveToFirst() ? new d(cursorB.getString(androidx.room.c1.b.e(cursorB, "work_spec_id")), cursorB.getInt(androidx.room.c1.b.e(cursorB, "system_id"))) : null;
        } finally {
            cursorB.close();
            u0VarD.j();
        }
    }

    @Override // androidx.work.impl.l.e
    public void c(String str) {
        this.a.b();
        c.r.a.f fVarA = this.f2295c.a();
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
            this.f2295c.f(fVarA);
        }
    }
}