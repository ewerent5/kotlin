package com.google.android.play.core.assetpacks;

import j$.util.Spliterator;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes.dex */
final class d0 extends FilterInputStream {

    /* renamed from: e, reason: collision with root package name */
    private final k1 f11957e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f11958f;

    /* renamed from: g, reason: collision with root package name */
    private long f11959g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f11960h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11961i;

    d0(InputStream inputStream) {
        super(inputStream);
        this.f11957e = new k1();
        this.f11958f = new byte[Spliterator.CONCURRENT];
        this.f11960h = false;
        this.f11961i = false;
    }

    private final boolean i(int i2) {
        int iJ = j(this.f11958f, 0, i2);
        if (iJ != i2) {
            int i3 = i2 - iJ;
            if (j(this.f11958f, iJ, i3) != i3) {
                this.f11957e.a(this.f11958f, 0, iJ);
                return false;
            }
        }
        this.f11957e.a(this.f11958f, 0, i2);
        return true;
    }

    private final int j(byte[] bArr, int i2, int i3) {
        return Math.max(0, super.read(bArr, i2, i3));
    }

    final c2 b() {
        byte[] bArr;
        if (this.f11959g > 0) {
            do {
                bArr = this.f11958f;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f11960h || this.f11961i) {
            return new c2(null, -1L, -1, false, false, null);
        }
        if (!i(30)) {
            this.f11960h = true;
            return this.f11957e.b();
        }
        c2 c2VarB = this.f11957e.b();
        if (c2VarB.h()) {
            this.f11961i = true;
            return c2VarB;
        }
        if (c2VarB.e() == 4294967295L) {
            throw new k0("Files bigger than 4GiB are not supported.");
        }
        int iC = this.f11957e.c() - 30;
        long j2 = iC;
        int length = this.f11958f.length;
        if (j2 > length) {
            do {
                length += length;
            } while (length < j2);
            this.f11958f = Arrays.copyOf(this.f11958f, length);
        }
        if (!i(iC)) {
            this.f11960h = true;
            return this.f11957e.b();
        }
        c2 c2VarB2 = this.f11957e.b();
        this.f11959g = c2VarB2.e();
        return c2VarB2;
    }

    final boolean c() {
        return this.f11960h;
    }

    final boolean d() {
        return this.f11961i;
    }

    final long g() {
        return this.f11959g;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = this.f11959g;
        if (j2 <= 0 || this.f11960h) {
            return -1;
        }
        int iJ = j(bArr, i2, (int) Math.min(j2, i3));
        this.f11959g -= iJ;
        if (iJ != 0) {
            return iJ;
        }
        this.f11960h = true;
        return 0;
    }
}