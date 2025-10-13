package e.c.b.b.c.e;

import android.app.Activity;
import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class n extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Activity f14716i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f14717j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ String f14718k;

    /* renamed from: l, reason: collision with root package name */
    private final /* synthetic */ h f14719l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(h hVar, Activity activity, String str, String str2) {
        super(hVar);
        this.f14719l = hVar;
        this.f14716i = activity;
        this.f14717j = str;
        this.f14718k = str2;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        this.f14719l.f14570m.setCurrentScreen(e.c.b.b.b.d.m4(this.f14716i), this.f14717j, this.f14718k, this.f14571e);
    }
}