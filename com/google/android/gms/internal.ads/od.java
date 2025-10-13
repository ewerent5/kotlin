package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class od implements Runnable {

    /* renamed from: e */
    private final ge f7936e;

    /* renamed from: f */
    private final fe f7937f;

    /* renamed from: g */
    private final ad f7938g;

    od(ge geVar, fe feVar, ad adVar) {
        this.f7936e = geVar;
        this.f7937f = feVar;
        this.f7938g = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7936e.e(this.f7937f, this.f7938g);
    }
}