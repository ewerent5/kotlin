package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cv1 {
    private boolean a;

    final boolean a() {
        return this.a;
    }

    final void b(Context context) {
        mw1.a(context, "Application Context cannot be null");
        if (this.a) {
            return;
        }
        this.a = true;
        aw1.a().b(context);
        vv1.a().b(context);
        kw1.a(context);
        xv1.a().c(context);
    }
}