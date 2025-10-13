package i;

import ch.qos.logback.core.CoreConstants;

/* compiled from: KotlinVersion.kt */
/* loaded from: classes3.dex */
public final class e implements Comparable<e> {

    /* renamed from: g, reason: collision with root package name */
    private final int f15819g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15820h;

    /* renamed from: i, reason: collision with root package name */
    private final int f15821i;

    /* renamed from: j, reason: collision with root package name */
    private final int f15822j;

    /* renamed from: f, reason: collision with root package name */
    public static final a f15818f = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final e f15817e = f.a();

    /* compiled from: KotlinVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    public e(int i2, int i3, int i4) {
        this.f15820h = i2;
        this.f15821i = i3;
        this.f15822j = i4;
        this.f15819g = b(i2, i3, i4);
    }

    private final int b(int i2, int i3, int i4) {
        if (i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3 && i4 >= 0 && 255 >= i4) {
            return (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + CoreConstants.DOT + i3 + CoreConstants.DOT + i4).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        i.y.d.l.d(eVar, "other");
        return this.f15819g - eVar.f15819g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            obj = null;
        }
        e eVar = (e) obj;
        return eVar != null && this.f15819g == eVar.f15819g;
    }

    public int hashCode() {
        return this.f15819g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15820h);
        sb.append(CoreConstants.DOT);
        sb.append(this.f15821i);
        sb.append(CoreConstants.DOT);
        sb.append(this.f15822j);
        return sb.toString();
    }
}