package com.bumptech.glide.n;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: GifHeaderParser.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f4121b;

    /* renamed from: c, reason: collision with root package name */
    private c f4122c;
    private final byte[] a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f4123d = 0;

    private boolean b() {
        return this.f4122c.f4109b != 0;
    }

    private int d() {
        try {
            return this.f4121b.get() & 255;
        } catch (Exception unused) {
            this.f4122c.f4109b = 1;
            return 0;
        }
    }

    private void e() {
        this.f4122c.f4111d.a = n();
        this.f4122c.f4111d.f4099b = n();
        this.f4122c.f4111d.f4100c = n();
        this.f4122c.f4111d.f4101d = n();
        int iD = d();
        boolean z = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f4122c.f4111d;
        bVar.f4102e = (iD & 64) != 0;
        if (z) {
            bVar.f4108k = g(iPow);
        } else {
            bVar.f4108k = null;
        }
        this.f4122c.f4111d.f4107j = this.f4121b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f4122c;
        cVar.f4110c++;
        cVar.f4112e.add(cVar.f4111d);
    }

    private void f() {
        int iD = d();
        this.f4123d = iD;
        if (iD <= 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                i3 = this.f4123d;
                if (i2 >= i3) {
                    return;
                }
                i3 -= i2;
                this.f4121b.get(this.a, i2, i3);
                i2 += i3;
            } catch (Exception e2) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i2 + " count: " + i3 + " blockSize: " + this.f4123d, e2);
                }
                this.f4122c.f4109b = 1;
                return;
            }
        }
    }

    private int[] g(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.f4121b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & 255) << 16) | (-16777216) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f4122c.f4109b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i2) {
        boolean z = false;
        while (!z && !b() && this.f4122c.f4110c <= i2) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f4122c.f4111d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < 11; i3++) {
                        sb.append((char) this.a[i3]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f4122c;
                if (cVar.f4111d == null) {
                    cVar.f4111d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f4122c.f4109b = 1;
            } else {
                z = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f4122c.f4111d;
        int i2 = (iD & 28) >> 2;
        bVar.f4104g = i2;
        if (i2 == 0) {
            bVar.f4104g = 1;
        }
        bVar.f4103f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f4122c.f4111d;
        bVar2.f4106i = iN * 10;
        bVar2.f4105h = d();
        d();
    }

    private void k() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f4122c.f4109b = 1;
            return;
        }
        l();
        if (!this.f4122c.f4115h || b()) {
            return;
        }
        c cVar = this.f4122c;
        cVar.a = g(cVar.f4116i);
        c cVar2 = this.f4122c;
        cVar2.f4119l = cVar2.a[cVar2.f4117j];
    }

    private void l() {
        this.f4122c.f4113f = n();
        this.f4122c.f4114g = n();
        int iD = d();
        c cVar = this.f4122c;
        cVar.f4115h = (iD & 128) != 0;
        cVar.f4116i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f4122c.f4117j = d();
        this.f4122c.f4118k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.f4122c.f4120m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f4123d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f4121b.getShort();
    }

    private void o() {
        this.f4121b = null;
        Arrays.fill(this.a, (byte) 0);
        this.f4122c = new c();
        this.f4123d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f4121b.position(Math.min(this.f4121b.position() + iD, this.f4121b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f4121b = null;
        this.f4122c = null;
    }

    public c c() {
        if (this.f4121b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f4122c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f4122c;
            if (cVar.f4110c < 0) {
                cVar.f4109b = 1;
            }
        }
        return this.f4122c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f4121b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f4121b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}