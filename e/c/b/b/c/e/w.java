package e.c.b.b.c.e;

import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class w extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ rf f14902i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ h f14903j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(h hVar, rf rfVar) {
        super(hVar);
        this.f14903j = hVar;
        this.f14902i = rfVar;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        this.f14903j.f14570m.generateEventId(this.f14902i);
    }

    @Override // e.c.b.b.c.e.h.a
    protected final void b() {
        this.f14902i.w(null);
    }
}