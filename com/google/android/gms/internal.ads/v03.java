package com.google.android.gms.internal.ads;

import android.os.Build;
import ch.qos.logback.classic.Level;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class v03 {
    public static final int a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f9613b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f9614c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f9615d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f9616e;

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f9617f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f9618g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f9619h;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i2 = 26;
        }
        a = i2;
        String str = Build.DEVICE;
        f9613b = str;
        String str2 = Build.MANUFACTURER;
        f9614c = str2;
        String str3 = Build.MODEL;
        f9615d = str3;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i2);
        f9616e = sb.toString();
        f9617f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f9618g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f9619h = Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static ExecutorService b(String str) {
        return Executors.newSingleThreadExecutor(new u03("Loader:ExtractorMediaPeriod"));
    }

    public static void c(pz2 pz2Var) {
        if (pz2Var != null) {
            try {
                pz2Var.zzd();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] d(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static int e(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int f(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static float g(float f2, float f3, float f4) {
        return Math.max(0.1f, Math.min(f2, 8.0f));
    }

    public static int h(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            i2 = iBinarySearch + 1;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static int i(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            i2 = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    public static long j(long j2, long j3, long j4) {
        return (j4 < j3 || j4 % j3 != 0) ? (j4 >= j3 || j3 % j4 != 0) ? (long) (j2 * (j3 / j4)) : j2 * (j3 / j4) : j2 / (j4 / j3);
    }

    public static void k(long[] jArr, long j2, long j3) {
        int i2 = 0;
        if (j3 >= 1000000 && j3 % 1000000 == 0) {
            long j4 = j3 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
            return;
        }
        if (j3 >= 1000000 || 1000000 % j3 != 0) {
            double d2 = 1000000.0d / j3;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d2);
                i2++;
            }
            return;
        }
        long j5 = 1000000 / j3;
        while (i2 < jArr.length) {
            jArr[i2] = jArr[i2] * j5;
            i2++;
        }
    }

    public static int l(String str) {
        int length = str.length();
        f03.a(length <= 4);
        int iCharAt = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iCharAt = (iCharAt << 8) | str.charAt(i2);
        }
        return iCharAt;
    }

    public static byte[] m(String str) {
        byte[] bArr = new byte[38];
        for (int i2 = 0; i2 < 38; i2++) {
            int i3 = i2 + i2;
            bArr[i2] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3 + 1), 16));
        }
        return bArr;
    }

    public static String n(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int length = objArr.length;
            if (i2 >= length) {
                return sb.toString();
            }
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }

    public static int o(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 != 16) {
            return i2 != 24 ? i2 != 32 ? 0 : 1073741824 : Level.ALL_INT;
        }
        return 2;
    }

    public static int p(int i2, int i3) {
        if (i2 == Integer.MIN_VALUE) {
            return i3 * 3;
        }
        if (i2 == 1073741824) {
            return i3 * 4;
        }
        if (i2 == 2) {
            return i3 + i3;
        }
        if (i2 == 3) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    public static int q(int i2) {
        return i2 != 1 ? 13107200 : 3538944;
    }
}