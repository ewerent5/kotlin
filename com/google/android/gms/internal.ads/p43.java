package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class p43 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8087b;

    public p43(String str, String str2) {
        this.a = str;
        this.f8087b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f8087b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p43.class == obj.getClass()) {
            p43 p43Var = (p43) obj;
            if (TextUtils.equals(this.a, p43Var.a) && TextUtils.equals(this.f8087b, p43Var.f8087b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.f8087b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f8087b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}