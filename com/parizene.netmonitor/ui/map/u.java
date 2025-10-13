package com.parizene.netmonitor.ui.map;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: GoogleMapsAvailability.java */
/* loaded from: classes3.dex */
public class u {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private f.a<ActivityManager> f13989b;

    public u(Context context, f.a<ActivityManager> aVar) {
        this.a = context;
        this.f13989b = aVar;
    }

    public boolean a() {
        int iG;
        com.google.android.gms.common.e eVarL = com.google.android.gms.common.e.l();
        return this.f13989b.get().getDeviceConfigurationInfo().reqGlEsVersion >= 131072 && ((iG = eVarL.g(this.a)) == 0 || eVarL.i(iG));
    }
}