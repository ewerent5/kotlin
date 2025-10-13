package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellInfoLteWrapper.java */
/* loaded from: classes.dex */
public class k extends o {

    /* renamed from: d, reason: collision with root package name */
    public final d f13428d;

    /* renamed from: e, reason: collision with root package name */
    public final s f13429e;

    public k(boolean z, int i2, long j2, d dVar, s sVar) {
        super(z, i2, j2);
        this.f13428d = dVar;
        this.f13429e = sVar;
    }

    public String toString() {
        return "CellInfoLteWrapper{isRegistered=" + this.a + ", cellConnectionStatus=" + this.f13436b + ", timestampMillis=" + this.f13437c + ", cellIdentity=" + this.f13428d + ", cellSignalStrength=" + this.f13429e + CoreConstants.CURLY_RIGHT;
    }
}