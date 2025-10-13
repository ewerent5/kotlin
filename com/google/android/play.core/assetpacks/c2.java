package com.google.android.play.core.assetpacks;

import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
final class c2 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11952b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11953c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11954d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11955e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f11956f;

    c2() {
    }

    c2(String str, long j2, int i2, boolean z, boolean z2, byte[] bArr) {
        this();
        this.a = str;
        this.f11952b = j2;
        this.f11953c = i2;
        this.f11954d = z;
        this.f11955e = z2;
        this.f11956f = bArr;
    }

    static c2 a(String str, long j2, int i2, boolean z, byte[] bArr, boolean z2) {
        return new c2(str, j2, i2, z, z2, bArr);
    }

    final boolean b() {
        if (d() == null) {
            return false;
        }
        return d().endsWith("/");
    }

    final boolean c() {
        return f() == 0;
    }

    String d() {
        return this.a;
    }

    long e() {
        return this.f11952b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            String str = this.a;
            if (str != null ? str.equals(c2Var.d()) : c2Var.d() == null) {
                if (this.f11952b == c2Var.e() && this.f11953c == c2Var.f() && this.f11954d == c2Var.g() && this.f11955e == c2Var.h() && Arrays.equals(this.f11956f, c2Var.f11956f)) {
                    return true;
                }
            }
        }
        return false;
    }

    int f() {
        return this.f11953c;
    }

    boolean g() {
        return this.f11954d;
    }

    boolean h() {
        return this.f11955e;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f11952b;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f11953c) * 1000003) ^ (true != this.f11954d ? 1237 : 1231)) * 1000003) ^ (true == this.f11955e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f11956f);
    }

    byte[] i() {
        return this.f11956f;
    }

    public String toString() {
        String str = this.a;
        long j2 = this.f11952b;
        int i2 = this.f11953c;
        boolean z = this.f11954d;
        boolean z2 = this.f11955e;
        String string = Arrays.toString(this.f11956f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + WebSocketProtocol.PAYLOAD_SHORT + String.valueOf(string).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", compressionMethod=");
        sb.append(i2);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}