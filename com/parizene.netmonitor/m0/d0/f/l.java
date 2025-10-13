package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellInfoNrWrapper.java */
/* loaded from: classes.dex */
public class l extends o {

    /* renamed from: d, reason: collision with root package name */
    public final e f13430d;

    /* renamed from: e, reason: collision with root package name */
    public final t f13431e;

    public l(boolean z, int i2, long j2, e eVar, t tVar) {
        super(z, i2, j2);
        this.f13430d = eVar;
        this.f13431e = tVar;
    }

    public String toString() {
        return "CellInfoNrWrapper{isRegistered=" + this.a + ", cellConnectionStatus=" + this.f13436b + ", timestampMillis=" + this.f13437c + ", cellIdentity=" + this.f13430d + ", cellSignalStrength=" + this.f13431e + CoreConstants.CURLY_RIGHT;
    }
}