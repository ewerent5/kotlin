package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class md1 implements ah1<nd1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7461b;

    public md1(h52 h52Var, Context context) {
        this.a = h52Var;
        this.f7461b = context;
    }

    final /* synthetic */ nd1 a() {
        double intExtra;
        Intent intentRegisterReceiver = this.f7461b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver != null) {
            int intExtra2 = intentRegisterReceiver.getIntExtra("status", -1);
            intExtra = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            if (intExtra2 == 2 || intExtra2 == 5) {
                z = true;
            }
        } else {
            intExtra = -1.0d;
        }
        return new nd1(intExtra, z);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<nd1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.ld1
            private final md1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}