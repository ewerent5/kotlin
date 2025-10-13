package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class y9 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f11361e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Bundle f11362f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ w9 f11363g;

    y9(w9 w9Var, String str, Bundle bundle) {
        this.f11363g = w9Var;
        this.f11361e = str;
        this.f11362f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11363g.a.m(this.f11363g.a.c0().A(this.f11361e, "_err", this.f11362f, "auto", this.f11363g.a.zzl().a(), false, false, false), this.f11361e);
    }
}