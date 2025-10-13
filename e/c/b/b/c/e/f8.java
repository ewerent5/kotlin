package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public class f8 {
    private static final b7 a = b7.a();

    /* renamed from: b, reason: collision with root package name */
    private g6 f14518b;

    /* renamed from: c, reason: collision with root package name */
    private volatile b9 f14519c;

    /* renamed from: d, reason: collision with root package name */
    private volatile g6 f14520d;

    private final b9 c(b9 b9Var) {
        if (this.f14519c == null) {
            synchronized (this) {
                if (this.f14519c == null) {
                    try {
                        this.f14519c = b9Var;
                        this.f14520d = g6.f14544e;
                    } catch (a8 unused) {
                        this.f14519c = b9Var;
                        this.f14520d = g6.f14544e;
                    }
                }
            }
        }
        return this.f14519c;
    }

    public final b9 a(b9 b9Var) {
        b9 b9Var2 = this.f14519c;
        this.f14518b = null;
        this.f14520d = null;
        this.f14519c = b9Var;
        return b9Var2;
    }

    public final int b() {
        if (this.f14520d != null) {
            return this.f14520d.c();
        }
        if (this.f14519c != null) {
            return this.f14519c.b();
        }
        return 0;
    }

    public final g6 d() {
        if (this.f14520d != null) {
            return this.f14520d;
        }
        synchronized (this) {
            if (this.f14520d != null) {
                return this.f14520d;
            }
            if (this.f14519c == null) {
                this.f14520d = g6.f14544e;
            } else {
                this.f14520d = this.f14519c.a();
            }
            return this.f14520d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        b9 b9Var = this.f14519c;
        b9 b9Var2 = f8Var.f14519c;
        return (b9Var == null && b9Var2 == null) ? d().equals(f8Var.d()) : (b9Var == null || b9Var2 == null) ? b9Var != null ? b9Var.equals(f8Var.c(b9Var.g())) : c(b9Var2.g()).equals(b9Var2) : b9Var.equals(b9Var2);
    }

    public int hashCode() {
        return 1;
    }
}