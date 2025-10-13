package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class sj2 {
    private static final qi2 a = qi2.a();

    /* renamed from: b, reason: collision with root package name */
    protected volatile lk2 f8888b;

    /* renamed from: c, reason: collision with root package name */
    private volatile ci2 f8889c;

    public final int a() {
        if (this.f8889c != null) {
            return ((zh2) this.f8889c).f10598i.length;
        }
        if (this.f8888b != null) {
            return this.f8888b.f();
        }
        return 0;
    }

    public final ci2 b() {
        if (this.f8889c != null) {
            return this.f8889c;
        }
        synchronized (this) {
            if (this.f8889c != null) {
                return this.f8889c;
            }
            if (this.f8888b == null) {
                this.f8889c = ci2.f5319e;
            } else {
                this.f8889c = this.f8888b.d();
            }
            return this.f8889c;
        }
    }

    protected final void c(lk2 lk2Var) {
        if (this.f8888b != null) {
            return;
        }
        synchronized (this) {
            if (this.f8888b == null) {
                try {
                    this.f8888b = lk2Var;
                    this.f8889c = ci2.f5319e;
                } catch (qj2 unused) {
                    this.f8888b = lk2Var;
                    this.f8889c = ci2.f5319e;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj2)) {
            return false;
        }
        sj2 sj2Var = (sj2) obj;
        lk2 lk2Var = this.f8888b;
        lk2 lk2Var2 = sj2Var.f8888b;
        if (lk2Var == null && lk2Var2 == null) {
            return b().equals(sj2Var.b());
        }
        if (lk2Var != null && lk2Var2 != null) {
            return lk2Var.equals(lk2Var2);
        }
        if (lk2Var != null) {
            sj2Var.c(lk2Var.g());
            return lk2Var.equals(sj2Var.f8888b);
        }
        c(lk2Var2.g());
        return this.f8888b.equals(lk2Var2);
    }

    public int hashCode() {
        return 1;
    }
}