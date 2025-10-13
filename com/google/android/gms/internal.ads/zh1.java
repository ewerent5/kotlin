package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zh1 implements ah1<ai1> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10596b;

    /* renamed from: c, reason: collision with root package name */
    private final h52 f10597c;

    public zh1(sl slVar, Context context, String str, h52 h52Var) {
        this.a = context;
        this.f10596b = str;
        this.f10597c = h52Var;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<ai1> zza() {
        return this.f10597c.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.yh1
            private final zh1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ai1(new JSONObject());
            }
        });
    }
}