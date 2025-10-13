package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ki1 implements ah1<li1> {
    final h52 a;

    /* renamed from: b, reason: collision with root package name */
    final Context f7002b;

    /* renamed from: c, reason: collision with root package name */
    final k43 f7003c;

    public ki1(k43 k43Var, h52 h52Var, Context context, byte[] bArr) {
        this.f7003c = k43Var;
        this.a = h52Var;
        this.f7002b = context;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<li1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.ji1
            private final ki1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new li1(new JSONObject());
            }
        });
    }
}