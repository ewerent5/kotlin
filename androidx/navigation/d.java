package androidx.navigation;

import android.os.Bundle;

/* compiled from: NavArgument.java */
/* loaded from: classes.dex */
public final class d {
    private final p a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1262b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1263c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f1264d;

    /* compiled from: NavArgument.java */
    public static final class a {
        private p<?> a;

        /* renamed from: c, reason: collision with root package name */
        private Object f1266c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f1265b = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1267d = false;

        public d a() {
            if (this.a == null) {
                this.a = p.e(this.f1266c);
            }
            return new d(this.a, this.f1265b, this.f1266c, this.f1267d);
        }

        public a b(Object obj) {
            this.f1266c = obj;
            this.f1267d = true;
            return this;
        }

        public a c(boolean z) {
            this.f1265b = z;
            return this;
        }

        public a d(p<?> pVar) {
            this.a = pVar;
            return this;
        }
    }

    d(p<?> pVar, boolean z, Object obj, boolean z2) {
        if (!pVar.f() && z) {
            throw new IllegalArgumentException(pVar.c() + " does not allow nullable values");
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException("Argument with type " + pVar.c() + " has null value but is not nullable.");
        }
        this.a = pVar;
        this.f1262b = z;
        this.f1264d = obj;
        this.f1263c = z2;
    }

    public p<?> a() {
        return this.a;
    }

    public boolean b() {
        return this.f1263c;
    }

    void c(String str, Bundle bundle) {
        if (this.f1263c) {
            this.a.i(bundle, str, this.f1264d);
        }
    }

    boolean d(String str, Bundle bundle) {
        if (!this.f1262b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.a.b(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1262b != dVar.f1262b || this.f1263c != dVar.f1263c || !this.a.equals(dVar.a)) {
            return false;
        }
        Object obj2 = this.f1264d;
        return obj2 != null ? obj2.equals(dVar.f1264d) : dVar.f1264d == null;
    }

    public int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.f1262b ? 1 : 0)) * 31) + (this.f1263c ? 1 : 0)) * 31;
        Object obj = this.f1264d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}