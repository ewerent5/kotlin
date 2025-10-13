package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class zj2 {
    private static final zj2 a;

    /* renamed from: b, reason: collision with root package name */
    private static final zj2 f10609b;

    static {
        vj2 vj2Var = null;
        a = new xj2(vj2Var);
        f10609b = new yj2(vj2Var);
    }

    /* synthetic */ zj2(vj2 vj2Var) {
    }

    static zj2 d() {
        return a;
    }

    static zj2 e() {
        return f10609b;
    }

    abstract <L> List<L> a(Object obj, long j2);

    abstract void b(Object obj, long j2);

    abstract <L> void c(Object obj, Object obj2, long j2);
}