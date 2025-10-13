package com.google.android.gms.internal.ads;

import android.os.Bundle;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wd1 implements zg1<Bundle> {

    @Nullable
    private final JSONObject a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final JSONObject f9951b;

    public wd1(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        this.a = jSONObject;
        this.f9951b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            bundle2.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f9951b;
        if (jSONObject2 != null) {
            bundle2.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}