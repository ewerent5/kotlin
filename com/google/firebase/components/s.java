package com.google.firebase.components;

/* compiled from: Lazy.java */
/* loaded from: classes.dex */
public class s<T> implements com.google.firebase.n.a<T> {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f12300b = a;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.google.firebase.n.a<T> f12301c;

    public s(com.google.firebase.n.a<T> aVar) {
        this.f12301c = aVar;
    }

    @Override // com.google.firebase.n.a
    public T get() {
        T t = (T) this.f12300b;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f12300b;
                if (t == obj) {
                    t = this.f12301c.get();
                    this.f12300b = t;
                    this.f12301c = null;
                }
            }
        }
        return t;
    }
}