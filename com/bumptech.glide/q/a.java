package com.bumptech.glide.q;

import java.util.ArrayList;
import java.util.List;

/* compiled from: EncoderRegistry.java */
/* loaded from: classes.dex */
public class a {
    private final List<C0100a<?>> a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: com.bumptech.glide.q.a$a, reason: collision with other inner class name */
    private static final class C0100a<T> {
        private final Class<T> a;

        /* renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.d<T> f4161b;

        C0100a(Class<T> cls, com.bumptech.glide.load.d<T> dVar) {
            this.a = cls;
            this.f4161b = dVar;
        }

        boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, com.bumptech.glide.load.d<T> dVar) {
        this.a.add(new C0100a<>(cls, dVar));
    }

    public synchronized <T> com.bumptech.glide.load.d<T> b(Class<T> cls) {
        for (C0100a<?> c0100a : this.a) {
            if (c0100a.a(cls)) {
                return (com.bumptech.glide.load.d<T>) c0100a.f4161b;
            }
        }
        return null;
    }
}