package e.c.b.b.c.e;

import android.app.Activity;
import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class n0 extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Activity f14720i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ h.b f14721j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n0(h.b bVar, Activity activity) {
        super(h.this);
        this.f14721j = bVar;
        this.f14720i = activity;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        h.this.f14570m.onActivityDestroyed(e.c.b.b.b.d.m4(this.f14720i), this.f14572f);
    }
}