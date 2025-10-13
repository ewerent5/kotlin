package com.bumptech.glide.load.o;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.o.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* loaded from: classes.dex */
public class b<Data> implements n<byte[], Data> {
    private final InterfaceC0090b<Data> a;

    /* compiled from: ByteArrayLoader.java */
    public static class a implements o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: com.bumptech.glide.load.o.b$a$a, reason: collision with other inner class name */
        class C0089a implements InterfaceC0090b<ByteBuffer> {
            C0089a() {
            }

            @Override // com.bumptech.glide.load.o.b.InterfaceC0090b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.o.b.InterfaceC0090b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.o.o
        public n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0089a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.o.b$b, reason: collision with other inner class name */
    public interface InterfaceC0090b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f3878e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC0090b<Data> f3879f;

        c(byte[] bArr, InterfaceC0090b<Data> interfaceC0090b) {
            this.f3878e = bArr;
            this.f3879f = interfaceC0090b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f3879f.a();
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
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            aVar.f(this.f3879f.b(this.f3878e));
        }
    }

    /* compiled from: ByteArrayLoader.java */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        class a implements InterfaceC0090b<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.o.b.InterfaceC0090b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.o.b.InterfaceC0090b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.o.o
        public n<byte[], InputStream> b(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0090b<Data> interfaceC0090b) {
        this.a = interfaceC0090b;
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(byte[] bArr, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.b(bArr), new c(bArr, this.a));
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }
}