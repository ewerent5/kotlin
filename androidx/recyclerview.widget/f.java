package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper.java */
/* loaded from: classes.dex */
class f {
    final b a;

    /* renamed from: b, reason: collision with root package name */
    final a f1668b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List<View> f1669c = new ArrayList();

    /* compiled from: ChildHelper.java */
    static class a {
        long a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f1670b;

        a() {
        }

        private void c() {
            if (this.f1670b == null) {
                this.f1670b = new a();
            }
        }

        void a(int i2) {
            if (i2 < 64) {
                this.a &= ~(1 << i2);
                return;
            }
            a aVar = this.f1670b;
            if (aVar != null) {
                aVar.a(i2 - 64);
            }
        }

        int b(int i2) {
            a aVar = this.f1670b;
            return aVar == null ? i2 >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i2) - 1)) : i2 < 64 ? Long.bitCount(this.a & ((1 << i2) - 1)) : aVar.b(i2 - 64) + Long.bitCount(this.a);
        }

        boolean d(int i2) {
            if (i2 < 64) {
                return (this.a & (1 << i2)) != 0;
            }
            c();
            return this.f1670b.d(i2 - 64);
        }

        void e(int i2, boolean z) {
            if (i2 >= 64) {
                c();
                this.f1670b.e(i2 - 64, z);
                return;
            }
            long j2 = this.a;
            boolean z2 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.a = ((j2 & (~j3)) << 1) | (j2 & j3);
            if (z) {
                h(i2);
            } else {
                a(i2);
            }
            if (z2 || this.f1670b != null) {
                c();
                this.f1670b.e(0, z2);
            }
        }

        boolean f(int i2) {
            if (i2 >= 64) {
                c();
                return this.f1670b.f(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.a;
            boolean z = (j3 & j2) != 0;
            long j4 = j3 & (~j2);
            this.a = j4;
            long j5 = j2 - 1;
            this.a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
            a aVar = this.f1670b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f1670b.f(0);
            }
            return z;
        }

        void g() {
            this.a = 0L;
            a aVar = this.f1670b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i2) {
            if (i2 < 64) {
                this.a |= 1 << i2;
            } else {
                c();
                this.f1670b.h(i2 - 64);
            }
        }

        public String toString() {
            if (this.f1670b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.f1670b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* compiled from: ChildHelper.java */
    interface b {
        View a(int i2);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.d0 f(View view);

        void g(int i2);

        void h(View view);

        void i(View view, int i2);

        void j(int i2);

        void k(View view, int i2, ViewGroup.LayoutParams layoutParams);
    }

    f(b bVar) {
        this.a = bVar;
    }

    private int h(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int iC = this.a.c();
        int i3 = i2;
        while (i3 < iC) {
            int iB = i2 - (i3 - this.f1668b.b(i3));
            if (iB == 0) {
                while (this.f1668b.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f1669c.add(view);
        this.a.b(view);
    }

    private boolean t(View view) {
        if (!this.f1669c.remove(view)) {
            return false;
        }
        this.a.h(view);
        return true;
    }

    void a(View view, int i2, boolean z) {
        int iC = i2 < 0 ? this.a.c() : h(i2);
        this.f1668b.e(iC, z);
        if (z) {
            l(view);
        }
        this.a.i(view, iC);
    }

    void b(View view, boolean z) {
        a(view, -1, z);
    }

    void c(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iC = i2 < 0 ? this.a.c() : h(i2);
        this.f1668b.e(iC, z);
        if (z) {
            l(view);
        }
        this.a.k(view, iC, layoutParams);
    }

    void d(int i2) {
        int iH = h(i2);
        this.f1668b.f(iH);
        this.a.g(iH);
    }

    View e(int i2) {
        int size = this.f1669c.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f1669c.get(i3);
            RecyclerView.d0 d0VarF = this.a.f(view);
            if (d0VarF.n() == i2 && !d0VarF.u() && !d0VarF.w()) {
                return view;
            }
        }
        return null;
    }

    View f(int i2) {
        return this.a.a(h(i2));
    }

    int g() {
        return this.a.c() - this.f1669c.size();
    }

    View i(int i2) {
        return this.a.a(i2);
    }

    int j() {
        return this.a.c();
    }

    void k(View view) {
        int iE = this.a.e(view);
        if (iE >= 0) {
            this.f1668b.h(iE);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iE = this.a.e(view);
        if (iE == -1 || this.f1668b.d(iE)) {
            return -1;
        }
        return iE - this.f1668b.b(iE);
    }

    boolean n(View view) {
        return this.f1669c.contains(view);
    }

    void o() {
        this.f1668b.g();
        for (int size = this.f1669c.size() - 1; size >= 0; size--) {
            this.a.h(this.f1669c.get(size));
            this.f1669c.remove(size);
        }
        this.a.d();
    }

    void p(View view) {
        int iE = this.a.e(view);
        if (iE < 0) {
            return;
        }
        if (this.f1668b.f(iE)) {
            t(view);
        }
        this.a.j(iE);
    }

    void q(int i2) {
        int iH = h(i2);
        View viewA = this.a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f1668b.f(iH)) {
            t(viewA);
        }
        this.a.j(iH);
    }

    boolean r(View view) {
        int iE = this.a.e(view);
        if (iE == -1) {
            t(view);
            return true;
        }
        if (!this.f1668b.d(iE)) {
            return false;
        }
        this.f1668b.f(iE);
        t(view);
        this.a.j(iE);
        return true;
    }

    void s(View view) {
        int iE = this.a.e(view);
        if (iE < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f1668b.d(iE)) {
            this.f1668b.a(iE);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f1668b.toString() + ", hidden list:" + this.f1669c.size();
    }
}