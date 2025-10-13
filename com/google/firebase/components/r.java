package com.google.firebase.components;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: EventBus.java */
/* loaded from: classes.dex */
class r implements com.google.firebase.l.d, com.google.firebase.l.c {
    private final Map<Class<?>, ConcurrentHashMap<com.google.firebase.l.b<Object>, Executor>> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue<com.google.firebase.l.a<?>> f12298b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f12299c;

    r(Executor executor) {
        this.f12299c = executor;
    }

    private synchronized Set<Map.Entry<com.google.firebase.l.b<Object>, Executor>> c(com.google.firebase.l.a<?> aVar) {
        ConcurrentHashMap<com.google.firebase.l.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    @Override // com.google.firebase.l.d
    public synchronized <T> void a(Class<T> cls, Executor executor, com.google.firebase.l.b<? super T> bVar) {
        u.b(cls);
        u.b(bVar);
        u.b(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(bVar, executor);
    }

    void b() {
        Queue<com.google.firebase.l.a<?>> queue;
        synchronized (this) {
            queue = this.f12298b;
            if (queue != null) {
                this.f12298b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<com.google.firebase.l.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }
    }

    public void e(com.google.firebase.l.a<?> aVar) {
        u.b(aVar);
        synchronized (this) {
            Queue<com.google.firebase.l.a<?>> queue = this.f12298b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (Map.Entry<com.google.firebase.l.b<Object>, Executor> entry : c(aVar)) {
                entry.getValue().execute(q.a(entry, aVar));
            }
        }
    }
}