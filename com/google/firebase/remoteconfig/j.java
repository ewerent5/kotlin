package com.google.firebase.remoteconfig;

/* compiled from: FirebaseRemoteConfigFetchThrottledException.java */
/* loaded from: classes.dex */
public class j extends i {

    /* renamed from: e, reason: collision with root package name */
    private final long f12970e;

    public j(long j2) {
        this("Fetch was throttled.", j2);
    }

    public j(String str, long j2) {
        super(str);
        this.f12970e = j2;
    }
}