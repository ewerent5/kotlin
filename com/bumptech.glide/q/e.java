package com.bumptech.glide.q;

import com.bumptech.glide.load.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes.dex */
public class e {
    private final List<String> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f4165b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    private static class a<T, R> {
        private final Class<T> a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f4166b;

        /* renamed from: c, reason: collision with root package name */
        final k<T, R> f4167c;

        public a(Class<T> cls, Class<R> cls2, k<T, R> kVar) {
            this.a = cls;
            this.f4166b = cls2;
            this.f4167c = kVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f4166b);
        }
    }

    private synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> arrayList;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        arrayList = this.f4165b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f4165b.put(str, arrayList);
        }
        return arrayList;
    }

    public synchronized <T, R> void a(String str, k<T, R> kVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, kVar));
    }

    public synchronized <T, R> List<k<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f4165b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f4167c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f4165b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f4166b)) {
                        arrayList.add(aVar.f4166b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.a);
        this.a.clear();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.a.add(it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.a.add(str);
            }
        }
    }
}