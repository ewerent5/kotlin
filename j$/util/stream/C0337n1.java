package j$.util.stream;

import j$.util.stream.InterfaceC0333m1;
import java.util.Collections;
import java.util.EnumSet;

/* renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0337n1 {
    static {
        InterfaceC0333m1.a aVar = InterfaceC0333m1.a.CONCURRENT;
        InterfaceC0333m1.a aVar2 = InterfaceC0333m1.a.UNORDERED;
        InterfaceC0333m1.a aVar3 = InterfaceC0333m1.a.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(aVar, aVar2, aVar3));
        Collections.unmodifiableSet(EnumSet.of(aVar, aVar2));
        Collections.unmodifiableSet(EnumSet.of(aVar3));
        Collections.unmodifiableSet(EnumSet.of(aVar2, aVar3));
        Collections.emptySet();
    }

    static double a(double[] dArr) {
        double d2 = dArr[0] + dArr[1];
        double d3 = dArr[dArr.length - 1];
        return (Double.isNaN(d2) && Double.isInfinite(d3)) ? d3 : d2;
    }

    static double[] b(double[] dArr, double d2) {
        double d3 = d2 - dArr[1];
        double d4 = dArr[0];
        double d5 = d4 + d3;
        dArr[1] = (d5 - d4) - d3;
        dArr[0] = d5;
        return dArr;
    }
}