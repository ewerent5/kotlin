package com.google.android.play.core.assetpacks;

import java.util.Objects;

/* loaded from: classes.dex */
final class z extends AssetPackState {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12205b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12206c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12207d;

    /* renamed from: e, reason: collision with root package name */
    private final long f12208e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12209f;

    /* renamed from: g, reason: collision with root package name */
    private final int f12210g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12211h;

    z(String str, int i2, int i3, long j2, long j3, int i4, int i5, String str2) {
        Objects.requireNonNull(str, "Null name");
        this.a = str;
        this.f12205b = i2;
        this.f12206c = i3;
        this.f12207d = j2;
        this.f12208e = j3;
        this.f12209f = i4;
        this.f12210g = i5;
        Objects.requireNonNull(str2, "Null versionTag");
        this.f12211h = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int a() {
        return this.f12210g;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String b() {
        return this.f12211h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long c() {
        return this.f12207d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.a.equals(assetPackState.g()) && this.f12205b == assetPackState.h() && this.f12206c == assetPackState.f() && this.f12207d == assetPackState.c() && this.f12208e == assetPackState.i() && this.f12209f == assetPackState.j() && this.f12210g == assetPackState.a() && this.f12211h.equals(assetPackState.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int f() {
        return this.f12206c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String g() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int h() {
        return this.f12205b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        int i2 = this.f12205b;
        int i3 = this.f12206c;
        long j2 = this.f12207d;
        long j3 = this.f12208e;
        return ((((((((((((((iHashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f12209f) * 1000003) ^ this.f12210g) * 1000003) ^ this.f12211h.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long i() {
        return this.f12208e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int j() {
        return this.f12209f;
    }

    public final String toString() {
        String str = this.a;
        int i2 = this.f12205b;
        int i3 = this.f12206c;
        long j2 = this.f12207d;
        long j3 = this.f12208e;
        int i4 = this.f12209f;
        int i5 = this.f12210g;
        String str2 = this.f12211h;
        StringBuilder sb = new StringBuilder(str.length() + 230 + str2.length());
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", transferProgressPercentage=");
        sb.append(i4);
        sb.append(", updateAvailability=");
        sb.append(i5);
        sb.append(", versionTag=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}