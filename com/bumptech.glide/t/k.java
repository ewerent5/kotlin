package com.bumptech.glide.t;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.o.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class k {
    private static final char[] a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f4252b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    private static volatile Handler f4253c;

    /* compiled from: Util.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private k() {
    }

    public static void a() {
        if (!q()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj instanceof l ? ((l) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static String d(byte[] bArr, char[] cArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = a;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> e(int i2) {
        return new ArrayDeque(i2);
    }

    public static int f(int i2, int i3, Bitmap.Config config) {
        return i2 * i3 * h(config);
    }

    @TargetApi(19)
    public static int g(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    private static int h(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = a.a[config.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2 || i2 == 3) {
            return 2;
        }
        return i2 != 4 ? 4 : 8;
    }

    public static <T> List<T> i(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private static Handler j() {
        if (f4253c == null) {
            synchronized (k.class) {
                if (f4253c == null) {
                    f4253c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f4253c;
    }

    public static int k(float f2) {
        return l(f2, 17);
    }

    public static int l(float f2, int i2) {
        return m(Float.floatToIntBits(f2), i2);
    }

    public static int m(int i2, int i3) {
        return (i3 * 31) + i2;
    }

    public static int n(Object obj, int i2) {
        return m(obj == null ? 0 : obj.hashCode(), i2);
    }

    public static int o(boolean z, int i2) {
        return m(z ? 1 : 0, i2);
    }

    public static boolean p() {
        return !q();
    }

    public static boolean q() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean r(int i2) {
        return i2 > 0 || i2 == Integer.MIN_VALUE;
    }

    public static boolean s(int i2, int i3) {
        return r(i2) && r(i3);
    }

    public static void t(Runnable runnable) {
        j().post(runnable);
    }

    public static void u(Runnable runnable) {
        j().removeCallbacks(runnable);
    }

    public static String v(byte[] bArr) {
        String strD;
        char[] cArr = f4252b;
        synchronized (cArr) {
            strD = d(bArr, cArr);
        }
        return strD;
    }
}