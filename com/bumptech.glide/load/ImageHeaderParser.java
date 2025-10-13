package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);


        /* renamed from: e, reason: collision with root package name */
        private final boolean f3576e;

        ImageType(boolean z) {
            this.f3576e = z;
        }

        public boolean hasAlpha() {
            return this.f3576e;
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    ImageType b(InputStream inputStream);

    int c(InputStream inputStream, com.bumptech.glide.load.n.a0.b bVar);
}