package com.google.android.gms.internal.ads;

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
/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rj2 {

    /* renamed from: e, reason: collision with root package name */
    public static final rj2 f8656e;

    /* renamed from: f, reason: collision with root package name */
    public static final rj2 f8657f;

    /* renamed from: g, reason: collision with root package name */
    public static final rj2 f8658g;

    /* renamed from: h, reason: collision with root package name */
    public static final rj2 f8659h;

    /* renamed from: i, reason: collision with root package name */
    public static final rj2 f8660i;

    /* renamed from: j, reason: collision with root package name */
    public static final rj2 f8661j;

    /* renamed from: k, reason: collision with root package name */
    public static final rj2 f8662k;

    /* renamed from: l, reason: collision with root package name */
    public static final rj2 f8663l;

    /* renamed from: m, reason: collision with root package name */
    public static final rj2 f8664m;
    public static final rj2 n;
    private static final /* synthetic */ rj2[] o;
    private final Class<?> p;
    private final Class<?> q;
    private final Object r;

    static {
        rj2 rj2Var = new rj2("VOID", 0, Void.class, Void.class, null);
        f8656e = rj2Var;
        Class cls = Integer.TYPE;
        rj2 rj2Var2 = new rj2("INT", 1, cls, Integer.class, 0);
        f8657f = rj2Var2;
        rj2 rj2Var3 = new rj2("LONG", 2, Long.TYPE, Long.class, 0L);
        f8658g = rj2Var3;
        rj2 rj2Var4 = new rj2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f8659h = rj2Var4;
        rj2 rj2Var5 = new rj2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f8660i = rj2Var5;
        rj2 rj2Var6 = new rj2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f8661j = rj2Var6;
        rj2 rj2Var7 = new rj2("STRING", 6, String.class, String.class, "");
        f8662k = rj2Var7;
        rj2 rj2Var8 = new rj2("BYTE_STRING", 7, ci2.class, ci2.class, ci2.f5319e);
        f8663l = rj2Var8;
        rj2 rj2Var9 = new rj2("ENUM", 8, cls, Integer.class, null);
        f8664m = rj2Var9;
        rj2 rj2Var10 = new rj2("MESSAGE", 9, Object.class, Object.class, null);
        n = rj2Var10;
        o = new rj2[]{rj2Var, rj2Var2, rj2Var3, rj2Var4, rj2Var5, rj2Var6, rj2Var7, rj2Var8, rj2Var9, rj2Var10};
    }

    private rj2(String str, int i2, Class cls, Class cls2, Object obj) {
        this.p = cls;
        this.q = cls2;
        this.r = obj;
    }

    public static rj2[] values() {
        return (rj2[]) o.clone();
    }

    public final Class<?> a() {
        return this.q;
    }
}