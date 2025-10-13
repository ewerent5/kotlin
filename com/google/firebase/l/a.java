package com.google.firebase.l;

/* compiled from: Event.java */
/* loaded from: classes.dex */
public class a<T> {
    private final Class<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final T f12884b;

    public T a() {
        return this.f12884b;
    }

    public Class<T> b() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.f12884b);
    }
}