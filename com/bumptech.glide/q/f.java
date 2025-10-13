package com.bumptech.glide.q;

import com.bumptech.glide.load.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes.dex */
public class f {
    private final List<a<?>> a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    private static final class a<T> {
        private final Class<T> a;

        /* renamed from: b, reason: collision with root package name */
        final l<T> f4168b;

        a(Class<T> cls, l<T> lVar) {
            this.a = cls;
            this.f4168b = lVar;
        }

        boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, l<Z> lVar) {
        this.a.add(new a<>(cls, lVar));
    }

    public synchronized <Z> l<Z> b(Class<Z> cls) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a<?> aVar = this.a.get(i2);
            if (aVar.a(cls)) {
                return (l<Z>) aVar.f4168b;
            }
        }
        return null;
    }
}