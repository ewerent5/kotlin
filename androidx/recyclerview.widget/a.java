package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
class a implements o.a {
    private c.h.k.e<b> a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f1633b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f1634c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0023a f1635d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f1636e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f1637f;

    /* renamed from: g, reason: collision with root package name */
    final o f1638g;

    /* renamed from: h, reason: collision with root package name */
    private int f1639h;

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0023a {
        void a(int i2, int i3);

        void b(b bVar);

        void c(int i2, int i3, Object obj);

        void d(b bVar);

        RecyclerView.d0 e(int i2);

        void f(int i2, int i3);

        void g(int i2, int i3);

        void h(int i2, int i3);
    }

    /* compiled from: AdapterHelper.java */
    static class b {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1640b;

        /* renamed from: c, reason: collision with root package name */
        Object f1641c;

        /* renamed from: d, reason: collision with root package name */
        int f1642d;

        b(int i2, int i3, int i4, Object obj) {
            this.a = i2;
            this.f1640b = i3;
            this.f1642d = i4;
            this.f1641c = obj;
        }

        String a() {
            int i2 = this.a;
            return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.a;
            if (i2 != bVar.a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f1642d - this.f1640b) == 1 && this.f1642d == bVar.f1640b && this.f1640b == bVar.f1642d) {
                return true;
            }
            if (this.f1642d != bVar.f1642d || this.f1640b != bVar.f1640b) {
                return false;
            }
            Object obj2 = this.f1641c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f1641c)) {
                    return false;
                }
            } else if (bVar.f1641c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.f1640b) * 31) + this.f1642d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f1640b + "c:" + this.f1642d + ",p:" + this.f1641c + "]";
        }
    }

    a(InterfaceC0023a interfaceC0023a) {
        this(interfaceC0023a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z;
        char c2;
        int i2 = bVar.f1640b;
        int i3 = bVar.f1642d + i2;
        char c3 = 65535;
        int i4 = i2;
        int i5 = 0;
        while (i4 < i3) {
            if (this.f1635d.e(i4) != null || h(i4)) {
                if (c3 == 0) {
                    k(b(2, i2, i5, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    v(b(2, i2, i5, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i4 -= i5;
                i3 -= i5;
                i5 = 1;
            } else {
                i5++;
            }
            i4++;
            c3 = c2;
        }
        if (i5 != bVar.f1642d) {
            a(bVar);
            bVar = b(2, i2, i5, null);
        }
        if (c3 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i2 = bVar.f1640b;
        int i3 = bVar.f1642d + i2;
        int i4 = i2;
        char c2 = 65535;
        int i5 = 0;
        while (i2 < i3) {
            if (this.f1635d.e(i2) != null || h(i2)) {
                if (c2 == 0) {
                    k(b(4, i4, i5, bVar.f1641c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    v(b(4, i4, i5, bVar.f1641c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 0;
            }
            i5++;
            i2++;
        }
        if (i5 != bVar.f1642d) {
            Object obj = bVar.f1641c;
            a(bVar);
            bVar = b(4, i4, i5, obj);
        }
        if (c2 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i2) {
        int size = this.f1634c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f1634c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                if (n(bVar.f1642d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.f1640b;
                int i6 = bVar.f1642d + i5;
                while (i5 < i6) {
                    if (n(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i2;
        int i3 = bVar.a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f1640b, i3);
        int i4 = bVar.f1640b;
        int i5 = bVar.a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f1642d; i7++) {
            int iZ2 = z(bVar.f1640b + (i2 * i7), bVar.a);
            int i8 = bVar.a;
            if (i8 == 2 ? iZ2 == iZ : i8 == 4 && iZ2 == iZ + 1) {
                i6++;
            } else {
                b bVarB = b(i8, iZ, i6, bVar.f1641c);
                l(bVarB, i4);
                a(bVarB);
                if (bVar.a == 4) {
                    i4 += i6;
                }
                iZ = iZ2;
                i6 = 1;
            }
        }
        Object obj = bVar.f1641c;
        a(bVar);
        if (i6 > 0) {
            b bVarB2 = b(bVar.a, iZ, i6, obj);
            l(bVarB2, i4);
            a(bVarB2);
        }
    }

    private void v(b bVar) {
        this.f1634c.add(bVar);
        int i2 = bVar.a;
        if (i2 == 1) {
            this.f1635d.g(bVar.f1640b, bVar.f1642d);
            return;
        }
        if (i2 == 2) {
            this.f1635d.f(bVar.f1640b, bVar.f1642d);
            return;
        }
        if (i2 == 4) {
            this.f1635d.c(bVar.f1640b, bVar.f1642d, bVar.f1641c);
        } else {
            if (i2 == 8) {
                this.f1635d.a(bVar.f1640b, bVar.f1642d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i2, int i3) {
        int i4;
        int i5;
        for (int size = this.f1634c.size() - 1; size >= 0; size--) {
            b bVar = this.f1634c.get(size);
            int i6 = bVar.a;
            if (i6 == 8) {
                int i7 = bVar.f1640b;
                int i8 = bVar.f1642d;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            bVar.f1640b = i7 + 1;
                            bVar.f1642d = i8 + 1;
                        } else if (i3 == 2) {
                            bVar.f1640b = i7 - 1;
                            bVar.f1642d = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        bVar.f1642d = i8 + 1;
                    } else if (i3 == 2) {
                        bVar.f1642d = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        bVar.f1640b = i7 + 1;
                    } else if (i3 == 2) {
                        bVar.f1640b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = bVar.f1640b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= bVar.f1642d;
                    } else if (i6 == 2) {
                        i2 += bVar.f1642d;
                    }
                } else if (i3 == 1) {
                    bVar.f1640b = i9 + 1;
                } else if (i3 == 2) {
                    bVar.f1640b = i9 - 1;
                }
            }
        }
        for (int size2 = this.f1634c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f1634c.get(size2);
            if (bVar2.a == 8) {
                int i10 = bVar2.f1642d;
                if (i10 == bVar2.f1640b || i10 < 0) {
                    this.f1634c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f1642d <= 0) {
                this.f1634c.remove(size2);
                a(bVar2);
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.o.a
    public void a(b bVar) {
        if (this.f1637f) {
            return;
        }
        bVar.f1641c = null;
        this.a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.o.a
    public b b(int i2, int i3, int i4, Object obj) {
        b bVarB = this.a.b();
        if (bVarB == null) {
            return new b(i2, i3, i4, obj);
        }
        bVarB.a = i2;
        bVarB.f1640b = i3;
        bVarB.f1642d = i4;
        bVarB.f1641c = obj;
        return bVarB;
    }

    public int e(int i2) {
        int size = this.f1633b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f1633b.get(i3);
            int i4 = bVar.a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = bVar.f1640b;
                    if (i5 <= i2) {
                        int i6 = bVar.f1642d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = bVar.f1640b;
                    if (i7 == i2) {
                        i2 = bVar.f1642d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (bVar.f1642d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (bVar.f1640b <= i2) {
                i2 += bVar.f1642d;
            }
        }
        return i2;
    }

    void i() {
        int size = this.f1634c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1635d.d(this.f1634c.get(i2));
        }
        x(this.f1634c);
        this.f1639h = 0;
    }

    void j() {
        i();
        int size = this.f1633b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1633b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                this.f1635d.d(bVar);
                this.f1635d.g(bVar.f1640b, bVar.f1642d);
            } else if (i3 == 2) {
                this.f1635d.d(bVar);
                this.f1635d.h(bVar.f1640b, bVar.f1642d);
            } else if (i3 == 4) {
                this.f1635d.d(bVar);
                this.f1635d.c(bVar.f1640b, bVar.f1642d, bVar.f1641c);
            } else if (i3 == 8) {
                this.f1635d.d(bVar);
                this.f1635d.a(bVar.f1640b, bVar.f1642d);
            }
            Runnable runnable = this.f1636e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f1633b);
        this.f1639h = 0;
    }

    void l(b bVar, int i2) {
        this.f1635d.b(bVar);
        int i3 = bVar.a;
        if (i3 == 2) {
            this.f1635d.h(i2, bVar.f1642d);
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f1635d.c(i2, bVar.f1642d, bVar.f1641c);
        }
    }

    int m(int i2) {
        return n(i2, 0);
    }

    int n(int i2, int i3) {
        int size = this.f1634c.size();
        while (i3 < size) {
            b bVar = this.f1634c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                int i5 = bVar.f1640b;
                if (i5 == i2) {
                    i2 = bVar.f1642d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f1642d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.f1640b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f1642d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f1642d;
                }
            }
            i3++;
        }
        return i2;
    }

    boolean o(int i2) {
        return (i2 & this.f1639h) != 0;
    }

    boolean p() {
        return this.f1633b.size() > 0;
    }

    boolean q() {
        return (this.f1634c.isEmpty() || this.f1633b.isEmpty()) ? false : true;
    }

    boolean r(int i2, int i3, Object obj) {
        if (i3 < 1) {
            return false;
        }
        this.f1633b.add(b(4, i2, i3, obj));
        this.f1639h |= 4;
        return this.f1633b.size() == 1;
    }

    boolean s(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.f1633b.add(b(1, i2, i3, null));
        this.f1639h |= 1;
        return this.f1633b.size() == 1;
    }

    boolean t(int i2, int i3, int i4) {
        if (i2 == i3) {
            return false;
        }
        if (i4 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f1633b.add(b(8, i2, i3, null));
        this.f1639h |= 8;
        return this.f1633b.size() == 1;
    }

    boolean u(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.f1633b.add(b(2, i2, i3, null));
        this.f1639h |= 2;
        return this.f1633b.size() == 1;
    }

    void w() {
        this.f1638g.b(this.f1633b);
        int size = this.f1633b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1633b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                c(bVar);
            } else if (i3 == 2) {
                f(bVar);
            } else if (i3 == 4) {
                g(bVar);
            } else if (i3 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f1636e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f1633b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(list.get(i2));
        }
        list.clear();
    }

    void y() {
        x(this.f1633b);
        x(this.f1634c);
        this.f1639h = 0;
    }

    a(InterfaceC0023a interfaceC0023a, boolean z) {
        this.a = new c.h.k.f(30);
        this.f1633b = new ArrayList<>();
        this.f1634c = new ArrayList<>();
        this.f1639h = 0;
        this.f1635d = interfaceC0023a;
        this.f1637f = z;
        this.f1638g = new o(this);
    }
}