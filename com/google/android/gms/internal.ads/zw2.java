package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zw2 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10652b;

    public zw2(String str, boolean z) {
        this.a = str;
        this.f10652b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zw2.class) {
            zw2 zw2Var = (zw2) obj;
            if (TextUtils.equals(this.a, zw2Var.a) && this.f10652b == zw2Var.f10652b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.f10652b ? 1237 : 1231);
    }
}