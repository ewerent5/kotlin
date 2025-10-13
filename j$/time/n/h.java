package j$.time.n;

import ch.qos.logback.core.CoreConstants;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class h {
    public static final h a = new h('0', '+', CoreConstants.DASH_CHAR, CoreConstants.DOT);

    /* renamed from: b, reason: collision with root package name */
    private final char f15967b;

    /* renamed from: c, reason: collision with root package name */
    private final char f15968c;

    /* renamed from: d, reason: collision with root package name */
    private final char f15969d;

    /* renamed from: e, reason: collision with root package name */
    private final char f15970e;

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private h(char c2, char c3, char c4, char c5) {
        this.f15967b = c2;
        this.f15968c = c3;
        this.f15969d = c4;
        this.f15970e = c5;
    }

    String a(String str) {
        char c2 = this.f15967b;
        if (c2 == '0') {
            return str;
        }
        int i2 = c2 - '0';
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < charArray.length; i3++) {
            charArray[i3] = (char) (charArray[i3] + i2);
        }
        return new String(charArray);
    }

    public char b() {
        return this.f15970e;
    }

    public char c() {
        return this.f15969d;
    }

    public char d() {
        return this.f15968c;
    }

    public char e() {
        return this.f15967b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f15967b == hVar.f15967b && this.f15968c == hVar.f15968c && this.f15969d == hVar.f15969d && this.f15970e == hVar.f15970e;
    }

    public int hashCode() {
        return this.f15967b + this.f15968c + this.f15969d + this.f15970e;
    }

    public String toString() {
        StringBuilder sbA = j$.T0.a.a.a.a.a("DecimalStyle[");
        sbA.append(this.f15967b);
        sbA.append(this.f15968c);
        sbA.append(this.f15969d);
        sbA.append(this.f15970e);
        sbA.append("]");
        return sbA.toString();
    }
}