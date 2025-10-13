package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class o43 extends PushbackInputStream {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q43 f7899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o43(q43 q43Var, InputStream inputStream, int i2) {
        super(inputStream, 1);
        this.f7899e = q43Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        s43.b(this.f7899e.f8328c);
        super.close();
    }
}