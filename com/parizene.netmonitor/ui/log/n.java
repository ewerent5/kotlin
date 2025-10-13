package com.parizene.netmonitor.ui.log;

import ch.qos.logback.core.CoreConstants;

/* compiled from: LogOptionsMenu.kt */
/* loaded from: classes3.dex */
public final class n {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13921b;

    public n(boolean z, boolean z2) {
        this.a = z;
        this.f13921b = z2;
    }

    public final boolean a() {
        return this.f13921b;
    }

    public final boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && this.f13921b == nVar.f13921b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        boolean z2 = this.f13921b;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "LogOptionsMenu(isShowOperatorChecked=" + this.a + ", isShowDateChecked=" + this.f13921b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}