package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xs2 implements Parcelable {
    public static final Parcelable.Creator<xs2> CREATOR = new ws2();
    public final long A;
    public final int B;
    public final String C;
    public final int D;
    private int E;

    /* renamed from: e, reason: collision with root package name */
    public final String f10245e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10246f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10247g;

    /* renamed from: h, reason: collision with root package name */
    public final hx2 f10248h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10249i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10250j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10251k;

    /* renamed from: l, reason: collision with root package name */
    public final List<byte[]> f10252l;

    /* renamed from: m, reason: collision with root package name */
    public final wu2 f10253m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;
    public final int s;
    public final byte[] t;
    public final y03 u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    xs2(Parcel parcel) {
        this.f10245e = parcel.readString();
        this.f10249i = parcel.readString();
        this.f10250j = parcel.readString();
        this.f10247g = parcel.readString();
        this.f10246f = parcel.readInt();
        this.f10251k = parcel.readInt();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readFloat();
        this.q = parcel.readInt();
        this.r = parcel.readFloat();
        this.t = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.s = parcel.readInt();
        this.u = (y03) parcel.readParcelable(y03.class.getClassLoader());
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readString();
        this.D = parcel.readInt();
        this.A = parcel.readLong();
        int i2 = parcel.readInt();
        this.f10252l = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f10252l.add(parcel.createByteArray());
        }
        this.f10253m = (wu2) parcel.readParcelable(wu2.class.getClassLoader());
        this.f10248h = (hx2) parcel.readParcelable(hx2.class.getClassLoader());
    }

    @TargetApi(16)
    private static void C(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static xs2 a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, y03 y03Var, wu2 wu2Var) {
        return new xs2(str, null, str2, null, -1, i3, i4, i5, -1.0f, i6, f3, bArr, i7, y03Var, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, wu2Var, null);
    }

    public static xs2 b(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, wu2 wu2Var, int i6, String str4) {
        return c(str, str2, null, -1, -1, i4, i5, -1, -1, -1, null, wu2Var, 0, str4, null);
    }

    public static xs2 c(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<byte[]> list, wu2 wu2Var, int i9, String str4, hx2 hx2Var) {
        return new xs2(str, null, str2, null, -1, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, -1, -1, i9, str4, -1, Long.MAX_VALUE, list, wu2Var, null);
    }

    public static xs2 d(String str, String str2, String str3, int i2, int i3, String str4, int i4, wu2 wu2Var, long j2, List<byte[]> list) {
        return new xs2(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, -1, j2, list, wu2Var, null);
    }

    public static xs2 g(String str, String str2, String str3, int i2, List<byte[]> list, String str4, wu2 wu2Var) {
        return new xs2(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, wu2Var, null);
    }

    public static xs2 i(String str, String str2, String str3, int i2, wu2 wu2Var) {
        return new xs2(str, null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, wu2Var, null);
    }

    public final int A() {
        int i2;
        int i3 = this.n;
        if (i3 == -1 || (i2 = this.o) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat B() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f10250j);
        String str = this.C;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        C(mediaFormat, "max-input-size", this.f10251k);
        C(mediaFormat, "width", this.n);
        C(mediaFormat, "height", this.o);
        float f2 = this.p;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        C(mediaFormat, "rotation-degrees", this.q);
        C(mediaFormat, "channel-count", this.v);
        C(mediaFormat, "sample-rate", this.w);
        C(mediaFormat, "encoder-delay", this.y);
        C(mediaFormat, "encoder-padding", this.z);
        for (int i2 = 0; i2 < this.f10252l.size(); i2++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f10252l.get(i2)));
        }
        y03 y03Var = this.u;
        if (y03Var != null) {
            C(mediaFormat, "color-transfer", y03Var.f10332g);
            C(mediaFormat, "color-standard", y03Var.f10330e);
            C(mediaFormat, "color-range", y03Var.f10331f);
            byte[] bArr = y03Var.f10333h;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xs2.class == obj.getClass()) {
            xs2 xs2Var = (xs2) obj;
            if (this.f10246f == xs2Var.f10246f && this.f10251k == xs2Var.f10251k && this.n == xs2Var.n && this.o == xs2Var.o && this.p == xs2Var.p && this.q == xs2Var.q && this.r == xs2Var.r && this.s == xs2Var.s && this.v == xs2Var.v && this.w == xs2Var.w && this.x == xs2Var.x && this.y == xs2Var.y && this.z == xs2Var.z && this.A == xs2Var.A && this.B == xs2Var.B && v03.a(this.f10245e, xs2Var.f10245e) && v03.a(this.C, xs2Var.C) && this.D == xs2Var.D && v03.a(this.f10249i, xs2Var.f10249i) && v03.a(this.f10250j, xs2Var.f10250j) && v03.a(this.f10247g, xs2Var.f10247g) && v03.a(this.f10253m, xs2Var.f10253m) && v03.a(this.f10248h, xs2Var.f10248h) && v03.a(this.u, xs2Var.u) && Arrays.equals(this.t, xs2Var.t) && this.f10252l.size() == xs2Var.f10252l.size()) {
                for (int i2 = 0; i2 < this.f10252l.size(); i2++) {
                    if (!Arrays.equals(this.f10252l.get(i2), xs2Var.f10252l.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.E;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f10245e;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.f10249i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10250j;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10247g;
        int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f10246f) * 31) + this.n) * 31) + this.o) * 31) + this.v) * 31) + this.w) * 31;
        String str5 = this.C;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.D) * 31;
        wu2 wu2Var = this.f10253m;
        int iHashCode6 = (iHashCode5 + (wu2Var == null ? 0 : wu2Var.hashCode())) * 31;
        hx2 hx2Var = this.f10248h;
        int iHashCode7 = iHashCode6 + (hx2Var != null ? hx2Var.hashCode() : 0);
        this.E = iHashCode7;
        return iHashCode7;
    }

    public final xs2 j(int i2) {
        return new xs2(this.f10245e, this.f10249i, this.f10250j, this.f10247g, this.f10246f, i2, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.B, this.C, this.D, this.A, this.f10252l, this.f10253m, this.f10248h);
    }

    public final xs2 q(int i2, int i3) {
        return new xs2(this.f10245e, this.f10249i, this.f10250j, this.f10247g, this.f10246f, this.f10251k, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, i2, i3, this.B, this.C, this.D, this.A, this.f10252l, this.f10253m, this.f10248h);
    }

    public final xs2 s(wu2 wu2Var) {
        return new xs2(this.f10245e, this.f10249i, this.f10250j, this.f10247g, this.f10246f, this.f10251k, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.B, this.C, this.D, this.A, this.f10252l, wu2Var, this.f10248h);
    }

    public final String toString() {
        String str = this.f10245e;
        String str2 = this.f10249i;
        String str3 = this.f10250j;
        int i2 = this.f10246f;
        String str4 = this.C;
        int i3 = this.n;
        int i4 = this.o;
        float f2 = this.p;
        int i5 = this.v;
        int i6 = this.w;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("])");
        return sb.toString();
    }

    public final xs2 v(hx2 hx2Var) {
        return new xs2(this.f10245e, this.f10249i, this.f10250j, this.f10247g, this.f10246f, this.f10251k, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.B, this.C, this.D, this.A, this.f10252l, this.f10253m, hx2Var);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f10245e);
        parcel.writeString(this.f10249i);
        parcel.writeString(this.f10250j);
        parcel.writeString(this.f10247g);
        parcel.writeInt(this.f10246f);
        parcel.writeInt(this.f10251k);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeFloat(this.p);
        parcel.writeInt(this.q);
        parcel.writeFloat(this.r);
        parcel.writeInt(this.t != null ? 1 : 0);
        byte[] bArr = this.t;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.s);
        parcel.writeParcelable(this.u, i2);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.B);
        parcel.writeString(this.C);
        parcel.writeInt(this.D);
        parcel.writeLong(this.A);
        int size = this.f10252l.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.f10252l.get(i3));
        }
        parcel.writeParcelable(this.f10253m, 0);
        parcel.writeParcelable(this.f10248h, 0);
    }

    xs2(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, y03 y03Var, int i8, int i9, int i10, int i11, int i12, int i13, String str5, int i14, long j2, List<byte[]> list, wu2 wu2Var, hx2 hx2Var) {
        this.f10245e = str;
        this.f10249i = str2;
        this.f10250j = str3;
        this.f10247g = str4;
        this.f10246f = i2;
        this.f10251k = i3;
        this.n = i4;
        this.o = i5;
        this.p = f2;
        this.q = i6;
        this.r = f3;
        this.t = bArr;
        this.s = i7;
        this.u = y03Var;
        this.v = i8;
        this.w = i9;
        this.x = i10;
        this.y = i11;
        this.z = i12;
        this.B = i13;
        this.C = str5;
        this.D = i14;
        this.A = j2;
        this.f10252l = list == null ? Collections.emptyList() : list;
        this.f10253m = wu2Var;
        this.f10248h = hx2Var;
    }
}