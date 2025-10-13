package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class v9 implements e4 {
    private final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t9 f11302b;

    v9(t9 t9Var, String str) {
        this.f11302b = t9Var;
        this.a = str;
    }

    @Override // com.google.android.gms.measurement.internal.e4
    public final void a(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f11302b.h(i2, th, bArr, this.a);
    }
}