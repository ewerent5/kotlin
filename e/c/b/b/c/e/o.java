package e.c.b.b.c.e;

import android.os.Bundle;
import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class o extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Bundle f14736i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ h f14737j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(h hVar, Bundle bundle) {
        super(hVar);
        this.f14737j = hVar;
        this.f14736i = bundle;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        this.f14737j.f14570m.setConsent(this.f14736i, this.f14571e);
    }
}