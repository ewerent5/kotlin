package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class c30 implements mo2<r13> {
    private final wo2<xo1> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<kr> f5248b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<JSONObject> f5249c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<String> f5250d;

    public c30(wo2<xo1> wo2Var, wo2<kr> wo2Var2, wo2<JSONObject> wo2Var3, wo2<String> wo2Var4) {
        this.a = wo2Var;
        this.f5248b = wo2Var2;
        this.f5249c = wo2Var3;
        this.f5250d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((j70) this.a).a();
        kr krVarA = ((qy) this.f5248b).a();
        JSONObject jSONObjectZzb = this.f5249c.zzb();
        String strZzb = this.f5250d.zzb();
        boolean zEquals = "native".equals(strZzb);
        zzs.zzc();
        return new r13(UUID.randomUUID().toString(), krVarA, strZzb, jSONObjectZzb, false, zEquals);
    }
}