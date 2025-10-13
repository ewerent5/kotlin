package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class w9 implements ga {
    final /* synthetic */ t9 a;

    w9(t9 t9Var) {
        this.a = t9Var;
    }

    @Override // com.google.android.gms.measurement.internal.ga
    public final void a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.f11254k.zzq().A().a("AppId not known when logging error event");
        } else {
            this.a.zzp().u(new y9(this, str, bundle));
        }
    }
}