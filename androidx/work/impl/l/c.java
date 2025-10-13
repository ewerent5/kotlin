package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.e0;
import androidx.room.q0;
import androidx.room.u0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class c implements b {
    private final q0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f2291b;

    /* compiled from: DependencyDao_Impl.java */
    class a extends e0<androidx.work.impl.l.a> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, androidx.work.impl.l.a aVar) {
            String str = aVar.a;
            if (str == null) {
                fVar.t0(1);
            } else {
                fVar.r(1, str);
            }
            String str2 = aVar.f2290b;
            if (str2 == null) {
                fVar.t0(2);
            } else {
                fVar.r(2, str2);
            }
        }
    }

    public c(q0 q0Var) {
        this.a = q0Var;
        this.f2291b = new a(q0Var);
    }

    @Override // androidx.work.impl.l.b
    public void a(androidx.work.impl.l.a aVar) {
        this.a.b();
        this.a.c();
        try {
            this.f2291b.h(aVar);
            this.a.D();
        } finally {
            this.a.h();
        }
    }

    @Override // androidx.work.impl.l.b
    public List<String> b(String str) {
        u0 u0VarD = u0.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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

    @Override // androidx.work.impl.l.b
    public boolean c(String str) {
        u0 u0VarD = u0.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        this.a.b();
        boolean z = false;
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            if (cursorB.moveToFirst()) {
                z = cursorB.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorB.close();
            u0VarD.j();
        }
    }

    @Override // androidx.work.impl.l.b
    public boolean d(String str) {
        u0 u0VarD = u0.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            u0VarD.t0(1);
        } else {
            u0VarD.r(1, str);
        }
        this.a.b();
        boolean z = false;
        Cursor cursorB = androidx.room.c1.c.b(this.a, u0VarD, false);
        try {
            if (cursorB.moveToFirst()) {
                z = cursorB.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorB.close();
            u0VarD.j();
        }
    }
}