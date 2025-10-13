package e.c.b.b.c.e;

import android.os.Bundle;
import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class a0 extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Bundle f14366i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ rf f14367j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ h f14368k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(h hVar, Bundle bundle, rf rfVar) {
        super(hVar);
        this.f14368k = hVar;
        this.f14366i = bundle;
        this.f14367j = rfVar;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        this.f14368k.f14570m.performAction(this.f14366i, this.f14367j, this.f14571e);
    }

    @Override // e.c.b.b.c.e.h.a
    protected final void b() {
        this.f14367j.w(null);
    }
}