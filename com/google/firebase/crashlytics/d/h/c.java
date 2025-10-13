package com.google.firebase.crashlytics.d.h;

import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* loaded from: classes.dex */
final class c extends p {
    private final com.google.firebase.crashlytics.d.j.v a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12347b;

    c(com.google.firebase.crashlytics.d.j.v vVar, String str) {
        Objects.requireNonNull(vVar, "Null report");
        this.a = vVar;
        Objects.requireNonNull(str, "Null sessionId");
        this.f12347b = str;
    }

    @Override // com.google.firebase.crashlytics.d.h.p
    public com.google.firebase.crashlytics.d.j.v b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.d.h.p
    public String c() {
        return this.f12347b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.b()) && this.f12347b.equals(pVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f12347b.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.f12347b + "}";
    }
}