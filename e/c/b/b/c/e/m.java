package e.c.b.b.c.e;

import android.os.Bundle;
import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class m extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ String f14704i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f14705j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ Bundle f14706k;

    /* renamed from: l, reason: collision with root package name */
    private final /* synthetic */ h f14707l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(h hVar, String str, String str2, Bundle bundle) {
        super(hVar);
        this.f14707l = hVar;
        this.f14704i = str;
        this.f14705j = str2;
        this.f14706k = bundle;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        this.f14707l.f14570m.clearConditionalUserProperty(this.f14704i, this.f14705j, this.f14706k);
    }
}