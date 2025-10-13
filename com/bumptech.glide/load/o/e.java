package com.bumptech.glide.load.o;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.o.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader.java */
/* loaded from: classes.dex */
public final class e<Model, Data> implements n<Model, Data> {
    private final a<Data> a;

    /* compiled from: DataUrlLoader.java */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(String str);
    }

    /* compiled from: DataUrlLoader.java */
    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: e, reason: collision with root package name */
        private final String f3881e;

        /* renamed from: f, reason: collision with root package name */
        private final a<Data> f3882f;

        /* renamed from: g, reason: collision with root package name */
        private Data f3883g;

        b(String str, a<Data> aVar) {
            this.f3881e = str;
            this.f3882f = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f3882f.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f3882f.b(this.f3883g);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data dataC = this.f3882f.c(this.f3881e);
                this.f3883g = dataC;
                aVar.f(dataC);
            } catch (IllegalArgumentException e2) {
                aVar.c(e2);
            }
        }
    }

    /* compiled from: DataUrlLoader.java */
    public static final class c<Model> implements o<Model, InputStream> {
        private final a<InputStream> a = new a();

        /* compiled from: DataUrlLoader.java */
        class a implements a<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.o.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.o.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.o.e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Model, InputStream> b(r rVar) {
            return new e(this.a);
        }
    }

    public e(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // com.bumptech.glide.load.o.n
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // com.bumptech.glide.load.o.n
    public n.a<Data> b(Model model, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.b(model), new b(model.toString(), this.a));
    }
}