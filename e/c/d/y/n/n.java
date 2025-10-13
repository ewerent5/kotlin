package e.c.d.y.n;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.slf4j.Marker;

/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class n {
    public static final e.c.d.v<String> A;
    public static final e.c.d.v<BigDecimal> B;
    public static final e.c.d.v<BigInteger> C;
    public static final e.c.d.w D;
    public static final e.c.d.v<StringBuilder> E;
    public static final e.c.d.w F;
    public static final e.c.d.v<StringBuffer> G;
    public static final e.c.d.w H;
    public static final e.c.d.v<URL> I;
    public static final e.c.d.w J;
    public static final e.c.d.v<URI> K;
    public static final e.c.d.w L;
    public static final e.c.d.v<InetAddress> M;
    public static final e.c.d.w N;
    public static final e.c.d.v<UUID> O;
    public static final e.c.d.w P;
    public static final e.c.d.v<Currency> Q;
    public static final e.c.d.w R;
    public static final e.c.d.w S;
    public static final e.c.d.v<Calendar> T;
    public static final e.c.d.w U;
    public static final e.c.d.v<Locale> V;
    public static final e.c.d.w W;
    public static final e.c.d.v<e.c.d.l> X;
    public static final e.c.d.w Y;
    public static final e.c.d.w Z;
    public static final e.c.d.v<Class> a;

    /* renamed from: b, reason: collision with root package name */
    public static final e.c.d.w f15550b;

    /* renamed from: c, reason: collision with root package name */
    public static final e.c.d.v<BitSet> f15551c;

    /* renamed from: d, reason: collision with root package name */
    public static final e.c.d.w f15552d;

    /* renamed from: e, reason: collision with root package name */
    public static final e.c.d.v<Boolean> f15553e;

    /* renamed from: f, reason: collision with root package name */
    public static final e.c.d.v<Boolean> f15554f;

    /* renamed from: g, reason: collision with root package name */
    public static final e.c.d.w f15555g;

    /* renamed from: h, reason: collision with root package name */
    public static final e.c.d.v<Number> f15556h;

    /* renamed from: i, reason: collision with root package name */
    public static final e.c.d.w f15557i;

    /* renamed from: j, reason: collision with root package name */
    public static final e.c.d.v<Number> f15558j;

    /* renamed from: k, reason: collision with root package name */
    public static final e.c.d.w f15559k;

    /* renamed from: l, reason: collision with root package name */
    public static final e.c.d.v<Number> f15560l;

    /* renamed from: m, reason: collision with root package name */
    public static final e.c.d.w f15561m;
    public static final e.c.d.v<AtomicInteger> n;
    public static final e.c.d.w o;
    public static final e.c.d.v<AtomicBoolean> p;
    public static final e.c.d.w q;
    public static final e.c.d.v<AtomicIntegerArray> r;
    public static final e.c.d.w s;
    public static final e.c.d.v<Number> t;
    public static final e.c.d.v<Number> u;
    public static final e.c.d.v<Number> v;
    public static final e.c.d.v<Number> w;
    public static final e.c.d.w x;
    public static final e.c.d.v<Character> y;
    public static final e.c.d.w z;

    /* compiled from: TypeAdapters.java */
    class a extends e.c.d.v<AtomicIntegerArray> {
        a() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(e.c.d.a0.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.v()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.N()));
                } catch (NumberFormatException e2) {
                    throw new e.c.d.t(e2);
                }
            }
            aVar.j();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.d();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.a0(atomicIntegerArray.get(i2));
            }
            cVar.j();
        }
    }

    /* compiled from: TypeAdapters.java */
    class a0 implements e.c.d.w {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Class f15562e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Class f15563f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e.c.d.v f15564g;

        a0(Class cls, Class cls2, e.c.d.v vVar) {
            this.f15562e = cls;
            this.f15563f = cls2;
            this.f15564g = vVar;
        }

        @Override // e.c.d.w
        public <T> e.c.d.v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            Class<? super T> clsC = aVar.c();
            if (clsC == this.f15562e || clsC == this.f15563f) {
                return this.f15564g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f15562e.getName() + Marker.ANY_NON_NULL_MARKER + this.f15563f.getName() + ",adapter=" + this.f15564g + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    class b extends e.c.d.v<Number> {
        b() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return Long.valueOf(aVar.T());
            } catch (NumberFormatException e2) {
                throw new e.c.d.t(e2);
            }
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Number number) throws IOException {
            cVar.h0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    class b0 implements e.c.d.w {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Class f15565e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.c.d.v f15566f;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        /* compiled from: TypeAdapters.java */
        class a<T1> extends e.c.d.v<T1> {
            final /* synthetic */ Class a;

            a(Class cls) {
                this.a = cls;
            }

            @Override // e.c.d.v
            public T1 b(e.c.d.a0.a aVar) {
                T1 t1 = (T1) b0.this.f15566f.b(aVar);
                if (t1 == null || this.a.isInstance(t1)) {
                    return t1;
                }
                throw new e.c.d.t("Expected a " + this.a.getName() + " but was " + t1.getClass().getName());
            }

            @Override // e.c.d.v
            public void d(e.c.d.a0.c cVar, T1 t1) {
                b0.this.f15566f.d(cVar, t1);
            }
        }

        b0(Class cls, e.c.d.v vVar) {
            this.f15565e = cls;
            this.f15566f = vVar;
        }

        @Override // e.c.d.w
        public <T2> e.c.d.v<T2> a(e.c.d.f fVar, e.c.d.z.a<T2> aVar) {
            Class<? super T2> clsC = aVar.c();
            if (this.f15565e.isAssignableFrom(clsC)) {
                return new a(clsC);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f15565e.getName() + ",adapter=" + this.f15566f + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    class c extends e.c.d.v<Number> {
        c() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return Float.valueOf((float) aVar.K());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Number number) throws IOException {
            cVar.h0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    static /* synthetic */ class c0 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.c.d.a0.b.values().length];
            a = iArr;
            try {
                iArr[e.c.d.a0.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.c.d.a0.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.c.d.a0.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.c.d.a0.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.c.d.a0.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.c.d.a0.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.c.d.a0.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.c.d.a0.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e.c.d.a0.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[e.c.d.a0.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: TypeAdapters.java */
    class d extends e.c.d.v<Number> {
        d() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return Double.valueOf(aVar.K());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Number number) throws IOException {
            cVar.h0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    class d0 extends e.c.d.v<Boolean> {
        d0() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(e.c.d.a0.a aVar) throws IOException {
            e.c.d.a0.b bVarK0 = aVar.k0();
            if (bVarK0 != e.c.d.a0.b.NULL) {
                return bVarK0 == e.c.d.a0.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.h0())) : Boolean.valueOf(aVar.D());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Boolean bool) throws IOException {
            cVar.b0(bool);
        }
    }

    /* compiled from: TypeAdapters.java */
    class e extends e.c.d.v<Number> {
        e() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(e.c.d.a0.a aVar) throws IOException {
            e.c.d.a0.b bVarK0 = aVar.k0();
            int i2 = c0.a[bVarK0.ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new e.c.d.y.g(aVar.h0());
            }
            if (i2 == 4) {
                aVar.a0();
                return null;
            }
            throw new e.c.d.t("Expecting number, got: " + bVarK0);
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Number number) throws IOException {
            cVar.h0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    class e0 extends e.c.d.v<Boolean> {
        e0() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return Boolean.valueOf(aVar.h0());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Boolean bool) throws IOException {
            cVar.j0(bool == null ? "null" : bool.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    class f extends e.c.d.v<Character> {
        f() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            String strH0 = aVar.h0();
            if (strH0.length() == 1) {
                return Character.valueOf(strH0.charAt(0));
            }
            throw new e.c.d.t("Expecting character, got: " + strH0);
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Character ch2) throws IOException {
            cVar.j0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* compiled from: TypeAdapters.java */
    class f0 extends e.c.d.v<Number> {
        f0() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.N());
            } catch (NumberFormatException e2) {
                throw new e.c.d.t(e2);
            }
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Number number) throws IOException {
            cVar.h0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    class g extends e.c.d.v<String> {
        g() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(e.c.d.a0.a aVar) throws IOException {
            e.c.d.a0.b bVarK0 = aVar.k0();
            if (bVarK0 != e.c.d.a0.b.NULL) {
                return bVarK0 == e.c.d.a0.b.BOOLEAN ? Boolean.toString(aVar.D()) : aVar.h0();
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, String str) throws IOException {
            cVar.j0(str);
        }
    }

    /* compiled from: TypeAdapters.java */
    class g0 extends e.c.d.v<Number> {
        g0() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.N());
            } catch (NumberFormatException e2) {
                throw new e.c.d.t(e2);
            }
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Number number) throws IOException {
            cVar.h0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    class h extends e.c.d.v<BigDecimal> {
        h() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return new BigDecimal(aVar.h0());
            } catch (NumberFormatException e2) {
                throw new e.c.d.t(e2);
            }
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.h0(bigDecimal);
        }
    }

    /* compiled from: TypeAdapters.java */
    class h0 extends e.c.d.v<Number> {
        h0() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.N());
            } catch (NumberFormatException e2) {
                throw new e.c.d.t(e2);
            }
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Number number) throws IOException {
            cVar.h0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    class i extends e.c.d.v<BigInteger> {
        i() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return new BigInteger(aVar.h0());
            } catch (NumberFormatException e2) {
                throw new e.c.d.t(e2);
            }
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, BigInteger bigInteger) throws IOException {
            cVar.h0(bigInteger);
        }
    }

    /* compiled from: TypeAdapters.java */
    class i0 extends e.c.d.v<AtomicInteger> {
        i0() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(e.c.d.a0.a aVar) {
            try {
                return new AtomicInteger(aVar.N());
            } catch (NumberFormatException e2) {
                throw new e.c.d.t(e2);
            }
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.a0(atomicInteger.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    class j extends e.c.d.v<StringBuilder> {
        j() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return new StringBuilder(aVar.h0());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, StringBuilder sb) throws IOException {
            cVar.j0(sb == null ? null : sb.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    class j0 extends e.c.d.v<AtomicBoolean> {
        j0() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(e.c.d.a0.a aVar) {
            return new AtomicBoolean(aVar.D());
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.k0(atomicBoolean.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    class k extends e.c.d.v<Class> {
        k() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(e.c.d.a0.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* compiled from: TypeAdapters.java */
    private static final class k0<T extends Enum<T>> extends e.c.d.v<T> {
        private final Map<String, T> a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<T, String> f15568b = new HashMap();

        public k0(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String strName = t.name();
                    e.c.d.x.c cVar = (e.c.d.x.c) cls.getField(strName).getAnnotation(e.c.d.x.c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.a.put(str, t);
                        }
                    }
                    this.a.put(strName, t);
                    this.f15568b.put(t, strName);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return this.a.get(aVar.h0());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, T t) throws IOException {
            cVar.j0(t == null ? null : this.f15568b.get(t));
        }
    }

    /* compiled from: TypeAdapters.java */
    class l extends e.c.d.v<StringBuffer> {
        l() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return new StringBuffer(aVar.h0());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.j0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    class m extends e.c.d.v<URL> {
        m() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            String strH0 = aVar.h0();
            if ("null".equals(strH0)) {
                return null;
            }
            return new URL(strH0);
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, URL url) throws IOException {
            cVar.j0(url == null ? null : url.toExternalForm());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: e.c.d.y.n.n$n, reason: collision with other inner class name */
    class C0192n extends e.c.d.v<URI> {
        C0192n() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                String strH0 = aVar.h0();
                if ("null".equals(strH0)) {
                    return null;
                }
                return new URI(strH0);
            } catch (URISyntaxException e2) {
                throw new e.c.d.m(e2);
            }
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, URI uri) throws IOException {
            cVar.j0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* compiled from: TypeAdapters.java */
    class o extends e.c.d.v<InetAddress> {
        o() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return InetAddress.getByName(aVar.h0());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, InetAddress inetAddress) throws IOException {
            cVar.j0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* compiled from: TypeAdapters.java */
    class p extends e.c.d.v<UUID> {
        p() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return UUID.fromString(aVar.h0());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, UUID uuid) throws IOException {
            cVar.j0(uuid == null ? null : uuid.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    class q extends e.c.d.v<Currency> {
        q() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(e.c.d.a0.a aVar) {
            return Currency.getInstance(aVar.h0());
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Currency currency) throws IOException {
            cVar.j0(currency.getCurrencyCode());
        }
    }

    /* compiled from: TypeAdapters.java */
    class r implements e.c.d.w {

        /* compiled from: TypeAdapters.java */
        class a extends e.c.d.v<Timestamp> {
            final /* synthetic */ e.c.d.v a;

            a(e.c.d.v vVar) {
                this.a = vVar;
            }

            @Override // e.c.d.v
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Timestamp b(e.c.d.a0.a aVar) {
                Date date = (Date) this.a.b(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // e.c.d.v
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(e.c.d.a0.c cVar, Timestamp timestamp) {
                this.a.d(cVar, timestamp);
            }
        }

        r() {
        }

        @Override // e.c.d.w
        public <T> e.c.d.v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            if (aVar.c() != Timestamp.class) {
                return null;
            }
            return new a(fVar.m(Date.class));
        }
    }

    /* compiled from: TypeAdapters.java */
    class s extends e.c.d.v<Calendar> {
        s() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(e.c.d.a0.a aVar) throws IOException, NumberFormatException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            aVar.c();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.k0() != e.c.d.a0.b.END_OBJECT) {
                String strW = aVar.W();
                int iN = aVar.N();
                if ("year".equals(strW)) {
                    i2 = iN;
                } else if ("month".equals(strW)) {
                    i3 = iN;
                } else if ("dayOfMonth".equals(strW)) {
                    i4 = iN;
                } else if ("hourOfDay".equals(strW)) {
                    i5 = iN;
                } else if ("minute".equals(strW)) {
                    i6 = iN;
                } else if ("second".equals(strW)) {
                    i7 = iN;
                }
            }
            aVar.q();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.C();
                return;
            }
            cVar.g();
            cVar.A("year");
            cVar.a0(calendar.get(1));
            cVar.A("month");
            cVar.a0(calendar.get(2));
            cVar.A("dayOfMonth");
            cVar.a0(calendar.get(5));
            cVar.A("hourOfDay");
            cVar.a0(calendar.get(11));
            cVar.A("minute");
            cVar.a0(calendar.get(12));
            cVar.A("second");
            cVar.a0(calendar.get(13));
            cVar.q();
        }
    }

    /* compiled from: TypeAdapters.java */
    class t extends e.c.d.v<Locale> {
        t() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.h0(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Locale locale) throws IOException {
            cVar.j0(locale == null ? null : locale.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    class u extends e.c.d.v<e.c.d.l> {
        u() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public e.c.d.l b(e.c.d.a0.a aVar) throws IOException {
            switch (c0.a[aVar.k0().ordinal()]) {
                case 1:
                    return new e.c.d.q(new e.c.d.y.g(aVar.h0()));
                case 2:
                    return new e.c.d.q(Boolean.valueOf(aVar.D()));
                case 3:
                    return new e.c.d.q(aVar.h0());
                case 4:
                    aVar.a0();
                    return e.c.d.n.a;
                case 5:
                    e.c.d.i iVar = new e.c.d.i();
                    aVar.b();
                    while (aVar.v()) {
                        iVar.n(b(aVar));
                    }
                    aVar.j();
                    return iVar;
                case 6:
                    e.c.d.o oVar = new e.c.d.o();
                    aVar.c();
                    while (aVar.v()) {
                        oVar.n(aVar.W(), b(aVar));
                    }
                    aVar.q();
                    return oVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, e.c.d.l lVar) throws IOException {
            if (lVar == null || lVar.k()) {
                cVar.C();
                return;
            }
            if (lVar.m()) {
                e.c.d.q qVarE = lVar.e();
                if (qVarE.x()) {
                    cVar.h0(qVarE.t());
                    return;
                } else if (qVarE.u()) {
                    cVar.k0(qVarE.n());
                    return;
                } else {
                    cVar.j0(qVarE.f());
                    return;
                }
            }
            if (lVar.h()) {
                cVar.d();
                Iterator<e.c.d.l> it = lVar.a().iterator();
                while (it.hasNext()) {
                    d(cVar, it.next());
                }
                cVar.j();
                return;
            }
            if (!lVar.l()) {
                throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
            }
            cVar.g();
            for (Map.Entry<String, e.c.d.l> entry : lVar.c().o()) {
                cVar.A(entry.getKey());
                d(cVar, entry.getValue());
            }
            cVar.q();
        }
    }

    /* compiled from: TypeAdapters.java */
    class v extends e.c.d.v<BitSet> {
        v() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.BitSet b(e.c.d.a0.a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.b()
                e.c.d.a0.b r1 = r8.k0()
                r2 = 0
                r3 = 0
            Le:
                e.c.d.a0.b r4 = e.c.d.a0.b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = e.c.d.y.n.n.c0.a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.h0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = 0
                goto L69
            L30:
                e.c.d.t r8 = new e.c.d.t
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                e.c.d.t r8 = new e.c.d.t
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.D()
                goto L69
            L63:
                int r1 = r8.N()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                e.c.d.a0.b r1 = r8.k0()
                goto Le
            L75:
                r8.j()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.c.d.y.n.n.v.b(e.c.d.a0.a):java.util.BitSet");
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, BitSet bitSet) throws IOException {
            cVar.d();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.a0(bitSet.get(i2) ? 1L : 0L);
            }
            cVar.j();
        }
    }

    /* compiled from: TypeAdapters.java */
    class w implements e.c.d.w {
        w() {
        }

        @Override // e.c.d.w
        public <T> e.c.d.v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            Class<? super T> clsC = aVar.c();
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new k0(clsC);
        }
    }

    /* compiled from: TypeAdapters.java */
    class x implements e.c.d.w {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e.c.d.z.a f15570e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.c.d.v f15571f;

        x(e.c.d.z.a aVar, e.c.d.v vVar) {
            this.f15570e = aVar;
            this.f15571f = vVar;
        }

        @Override // e.c.d.w
        public <T> e.c.d.v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            if (aVar.equals(this.f15570e)) {
                return this.f15571f;
            }
            return null;
        }
    }

    /* compiled from: TypeAdapters.java */
    class y implements e.c.d.w {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Class f15572e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.c.d.v f15573f;

        y(Class cls, e.c.d.v vVar) {
            this.f15572e = cls;
            this.f15573f = vVar;
        }

        @Override // e.c.d.w
        public <T> e.c.d.v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            if (aVar.c() == this.f15572e) {
                return this.f15573f;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f15572e.getName() + ",adapter=" + this.f15573f + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    class z implements e.c.d.w {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Class f15574e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Class f15575f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e.c.d.v f15576g;

        z(Class cls, Class cls2, e.c.d.v vVar) {
            this.f15574e = cls;
            this.f15575f = cls2;
            this.f15576g = vVar;
        }

        @Override // e.c.d.w
        public <T> e.c.d.v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            Class<? super T> clsC = aVar.c();
            if (clsC == this.f15574e || clsC == this.f15575f) {
                return this.f15576g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f15575f.getName() + Marker.ANY_NON_NULL_MARKER + this.f15574e.getName() + ",adapter=" + this.f15576g + "]";
        }
    }

    static {
        e.c.d.v<Class> vVarA = new k().a();
        a = vVarA;
        f15550b = b(Class.class, vVarA);
        e.c.d.v<BitSet> vVarA2 = new v().a();
        f15551c = vVarA2;
        f15552d = b(BitSet.class, vVarA2);
        d0 d0Var = new d0();
        f15553e = d0Var;
        f15554f = new e0();
        f15555g = c(Boolean.TYPE, Boolean.class, d0Var);
        f0 f0Var = new f0();
        f15556h = f0Var;
        f15557i = c(Byte.TYPE, Byte.class, f0Var);
        g0 g0Var = new g0();
        f15558j = g0Var;
        f15559k = c(Short.TYPE, Short.class, g0Var);
        h0 h0Var = new h0();
        f15560l = h0Var;
        f15561m = c(Integer.TYPE, Integer.class, h0Var);
        e.c.d.v<AtomicInteger> vVarA3 = new i0().a();
        n = vVarA3;
        o = b(AtomicInteger.class, vVarA3);
        e.c.d.v<AtomicBoolean> vVarA4 = new j0().a();
        p = vVarA4;
        q = b(AtomicBoolean.class, vVarA4);
        e.c.d.v<AtomicIntegerArray> vVarA5 = new a().a();
        r = vVarA5;
        s = b(AtomicIntegerArray.class, vVarA5);
        t = new b();
        u = new c();
        v = new d();
        e eVar = new e();
        w = eVar;
        x = b(Number.class, eVar);
        f fVar = new f();
        y = fVar;
        z = c(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = b(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = b(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = b(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = b(URL.class, mVar);
        C0192n c0192n = new C0192n();
        K = c0192n;
        L = b(URI.class, c0192n);
        o oVar = new o();
        M = oVar;
        N = e(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = b(UUID.class, pVar);
        e.c.d.v<Currency> vVarA6 = new q().a();
        Q = vVarA6;
        R = b(Currency.class, vVarA6);
        S = new r();
        s sVar = new s();
        T = sVar;
        U = d(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = b(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = e(e.c.d.l.class, uVar);
        Z = new w();
    }

    public static <TT> e.c.d.w a(e.c.d.z.a<TT> aVar, e.c.d.v<TT> vVar) {
        return new x(aVar, vVar);
    }

    public static <TT> e.c.d.w b(Class<TT> cls, e.c.d.v<TT> vVar) {
        return new y(cls, vVar);
    }

    public static <TT> e.c.d.w c(Class<TT> cls, Class<TT> cls2, e.c.d.v<? super TT> vVar) {
        return new z(cls, cls2, vVar);
    }

    public static <TT> e.c.d.w d(Class<TT> cls, Class<? extends TT> cls2, e.c.d.v<? super TT> vVar) {
        return new a0(cls, cls2, vVar);
    }

    public static <T1> e.c.d.w e(Class<T1> cls, e.c.d.v<T1> vVar) {
        return new b0(cls, vVar);
    }
}