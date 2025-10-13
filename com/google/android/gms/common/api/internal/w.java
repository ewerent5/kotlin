package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class w implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ e.c.b.b.d.b.k f4618e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ u f4619f;

    w(u uVar, e.c.b.b.d.b.k kVar) {
        this.f4619f = uVar;
        this.f4618e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4619f.M4(this.f4618e);
    }
}