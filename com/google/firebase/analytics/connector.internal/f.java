package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.measurement.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* loaded from: classes.dex */
final class f implements a.InterfaceC0115a {
    private final /* synthetic */ d a;

    public f(d dVar) {
        this.a = dVar;
    }

    @Override // com.google.android.gms.measurement.internal.f6
    public final void a(String str, String str2, Bundle bundle, long j2) {
        if (str == null || str.equals("crash") || !c.i(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(Action.NAME_ATTRIBUTE, str2);
        bundle2.putLong("timestampInMillis", j2);
        bundle2.putBundle("params", bundle);
        this.a.a.a(3, bundle2);
    }
}