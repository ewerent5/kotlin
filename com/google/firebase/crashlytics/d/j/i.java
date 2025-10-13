package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* loaded from: classes.dex */
final class i extends v.d.c {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12568b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12569c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12570d;

    /* renamed from: e, reason: collision with root package name */
    private final long f12571e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f12572f;

    /* renamed from: g, reason: collision with root package name */
    private final int f12573g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12574h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12575i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    static final class b extends v.d.c.a {
        private Integer a;

        /* renamed from: b, reason: collision with root package name */
        private String f12576b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f12577c;

        /* renamed from: d, reason: collision with root package name */
        private Long f12578d;

        /* renamed from: e, reason: collision with root package name */
        private Long f12579e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f12580f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f12581g;

        /* renamed from: h, reason: collision with root package name */
        private String f12582h;

        /* renamed from: i, reason: collision with root package name */
        private String f12583i;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.c.a
        public v.d.c a() {
            String str = "";
            if (this.a == null) {
                str = " arch";
            }
            if (this.f12576b == null) {
                str = str + " model";
            }
            if (this.f12577c == null) {
                str = str + " cores";
            }
            if (this.f12578d == null) {
                str = str + " ram";
            }
            if (this.f12579e == null) {
                str = str + " diskSpace";
            }
            if (this.f12580f == null) {
                str = str + " simulator";
            }
            if (this.f12581g == null) {
                str = str + " state";
            }
            if (this.f12582h == null) {
                str = str + " manufacturer";
            }
            if (this.f12583i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new i(this.a.intValue(), this.f12576b, this.f12577c.intValue(), this.f12578d.longValue(), this.f12579e.longValue(), this.f12580f.booleanValue(), this.f12581g.intValue(), this.f12582h, this.f12583i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.c.a
        public v.d.c.a b(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.c.a
        public v.d.c.a c(int i2) {
            this.f12577c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.c.a
        public v.d.c.a d(long j2) {
            this.f12579e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.c.a
        public v.d.c.a e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f12582h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.c.a
        public v.d.c.a f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f12576b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.c.a
        public v.d.c.a g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f12583i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.c.a
        public v.d.c.a h(long j2) {
            this.f12578d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.c.a
        public v.d.c.a i(boolean z) {
            this.f12580f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.d.c.a
        public v.d.c.a j(int i2) {
            this.f12581g = Integer.valueOf(i2);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.c
    public int b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.c
    public int c() {
        return this.f12569c;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.c
    public long d() {
        return this.f12571e;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.c
    public String e() {
        return this.f12574h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.c)) {
            return false;
        }
        v.d.c cVar = (v.d.c) obj;
        return this.a == cVar.b() && this.f12568b.equals(cVar.f()) && this.f12569c == cVar.c() && this.f12570d == cVar.h() && this.f12571e == cVar.d() && this.f12572f == cVar.j() && this.f12573g == cVar.i() && this.f12574h.equals(cVar.e()) && this.f12575i.equals(cVar.g());
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.c
    public String f() {
        return this.f12568b;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.c
    public String g() {
        return this.f12575i;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.c
    public long h() {
        return this.f12570d;
    }

    public int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.f12568b.hashCode()) * 1000003) ^ this.f12569c) * 1000003;
        long j2 = this.f12570d;
        int i2 = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f12571e;
        return ((((((((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f12572f ? 1231 : 1237)) * 1000003) ^ this.f12573g) * 1000003) ^ this.f12574h.hashCode()) * 1000003) ^ this.f12575i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.c
    public int i() {
        return this.f12573g;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.d.c
    public boolean j() {
        return this.f12572f;
    }

    public String toString() {
        return "Device{arch=" + this.a + ", model=" + this.f12568b + ", cores=" + this.f12569c + ", ram=" + this.f12570d + ", diskSpace=" + this.f12571e + ", simulator=" + this.f12572f + ", state=" + this.f12573g + ", manufacturer=" + this.f12574h + ", modelClass=" + this.f12575i + "}";
    }

    private i(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.a = i2;
        this.f12568b = str;
        this.f12569c = i3;
        this.f12570d = j2;
        this.f12571e = j3;
        this.f12572f = z;
        this.f12573g = i4;
        this.f12574h = str2;
        this.f12575i = str3;
    }
}