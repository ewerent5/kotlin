package androidx.work.impl.l;

import androidx.room.e0;
import androidx.room.q0;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class i implements h {
    private final q0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f2299b;

    /* compiled from: WorkNameDao_Impl.java */
    class a extends e0<g> {
        a(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.room.y0
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(c.r.a.f fVar, g gVar) {
            String str = gVar.a;
            if (str == null) {
                fVar.t0(1);
            } else {
                fVar.r(1, str);
            }
            String str2 = gVar.f2298b;
            if (str2 == null) {
                fVar.t0(2);
            } else {
                fVar.r(2, str2);
            }
        }
    }

    public i(q0 q0Var) {
        this.a = q0Var;
        this.f2299b = new a(q0Var);
    }

    @Override // androidx.work.impl.l.h
    public void a(g gVar) {
        this.a.b();
        this.a.c();
        try {
            this.f2299b.h(gVar);
            this.a.D();
        } finally {
            this.a.h();
        }
    }
}