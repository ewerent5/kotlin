package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vi1 implements ah1<wi1> {
    final h52 a;

    /* renamed from: b, reason: collision with root package name */
    final List<String> f9709b;

    /* renamed from: c, reason: collision with root package name */
    final i3 f9710c;

    /* JADX WARN: Multi-variable type inference failed */
    public vi1(i3 i3Var, i3 i3Var2, h52 h52Var, List<String> list) {
        this.f9710c = i3Var;
        this.a = i3Var2;
        this.f9709b = h52Var;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<wi1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.ui1
            private final vi1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new wi1(this.a.f9709b);
            }
        });
    }
}