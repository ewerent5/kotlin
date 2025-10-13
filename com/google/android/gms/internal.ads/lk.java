package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class lk extends vp {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ QueryInfoGenerationCallback f7261e;

    lk(nk nkVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.f7261e = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void E(String str, String str2, Bundle bundle) {
        QueryInfo queryInfo = new QueryInfo(new g2(str, bundle));
        ta3.f().put(queryInfo, str2);
        this.f7261e.onSuccess(queryInfo);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void d(String str) {
        this.f7261e.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void o(String str, String str2) {
        QueryInfo queryInfo = new QueryInfo(new g2(str, null));
        ta3.f().put(queryInfo, str2);
        this.f7261e.onSuccess(queryInfo);
    }
}