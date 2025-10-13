package com.google.firebase.remoteconfig.internal;

/* compiled from: ConfigGetParameterHandler.java */
/* loaded from: classes.dex */
final /* synthetic */ class l implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.common.util.d f12954e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12955f;

    /* renamed from: g, reason: collision with root package name */
    private final f f12956g;

    private l(com.google.android.gms.common.util.d dVar, String str, f fVar) {
        this.f12954e = dVar;
        this.f12955f = str;
        this.f12956g = fVar;
    }

    public static Runnable a(com.google.android.gms.common.util.d dVar, String str, f fVar) {
        return new l(dVar, str, fVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12954e.a(this.f12955f, this.f12956g);
    }
}