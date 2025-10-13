package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
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
public final class im2 {

    /* renamed from: e, reason: collision with root package name */
    public static final im2 f6544e;

    /* renamed from: f, reason: collision with root package name */
    public static final im2 f6545f;

    /* renamed from: g, reason: collision with root package name */
    public static final im2 f6546g;

    /* renamed from: h, reason: collision with root package name */
    public static final im2 f6547h;

    /* renamed from: i, reason: collision with root package name */
    public static final im2 f6548i;

    /* renamed from: j, reason: collision with root package name */
    public static final im2 f6549j;

    /* renamed from: k, reason: collision with root package name */
    public static final im2 f6550k;

    /* renamed from: l, reason: collision with root package name */
    public static final im2 f6551l;

    /* renamed from: m, reason: collision with root package name */
    public static final im2 f6552m;
    public static final im2 n;
    public static final im2 o;
    public static final im2 p;
    public static final im2 q;
    public static final im2 r;
    public static final im2 s;
    public static final im2 t;
    public static final im2 u;
    public static final im2 v;
    private static final /* synthetic */ im2[] w;
    private final jm2 x;

    static {
        im2 im2Var = new im2("DOUBLE", 0, jm2.DOUBLE, 1);
        f6544e = im2Var;
        im2 im2Var2 = new im2("FLOAT", 1, jm2.FLOAT, 5);
        f6545f = im2Var2;
        jm2 jm2Var = jm2.LONG;
        im2 im2Var3 = new im2("INT64", 2, jm2Var, 0);
        f6546g = im2Var3;
        im2 im2Var4 = new im2("UINT64", 3, jm2Var, 0);
        f6547h = im2Var4;
        jm2 jm2Var2 = jm2.INT;
        im2 im2Var5 = new im2("INT32", 4, jm2Var2, 0);
        f6548i = im2Var5;
        im2 im2Var6 = new im2("FIXED64", 5, jm2Var, 1);
        f6549j = im2Var6;
        im2 im2Var7 = new im2("FIXED32", 6, jm2Var2, 5);
        f6550k = im2Var7;
        im2 im2Var8 = new im2("BOOL", 7, jm2.BOOLEAN, 0);
        f6551l = im2Var8;
        im2 im2Var9 = new im2("STRING", 8, jm2.STRING, 2);
        f6552m = im2Var9;
        jm2 jm2Var3 = jm2.MESSAGE;
        im2 im2Var10 = new im2("GROUP", 9, jm2Var3, 3);
        n = im2Var10;
        im2 im2Var11 = new im2("MESSAGE", 10, jm2Var3, 2);
        o = im2Var11;
        im2 im2Var12 = new im2("BYTES", 11, jm2.BYTE_STRING, 2);
        p = im2Var12;
        im2 im2Var13 = new im2("UINT32", 12, jm2Var2, 0);
        q = im2Var13;
        im2 im2Var14 = new im2("ENUM", 13, jm2.ENUM, 0);
        r = im2Var14;
        im2 im2Var15 = new im2("SFIXED32", 14, jm2Var2, 5);
        s = im2Var15;
        im2 im2Var16 = new im2("SFIXED64", 15, jm2Var, 1);
        t = im2Var16;
        im2 im2Var17 = new im2("SINT32", 16, jm2Var2, 0);
        u = im2Var17;
        im2 im2Var18 = new im2("SINT64", 17, jm2Var, 0);
        v = im2Var18;
        w = new im2[]{im2Var, im2Var2, im2Var3, im2Var4, im2Var5, im2Var6, im2Var7, im2Var8, im2Var9, im2Var10, im2Var11, im2Var12, im2Var13, im2Var14, im2Var15, im2Var16, im2Var17, im2Var18};
    }

    private im2(String str, int i2, jm2 jm2Var, int i3) {
        this.x = jm2Var;
    }

    public static im2[] values() {
        return (im2[]) w.clone();
    }

    public final jm2 a() {
        return this.x;
    }
}