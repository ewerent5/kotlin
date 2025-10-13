package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import okhttp3.HttpUrl;

/* compiled from: NavType.java */
/* loaded from: classes.dex */
public abstract class p<T> {
    public static final p<Integer> a = new c(false);

    /* renamed from: b, reason: collision with root package name */
    public static final p<Integer> f1350b = new d(false);

    /* renamed from: c, reason: collision with root package name */
    public static final p<int[]> f1351c = new e(true);

    /* renamed from: d, reason: collision with root package name */
    public static final p<Long> f1352d = new f(false);

    /* renamed from: e, reason: collision with root package name */
    public static final p<long[]> f1353e = new g(true);

    /* renamed from: f, reason: collision with root package name */
    public static final p<Float> f1354f = new h(false);

    /* renamed from: g, reason: collision with root package name */
    public static final p<float[]> f1355g = new i(true);

    /* renamed from: h, reason: collision with root package name */
    public static final p<Boolean> f1356h = new j(false);

    /* renamed from: i, reason: collision with root package name */
    public static final p<boolean[]> f1357i = new k(true);

    /* renamed from: j, reason: collision with root package name */
    public static final p<String> f1358j = new a(true);

    /* renamed from: k, reason: collision with root package name */
    public static final p<String[]> f1359k = new b(true);

    /* renamed from: l, reason: collision with root package name */
    private final boolean f1360l;

    /* compiled from: NavType.java */
    class a extends p<String> {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.p
        public String c() {
            return "string";
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String b(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // androidx.navigation.p
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String k(String str) {
            return str;
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    /* compiled from: NavType.java */
    class b extends p<String[]> {
        b(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.p
        public String c() {
            return "string[]";
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String[] b(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.p
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    /* compiled from: NavType.java */
    class c extends p<Integer> {
        c(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.p
        public String c() {
            return "integer";
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.p
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(String str) {
            return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* compiled from: NavType.java */
    class d extends p<Integer> {
        d(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.p
        public String c() {
            return "reference";
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.p
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(String str) {
            return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* compiled from: NavType.java */
    class e extends p<int[]> {
        e(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.p
        public String c() {
            return "integer[]";
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public int[] b(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.p
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public int[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    /* compiled from: NavType.java */
    class f extends p<Long> {
        f(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.p
        public String c() {
            return "long";
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long b(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        @Override // androidx.navigation.p
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long k(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            return str.startsWith("0x") ? Long.valueOf(Long.parseLong(str.substring(2), 16)) : Long.valueOf(Long.parseLong(str));
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Long l2) {
            bundle.putLong(str, l2.longValue());
        }
    }

    /* compiled from: NavType.java */
    class g extends p<long[]> {
        g(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.p
        public String c() {
            return "long[]";
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public long[] b(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.p
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public long[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    /* compiled from: NavType.java */
    class h extends p<Float> {
        h(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.p
        public String c() {
            return "float";
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float b(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        @Override // androidx.navigation.p
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float k(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Float f2) {
            bundle.putFloat(str, f2.floatValue());
        }
    }

    /* compiled from: NavType.java */
    class i extends p<float[]> {
        i(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.p
        public String c() {
            return "float[]";
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public float[] b(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.p
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public float[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    /* compiled from: NavType.java */
    class j extends p<Boolean> {
        j(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.p
        public String c() {
            return "boolean";
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean b(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.navigation.p
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean k(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* compiled from: NavType.java */
    class k extends p<boolean[]> {
        k(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.p
        public String c() {
            return "boolean[]";
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean[] b(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.p
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* compiled from: NavType.java */
    public static final class l<D extends Enum> extends C0018p<D> {
        private final Class<D> n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // androidx.navigation.p.C0018p, androidx.navigation.p
        public String c() {
            return this.n.getName();
        }

        @Override // androidx.navigation.p.C0018p
        /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D k(String str) {
            for (D d2 : this.n.getEnumConstants()) {
                if (d2.name().equals(str)) {
                    return d2;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.n.getName() + ".");
        }
    }

    /* compiled from: NavType.java */
    public static final class m<D extends Parcelable> extends p<D[]> {

        /* renamed from: m, reason: collision with root package name */
        private final Class<D[]> f1361m;

        public m(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.f1361m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.navigation.p
        public String c() {
            return this.f1361m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.f1361m.equals(((m) obj).f1361m);
        }

        public int hashCode() {
            return this.f1361m.hashCode();
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] b(Bundle bundle, String str) {
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        @Override // androidx.navigation.p
        public D[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.f1361m.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    /* compiled from: NavType.java */
    public static final class n<D> extends p<D> {

        /* renamed from: m, reason: collision with root package name */
        private final Class<D> f1362m;

        public n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f1362m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        @Override // androidx.navigation.p
        public D b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.p
        public String c() {
            return this.f1362m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.f1362m.equals(((n) obj).f1362m);
        }

        @Override // androidx.navigation.p
        /* renamed from: h */
        public D k(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.f1362m.hashCode();
        }

        @Override // androidx.navigation.p
        public void i(Bundle bundle, String str, D d2) {
            this.f1362m.cast(d2);
            if (d2 == null || (d2 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d2);
            } else if (d2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d2);
            }
        }
    }

    /* compiled from: NavType.java */
    public static final class o<D extends Serializable> extends p<D[]> {

        /* renamed from: m, reason: collision with root package name */
        private final Class<D[]> f1363m;

        public o(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.f1363m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.navigation.p
        public String c() {
            return this.f1363m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.f1363m.equals(((o) obj).f1363m);
        }

        public int hashCode() {
            return this.f1363m.hashCode();
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] b(Bundle bundle, String str) {
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        @Override // androidx.navigation.p
        public D[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.f1363m.cast(dArr);
            bundle.putSerializable(str, dArr);
        }
    }

    p(boolean z) {
        this.f1360l = z;
    }

    public static p<?> a(String str, String str2) throws ClassNotFoundException {
        String strSubstring;
        p<Integer> pVar = a;
        if (pVar.c().equals(str)) {
            return pVar;
        }
        p pVar2 = f1351c;
        if (pVar2.c().equals(str)) {
            return pVar2;
        }
        p<Long> pVar3 = f1352d;
        if (pVar3.c().equals(str)) {
            return pVar3;
        }
        p pVar4 = f1353e;
        if (pVar4.c().equals(str)) {
            return pVar4;
        }
        p<Boolean> pVar5 = f1356h;
        if (pVar5.c().equals(str)) {
            return pVar5;
        }
        p pVar6 = f1357i;
        if (pVar6.c().equals(str)) {
            return pVar6;
        }
        p<String> pVar7 = f1358j;
        if (pVar7.c().equals(str)) {
            return pVar7;
        }
        p pVar8 = f1359k;
        if (pVar8.c().equals(str)) {
            return pVar8;
        }
        p<Float> pVar9 = f1354f;
        if (pVar9.c().equals(str)) {
            return pVar9;
        }
        p pVar10 = f1355g;
        if (pVar10.c().equals(str)) {
            return pVar10;
        }
        p<Integer> pVar11 = f1350b;
        if (pVar11.c().equals(str)) {
            return pVar11;
        }
        if (str == null || str.isEmpty()) {
            return pVar7;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                strSubstring = str;
            } else {
                strSubstring = str2 + str;
            }
            if (str.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                Class<?> cls = Class.forName(strSubstring);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new m(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new o(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(strSubstring);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new n(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new l(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new C0018p(cls2);
                }
            }
            throw new IllegalArgumentException(strSubstring + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    static p d(String str) {
        try {
            try {
                try {
                    try {
                        p<Integer> pVar = a;
                        pVar.k(str);
                        return pVar;
                    } catch (IllegalArgumentException unused) {
                        return f1358j;
                    }
                } catch (IllegalArgumentException unused2) {
                    p<Long> pVar2 = f1352d;
                    pVar2.k(str);
                    return pVar2;
                }
            } catch (IllegalArgumentException unused3) {
                p<Float> pVar3 = f1354f;
                pVar3.k(str);
                return pVar3;
            }
        } catch (IllegalArgumentException unused4) {
            p<Boolean> pVar4 = f1356h;
            pVar4.k(str);
            return pVar4;
        }
    }

    static p e(Object obj) {
        if (obj instanceof Integer) {
            return a;
        }
        if (obj instanceof int[]) {
            return f1351c;
        }
        if (obj instanceof Long) {
            return f1352d;
        }
        if (obj instanceof long[]) {
            return f1353e;
        }
        if (obj instanceof Float) {
            return f1354f;
        }
        if (obj instanceof float[]) {
            return f1355g;
        }
        if (obj instanceof Boolean) {
            return f1356h;
        }
        if (obj instanceof boolean[]) {
            return f1357i;
        }
        if ((obj instanceof String) || obj == null) {
            return f1358j;
        }
        if (obj instanceof String[]) {
            return f1359k;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new m(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new o(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new n(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new l(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new C0018p(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    public abstract T b(Bundle bundle, String str);

    public abstract String c();

    public boolean f() {
        return this.f1360l;
    }

    T g(Bundle bundle, String str, String str2) {
        T tK = k(str2);
        i(bundle, str, tK);
        return tK;
    }

    /* renamed from: h */
    public abstract T k(String str);

    public abstract void i(Bundle bundle, String str, T t);

    public String toString() {
        return c();
    }

    /* compiled from: NavType.java */
    /* renamed from: androidx.navigation.p$p, reason: collision with other inner class name */
    public static class C0018p<D extends Serializable> extends p<D> {

        /* renamed from: m, reason: collision with root package name */
        private final Class<D> f1364m;

        public C0018p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            if (!cls.isEnum()) {
                this.f1364m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
        }

        @Override // androidx.navigation.p
        public String c() {
            return this.f1364m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0018p) {
                return this.f1364m.equals(((C0018p) obj).f1364m);
            }
            return false;
        }

        public int hashCode() {
            return this.f1364m.hashCode();
        }

        @Override // androidx.navigation.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.p
        public D k(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, D d2) {
            this.f1364m.cast(d2);
            bundle.putSerializable(str, d2);
        }

        C0018p(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f1364m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }
    }
}