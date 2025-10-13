package com.google.android.play.core.install;

import java.util.Objects;

/* loaded from: classes.dex */
final class a extends InstallState {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12217b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12218c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12219d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12220e;

    a(int i2, long j2, long j3, int i3, String str) {
        this.a = i2;
        this.f12217b = j2;
        this.f12218c = j3;
        this.f12219d = i3;
        Objects.requireNonNull(str, "Null packageName");
        this.f12220e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long b() {
        return this.f12217b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int c() {
        return this.f12219d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int d() {
        return this.a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String e() {
        return this.f12220e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.a == installState.d() && this.f12217b == installState.b() && this.f12218c == installState.f() && this.f12219d == installState.c() && this.f12220e.equals(installState.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long f() {
        return this.f12218c;
    }

    public final int hashCode() {
        int i2 = this.a;
        long j2 = this.f12217b;
        long j3 = this.f12218c;
        return ((((((((i2 ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f12219d) * 1000003) ^ this.f12220e.hashCode();
    }

    public final String toString() {
        int i2 = this.a;
        long j2 = this.f12217b;
        long j3 = this.f12218c;
        int i3 = this.f12219d;
        String str = this.f12220e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", installErrorCode=");
        sb.append(i3);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}