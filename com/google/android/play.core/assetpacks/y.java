package com.google.android.play.core.assetpacks;

/* loaded from: classes.dex */
final class y extends b {

    /* renamed from: b, reason: collision with root package name */
    private final int f12197b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12198c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12199d;

    y(int i2, String str, String str2) {
        this.f12197b = i2;
        this.f12198c = str;
        this.f12199d = str2;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String a() {
        return this.f12199d;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final int c() {
        return this.f12197b;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String d() {
        return this.f12198c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f12197b == bVar.c() && ((str = this.f12198c) != null ? str.equals(bVar.d()) : bVar.d() == null)) {
                String str2 = this.f12199d;
                String strA = bVar.a();
                if (str2 != null ? str2.equals(strA) : strA == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.f12197b ^ 1000003) * 1000003;
        String str = this.f12198c;
        int iHashCode = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12199d;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i2 = this.f12197b;
        String str = this.f12198c;
        String str2 = this.f12199d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i2);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}