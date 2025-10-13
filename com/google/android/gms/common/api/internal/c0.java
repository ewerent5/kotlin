package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;

/* loaded from: classes.dex */
public final class c0<O extends a.d> {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4592b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.a<O> f4593c;

    /* renamed from: d, reason: collision with root package name */
    private final O f4594d;

    public final String a() {
        return this.f4593c.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return !this.a && !c0Var.a && com.google.android.gms.common.internal.o.a(this.f4593c, c0Var.f4593c) && com.google.android.gms.common.internal.o.a(this.f4594d, c0Var.f4594d);
    }

    public final int hashCode() {
        return this.f4592b;
    }
}