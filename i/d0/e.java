package i.d0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: Strings.kt */
/* loaded from: classes3.dex */
final class e implements i.c0.d<i.a0.c> {
    private final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15799b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15800c;

    /* renamed from: d, reason: collision with root package name */
    private final i.y.c.p<CharSequence, Integer, i.l<Integer, Integer>> f15801d;

    /* compiled from: Strings.kt */
    public static final class a implements Iterator<i.a0.c>, i.y.d.z.a, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        private int f15802e = -1;

        /* renamed from: f, reason: collision with root package name */
        private int f15803f;

        /* renamed from: g, reason: collision with root package name */
        private int f15804g;

        /* renamed from: h, reason: collision with root package name */
        private i.a0.c f15805h;

        /* renamed from: i, reason: collision with root package name */
        private int f15806i;

        a() {
            int iF = i.a0.f.f(e.this.f15799b, 0, e.this.a.length());
            this.f15803f = iF;
            this.f15804g = iF;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f15804g
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f15802e = r1
                r0 = 0
                r6.f15805h = r0
                goto L9e
            Lc:
                i.d0.e r0 = i.d0.e.this
                int r0 = i.d0.e.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f15806i
                int r0 = r0 + r3
                r6.f15806i = r0
                i.d0.e r4 = i.d0.e.this
                int r4 = i.d0.e.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f15804g
                i.d0.e r4 = i.d0.e.this
                java.lang.CharSequence r4 = i.d0.e.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                int r0 = r6.f15803f
                i.a0.c r1 = new i.a0.c
                i.d0.e r4 = i.d0.e.this
                java.lang.CharSequence r4 = i.d0.e.c(r4)
                int r4 = i.d0.q.L(r4)
                r1.<init>(r0, r4)
                r6.f15805h = r1
                r6.f15804g = r2
                goto L9c
            L47:
                i.d0.e r0 = i.d0.e.this
                i.y.c.p r0 = i.d0.e.b(r0)
                i.d0.e r4 = i.d0.e.this
                java.lang.CharSequence r4 = i.d0.e.c(r4)
                int r5 = r6.f15804g
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.i(r4, r5)
                i.l r0 = (i.l) r0
                if (r0 != 0) goto L77
                int r0 = r6.f15803f
                i.a0.c r1 = new i.a0.c
                i.d0.e r4 = i.d0.e.this
                java.lang.CharSequence r4 = i.d0.e.c(r4)
                int r4 = i.d0.q.L(r4)
                r1.<init>(r0, r4)
                r6.f15805h = r1
                r6.f15804g = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f15803f
                i.a0.c r4 = i.a0.d.i(r4, r2)
                r6.f15805h = r4
                int r2 = r2 + r0
                r6.f15803f = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.f15804g = r2
            L9c:
                r6.f15802e = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.d0.e.a.a():void");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i.a0.c next() {
            if (this.f15802e == -1) {
                a();
            }
            if (this.f15802e == 0) {
                throw new NoSuchElementException();
            }
            i.a0.c cVar = this.f15805h;
            Objects.requireNonNull(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f15805h = null;
            this.f15802e = -1;
            return cVar;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            if (this.f15802e == -1) {
                a();
            }
            return this.f15802e == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence charSequence, int i2, int i3, i.y.c.p<? super CharSequence, ? super Integer, i.l<Integer, Integer>> pVar) {
        i.y.d.l.d(charSequence, "input");
        i.y.d.l.d(pVar, "getNextMatch");
        this.a = charSequence;
        this.f15799b = i2;
        this.f15800c = i3;
        this.f15801d = pVar;
    }

    @Override // i.c0.d
    public java.util.Iterator<i.a0.c> iterator() {
        return new a();
    }
}