package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellInfoTdscdmaWrapper.java */
/* loaded from: classes.dex */
public class m extends o {

    /* renamed from: d, reason: collision with root package name */
    public final f f13432d;

    /* renamed from: e, reason: collision with root package name */
    public final u f13433e;

    public m(boolean z, int i2, long j2, f fVar, u uVar) {
        super(z, i2, j2);
        this.f13432d = fVar;
        this.f13433e = uVar;
    }

    public String toString() {
        return "CellInfoTdscdmaWrapper{isRegistered=" + this.a + ", cellConnectionStatus=" + this.f13436b + ", timestampMillis=" + this.f13437c + ", cellIdentity=" + this.f13432d + ", cellSignalStrength=" + this.f13433e + CoreConstants.CURLY_RIGHT;
    }
}