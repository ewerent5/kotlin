package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* loaded from: classes.dex */
final class e implements a.InterfaceC0115a {
    private final /* synthetic */ b a;

    public e(b bVar) {
        this.a = bVar;
    }

    @Override // com.google.android.gms.measurement.internal.f6
    public final void a(String str, String str2, Bundle bundle, long j2) {
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", c.j(str2));
            this.a.f12250b.a(2, bundle2);
        }
    }
}