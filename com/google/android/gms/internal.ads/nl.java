package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class nl extends FilterInputStream {

    /* renamed from: e, reason: collision with root package name */
    private final long f7728e;

    /* renamed from: f, reason: collision with root package name */
    private long f7729f;

    nl(InputStream inputStream, long j2) {
        super(inputStream);
        this.f7728e = j2;
    }

    final long b() {
        return this.f7728e - this.f7729f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i2 = super.read();
        if (i2 != -1) {
            this.f7729f++;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = super.read(bArr, i2, i3);
        if (i4 != -1) {
            this.f7729f += i4;
        }
        return i4;
    }
}