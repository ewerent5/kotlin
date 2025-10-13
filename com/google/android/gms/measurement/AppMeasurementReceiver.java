package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import c.n.a.a;
import com.google.android.gms.measurement.internal.s4;
import com.google.android.gms.measurement.internal.v4;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements v4 {

    /* renamed from: c, reason: collision with root package name */
    private s4 f10734c;

    @Override // com.google.android.gms.measurement.internal.v4
    public final void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f10734c == null) {
            this.f10734c = new s4(this);
        }
        this.f10734c.a(context, intent);
    }
}