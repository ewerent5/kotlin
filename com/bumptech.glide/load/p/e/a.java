package com.bumptech.glide.load.p.e;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder.java */
/* loaded from: classes.dex */
public class a implements e<ByteBuffer> {
    private final ByteBuffer a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: com.bumptech.glide.load.p.e.a$a, reason: collision with other inner class name */
    public static class C0096a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.a.position(0);
        return this.a;
    }
}