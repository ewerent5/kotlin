package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.a;

/* loaded from: classes.dex */
final class l implements a.InterfaceC0111a {
    private final /* synthetic */ b a;

    l(b bVar) {
        this.a = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0111a
    public final void a(boolean z) {
        this.a.u.sendMessage(this.a.u.obtainMessage(1, Boolean.valueOf(z)));
    }
}