package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class b30 implements mo2<Set<nh0<ib0>>> {
    private final wo2<y20> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f5054b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<JSONObject> f5055c;

    public b30(wo2<y20> wo2Var, wo2<Executor> wo2Var2, wo2<JSONObject> wo2Var3) {
        this.a = wo2Var;
        this.f5054b = wo2Var2;
        this.f5055c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        y20 y20VarZzb = this.a.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        Set setEmptySet = this.f5055c.zzb() == null ? Collections.emptySet() : Collections.singleton(new nh0(y20VarZzb, h52Var));
        ro2.b(setEmptySet);
        return setEmptySet;
    }
}