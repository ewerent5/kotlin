package com.google.firebase.installations;

/* compiled from: FirebaseInstallationsException.java */
/* loaded from: classes.dex */
public class h extends com.google.firebase.h {

    /* renamed from: e, reason: collision with root package name */
    private final a f12802e;

    /* compiled from: FirebaseInstallationsException.java */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public h(a aVar) {
        this.f12802e = aVar;
    }

    public h(String str, a aVar) {
        super(str);
        this.f12802e = aVar;
    }
}