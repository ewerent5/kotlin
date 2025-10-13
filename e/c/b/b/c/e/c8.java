package e.c.b.b.c.e;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class c8 {

    /* renamed from: e, reason: collision with root package name */
    public static final c8 f14425e;

    /* renamed from: f, reason: collision with root package name */
    public static final c8 f14426f;

    /* renamed from: g, reason: collision with root package name */
    public static final c8 f14427g;

    /* renamed from: h, reason: collision with root package name */
    public static final c8 f14428h;

    /* renamed from: i, reason: collision with root package name */
    public static final c8 f14429i;

    /* renamed from: j, reason: collision with root package name */
    public static final c8 f14430j;

    /* renamed from: k, reason: collision with root package name */
    public static final c8 f14431k;

    /* renamed from: l, reason: collision with root package name */
    public static final c8 f14432l;

    /* renamed from: m, reason: collision with root package name */
    public static final c8 f14433m;
    public static final c8 n;
    private static final /* synthetic */ c8[] o;
    private final Class<?> p;
    private final Class<?> q;
    private final Object r;

    static {
        c8 c8Var = new c8("VOID", 0, Void.class, Void.class, null);
        f14425e = c8Var;
        Class cls = Integer.TYPE;
        c8 c8Var2 = new c8("INT", 1, cls, Integer.class, 0);
        f14426f = c8Var2;
        c8 c8Var3 = new c8("LONG", 2, Long.TYPE, Long.class, 0L);
        f14427g = c8Var3;
        c8 c8Var4 = new c8("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f14428h = c8Var4;
        c8 c8Var5 = new c8("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f14429i = c8Var5;
        c8 c8Var6 = new c8("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f14430j = c8Var6;
        c8 c8Var7 = new c8("STRING", 6, String.class, String.class, "");
        f14431k = c8Var7;
        c8 c8Var8 = new c8("BYTE_STRING", 7, g6.class, g6.class, g6.f14544e);
        f14432l = c8Var8;
        c8 c8Var9 = new c8("ENUM", 8, cls, Integer.class, null);
        f14433m = c8Var9;
        c8 c8Var10 = new c8("MESSAGE", 9, Object.class, Object.class, null);
        n = c8Var10;
        o = new c8[]{c8Var, c8Var2, c8Var3, c8Var4, c8Var5, c8Var6, c8Var7, c8Var8, c8Var9, c8Var10};
    }

    private c8(String str, int i2, Class cls, Class cls2, Object obj) {
        this.p = cls;
        this.q = cls2;
        this.r = obj;
    }

    public static c8[] values() {
        return (c8[]) o.clone();
    }

    public final Class<?> a() {
        return this.q;
    }
}