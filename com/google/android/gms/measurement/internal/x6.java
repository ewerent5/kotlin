package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class x6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f11334e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11335f = null;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11336g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ String f11337h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ boolean f11338i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ i6 f11339j;

    x6(i6 i6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f11339j = i6Var;
        this.f11334e = atomicReference;
        this.f11336g = str2;
        this.f11337h = str3;
        this.f11338i = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11339j.a.K().O(this.f11334e, null, this.f11336g, this.f11337h, this.f11338i);
    }
}