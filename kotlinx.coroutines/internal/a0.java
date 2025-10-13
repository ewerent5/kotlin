package kotlinx.coroutines.internal;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemProps.common.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 {
    public static final int a(String str, int i2, int i3, int i4) {
        return (int) y.c(str, i2, i3, i4);
    }

    public static final long b(String str, long j2, long j3, long j4) {
        String strD = y.d(str);
        if (strD == null) {
            return j2;
        }
        Long lK = i.d0.o.k(strD);
        if (lK == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + CoreConstants.SINGLE_QUOTE_CHAR).toString());
        }
        long jLongValue = lK.longValue();
        if (j3 <= jLongValue && j4 >= jLongValue) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + jLongValue + CoreConstants.SINGLE_QUOTE_CHAR).toString());
    }

    public static final boolean c(String str, boolean z) {
        String strD = y.d(str);
        return strD != null ? Boolean.parseBoolean(strD) : z;
    }

    public static /* synthetic */ int d(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return y.b(str, i2, i3, i4);
    }

    public static /* synthetic */ long e(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return y.c(str, j2, j5, j4);
    }
}