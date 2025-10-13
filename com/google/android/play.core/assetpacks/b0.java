package com.google.android.play.core.assetpacks;

import java.util.Map;

/* loaded from: classes.dex */
final class b0 extends c {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, AssetPackState> f11945b;

    b0(long j2, Map<String, AssetPackState> map) {
        this.a = j2;
        this.f11945b = map;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final Map<String, AssetPackState> e() {
        return this.f11945b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.a == cVar.f() && this.f11945b.equals(cVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final long f() {
        return this.a;
    }

    public final int hashCode() {
        long j2 = this.a;
        return this.f11945b.hashCode() ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j2 = this.a;
        String strValueOf = String.valueOf(this.f11945b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j2);
        sb.append(", packStates=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}