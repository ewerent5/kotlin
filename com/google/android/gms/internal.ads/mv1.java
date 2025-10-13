package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mv1 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7565b;

    private mv1(String str, String str2) {
        this.a = str;
        this.f7565b = str2;
    }

    public static mv1 a(String str, String str2) {
        mw1.b(str, "Name is null or empty");
        mw1.b(str2, "Version is null or empty");
        return new mv1(str, str2);
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.f7565b;
    }
}