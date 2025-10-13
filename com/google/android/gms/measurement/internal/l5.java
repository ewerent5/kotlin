package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class l5 implements Callable<List<ea>> {
    private final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f11004b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f11005c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ e5 f11006d;

    l5(e5 e5Var, String str, String str2, String str3) {
        this.f11006d = e5Var;
        this.a = str;
        this.f11004b = str2;
        this.f11005c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<ea> call() {
        this.f11006d.f10830e.f0();
        return this.f11006d.f10830e.V().I(this.a, this.f11004b, this.f11005c);
    }
}