package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.m0;

/* compiled from: ThreadSafeHeap.kt */
/* loaded from: classes3.dex */
public class e0<T extends f0 & Comparable<? super T>> {
    private volatile int _size = 0;
    private T[] a;

    private final T[] f() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new f0[4];
            this.a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, c() * 2);
        i.y.d.l.c(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((f0[]) objArrCopyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void j(int i2) {
        this._size = i2;
    }

    private final void k(int i2) {
        while (true) {
            int i3 = (i2 * 2) + 1;
            if (i3 >= c()) {
                return;
            }
            T[] tArr = this.a;
            i.y.d.l.b(tArr);
            int i4 = i3 + 1;
            if (i4 < c()) {
                T t = tArr[i4];
                i.y.d.l.b(t);
                T t2 = tArr[i3];
                i.y.d.l.b(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i3 = i4;
                }
            }
            T t3 = tArr[i2];
            i.y.d.l.b(t3);
            T t4 = tArr[i3];
            i.y.d.l.b(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m(i2, i3);
            i2 = i3;
        }
    }

    private final void l(int i2) {
        while (i2 > 0) {
            T[] tArr = this.a;
            i.y.d.l.b(tArr);
            int i3 = (i2 - 1) / 2;
            T t = tArr[i3];
            i.y.d.l.b(t);
            T t2 = tArr[i2];
            i.y.d.l.b(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m(i2, i3);
            i2 = i3;
        }
    }

    private final void m(int i2, int i3) {
        T[] tArr = this.a;
        i.y.d.l.b(tArr);
        T t = tArr[i3];
        i.y.d.l.b(t);
        T t2 = tArr[i2];
        i.y.d.l.b(t2);
        tArr[i2] = t;
        tArr[i3] = t2;
        t.d(i2);
        t2.d(i3);
    }

    public final void a(T t) {
        if (m0.a()) {
            if (!(t.b() == null)) {
                throw new AssertionError();
            }
        }
        t.a(this);
        f0[] f0VarArrF = f();
        int iC = c();
        j(iC + 1);
        f0VarArrF[iC] = t;
        t.d(iC);
        l(iC);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T t;
        synchronized (this) {
            t = (T) b();
        }
        return t;
    }

    public final boolean g(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            if (t.b() == null) {
                z = false;
            } else {
                int iE = t.e();
                if (m0.a()) {
                    if (!(iE >= 0)) {
                        throw new AssertionError();
                    }
                }
                h(iE);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T h(int r8) {
        /*
            r7 = this;
            boolean r0 = kotlinx.coroutines.m0.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            int r0 = r7.c()
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L14
            goto L1a
        L14:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L1a:
            T extends kotlinx.coroutines.internal.f0 & java.lang.Comparable<? super T>[] r0 = r7.a
            i.y.d.l.b(r0)
            int r3 = r7.c()
            r4 = -1
            int r3 = r3 + r4
            r7.j(r3)
            int r3 = r7.c()
            if (r8 >= r3) goto L57
            int r3 = r7.c()
            r7.m(r8, r3)
            int r3 = r8 + (-1)
            int r3 = r3 / 2
            if (r8 <= 0) goto L54
            r5 = r0[r8]
            i.y.d.l.b(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r0[r3]
            i.y.d.l.b(r6)
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L54
            r7.m(r8, r3)
            r7.l(r3)
            goto L57
        L54:
            r7.k(r8)
        L57:
            int r8 = r7.c()
            r8 = r0[r8]
            i.y.d.l.b(r8)
            boolean r3 = kotlinx.coroutines.m0.a()
            if (r3 == 0) goto L76
            kotlinx.coroutines.internal.e0 r3 = r8.b()
            if (r3 != r7) goto L6d
            r1 = 1
        L6d:
            if (r1 == 0) goto L70
            goto L76
        L70:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L76:
            r1 = 0
            r8.a(r1)
            r8.d(r4)
            int r2 = r7.c()
            r0[r2] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.e0.h(int):kotlinx.coroutines.internal.f0");
    }

    public final T i() {
        T t;
        synchronized (this) {
            t = c() > 0 ? (T) h(0) : null;
        }
        return t;
    }
}