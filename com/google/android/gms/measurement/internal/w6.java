package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class w6 implements ga {
    private final /* synthetic */ i6 a;

    w6(i6 i6Var) {
        this.a = i6Var;
    }

    @Override // com.google.android.gms.measurement.internal.ga
    public final void a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.R("auto", "_err", bundle);
        } else {
            this.a.S("auto", "_err", bundle, str);
        }
    }
}