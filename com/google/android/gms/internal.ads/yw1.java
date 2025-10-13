package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class yw1 extends zw1 {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f10499c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f10500d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f10501e;

    /* JADX WARN: Multi-variable type inference failed */
    public yw1(rw1 rw1Var, rw1 rw1Var2, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(rw1Var, null);
        this.f10499c = new HashSet<>((Collection) rw1Var2);
        this.f10500d = hashSet;
        this.f10501e = jSONObject;
    }
}