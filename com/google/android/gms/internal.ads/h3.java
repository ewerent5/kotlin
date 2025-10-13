package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzbr;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h3 {
    private final Context a;

    public h3(Context context) {
        com.google.android.gms.common.internal.p.k(context, "Context can not be null");
        this.a = context;
    }

    public final boolean a() {
        return ((Boolean) zzbr.zza(this.a, new g3())).booleanValue() && com.google.android.gms.common.p.c.a(this.a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    public final boolean b() {
        return c(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c(Intent intent) {
        com.google.android.gms.common.internal.p.k(intent, "Intent can not be null");
        return !this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}