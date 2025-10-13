package e.c.b.b.c.e;

import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class f0 extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ String f14504i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f14505j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ Object f14506k;

    /* renamed from: l, reason: collision with root package name */
    private final /* synthetic */ boolean f14507l;

    /* renamed from: m, reason: collision with root package name */
    private final /* synthetic */ h f14508m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(h hVar, String str, String str2, Object obj, boolean z) {
        super(hVar);
        this.f14508m = hVar;
        this.f14504i = str;
        this.f14505j = str2;
        this.f14506k = obj;
        this.f14507l = z;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        this.f14508m.f14570m.setUserProperty(this.f14504i, this.f14505j, e.c.b.b.b.d.m4(this.f14506k), this.f14507l, this.f14571e);
    }
}