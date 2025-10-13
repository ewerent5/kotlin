package com.google.firebase.crashlytics.d.h;

/* compiled from: DeliveryMechanism.java */
/* loaded from: classes.dex */
public enum u {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: j, reason: collision with root package name */
    private final int f12475j;

    u(int i2) {
        this.f12475j = i2;
    }

    public static u a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int b() {
        return this.f12475j;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f12475j);
    }
}