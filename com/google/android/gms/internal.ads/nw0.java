package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class nw0 implements Runnable {

    /* renamed from: e */
    private final ow0 f7819e;

    /* renamed from: f */
    private final String f7820f;

    nw0(ow0 ow0Var, String str) {
        this.f7819e = ow0Var;
        this.f7820f = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        ow0 ow0Var = this.f7819e;
        qw0.q(ow0Var.a, this.f7820f);
    }
}