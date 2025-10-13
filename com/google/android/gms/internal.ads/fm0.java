package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fm0 {
    public static final fm0 a = new fm0(new em0());

    /* renamed from: b, reason: collision with root package name */
    private final r7 f5894b;

    /* renamed from: c, reason: collision with root package name */
    private final o7 f5895c;

    /* renamed from: d, reason: collision with root package name */
    private final e8 f5896d;

    /* renamed from: e, reason: collision with root package name */
    private final b8 f5897e;

    /* renamed from: f, reason: collision with root package name */
    private final tc f5898f;

    /* renamed from: g, reason: collision with root package name */
    private final c.e.g<String, x7> f5899g;

    /* renamed from: h, reason: collision with root package name */
    private final c.e.g<String, u7> f5900h;

    private fm0(em0 em0Var) {
        this.f5894b = em0Var.a;
        this.f5895c = em0Var.f5663b;
        this.f5896d = em0Var.f5664c;
        this.f5899g = new c.e.g<>(em0Var.f5667f);
        this.f5900h = new c.e.g<>(em0Var.f5668g);
        this.f5897e = em0Var.f5665d;
        this.f5898f = em0Var.f5666e;
    }

    public final r7 a() {
        return this.f5894b;
    }

    public final o7 b() {
        return this.f5895c;
    }

    public final e8 c() {
        return this.f5896d;
    }

    public final b8 d() {
        return this.f5897e;
    }

    public final tc e() {
        return this.f5898f;
    }

    public final x7 f(String str) {
        return this.f5899g.get(str);
    }

    public final u7 g(String str) {
        return this.f5900h.get(str);
    }

    public final ArrayList<String> h() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f5896d != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f5894b != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f5895c != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f5899g.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f5898f != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> i() {
        ArrayList<String> arrayList = new ArrayList<>(this.f5899g.size());
        for (int i2 = 0; i2 < this.f5899g.size(); i2++) {
            arrayList.add(this.f5899g.i(i2));
        }
        return arrayList;
    }
}