package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-base@@20.1.0 */
/* loaded from: classes.dex */
final class dh2 extends WeakReference<Throwable> {
    private final int a;

    public dh2(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == dh2.class) {
            if (this == obj) {
                return true;
            }
            dh2 dh2Var = (dh2) obj;
            if (this.a == dh2Var.a && get() == dh2Var.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}