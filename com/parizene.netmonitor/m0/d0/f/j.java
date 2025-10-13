package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellInfoGsmWrapper.java */
/* loaded from: classes.dex */
public class j extends o {

    /* renamed from: d, reason: collision with root package name */
    public final c f13426d;

    /* renamed from: e, reason: collision with root package name */
    public final r f13427e;

    public j(boolean z, int i2, long j2, c cVar, r rVar) {
        super(z, i2, j2);
        this.f13426d = cVar;
        this.f13427e = rVar;
    }

    public String toString() {
        return "CellInfoGsmWrapper{isRegistered=" + this.a + ", cellConnectionStatus=" + this.f13436b + ", timestampMillis=" + this.f13437c + ", cellIdentity=" + this.f13426d + ", cellSignalStrength=" + this.f13427e + CoreConstants.CURLY_RIGHT;
    }
}