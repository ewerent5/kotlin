package com.google.android.play.core.assetpacks;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes.dex */
final class k1 {
    private byte[] a = new byte[Spliterator.CONCURRENT];

    /* renamed from: b, reason: collision with root package name */
    private int f12054b;

    /* renamed from: c, reason: collision with root package name */
    private long f12055c;

    /* renamed from: d, reason: collision with root package name */
    private long f12056d;

    /* renamed from: e, reason: collision with root package name */
    private int f12057e;

    /* renamed from: f, reason: collision with root package name */
    private int f12058f;

    /* renamed from: g, reason: collision with root package name */
    private int f12059g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12060h;

    /* renamed from: i, reason: collision with root package name */
    private String f12061i;

    public k1() {
        d();
    }

    private final int e(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.f12054b;
        if (i5 >= i2) {
            return 0;
        }
        int iMin = Math.min(i4, i2 - i5);
        System.arraycopy(bArr, i3, this.a, this.f12054b, iMin);
        int i6 = this.f12054b + iMin;
        this.f12054b = i6;
        if (i6 < i2) {
            return -1;
        }
        return iMin;
    }

    public final int a(byte[] bArr, int i2, int i3) {
        int iE = e(30, bArr, i2, i3);
        if (iE == -1) {
            return -1;
        }
        if (this.f12055c == -1) {
            long jB = i1.b(this.a, 0);
            this.f12055c = jB;
            if (jB == 67324752) {
                this.f12060h = false;
                this.f12056d = i1.b(this.a, 18);
                this.f12059g = i1.c(this.a, 8);
                this.f12057e = i1.c(this.a, 26);
                int iC = this.f12057e + 30 + i1.c(this.a, 28);
                this.f12058f = iC;
                int length = this.a.length;
                if (length < iC) {
                    do {
                        length += length;
                    } while (length < iC);
                    this.a = Arrays.copyOf(this.a, length);
                }
            } else {
                this.f12060h = true;
            }
        }
        int iE2 = e(this.f12058f, bArr, i2 + iE, i3 - iE);
        if (iE2 == -1) {
            return -1;
        }
        int i4 = iE + iE2;
        if (!this.f12060h && this.f12061i == null) {
            this.f12061i = new String(this.a, 30, this.f12057e);
        }
        return i4;
    }

    public final c2 b() {
        int i2 = this.f12054b;
        int i3 = this.f12058f;
        if (i2 < i3) {
            return c2.a(this.f12061i, this.f12056d, this.f12059g, true, Arrays.copyOf(this.a, i2), this.f12060h);
        }
        c2 c2VarA = c2.a(this.f12061i, this.f12056d, this.f12059g, false, Arrays.copyOf(this.a, i3), this.f12060h);
        d();
        return c2VarA;
    }

    public final int c() {
        return this.f12058f;
    }

    public final void d() {
        this.f12054b = 0;
        this.f12057e = -1;
        this.f12055c = -1L;
        this.f12060h = false;
        this.f12058f = 30;
        this.f12056d = -1L;
        this.f12059g = -1;
        this.f12061i = null;
    }
}