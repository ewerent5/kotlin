package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final /* synthetic */ class s implements Callable {
    private final boolean a;

    /* renamed from: b */
    private final String f4773b;

    /* renamed from: c */
    private final x f4774c;

    s(boolean z, String str, x xVar) {
        this.a = z;
        this.f4773b = str;
        this.f4774c = xVar;
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.common.b0.e(boolean, java.lang.String, com.google.android.gms.common.x):java.lang.String */
    /* JADX WARN: Not passed register '(r0v0 'z3' boolean)' in method call: com.google.android.gms.common.b0.e(boolean, java.lang.String, com.google.android.gms.common.x):java.lang.String */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        return b0.e(this.a, this.f4773b, this.f4774c);
    }
}