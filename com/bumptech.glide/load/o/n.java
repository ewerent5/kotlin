package com.bumptech.glide.load.o;

import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* compiled from: ModelLoader.java */
    public static class a<Data> {
        public final com.bumptech.glide.load.g a;

        /* renamed from: b, reason: collision with root package name */
        public final List<com.bumptech.glide.load.g> f3908b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f3909c;

        public a(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.data.d<Data> dVar) {
            this(gVar, Collections.emptyList(), dVar);
        }

        public a(com.bumptech.glide.load.g gVar, List<com.bumptech.glide.load.g> list, com.bumptech.glide.load.data.d<Data> dVar) {
            this.a = (com.bumptech.glide.load.g) com.bumptech.glide.t.j.d(gVar);
            this.f3908b = (List) com.bumptech.glide.t.j.d(list);
            this.f3909c = (com.bumptech.glide.load.data.d) com.bumptech.glide.t.j.d(dVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i2, int i3, com.bumptech.glide.load.i iVar);
}