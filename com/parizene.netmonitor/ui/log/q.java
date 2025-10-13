package com.parizene.netmonitor.ui.log;

import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.ui.p0;

/* compiled from: LogUiSettings.kt */
/* loaded from: classes3.dex */
public final class q {
    private p0 a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13930b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13931c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13932d;

    public q(p0 p0Var, boolean z, boolean z2, boolean z3) {
        i.y.d.l.d(p0Var, "cidDivider");
        this.a = p0Var;
        this.f13930b = z;
        this.f13931c = z2;
        this.f13932d = z3;
    }

    public final p0 a() {
        return this.a;
    }

    public final boolean b() {
        return this.f13932d;
    }

    public final boolean c() {
        return this.f13930b;
    }

    public final boolean d() {
        return this.f13931c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.f13930b == qVar.f13930b && this.f13931c == qVar.f13931c && this.f13932d == qVar.f13932d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.f13930b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (iHashCode + i2) * 31;
        boolean z2 = this.f13931c;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.f13932d;
        return i5 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        return "LogUiSettings(cidDivider=" + this.a + ", showLteENodeBSector=" + this.f13930b + ", showOperator=" + this.f13931c + ", showDate=" + this.f13932d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}