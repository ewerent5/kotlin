package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* loaded from: classes.dex */
final class d extends v.c {
    private final w<v.c.b> a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12532b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    static final class b extends v.c.a {
        private w<v.c.b> a;

        /* renamed from: b, reason: collision with root package name */
        private String f12533b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.c.a
        public v.c a() {
            String str = "";
            if (this.a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new d(this.a, this.f12533b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.c.a
        public v.c.a b(w<v.c.b> wVar) {
            Objects.requireNonNull(wVar, "Null files");
            this.a = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.c.a
        public v.c.a c(String str) {
            this.f12533b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.c
    public w<v.c.b> b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.c
    public String c() {
        return this.f12532b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.c)) {
            return false;
        }
        v.c cVar = (v.c) obj;
        if (this.a.equals(cVar.b())) {
            String str = this.f12532b;
            if (str == null) {
                if (cVar.c() == null) {
                    return true;
                }
            } else if (str.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.f12532b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.f12532b + "}";
    }

    private d(w<v.c.b> wVar, String str) {
        this.a = wVar;
        this.f12532b = str;
    }
}