package e.c.b.b.c.e;

import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class s extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ String f14824i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ h f14825j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(h hVar, String str) {
        super(hVar);
        this.f14825j = hVar;
        this.f14824i = str;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        this.f14825j.f14570m.beginAdUnitExposure(this.f14824i, this.f14572f);
    }
}