package j.f0;

import i.y.d.l;
import j.a0;

/* compiled from: SegmentedByteString.kt */
/* loaded from: classes3.dex */
public final class c {
    public static final int a(int[] iArr, int i2, int i3, int i4) {
        l.d(iArr, "$this$binarySearch");
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i2) {
                i3 = i6 + 1;
            } else {
                if (i7 <= i2) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return (-i3) - 1;
    }

    public static final int b(a0 a0Var, int i2) {
        l.d(a0Var, "$this$segment");
        int iA = a(a0Var.z(), i2 + 1, 0, a0Var.A().length);
        return iA >= 0 ? iA : ~iA;
    }
}