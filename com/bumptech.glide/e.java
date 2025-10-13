package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments.java */
/* loaded from: classes.dex */
public class e {
    private final Map<Class<?>, ?> a;

    /* compiled from: GlideExperiments.java */
    static final class a {
        private final Map<Class<?>, ?> a = new HashMap();

        a() {
        }

        e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }

    public boolean a(Class<?> cls) {
        return this.a.containsKey(cls);
    }
}