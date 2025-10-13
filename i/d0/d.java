package i.d0;

import java.nio.charset.Charset;

/* compiled from: Charsets.kt */
/* loaded from: classes3.dex */
public final class d {
    public static final Charset a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f15791b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f15792c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f15793d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f15794e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f15795f;

    /* renamed from: g, reason: collision with root package name */
    private static Charset f15796g;

    /* renamed from: h, reason: collision with root package name */
    private static Charset f15797h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f15798i = new d();

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        i.y.d.l.c(charsetForName, "Charset.forName(\"UTF-8\")");
        a = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        i.y.d.l.c(charsetForName2, "Charset.forName(\"UTF-16\")");
        f15791b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        i.y.d.l.c(charsetForName3, "Charset.forName(\"UTF-16BE\")");
        f15792c = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        i.y.d.l.c(charsetForName4, "Charset.forName(\"UTF-16LE\")");
        f15793d = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        i.y.d.l.c(charsetForName5, "Charset.forName(\"US-ASCII\")");
        f15794e = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        i.y.d.l.c(charsetForName6, "Charset.forName(\"ISO-8859-1\")");
        f15795f = charsetForName6;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f15797h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        i.y.d.l.c(charsetForName, "Charset.forName(\"UTF-32BE\")");
        f15797h = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f15796g;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        i.y.d.l.c(charsetForName, "Charset.forName(\"UTF-32LE\")");
        f15796g = charsetForName;
        return charsetForName;
    }
}