package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
final class n0 extends OutputStream {

    /* renamed from: e, reason: collision with root package name */
    private final k1 f12092e = new k1();

    /* renamed from: f, reason: collision with root package name */
    private final File f12093f;

    /* renamed from: g, reason: collision with root package name */
    private final x1 f12094g;

    /* renamed from: h, reason: collision with root package name */
    private long f12095h;

    /* renamed from: i, reason: collision with root package name */
    private long f12096i;

    /* renamed from: j, reason: collision with root package name */
    private FileOutputStream f12097j;

    /* renamed from: k, reason: collision with root package name */
    private c2 f12098k;

    n0(File file, x1 x1Var) {
        this.f12093f = file;
        this.f12094g = x1Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        write(new byte[]{(byte) i2});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        int iMin;
        while (i3 > 0) {
            if (this.f12095h == 0 && this.f12096i == 0) {
                int iA = this.f12092e.a(bArr, i2, i3);
                if (iA == -1) {
                    return;
                }
                i2 += iA;
                i3 -= iA;
                c2 c2VarB = this.f12092e.b();
                this.f12098k = c2VarB;
                if (c2VarB.h()) {
                    this.f12095h = 0L;
                    this.f12094g.m(this.f12098k.i(), this.f12098k.i().length);
                    this.f12096i = this.f12098k.i().length;
                } else if (!this.f12098k.c() || this.f12098k.b()) {
                    byte[] bArrI = this.f12098k.i();
                    this.f12094g.m(bArrI, bArrI.length);
                    this.f12095h = this.f12098k.e();
                } else {
                    this.f12094g.g(this.f12098k.i());
                    File file = new File(this.f12093f, this.f12098k.d());
                    file.getParentFile().mkdirs();
                    this.f12095h = this.f12098k.e();
                    this.f12097j = new FileOutputStream(file);
                }
            }
            if (!this.f12098k.b()) {
                if (this.f12098k.h()) {
                    this.f12094g.i(this.f12096i, bArr, i2, i3);
                    this.f12096i += i3;
                    iMin = i3;
                } else if (this.f12098k.c()) {
                    iMin = (int) Math.min(i3, this.f12095h);
                    this.f12097j.write(bArr, i2, iMin);
                    long j2 = this.f12095h - iMin;
                    this.f12095h = j2;
                    if (j2 == 0) {
                        this.f12097j.close();
                    }
                } else {
                    iMin = (int) Math.min(i3, this.f12095h);
                    this.f12094g.i((this.f12098k.i().length + this.f12098k.e()) - this.f12095h, bArr, i2, iMin);
                    this.f12095h -= iMin;
                }
                i2 += iMin;
                i3 -= iMin;
            }
        }
    }
}