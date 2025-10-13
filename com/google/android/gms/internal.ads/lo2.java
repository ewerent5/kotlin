package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lo2<T> implements wo2, go2 {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile wo2<T> f7287b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f7288c = a;

    private lo2(wo2<T> wo2Var) {
        this.f7287b = wo2Var;
    }

    public static <P extends wo2<T>, T> wo2<T> a(P p) {
        Objects.requireNonNull(p);
        return p instanceof lo2 ? p : new lo2(p);
    }

    public static <P extends wo2<T>, T> go2<T> b(P p) {
        if (p instanceof go2) {
            return (go2) p;
        }
        Objects.requireNonNull(p);
        return new lo2(p);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final T zzb() {
        T tZzb = (T) this.f7288c;
        Object obj = a;
        if (tZzb == obj) {
            synchronized (this) {
                tZzb = (T) this.f7288c;
                if (tZzb == obj) {
                    tZzb = this.f7287b.zzb();
                    Object obj2 = this.f7288c;
                    if (obj2 != obj && obj2 != tZzb) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tZzb);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f7288c = tZzb;
                    this.f7287b = null;
                }
            }
        }
        return tZzb;
    }
}