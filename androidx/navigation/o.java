package androidx.navigation;

/* compiled from: NavOptions.java */
/* loaded from: classes.dex */
public final class o {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private int f1338b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1339c;

    /* renamed from: d, reason: collision with root package name */
    private int f1340d;

    /* renamed from: e, reason: collision with root package name */
    private int f1341e;

    /* renamed from: f, reason: collision with root package name */
    private int f1342f;

    /* renamed from: g, reason: collision with root package name */
    private int f1343g;

    /* compiled from: NavOptions.java */
    public static final class a {
        boolean a;

        /* renamed from: c, reason: collision with root package name */
        boolean f1345c;

        /* renamed from: b, reason: collision with root package name */
        int f1344b = -1;

        /* renamed from: d, reason: collision with root package name */
        int f1346d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f1347e = -1;

        /* renamed from: f, reason: collision with root package name */
        int f1348f = -1;

        /* renamed from: g, reason: collision with root package name */
        int f1349g = -1;

        public o a() {
            return new o(this.a, this.f1344b, this.f1345c, this.f1346d, this.f1347e, this.f1348f, this.f1349g);
        }

        public a b(int i2) {
            this.f1346d = i2;
            return this;
        }

        public a c(int i2) {
            this.f1347e = i2;
            return this;
        }

        public a d(boolean z) {
            this.a = z;
            return this;
        }

        public a e(int i2) {
            this.f1348f = i2;
            return this;
        }

        public a f(int i2) {
            this.f1349g = i2;
            return this;
        }

        public a g(int i2, boolean z) {
            this.f1344b = i2;
            this.f1345c = z;
            return this;
        }
    }

    o(boolean z, int i2, boolean z2, int i3, int i4, int i5, int i6) {
        this.a = z;
        this.f1338b = i2;
        this.f1339c = z2;
        this.f1340d = i3;
        this.f1341e = i4;
        this.f1342f = i5;
        this.f1343g = i6;
    }

    public int a() {
        return this.f1340d;
    }

    public int b() {
        return this.f1341e;
    }

    public int c() {
        return this.f1342f;
    }

    public int d() {
        return this.f1343g;
    }

    public int e() {
        return this.f1338b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.f1338b == oVar.f1338b && this.f1339c == oVar.f1339c && this.f1340d == oVar.f1340d && this.f1341e == oVar.f1341e && this.f1342f == oVar.f1342f && this.f1343g == oVar.f1343g;
    }

    public boolean f() {
        return this.f1339c;
    }

    public boolean g() {
        return this.a;
    }

    public int hashCode() {
        return ((((((((((((g() ? 1 : 0) * 31) + e()) * 31) + (f() ? 1 : 0)) * 31) + a()) * 31) + b()) * 31) + c()) * 31) + d();
    }
}