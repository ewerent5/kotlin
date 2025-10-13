package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class cs1 {
    private final long a;

    /* renamed from: c, reason: collision with root package name */
    private long f5357c;

    /* renamed from: b, reason: collision with root package name */
    private final bs1 f5356b = new bs1();

    /* renamed from: d, reason: collision with root package name */
    private int f5358d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f5359e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f5360f = 0;

    public cs1() {
        long jA = zzs.zzj().a();
        this.a = jA;
        this.f5357c = jA;
    }

    public final void a() {
        this.f5357c = zzs.zzj().a();
        this.f5358d++;
    }

    public final void b() {
        this.f5359e++;
        this.f5356b.f5176e = true;
    }

    public final void c() {
        this.f5360f++;
        this.f5356b.f5177f++;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.f5357c;
    }

    public final int f() {
        return this.f5358d;
    }

    public final bs1 g() {
        bs1 bs1VarClone = this.f5356b.clone();
        bs1 bs1Var = this.f5356b;
        bs1Var.f5176e = false;
        bs1Var.f5177f = 0;
        return bs1VarClone;
    }

    public final String h() {
        return "Created: " + this.a + " Last accessed: " + this.f5357c + " Accesses: " + this.f5358d + "\nEntries retrieved: Valid: " + this.f5359e + " Stale: " + this.f5360f;
    }
}