package i.t;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: _ArraysJvm.kt */
/* loaded from: classes3.dex */
public class g extends f {
    public static <T> List<T> b(T[] tArr) {
        i.y.d.l.d(tArr, "$this$asList");
        List<T> listA = i.a(tArr);
        i.y.d.l.c(listA, "ArraysUtilJVM.asList(this)");
        return listA;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        i.y.d.l.d(bArr, "$this$copyInto");
        i.y.d.l.d(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
        return bArr2;
    }

    public static final <T> T[] d(T[] tArr, T[] tArr2, int i2, int i3, int i4) {
        i.y.d.l.d(tArr, "$this$copyInto");
        i.y.d.l.d(tArr2, "destination");
        System.arraycopy(tArr, i3, tArr2, i2, i4 - i3);
        return tArr2;
    }

    public static /* synthetic */ byte[] e(byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bArr.length;
        }
        return c(bArr, bArr2, i2, i3, i4);
    }

    public static /* synthetic */ Object[] f(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        return d(objArr, objArr2, i2, i3, i4);
    }

    public static byte[] g(byte[] bArr, int i2, int i3) {
        i.y.d.l.d(bArr, "$this$copyOfRangeImpl");
        e.a(i3, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        i.y.d.l.c(bArrCopyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return bArrCopyOfRange;
    }

    public static final void h(int[] iArr, int i2, int i3, int i4) {
        i.y.d.l.d(iArr, "$this$fill");
        Arrays.fill(iArr, i3, i4, i2);
    }

    public static <T> void i(T[] tArr, T t, int i2, int i3) {
        i.y.d.l.d(tArr, "$this$fill");
        Arrays.fill(tArr, i2, i3, t);
    }

    public static /* synthetic */ void j(int[] iArr, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = iArr.length;
        }
        h(iArr, i2, i3, i4);
    }

    public static /* synthetic */ void k(Object[] objArr, Object obj, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = objArr.length;
        }
        i(objArr, obj, i2, i3);
    }

    public static final <T> void l(T[] tArr, Comparator<? super T> comparator) {
        i.y.d.l.d(tArr, "$this$sortWith");
        i.y.d.l.d(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}