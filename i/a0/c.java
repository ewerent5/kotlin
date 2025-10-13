package i.a0;

import i.y.d.g;

/* compiled from: Ranges.kt */
/* loaded from: classes3.dex */
public final class c extends i.a0.a {

    /* renamed from: j, reason: collision with root package name */
    public static final a f15777j = new a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final c f15776i = new c(1, 0);

    /* compiled from: Ranges.kt */
    public static final class a {
        private a() {
        }

        public final c a() {
            return c.f15776i;
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public c(int i2, int i3) {
        super(i2, i3, 1);
    }

    @Override // i.a0.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (a() != cVar.a() || c() != cVar.c()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // i.a0.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + c();
    }

    @Override // i.a0.a
    public boolean isEmpty() {
        return a() > c();
    }

    public boolean k(int i2) {
        return a() <= i2 && i2 <= c();
    }

    public Integer l() {
        return Integer.valueOf(c());
    }

    public Integer m() {
        return Integer.valueOf(a());
    }

    @Override // i.a0.a
    public String toString() {
        return a() + ".." + c();
    }
}