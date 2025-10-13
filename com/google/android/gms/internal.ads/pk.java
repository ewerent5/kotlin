package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class pk extends jk {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ UpdateClickUrlCallback f8180e;

    pk(rk rkVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.f8180e = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void U3(List<Uri> list) {
        this.f8180e.onSuccess(list.get(0));
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void b(String str) {
        this.f8180e.onFailure(str);
    }
}