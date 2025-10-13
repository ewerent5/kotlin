package com.google.firebase.installations;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes.dex */
final /* synthetic */ class d implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final f f12785e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f12786f;

    private d(f fVar, boolean z) {
        this.f12785e = fVar;
        this.f12786f = z;
    }

    public static Runnable a(f fVar, boolean z) {
        return new d(fVar, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12785e.f(this.f12786f);
    }
}