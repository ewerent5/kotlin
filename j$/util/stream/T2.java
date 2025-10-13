package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
final class T2 {
    public static final T2 DISTINCT;
    public static final T2 ORDERED;
    public static final T2 SHORT_CIRCUIT;
    public static final T2 SIZED;
    public static final T2 SORTED;
    static final int a;

    /* renamed from: b, reason: collision with root package name */
    static final int f16216b;

    /* renamed from: c, reason: collision with root package name */
    static final int f16217c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f16218d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f16219e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f16220f;

    /* renamed from: g, reason: collision with root package name */
    static final int f16221g;

    /* renamed from: h, reason: collision with root package name */
    static final int f16222h;

    /* renamed from: i, reason: collision with root package name */
    static final int f16223i;

    /* renamed from: j, reason: collision with root package name */
    static final int f16224j;

    /* renamed from: k, reason: collision with root package name */
    static final int f16225k;

    /* renamed from: l, reason: collision with root package name */
    static final int f16226l;

    /* renamed from: m, reason: collision with root package name */
    static final int f16227m;
    static final int n;
    static final int o;
    static final int p;
    private static final /* synthetic */ T2[] q;
    private final Map r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;

    private static class a {
        final Map a;

        a(Map map) {
            this.a = map;
        }

        a a(b bVar) {
            this.a.put(bVar, 2);
            return this;
        }

        a b(b bVar) {
            this.a.put(bVar, 1);
            return this;
        }

        a c(b bVar) {
            this.a.put(bVar, 3);
            return this;
        }
    }

    enum b {
        SPLITERATOR,
        STREAM,
        OP,
        TERMINAL_OP,
        UPSTREAM_TERMINAL_OP
    }

    static {
        b bVar = b.SPLITERATOR;
        a aVarV = v(bVar);
        b bVar2 = b.STREAM;
        aVarV.b(bVar2);
        b bVar3 = b.OP;
        aVarV.c(bVar3);
        T2 t2 = new T2("DISTINCT", 0, 0, aVarV);
        DISTINCT = t2;
        a aVarV2 = v(bVar);
        aVarV2.b(bVar2);
        aVarV2.c(bVar3);
        T2 t22 = new T2("SORTED", 1, 1, aVarV2);
        SORTED = t22;
        a aVarV3 = v(bVar);
        aVarV3.b(bVar2);
        aVarV3.c(bVar3);
        b bVar4 = b.TERMINAL_OP;
        aVarV3.a(bVar4);
        b bVar5 = b.UPSTREAM_TERMINAL_OP;
        aVarV3.a(bVar5);
        T2 t23 = new T2("ORDERED", 2, 2, aVarV3);
        ORDERED = t23;
        a aVarV4 = v(bVar);
        aVarV4.b(bVar2);
        aVarV4.a(bVar3);
        T2 t24 = new T2("SIZED", 3, 3, aVarV4);
        SIZED = t24;
        a aVarV5 = v(bVar3);
        aVarV5.b(bVar4);
        T2 t25 = new T2("SHORT_CIRCUIT", 4, 12, aVarV5);
        SHORT_CIRCUIT = t25;
        q = new T2[]{t2, t22, t23, t24, t25};
        a = j(bVar);
        int iJ = j(bVar2);
        f16216b = iJ;
        f16217c = j(bVar3);
        j(bVar4);
        j(bVar5);
        T2[] t2ArrValues = values();
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            i2 |= t2ArrValues[i3].v;
        }
        f16218d = i2;
        f16219e = iJ;
        int i4 = iJ << 1;
        f16220f = i4;
        f16221g = iJ | i4;
        f16222h = t2.t;
        f16223i = t2.u;
        f16224j = t22.t;
        f16225k = t22.u;
        f16226l = t23.t;
        f16227m = t23.u;
        n = t24.t;
        o = t24.u;
        p = t25.t;
    }

    private T2(String str, int i2, int i3, a aVar) {
        b[] bVarArrValues = b.values();
        for (int i4 = 0; i4 < 5; i4++) {
            b bVar = bVarArrValues[i4];
            Map map = aVar.a;
            if (map instanceof j$.util.Map) {
                ((j$.util.Map) map).putIfAbsent(bVar, 0);
            } else {
                Map.CC.$default$putIfAbsent(map, bVar, 0);
            }
        }
        this.r = aVar.a;
        int i5 = i3 * 2;
        this.s = i5;
        this.t = 1 << i5;
        this.u = 2 << i5;
        this.v = 3 << i5;
    }

    static int h(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? f16218d : ~(((f16219e & i2) << 1) | i2 | ((f16220f & i2) >> 1))));
    }

    private static int j(b bVar) {
        T2[] t2ArrValues = values();
        int iIntValue = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            T2 t2 = t2ArrValues[i2];
            iIntValue |= ((Integer) t2.r.get(bVar)).intValue() << t2.s;
        }
        return iIntValue;
    }

    static int l(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        return ((iCharacteristics & 4) == 0 || spliterator.getComparator() == null) ? a & iCharacteristics : a & iCharacteristics & (-5);
    }

    private static a v(b bVar) {
        EnumMap enumMap = new EnumMap(b.class);
        a aVar = new a(enumMap);
        enumMap.put((EnumMap) bVar, (b) 1);
        return aVar;
    }

    public static T2 valueOf(String str) {
        return (T2) Enum.valueOf(T2.class, str);
    }

    public static T2[] values() {
        return (T2[]) q.clone();
    }

    static int w(int i2) {
        return i2 & ((~i2) >> 1) & f16219e;
    }

    boolean n(int i2) {
        return (i2 & this.v) == this.t;
    }

    boolean t(int i2) {
        int i3 = this.v;
        return (i2 & i3) == i3;
    }
}