package e.c.b.b.c.e;

import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class e0 extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ h.c f14467i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ h f14468j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e0(h hVar, h.c cVar) {
        super(hVar);
        this.f14468j = hVar;
        this.f14467i = cVar;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        this.f14468j.f14570m.registerOnMeasurementEventListener(this.f14467i);
    }
}