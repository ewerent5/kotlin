package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class i32 {
    static final i32 a = new i32(new a("Failure occurred while trying to finish a future."));

    /* renamed from: b, reason: collision with root package name */
    final Throwable f6471b;

    /* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    i32(Throwable th) {
        Objects.requireNonNull(th);
        this.f6471b = th;
    }
}