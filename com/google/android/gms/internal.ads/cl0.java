package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cl0 implements mo2<r13> {
    private final wo2<kr> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<String> f5325b;

    public cl0(wo2<kr> wo2Var, wo2<String> wo2Var2) {
        this.a = wo2Var;
        this.f5325b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        kr krVarA = ((qy) this.a).a();
        zzs.zzc();
        return new r13(UUID.randomUUID().toString(), krVarA, "native", new JSONObject(), false, true);
    }
}