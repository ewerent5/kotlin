package com.google.android.gms.internal.ads;

import j$.util.Set;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class f22<E> extends y12<E> implements Set<E>, j$.util.Set {

    /* renamed from: f, reason: collision with root package name */
    @NullableDecl
    private transient b22<E> f5779f;

    f22() {
    }

    public static <E> f22<E> m(E e2) {
        return new t22(e2);
    }

    @SafeVarargs
    public static <E> f22<E> n(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        int length = eArr.length;
        int i2 = length + 6;
        Object[] objArr = new Object[i2];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        System.arraycopy(eArr, 0, objArr, 6, length);
        return x(i2, objArr);
    }

    static int o(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            h12.a(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static <E> e22<E> t(int i2) {
        return new e22<>(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> f22<E> x(int i2, Object... objArr) {
        if (i2 == 0) {
            return r22.f8565g;
        }
        if (i2 == 1) {
            return new t22(objArr[0]);
        }
        int iO = o(i2);
        Object[] objArr2 = new Object[iO];
        int i3 = iO - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj = objArr[i6];
            k22.b(obj, i6);
            int iHashCode = obj.hashCode();
            int iA = u12.a(iHashCode);
            while (true) {
                int i7 = iA & i3;
                Object obj2 = objArr2[i7];
                if (obj2 == null) {
                    objArr[i5] = obj;
                    objArr2[i7] = obj;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj2.equals(obj)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            return new t22(objArr[0], i4);
        }
        if (o(i5) < iO / 2) {
            return x(i5, objArr);
        }
        if (y(i5, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new r22(objArr, i4, objArr2, i3, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean y(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof f22) && p() && ((f22) obj).p() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y12
    public b22<E> h() {
        b22<E> b22Var = this.f5779f;
        if (b22Var != null) {
            return b22Var;
        }
        b22<E> b22VarR = r();
        this.f5779f = b22VarR;
        return b22VarR;
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public int hashCode() {
        return s22.a(this);
    }

    @Override // com.google.android.gms.internal.ads.y12, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    boolean p() {
        return false;
    }

    b22<E> r() {
        return b22.w(toArray());
    }

    @Override // com.google.android.gms.internal.ads.y12, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Set.CC.$default$spliterator(this);
    }
}