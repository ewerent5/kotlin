package e.c.b.b.c.e;

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
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public class ya {

    /* renamed from: e, reason: collision with root package name */
    public static final ya f14953e;

    /* renamed from: f, reason: collision with root package name */
    public static final ya f14954f;

    /* renamed from: g, reason: collision with root package name */
    public static final ya f14955g;

    /* renamed from: h, reason: collision with root package name */
    public static final ya f14956h;

    /* renamed from: i, reason: collision with root package name */
    public static final ya f14957i;

    /* renamed from: j, reason: collision with root package name */
    public static final ya f14958j;

    /* renamed from: k, reason: collision with root package name */
    public static final ya f14959k;

    /* renamed from: l, reason: collision with root package name */
    public static final ya f14960l;

    /* renamed from: m, reason: collision with root package name */
    public static final ya f14961m;
    public static final ya n;
    public static final ya o;
    public static final ya p;
    public static final ya q;
    public static final ya r;
    public static final ya s;
    public static final ya t;
    public static final ya u;
    public static final ya v;
    private static final /* synthetic */ ya[] w;
    private final fb x;
    private final int y;

    static {
        ya yaVar = new ya("DOUBLE", 0, fb.DOUBLE, 1);
        f14953e = yaVar;
        ya yaVar2 = new ya("FLOAT", 1, fb.FLOAT, 5);
        f14954f = yaVar2;
        fb fbVar = fb.LONG;
        final int i2 = 2;
        ya yaVar3 = new ya("INT64", 2, fbVar, 0);
        f14955g = yaVar3;
        final int i3 = 3;
        ya yaVar4 = new ya("UINT64", 3, fbVar, 0);
        f14956h = yaVar4;
        fb fbVar2 = fb.INT;
        ya yaVar5 = new ya("INT32", 4, fbVar2, 0);
        f14957i = yaVar5;
        ya yaVar6 = new ya("FIXED64", 5, fbVar, 1);
        f14958j = yaVar6;
        ya yaVar7 = new ya("FIXED32", 6, fbVar2, 5);
        f14959k = yaVar7;
        ya yaVar8 = new ya("BOOL", 7, fb.BOOLEAN, 0);
        f14960l = yaVar8;
        final fb fbVar3 = fb.STRING;
        final String str = "STRING";
        final int i4 = 8;
        ya yaVar9 = new ya(str, i4, fbVar3, i2) { // from class: e.c.b.b.c.e.bb
            {
                int i5 = 8;
                int i6 = 2;
            }
        };
        f14961m = yaVar9;
        final fb fbVar4 = fb.MESSAGE;
        final String str2 = "GROUP";
        final int i5 = 9;
        ya yaVar10 = new ya(str2, i5, fbVar4, i3) { // from class: e.c.b.b.c.e.ab
            {
                int i6 = 9;
                int i7 = 3;
            }
        };
        n = yaVar10;
        final String str3 = "MESSAGE";
        final int i6 = 10;
        final int i7 = 2;
        ya yaVar11 = new ya(str3, i6, fbVar4, i7) { // from class: e.c.b.b.c.e.db
            {
                int i8 = 10;
                int i9 = 2;
            }
        };
        o = yaVar11;
        final fb fbVar5 = fb.BYTE_STRING;
        final String str4 = "BYTES";
        final int i8 = 11;
        ya yaVar12 = new ya(str4, i8, fbVar5, i7) { // from class: e.c.b.b.c.e.cb
            {
                int i9 = 11;
                int i10 = 2;
            }
        };
        p = yaVar12;
        ya yaVar13 = new ya("UINT32", 12, fbVar2, 0);
        q = yaVar13;
        ya yaVar14 = new ya("ENUM", 13, fb.ENUM, 0);
        r = yaVar14;
        ya yaVar15 = new ya("SFIXED32", 14, fbVar2, 5);
        s = yaVar15;
        ya yaVar16 = new ya("SFIXED64", 15, fbVar, 1);
        t = yaVar16;
        ya yaVar17 = new ya("SINT32", 16, fbVar2, 0);
        u = yaVar17;
        ya yaVar18 = new ya("SINT64", 17, fbVar, 0);
        v = yaVar18;
        w = new ya[]{yaVar, yaVar2, yaVar3, yaVar4, yaVar5, yaVar6, yaVar7, yaVar8, yaVar9, yaVar10, yaVar11, yaVar12, yaVar13, yaVar14, yaVar15, yaVar16, yaVar17, yaVar18};
    }

    private ya(String str, int i2, fb fbVar, int i3) {
        this.x = fbVar;
        this.y = i3;
    }

    public static ya[] values() {
        return (ya[]) w.clone();
    }

    public final fb a() {
        return this.x;
    }
}