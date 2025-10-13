package e.c.b.b.c.e;

import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class p extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Boolean f14761i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ h f14762j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(h hVar, Boolean bool) {
        super(hVar);
        this.f14762j = hVar;
        this.f14761i = bool;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        if (this.f14761i != null) {
            this.f14762j.f14570m.setMeasurementEnabled(this.f14761i.booleanValue(), this.f14571e);
        } else {
            this.f14762j.f14570m.clearMeasurementEnabled(this.f14571e);
        }
    }
}