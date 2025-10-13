package com.parizene.netmonitor.t0;

/* compiled from: BasePref.java */
/* loaded from: classes3.dex */
public abstract class a<T> {
    protected static g a;

    /* renamed from: b, reason: collision with root package name */
    private String f13715b;

    /* renamed from: c, reason: collision with root package name */
    private T f13716c;

    protected a(String str, T t) {
        this.f13715b = str;
        this.f13716c = t;
    }

    public static void e(g gVar) {
        a = gVar;
    }

    public T a() {
        return this.f13716c;
    }

    public boolean b() {
        return a.a().contains(this.f13715b);
    }

    public String c() {
        return this.f13715b;
    }

    public void d() {
        a.a().edit().remove(this.f13715b);
    }
}