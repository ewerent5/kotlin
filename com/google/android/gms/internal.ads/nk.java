package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class nk {

    @GuardedBy("InternalQueryInfoGenerator.class")
    private static zp a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7721b;

    /* renamed from: c, reason: collision with root package name */
    private final AdFormat f7722c;

    /* renamed from: d, reason: collision with root package name */
    private final u1 f7723d;

    public nk(Context context, AdFormat adFormat, u1 u1Var) {
        this.f7721b = context;
        this.f7722c = adFormat;
        this.f7723d = u1Var;
    }

    public static zp a(Context context) {
        zp zpVar;
        synchronized (nk.class) {
            if (a == null) {
                a = ta3.b().h(context, new pf());
            }
            zpVar = a;
        }
        return zpVar;
    }

    public final void b(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zp zpVarA = a(this.f7721b);
        if (zpVarA == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        e.c.b.b.b.b bVarM4 = e.c.b.b.b.d.m4(this.f7721b);
        u1 u1Var = this.f7723d;
        try {
            zpVarA.zze(bVarM4, new dq(null, this.f7722c.name(), null, u1Var == null ? new n93().a() : q93.a.a(this.f7721b, u1Var)), new lk(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}