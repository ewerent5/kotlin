package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class m52 extends o32<Void> implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f7432l;

    public m52(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.f7432l = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7432l.run();
        } catch (Throwable th) {
            m(th);
            q12.a(th);
            throw new RuntimeException(th);
        }
    }
}