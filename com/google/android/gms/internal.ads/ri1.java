package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ri1 implements ah1<si1> {
    final h52 a;

    /* renamed from: b, reason: collision with root package name */
    final String f8653b;

    /* renamed from: c, reason: collision with root package name */
    final fq f8654c;

    public ri1(fq fqVar, h52 h52Var, String str, byte[] bArr) {
        this.f8654c = fqVar;
        this.a = h52Var;
        this.f8653b = str;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<si1> zza() {
        new wr();
        final g52 g52VarA = y42.a(null);
        if (((Boolean) c.c().b(w3.V3)).booleanValue()) {
            g52VarA = y42.a(null);
        }
        final g52 g52VarA2 = y42.a(null);
        return y42.m(g52VarA, g52VarA2).a(new Callable(g52VarA, g52VarA2) { // from class: com.google.android.gms.internal.ads.qi1
            private final g52 a;

            /* renamed from: b, reason: collision with root package name */
            private final g52 f8391b;

            {
                this.a = g52VarA;
                this.f8391b = g52VarA2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new si1((String) this.a.get(), (String) this.f8391b.get());
            }
        }, qr.a);
    }
}