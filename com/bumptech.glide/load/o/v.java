package com.bumptech.glide.load.o;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.o.n;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes.dex */
public class v<Model> implements n<Model, Model> {
    private static final v<?> a = new v<>();

    /* compiled from: UnitModelLoader.java */
    public static class a<Model> implements o<Model, Model> {
        private static final a<?> a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) a;
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Model, Model> b(r rVar) {
            return v.c();
        }
    }

    /* compiled from: UnitModelLoader.java */
    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: e, reason: collision with root package name */
        private final Model f3927e;

        b(Model model) {
            this.f3927e = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Model> a() {
            return (Class<Model>) this.f3927e.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Model> aVar) {
            aVar.f(this.f3927e);
        }
    }

    @Deprecated
    public v() {
    }

    public static <T> v<T> c() {
        return (v<T>) a;
    }

    @Override // com.bumptech.glide.load.o.n
    public boolean a(Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.o.n
    public n.a<Model> b(Model model, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.b(model), new b(model));
    }
}