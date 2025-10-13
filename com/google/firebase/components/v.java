package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes.dex */
final class v extends com.google.firebase.components.a {
    private final Set<Class<?>> a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Class<?>> f12302b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Class<?>> f12303c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<Class<?>> f12304d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<Class<?>> f12305e;

    /* renamed from: f, reason: collision with root package name */
    private final e f12306f;

    /* compiled from: RestrictedComponentContainer.java */
    private static class a implements com.google.firebase.l.c {
        private final Set<Class<?>> a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.firebase.l.c f12307b;

        public a(Set<Class<?>> set, com.google.firebase.l.c cVar) {
            this.a = set;
            this.f12307b = cVar;
        }
    }

    v(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (n nVar : dVar.c()) {
            if (nVar.b()) {
                if (nVar.d()) {
                    hashSet3.add(nVar.a());
                } else {
                    hashSet.add(nVar.a());
                }
            } else if (nVar.d()) {
                hashSet4.add(nVar.a());
            } else {
                hashSet2.add(nVar.a());
            }
        }
        if (!dVar.f().isEmpty()) {
            hashSet.add(com.google.firebase.l.c.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.f12302b = Collections.unmodifiableSet(hashSet2);
        this.f12303c = Collections.unmodifiableSet(hashSet3);
        this.f12304d = Collections.unmodifiableSet(hashSet4);
        this.f12305e = dVar.f();
        this.f12306f = eVar;
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.e
    public <T> T a(Class<T> cls) {
        if (!this.a.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f12306f.a(cls);
        return !cls.equals(com.google.firebase.l.c.class) ? t : (T) new a(this.f12305e, (com.google.firebase.l.c) t);
    }

    @Override // com.google.firebase.components.e
    public <T> com.google.firebase.n.a<T> b(Class<T> cls) {
        if (this.f12302b.contains(cls)) {
            return this.f12306f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.e
    public <T> com.google.firebase.n.a<Set<T>> c(Class<T> cls) {
        if (this.f12304d.contains(cls)) {
            return this.f12306f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.e
    public <T> Set<T> d(Class<T> cls) {
        if (this.f12303c.contains(cls)) {
            return this.f12306f.d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }
}