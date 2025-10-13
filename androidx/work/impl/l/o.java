package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.e0;
import androidx.room.q0;
import androidx.room.u0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class o implements n {
    private final q0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f2337b;

    /* compiled from: WorkTagDao_Impl.java */
    class a extends e0<m> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, m mVar) {
            String str = mVar.a;
            if (str == null) {
                fVar.t0(1);
            } else {
                fVar.r(1, str);
            }
            String str2 = mVar.f2336b;
            if (str2 == null) {
                fVar.t0(2);
            } else {
                fVar.r(2, str2);
            }
        }
    }

    public o(q0 q0Var) {
        this.a = q0Var;
        this.f2337b = new a(q0Var);
    }

    @Override // androidx.work.impl.l.n
    public void a(m mVar) {
        this.a.b();
        this.a.c();
        try {
            this.f2337b.h(mVar);
            this.a.D();
        } finally {
            this.a.h();
        }
    }

    @Override // androidx.work.impl.l.n
    public List<String> b(String str) {
        u0 u0VarD = u0.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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
}