package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* loaded from: classes.dex */
final class h extends v.d.a.b {
    private final String a;

    @Override // com.google.firebase.crashlytics.d.j.v.d.a.b
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v.d.a.b) {
            return this.a.equals(((v.d.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.a + "}";
    }
}