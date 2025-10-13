package com.google.firebase.remoteconfig;

/* compiled from: RemoteConfigComponent.java */
/* loaded from: classes.dex */
final /* synthetic */ class n implements com.google.android.gms.common.util.d {
    private final com.google.firebase.remoteconfig.internal.p a;

    private n(com.google.firebase.remoteconfig.internal.p pVar) {
        this.a = pVar;
    }

    public static com.google.android.gms.common.util.d b(com.google.firebase.remoteconfig.internal.p pVar) {
        return new n(pVar);
    }

    @Override // com.google.android.gms.common.util.d
    public void a(Object obj, Object obj2) {
        this.a.a((String) obj, (com.google.firebase.remoteconfig.internal.f) obj2);
    }
}