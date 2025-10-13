package com.google.firebase.installations;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes.dex */
final /* synthetic */ class e implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final f f12787e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f12788f;

    private e(f fVar, boolean z) {
        this.f12787e = fVar;
        this.f12788f = z;
    }

    public static Runnable a(f fVar, boolean z) {
        return new e(fVar, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12787e.e(this.f12788f);
    }
}