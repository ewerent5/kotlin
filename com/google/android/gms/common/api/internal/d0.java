package com.google.android.gms.common.api.internal;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d0 {
    private final c.e.a<c0<?>, com.google.android.gms.common.b> a;

    /* renamed from: b, reason: collision with root package name */
    private final c.e.a<c0<?>, String> f4595b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.b.e.i<Map<c0<?>, String>> f4596c;

    /* renamed from: d, reason: collision with root package name */
    private int f4597d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4598e;

    public final void a(c0<?> c0Var, com.google.android.gms.common.b bVar, String str) {
        this.a.put(c0Var, bVar);
        this.f4595b.put(c0Var, str);
        this.f4597d--;
        if (!bVar.L()) {
            this.f4598e = true;
        }
        if (this.f4597d == 0) {
            if (!this.f4598e) {
                this.f4596c.c(this.f4595b);
            } else {
                this.f4596c.b(new com.google.android.gms.common.api.c(this.a));
            }
        }
    }

    public final Set<c0<?>> b() {
        return this.a.keySet();
    }
}