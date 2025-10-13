package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yl {
    private final WeakHashMap<Context, xl> a = new WeakHashMap<>();

    public final Future<vl> a(Context context) {
        return qr.a.N(new wl(this, context));
    }
}