package com.google.android.play.core.assetpacks;

/* loaded from: classes.dex */
final class w1 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12181b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12182c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12183d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12184e;

    w1() {
    }

    w1(int i2, String str, long j2, long j3, int i3) {
        this();
        this.a = i2;
        this.f12181b = str;
        this.f12182c = j2;
        this.f12183d = j3;
        this.f12184e = i3;
    }

    int a() {
        return this.a;
    }

    String b() {
        return this.f12181b;
    }

    long c() {
        return this.f12182c;
    }

    long d() {
        return this.f12183d;
    }

    int e() {
        return this.f12184e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            if (this.a == w1Var.a() && ((str = this.f12181b) != null ? str.equals(w1Var.b()) : w1Var.b() == null) && this.f12182c == w1Var.c() && this.f12183d == w1Var.d() && this.f12184e == w1Var.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = (this.a ^ 1000003) * 1000003;
        String str = this.f12181b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f12182c;
        long j3 = this.f12183d;
        return ((((((i2 ^ iHashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f12184e;
    }

    public String toString() {
        int i2 = this.a;
        String str = this.f12181b;
        long j2 = this.f12182c;
        long j3 = this.f12183d;
        int i3 = this.f12184e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i2);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j2);
        sb.append(", remainingBytes=");
        sb.append(j3);
        sb.append(", previousChunk=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}