package k.a.a.a;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: ArrayUtils.java */
/* loaded from: classes3.dex */
public class a {
    public static final boolean[] a = new boolean[0];

    /* renamed from: b */
    public static final Boolean[] f16511b = new Boolean[0];

    /* renamed from: c */
    public static final byte[] f16512c = new byte[0];

    /* renamed from: d */
    public static final Byte[] f16513d = new Byte[0];

    /* renamed from: e */
    public static final char[] f16514e = new char[0];

    /* renamed from: f */
    public static final Character[] f16515f = new Character[0];

    /* renamed from: g */
    public static final Class<?>[] f16516g = new Class[0];

    /* renamed from: h */
    public static final double[] f16517h = new double[0];

    /* renamed from: i */
    public static final Double[] f16518i = new Double[0];

    /* renamed from: j */
    public static final Field[] f16519j = new Field[0];

    /* renamed from: k */
    public static final float[] f16520k = new float[0];

    /* renamed from: l */
    public static final Float[] f16521l = new Float[0];

    /* renamed from: m */
    public static final int[] f16522m = new int[0];
    public static final Integer[] n = new Integer[0];
    public static final long[] o = new long[0];
    public static final Long[] p = new Long[0];
    public static final Method[] q = new Method[0];
    public static final Object[] r = new Object[0];
    public static final short[] s = new short[0];
    public static final Short[] t = new Short[0];
    public static final String[] u = new String[0];
    public static final Throwable[] v = new Throwable[0];
    public static final Type[] w = new Type[0];

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static boolean b(Object[] objArr) {
        return a(objArr) == 0;
    }
}