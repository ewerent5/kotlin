package com.bumptech.glide.load.p.h;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.n.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: StreamGifDecoder.java */
/* loaded from: classes.dex */
public class j implements k<InputStream, c> {
    private final List<ImageHeaderParser> a;

    /* renamed from: b, reason: collision with root package name */
    private final k<ByteBuffer, c> f4062b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.n.a0.b f4063c;

    public j(List<ImageHeaderParser> list, k<ByteBuffer, c> kVar, com.bumptech.glide.load.n.a0.b bVar) {
        this.a = list;
        this.f4062b = kVar;
        this.f4063c = bVar;
    }

    private static byte[] e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e2) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v<c> b(InputStream inputStream, int i2, int i3, com.bumptech.glide.load.i iVar) throws IOException {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f4062b.b(ByteBuffer.wrap(bArrE), i2, i3, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, com.bumptech.glide.load.i iVar) {
        return !((Boolean) iVar.c(i.f4061b)).booleanValue() && com.bumptech.glide.load.f.e(this.a, inputStream, this.f4063c) == ImageHeaderParser.ImageType.GIF;
    }
}