package com.google.android.datatransport.cct.f;

import com.google.android.datatransport.cct.f.o;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes.dex */
final class i extends o {
    private final o.c a;

    /* renamed from: b, reason: collision with root package name */
    private final o.b f4338b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    static final class b extends o.a {
        private o.c a;

        /* renamed from: b, reason: collision with root package name */
        private o.b f4339b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.f.o.a
        public o a() {
            return new i(this.a, this.f4339b);
        }

        @Override // com.google.android.datatransport.cct.f.o.a
        public o.a b(o.b bVar) {
            this.f4339b = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.o.a
        public o.a c(o.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.f.o
    public o.b b() {
        return this.f4338b;
    }

    @Override // com.google.android.datatransport.cct.f.o
    public o.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f4338b;
            if (bVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f4338b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.f4338b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.a = cVar;
        this.f4338b = bVar;
    }
}