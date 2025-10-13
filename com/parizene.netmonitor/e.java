package com.parizene.netmonitor;

import android.location.Address;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ com.parizene.netmonitor.r0.c f13177f;

    /* renamed from: g */
    public final /* synthetic */ com.parizene.netmonitor.r0.b f13178g;

    /* renamed from: h */
    public final /* synthetic */ Address f13179h;

    public /* synthetic */ e(com.parizene.netmonitor.r0.c cVar, com.parizene.netmonitor.r0.b bVar, Address address) {
        cVar = cVar;
        bVarC = bVar;
        addressB = address;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13176e.m(cVar, bVarC, addressB);
    }
}