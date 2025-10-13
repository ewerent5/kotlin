package com.parizene.netmonitor.m0.c0;

import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.m0.d0.f.o;
import i.y.d.l;

/* compiled from: CellInfoWithMeta.kt */
/* loaded from: classes.dex */
public final class b {
    private final o a;

    /* renamed from: b, reason: collision with root package name */
    private final f f13335b;

    public b(o oVar, f fVar) {
        l.d(oVar, "cellInfo");
        l.d(fVar, "meta");
        this.a = oVar;
        this.f13335b = fVar;
    }

    public final o a() {
        return this.a;
    }

    public final f b() {
        return this.f13335b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.a, bVar.a) && l.a(this.f13335b, bVar.f13335b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.f13335b.hashCode();
    }

    public String toString() {
        return "CellInfoWithMeta(cellInfo=" + this.a + ", meta=" + this.f13335b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}