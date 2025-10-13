package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class br1 {

    /* renamed from: b, reason: collision with root package name */
    private final int f5171b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5172c;
    private final LinkedList<mr1<?>> a = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    private final cs1 f5173d = new cs1();

    public br1(int i2, int i3) {
        this.f5171b = i2;
        this.f5172c = i3;
    }

    private final void i() {
        while (!this.a.isEmpty()) {
            if (zzs.zzj().a() - this.a.getFirst().f7533d < this.f5172c) {
                return;
            }
            this.f5173d.c();
            this.a.remove();
        }
    }

    public final boolean a(mr1<?> mr1Var) {
        this.f5173d.a();
        i();
        if (this.a.size() == this.f5171b) {
            return false;
        }
        this.a.add(mr1Var);
        return true;
    }

    public final mr1<?> b() {
        this.f5173d.a();
        i();
        if (this.a.isEmpty()) {
            return null;
        }
        mr1<?> mr1VarRemove = this.a.remove();
        if (mr1VarRemove != null) {
            this.f5173d.b();
        }
        return mr1VarRemove;
    }

    public final int c() {
        i();
        return this.a.size();
    }

    public final long d() {
        return this.f5173d.d();
    }

    public final long e() {
        return this.f5173d.e();
    }

    public final int f() {
        return this.f5173d.f();
    }

    public final String g() {
        return this.f5173d.h();
    }

    public final bs1 h() {
        return this.f5173d.g();
    }
}