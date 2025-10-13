package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.b;

/* loaded from: classes.dex */
final class o implements b.e {
    final /* synthetic */ b.a a;

    o(b.a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.gms.common.internal.b.e
    public final void a() {
        b.this.u.post(new p(this));
    }
}