package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class ok extends jk {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ UpdateImpressionUrlsCallback f7953e;

    ok(rk rkVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.f7953e = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void U3(List<Uri> list) {
        this.f7953e.onSuccess(list);
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void b(String str) {
        this.f7953e.onFailure(str);
    }
}