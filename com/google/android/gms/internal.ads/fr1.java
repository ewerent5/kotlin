package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class fr1 {
    private final er1 a = new er1();

    /* renamed from: b, reason: collision with root package name */
    private int f5933b;

    /* renamed from: c, reason: collision with root package name */
    private int f5934c;

    /* renamed from: d, reason: collision with root package name */
    private int f5935d;

    /* renamed from: e, reason: collision with root package name */
    private int f5936e;

    /* renamed from: f, reason: collision with root package name */
    private int f5937f;

    fr1() {
    }

    public final void a() {
        this.f5935d++;
    }

    public final void b() {
        this.f5936e++;
    }

    public final void c() {
        this.f5933b++;
        this.a.f5689e = true;
    }

    public final void d() {
        this.f5934c++;
        this.a.f5690f = true;
    }

    public final void e() {
        this.f5937f++;
    }

    public final er1 f() {
        er1 er1VarClone = this.a.clone();
        er1 er1Var = this.a;
        er1Var.f5689e = false;
        er1Var.f5690f = false;
        return er1VarClone;
    }

    public final String g() {
        return "\n\tPool does not exist: " + this.f5935d + "\n\tNew pools created: " + this.f5933b + "\n\tPools removed: " + this.f5934c + "\n\tEntries added: " + this.f5937f + "\n\tNo entries retrieved: " + this.f5936e + "\n";
    }
}