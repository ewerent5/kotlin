package e.c.b.b.c.e;

import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class d0 extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ boolean f14441i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ h f14442j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(h hVar, boolean z) {
        super(hVar);
        this.f14442j = hVar;
        this.f14441i = z;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        this.f14442j.f14570m.setDataCollectionEnabled(this.f14441i);
    }
}