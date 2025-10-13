package k.c.g.g;

import android.graphics.Point;
import android.graphics.drawable.Drawable;

/* compiled from: OverlayItem.java */
/* loaded from: classes3.dex */
public class f {
    protected static final Point a = new Point(26, 94);

    /* renamed from: b, reason: collision with root package name */
    protected final String f16881b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f16882c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f16883d;

    /* renamed from: e, reason: collision with root package name */
    protected final k.c.a.a f16884e;

    /* renamed from: f, reason: collision with root package name */
    protected Drawable f16885f;

    /* renamed from: g, reason: collision with root package name */
    protected a f16886g;

    /* compiled from: OverlayItem.java */
    public enum a {
        NONE,
        CENTER,
        BOTTOM_CENTER,
        TOP_CENTER,
        RIGHT_CENTER,
        LEFT_CENTER,
        UPPER_RIGHT_CORNER,
        LOWER_RIGHT_CORNER,
        UPPER_LEFT_CORNER,
        LOWER_LEFT_CORNER
    }

    public f(String str, String str2, k.c.a.a aVar) {
        this(null, str, str2, aVar);
    }

    public static void h(Drawable drawable, int i2) {
        int[] iArr = new int[3];
        int i3 = 0;
        if ((i2 & 1) > 0) {
            iArr[0] = 16842919;
            i3 = 1;
        }
        if ((i2 & 2) > 0) {
            iArr[i3] = 16842913;
            i3++;
        }
        if ((i2 & 4) > 0) {
            iArr[i3] = 16842908;
        }
        drawable.setState(iArr);
    }

    public Drawable a(int i2) {
        Drawable drawable = this.f16885f;
        if (drawable == null) {
            return null;
        }
        h(drawable, i2);
        return this.f16885f;
    }

    public a b() {
        return this.f16886g;
    }

    public k.c.a.a c() {
        return this.f16884e;
    }

    public String d() {
        return this.f16883d;
    }

    public String e() {
        return this.f16882c;
    }

    public void f(Drawable drawable) {
        this.f16885f = drawable;
    }

    public void g(a aVar) {
        if (aVar == null) {
            aVar = a.BOTTOM_CENTER;
        }
        this.f16886g = aVar;
    }

    public f(String str, String str2, String str3, k.c.a.a aVar) {
        this.f16882c = str2;
        this.f16883d = str3;
        this.f16884e = aVar;
        this.f16881b = str;
    }
}