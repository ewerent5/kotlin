package com.google.firebase.remoteconfig;

/* compiled from: FirebaseRemoteConfigServerException.java */
/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: e, reason: collision with root package name */
    private final int f12971e;

    public k(int i2, String str) {
        super(str);
        this.f12971e = i2;
    }

    public int a() {
        return this.f12971e;
    }

    public k(int i2, String str, Throwable th) {
        super(str, th);
        this.f12971e = i2;
    }
}