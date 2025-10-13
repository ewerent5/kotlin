package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellInfoWcdmaWrapper.java */
/* loaded from: classes.dex */
public class n extends o {

    /* renamed from: d, reason: collision with root package name */
    public final g f13434d;

    /* renamed from: e, reason: collision with root package name */
    public final v f13435e;

    public n(boolean z, int i2, long j2, g gVar, v vVar) {
        super(z, i2, j2);
        this.f13434d = gVar;
        this.f13435e = vVar;
    }

    public String toString() {
        return "CellInfoWcdmaWrapper{isRegistered=" + this.a + ", cellConnectionStatus=" + this.f13436b + ", timestampMillis=" + this.f13437c + ", cellIdentity=" + this.f13434d + ", cellSignalStrength=" + this.f13435e + CoreConstants.CURLY_RIGHT;
    }
}