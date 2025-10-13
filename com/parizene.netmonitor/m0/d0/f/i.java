package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellInfoCdmaWrapper.java */
/* loaded from: classes.dex */
public class i extends o {

    /* renamed from: d, reason: collision with root package name */
    public final b f13424d;

    /* renamed from: e, reason: collision with root package name */
    public final q f13425e;

    public i(boolean z, int i2, long j2, b bVar, q qVar) {
        super(z, i2, j2);
        this.f13424d = bVar;
        this.f13425e = qVar;
    }

    public String toString() {
        return "CellInfoCdmaWrapper{isRegistered=" + this.a + ", cellConnectionStatus=" + this.f13436b + ", timestampMillis=" + this.f13437c + ", cellIdentity=" + this.f13424d + ", cellSignalStrength=" + this.f13425e + CoreConstants.CURLY_RIGHT;
    }
}