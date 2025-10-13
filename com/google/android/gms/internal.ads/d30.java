package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class d30 extends wn2 implements Closeable {

    /* renamed from: m, reason: collision with root package name */
    private static final eo2 f5422m = eo2.b(d30.class);

    public d30(xn2 xn2Var, c20 c20Var) {
        g(xn2Var, xn2Var.zzb(), c20Var);
    }

    @Override // com.google.android.gms.internal.ads.wn2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final String toString() {
        String string = this.f10003h.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}