package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class iq {
    private long a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f6567b = -1;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ jq f6568c;

    public iq(jq jqVar) {
        this.f6568c = jqVar;
    }

    public final long a() {
        return this.f6567b;
    }

    public final void b() {
        this.f6567b = this.f6568c.a.c();
    }

    public final void c() {
        this.a = this.f6568c.a.c();
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.a);
        bundle.putLong("tclose", this.f6567b);
        return bundle;
    }
}