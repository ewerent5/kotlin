package e.c.b.b.c.e;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class i7 {
    private static final i7 A;
    private static final i7 B;
    private static final i7 C;
    private static final i7 D;
    private static final i7 E;
    private static final i7 F;
    private static final i7 G;
    private static final i7 H;
    private static final i7 I;
    private static final i7 J;
    private static final i7 K;
    private static final i7 L;
    private static final i7 M;
    public static final i7 N;
    private static final i7 O;
    private static final i7 P;
    private static final i7 Q;
    private static final i7 R;
    private static final i7 S;
    private static final i7 T;
    private static final i7 U;
    private static final i7 V;
    private static final i7 W;
    private static final i7 X;
    private static final i7 Y;
    private static final i7 Z;
    public static final i7 a0;
    private static final i7 b0;
    private static final i7 c0;
    private static final i7[] d0;

    /* renamed from: e, reason: collision with root package name */
    private static final i7 f14612e;
    private static final Type[] e0;

    /* renamed from: f, reason: collision with root package name */
    private static final i7 f14613f;
    private static final /* synthetic */ i7[] f0;

    /* renamed from: g, reason: collision with root package name */
    private static final i7 f14614g;

    /* renamed from: h, reason: collision with root package name */
    private static final i7 f14615h;

    /* renamed from: i, reason: collision with root package name */
    private static final i7 f14616i;

    /* renamed from: j, reason: collision with root package name */
    private static final i7 f14617j;

    /* renamed from: k, reason: collision with root package name */
    private static final i7 f14618k;

    /* renamed from: l, reason: collision with root package name */
    private static final i7 f14619l;

    /* renamed from: m, reason: collision with root package name */
    private static final i7 f14620m;
    private static final i7 n;
    private static final i7 o;
    private static final i7 p;
    private static final i7 q;
    private static final i7 r;
    private static final i7 s;
    private static final i7 t;
    private static final i7 u;
    private static final i7 v;
    private static final i7 w;
    private static final i7 x;
    private static final i7 y;
    private static final i7 z;
    private final c8 g0;
    private final int h0;
    private final k7 i0;
    private final Class<?> j0;
    private final boolean k0;

    static {
        k7 k7Var = k7.SCALAR;
        c8 c8Var = c8.f14429i;
        f14612e = new i7("DOUBLE", 0, 0, k7Var, c8Var);
        c8 c8Var2 = c8.f14428h;
        f14613f = new i7("FLOAT", 1, 1, k7Var, c8Var2);
        c8 c8Var3 = c8.f14427g;
        f14614g = new i7("INT64", 2, 2, k7Var, c8Var3);
        f14615h = new i7("UINT64", 3, 3, k7Var, c8Var3);
        c8 c8Var4 = c8.f14426f;
        f14616i = new i7("INT32", 4, 4, k7Var, c8Var4);
        f14617j = new i7("FIXED64", 5, 5, k7Var, c8Var3);
        f14618k = new i7("FIXED32", 6, 6, k7Var, c8Var4);
        c8 c8Var5 = c8.f14430j;
        f14619l = new i7("BOOL", 7, 7, k7Var, c8Var5);
        c8 c8Var6 = c8.f14431k;
        f14620m = new i7("STRING", 8, 8, k7Var, c8Var6);
        c8 c8Var7 = c8.n;
        n = new i7("MESSAGE", 9, 9, k7Var, c8Var7);
        c8 c8Var8 = c8.f14432l;
        o = new i7("BYTES", 10, 10, k7Var, c8Var8);
        p = new i7("UINT32", 11, 11, k7Var, c8Var4);
        c8 c8Var9 = c8.f14433m;
        q = new i7("ENUM", 12, 12, k7Var, c8Var9);
        r = new i7("SFIXED32", 13, 13, k7Var, c8Var4);
        s = new i7("SFIXED64", 14, 14, k7Var, c8Var3);
        t = new i7("SINT32", 15, 15, k7Var, c8Var4);
        u = new i7("SINT64", 16, 16, k7Var, c8Var3);
        v = new i7("GROUP", 17, 17, k7Var, c8Var7);
        k7 k7Var2 = k7.VECTOR;
        w = new i7("DOUBLE_LIST", 18, 18, k7Var2, c8Var);
        x = new i7("FLOAT_LIST", 19, 19, k7Var2, c8Var2);
        y = new i7("INT64_LIST", 20, 20, k7Var2, c8Var3);
        z = new i7("UINT64_LIST", 21, 21, k7Var2, c8Var3);
        A = new i7("INT32_LIST", 22, 22, k7Var2, c8Var4);
        B = new i7("FIXED64_LIST", 23, 23, k7Var2, c8Var3);
        C = new i7("FIXED32_LIST", 24, 24, k7Var2, c8Var4);
        D = new i7("BOOL_LIST", 25, 25, k7Var2, c8Var5);
        E = new i7("STRING_LIST", 26, 26, k7Var2, c8Var6);
        F = new i7("MESSAGE_LIST", 27, 27, k7Var2, c8Var7);
        G = new i7("BYTES_LIST", 28, 28, k7Var2, c8Var8);
        H = new i7("UINT32_LIST", 29, 29, k7Var2, c8Var4);
        I = new i7("ENUM_LIST", 30, 30, k7Var2, c8Var9);
        J = new i7("SFIXED32_LIST", 31, 31, k7Var2, c8Var4);
        K = new i7("SFIXED64_LIST", 32, 32, k7Var2, c8Var3);
        L = new i7("SINT32_LIST", 33, 33, k7Var2, c8Var4);
        M = new i7("SINT64_LIST", 34, 34, k7Var2, c8Var3);
        k7 k7Var3 = k7.PACKED_VECTOR;
        N = new i7("DOUBLE_LIST_PACKED", 35, 35, k7Var3, c8Var);
        O = new i7("FLOAT_LIST_PACKED", 36, 36, k7Var3, c8Var2);
        P = new i7("INT64_LIST_PACKED", 37, 37, k7Var3, c8Var3);
        Q = new i7("UINT64_LIST_PACKED", 38, 38, k7Var3, c8Var3);
        R = new i7("INT32_LIST_PACKED", 39, 39, k7Var3, c8Var4);
        S = new i7("FIXED64_LIST_PACKED", 40, 40, k7Var3, c8Var3);
        T = new i7("FIXED32_LIST_PACKED", 41, 41, k7Var3, c8Var4);
        U = new i7("BOOL_LIST_PACKED", 42, 42, k7Var3, c8Var5);
        V = new i7("UINT32_LIST_PACKED", 43, 43, k7Var3, c8Var4);
        W = new i7("ENUM_LIST_PACKED", 44, 44, k7Var3, c8Var9);
        X = new i7("SFIXED32_LIST_PACKED", 45, 45, k7Var3, c8Var4);
        c8 c8Var10 = c8.f14427g;
        Y = new i7("SFIXED64_LIST_PACKED", 46, 46, k7Var3, c8Var10);
        Z = new i7("SINT32_LIST_PACKED", 47, 47, k7Var3, c8.f14426f);
        a0 = new i7("SINT64_LIST_PACKED", 48, 48, k7Var3, c8Var10);
        b0 = new i7("GROUP_LIST", 49, 49, k7Var2, c8Var7);
        c0 = new i7("MAP", 50, 50, k7.MAP, c8.f14425e);
        f0 = new i7[]{f14612e, f14613f, f14614g, f14615h, f14616i, f14617j, f14618k, f14619l, f14620m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a0, b0, c0};
        e0 = new Type[0];
        i7[] i7VarArrValues = values();
        d0 = new i7[i7VarArrValues.length];
        for (i7 i7Var : i7VarArrValues) {
            d0[i7Var.h0] = i7Var;
        }
    }

    private i7(String str, int i2, int i3, k7 k7Var, c8 c8Var) {
        int i4;
        this.h0 = i3;
        this.i0 = k7Var;
        this.g0 = c8Var;
        int i5 = l7.a[k7Var.ordinal()];
        if (i5 == 1 || i5 == 2) {
            this.j0 = c8Var.a();
        } else {
            this.j0 = null;
        }
        this.k0 = (k7Var != k7.SCALAR || (i4 = l7.f14690b[c8Var.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : true;
    }

    public static i7[] values() {
        return (i7[]) f0.clone();
    }

    public final int zza() {
        return this.h0;
    }
}