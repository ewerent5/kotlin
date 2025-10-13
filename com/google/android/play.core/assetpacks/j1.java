package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j1 extends InputStream {

    /* renamed from: e, reason: collision with root package name */
    private final Enumeration<File> f12051e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f12052f;

    public j1(Enumeration<File> enumeration) throws IOException {
        this.f12051e = enumeration;
        b();
    }

    final void b() throws IOException {
        InputStream inputStream = this.f12052f;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f12052f = this.f12051e.hasMoreElements() ? new FileInputStream(this.f12051e.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f12052f;
        if (inputStream != null) {
            inputStream.close();
            this.f12052f = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f12052f;
            if (inputStream == null) {
                return -1;
            }
            int i2 = inputStream.read();
            if (i2 != -1) {
                return i2;
            }
            b();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f12052f == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 == 0) {
            return 0;
        }
        do {
            int i4 = this.f12052f.read(bArr, i2, i3);
            if (i4 > 0) {
                return i4;
            }
            b();
        } while (this.f12052f != null);
        return -1;
    }
}