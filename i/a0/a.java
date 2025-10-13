package i.a0;

import i.t.y;
import i.y.d.g;
import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.v;

/* compiled from: Progressions.kt */
/* loaded from: classes3.dex */
public class a implements Iterable<Integer>, i.y.d.z.a, Iterable {

    /* renamed from: e, reason: collision with root package name */
    public static final C0197a f15768e = new C0197a(null);

    /* renamed from: f, reason: collision with root package name */
    private final int f15769f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15770g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15771h;

    /* compiled from: Progressions.kt */
    /* renamed from: i.a0.a$a, reason: collision with other inner class name */
    public static final class C0197a {
        private C0197a() {
        }

        public final a a(int i2, int i3, int i4) {
            return new a(i2, i3, i4);
        }

        public /* synthetic */ C0197a(g gVar) {
            this();
        }
    }

    public a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f15769f = i2;
        this.f15770g = i.w.c.b(i2, i3, i4);
        this.f15771h = i4;
    }

    public final int a() {
        return this.f15769f;
    }

    public final int c() {
        return this.f15770g;
    }

    public final int e() {
        return this.f15771h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f15769f != aVar.f15769f || this.f15770g != aVar.f15770g || this.f15771h != aVar.f15771h) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public y iterator() {
        return new b(this.f15769f, this.f15770g, this.f15771h);
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f15769f * 31) + this.f15770g) * 31) + this.f15771h;
    }

    public boolean isEmpty() {
        if (this.f15771h > 0) {
            if (this.f15769f > this.f15770g) {
                return true;
            }
        } else if (this.f15769f < this.f15770g) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return v.o(iterator(), 0);
    }

    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f15771h > 0) {
            sb = new StringBuilder();
            sb.append(this.f15769f);
            sb.append("..");
            sb.append(this.f15770g);
            sb.append(" step ");
            i2 = this.f15771h;
        } else {
            sb = new StringBuilder();
            sb.append(this.f15769f);
            sb.append(" downTo ");
            sb.append(this.f15770g);
            sb.append(" step ");
            i2 = -this.f15771h;
        }
        sb.append(i2);
        return sb.toString();
    }
}