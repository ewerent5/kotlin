package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class iy implements mo2<WeakReference<Context>> {
    private final fy a;

    public iy(fy fyVar) {
        this.a = fyVar;
    }

    public final WeakReference<Context> a() {
        WeakReference<Context> weakReferenceB = this.a.b();
        ro2.b(weakReferenceB);
        return weakReferenceB;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        WeakReference<Context> weakReferenceB = this.a.b();
        ro2.b(weakReferenceB);
        return weakReferenceB;
    }
}