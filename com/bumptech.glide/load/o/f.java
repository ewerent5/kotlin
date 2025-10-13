package com.bumptech.glide.load.o;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.o.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* loaded from: classes.dex */
public class f<Data> implements n<File, Data> {
    private final d<Data> a;

    /* compiled from: FileLoader.java */
    public static class a<Data> implements o<File, Data> {
        private final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // com.bumptech.glide.load.o.o
        public final n<File, Data> b(r rVar) {
            return new f(this.a);
        }
    }

    /* compiled from: FileLoader.java */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // com.bumptech.glide.load.o.f.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.o.f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.bumptech.glide.load.o.f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: e, reason: collision with root package name */
        private final File f3884e;

        /* renamed from: f, reason: collision with root package name */
        private final d<Data> f3885f;

        /* renamed from: g, reason: collision with root package name */
        private Data f3886g;

        c(File file, d<Data> dVar) {
            this.f3884e = file;
            this.f3885f = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f3885f.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f3886g;
            if (data != null) {
                try {
                    this.f3885f.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data dataC = this.f3885f.c(this.f3884e);
                this.f3886g = dataC;
                aVar.f(dataC);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                aVar.c(e2);
            }
        }
    }

    /* compiled from: FileLoader.java */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    /* compiled from: FileLoader.java */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        class a implements d<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.o.f.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.o.f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.o.f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(File file, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.b(file), new c(file, this.a));
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }
}