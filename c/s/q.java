package c.s;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import c.s.m;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class q extends m {
    int Q;
    private ArrayList<m> O = new ArrayList<>();
    private boolean P = true;
    boolean R = false;
    private int S = 0;

    /* compiled from: TransitionSet.java */
    class a extends n {
        final /* synthetic */ m a;

        a(m mVar) {
            this.a = mVar;
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            this.a.U();
            mVar.Q(this);
        }
    }

    /* compiled from: TransitionSet.java */
    static class b extends n {
        q a;

        b(q qVar) {
            this.a = qVar;
        }

        @Override // c.s.n, c.s.m.f
        public void a(m mVar) {
            q qVar = this.a;
            if (qVar.R) {
                return;
            }
            qVar.c0();
            this.a.R = true;
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            q qVar = this.a;
            int i2 = qVar.Q - 1;
            qVar.Q = i2;
            if (i2 == 0) {
                qVar.R = false;
                qVar.p();
            }
            mVar.Q(this);
        }
    }

    private void h0(m mVar) {
        this.O.add(mVar);
        mVar.y = this;
    }

    private void q0() {
        b bVar = new b(this);
        Iterator<m> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.Q = this.O.size();
    }

    @Override // c.s.m
    public void O(View view) {
        super.O(view);
        int size = this.O.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.O.get(i2).O(view);
        }
    }

    @Override // c.s.m
    public void S(View view) {
        super.S(view);
        int size = this.O.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.O.get(i2).S(view);
        }
    }

    @Override // c.s.m
    protected void U() {
        if (this.O.isEmpty()) {
            c0();
            p();
            return;
        }
        q0();
        if (this.P) {
            Iterator<m> it = this.O.iterator();
            while (it.hasNext()) {
                it.next().U();
            }
            return;
        }
        for (int i2 = 1; i2 < this.O.size(); i2++) {
            this.O.get(i2 - 1).a(new a(this.O.get(i2)));
        }
        m mVar = this.O.get(0);
        if (mVar != null) {
            mVar.U();
        }
    }

    @Override // c.s.m
    public void W(m.e eVar) {
        super.W(eVar);
        this.S |= 8;
        int size = this.O.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.O.get(i2).W(eVar);
        }
    }

    @Override // c.s.m
    public void Y(g gVar) {
        super.Y(gVar);
        this.S |= 4;
        if (this.O != null) {
            for (int i2 = 0; i2 < this.O.size(); i2++) {
                this.O.get(i2).Y(gVar);
            }
        }
    }

    @Override // c.s.m
    public void Z(p pVar) {
        super.Z(pVar);
        this.S |= 2;
        int size = this.O.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.O.get(i2).Z(pVar);
        }
    }

    @Override // c.s.m
    protected void cancel() {
        super.cancel();
        int size = this.O.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.O.get(i2).cancel();
        }
    }

    @Override // c.s.m
    String d0(String str) {
        String strD0 = super.d0(str);
        for (int i2 = 0; i2 < this.O.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strD0);
            sb.append("\n");
            sb.append(this.O.get(i2).d0(str + "  "));
            strD0 = sb.toString();
        }
        return strD0;
    }

    @Override // c.s.m
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public q a(m.f fVar) {
        return (q) super.a(fVar);
    }

    @Override // c.s.m
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public q b(View view) {
        for (int i2 = 0; i2 < this.O.size(); i2++) {
            this.O.get(i2).b(view);
        }
        return (q) super.b(view);
    }

    @Override // c.s.m
    public void g(s sVar) {
        if (G(sVar.f3415b)) {
            Iterator<m> it = this.O.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.G(sVar.f3415b)) {
                    next.g(sVar);
                    sVar.f3416c.add(next);
                }
            }
        }
    }

    public q g0(m mVar) {
        h0(mVar);
        long j2 = this.f3398j;
        if (j2 >= 0) {
            mVar.V(j2);
        }
        if ((this.S & 1) != 0) {
            mVar.X(s());
        }
        if ((this.S & 2) != 0) {
            mVar.Z(w());
        }
        if ((this.S & 4) != 0) {
            mVar.Y(v());
        }
        if ((this.S & 8) != 0) {
            mVar.W(r());
        }
        return this;
    }

    @Override // c.s.m
    void i(s sVar) {
        super.i(sVar);
        int size = this.O.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.O.get(i2).i(sVar);
        }
    }

    public m i0(int i2) {
        if (i2 < 0 || i2 >= this.O.size()) {
            return null;
        }
        return this.O.get(i2);
    }

    @Override // c.s.m
    public void j(s sVar) {
        if (G(sVar.f3415b)) {
            Iterator<m> it = this.O.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.G(sVar.f3415b)) {
                    next.j(sVar);
                    sVar.f3416c.add(next);
                }
            }
        }
    }

    public int j0() {
        return this.O.size();
    }

    @Override // c.s.m
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public q Q(m.f fVar) {
        return (q) super.Q(fVar);
    }

    @Override // c.s.m
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public q R(View view) {
        for (int i2 = 0; i2 < this.O.size(); i2++) {
            this.O.get(i2).R(view);
        }
        return (q) super.R(view);
    }

    @Override // c.s.m
    /* renamed from: m */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.O = new ArrayList<>();
        int size = this.O.size();
        for (int i2 = 0; i2 < size; i2++) {
            qVar.h0(this.O.get(i2).clone());
        }
        return qVar;
    }

    @Override // c.s.m
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public q V(long j2) {
        ArrayList<m> arrayList;
        super.V(j2);
        if (this.f3398j >= 0 && (arrayList = this.O) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.O.get(i2).V(j2);
            }
        }
        return this;
    }

    @Override // c.s.m
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public q X(TimeInterpolator timeInterpolator) {
        this.S |= 1;
        ArrayList<m> arrayList = this.O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.O.get(i2).X(timeInterpolator);
            }
        }
        return (q) super.X(timeInterpolator);
    }

    @Override // c.s.m
    protected void o(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long jY = y();
        int size = this.O.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.O.get(i2);
            if (jY > 0 && (this.P || i2 == 0)) {
                long jY2 = mVar.y();
                if (jY2 > 0) {
                    mVar.a0(jY2 + jY);
                } else {
                    mVar.a0(jY);
                }
            }
            mVar.o(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public q o0(int i2) {
        if (i2 == 0) {
            this.P = true;
        } else {
            if (i2 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
            }
            this.P = false;
        }
        return this;
    }

    @Override // c.s.m
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public q a0(long j2) {
        return (q) super.a0(j2);
    }
}