package com.google.firebase.crashlytics.d.m;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: ByteString.java */
/* loaded from: classes.dex */
final class a {
    public static final a a = new a(new byte[0]);

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12679b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f12680c = 0;

    private a(byte[] bArr) {
        this.f12679b = bArr;
    }

    public static a a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static a b(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new a(bArr2);
    }

    public static a c(String str) {
        try {
            return new a(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported.", e2);
        }
    }

    public void d(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f12679b, i2, bArr, i3, i4);
    }

    public InputStream e() {
        return new ByteArrayInputStream(this.f12679b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        byte[] bArr = this.f12679b;
        int length = bArr.length;
        byte[] bArr2 = ((a) obj).f12679b;
        if (length != bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return this.f12679b.length;
    }

    public int hashCode() {
        int i2 = this.f12680c;
        if (i2 == 0) {
            byte[] bArr = this.f12679b;
            int length = bArr.length;
            for (byte b2 : bArr) {
                length = (length * 31) + b2;
            }
            i2 = length == 0 ? 1 : length;
            this.f12680c = i2;
        }
        return i2;
    }
}