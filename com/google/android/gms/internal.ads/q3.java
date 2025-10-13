package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class q3 {
    public static final SharedPreferences a(Context context) {
        return context.getSharedPreferences("google_ads_flags", 0);
    }
}