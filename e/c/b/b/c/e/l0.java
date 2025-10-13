package e.c.b.b.c.e;

import android.app.Activity;
import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class l0 extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Activity f14681i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ rf f14682j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ h.b f14683k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l0(h.b bVar, Activity activity, rf rfVar) {
        super(h.this);
        this.f14683k = bVar;
        this.f14681i = activity;
        this.f14682j = rfVar;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        h.this.f14570m.onActivitySaveInstanceState(e.c.b.b.b.d.m4(this.f14681i), this.f14682j, this.f14572f);
    }
}