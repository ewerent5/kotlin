package com.google.firebase.crashlytics.d.j;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.d.j.b;
import com.google.firebase.crashlytics.d.j.c;
import com.google.firebase.crashlytics.d.j.d;
import com.google.firebase.crashlytics.d.j.e;
import com.google.firebase.crashlytics.d.j.f;
import com.google.firebase.crashlytics.d.j.g;
import com.google.firebase.crashlytics.d.j.i;
import com.google.firebase.crashlytics.d.j.j;
import com.google.firebase.crashlytics.d.j.k;
import com.google.firebase.crashlytics.d.j.l;
import com.google.firebase.crashlytics.d.j.m;
import com.google.firebase.crashlytics.d.j.n;
import com.google.firebase.crashlytics.d.j.o;
import com.google.firebase.crashlytics.d.j.p;
import com.google.firebase.crashlytics.d.j.q;
import com.google.firebase.crashlytics.d.j.r;
import com.google.firebase.crashlytics.d.j.s;
import com.google.firebase.crashlytics.d.j.t;
import com.google.firebase.crashlytics.d.j.u;
import java.nio.charset.Charset;

/* compiled from: CrashlyticsReport.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class v {
    private static final Charset a = Charset.forName("UTF-8");

    /* compiled from: CrashlyticsReport.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract v a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(c cVar);

        public abstract a g(int i2);

        public abstract a h(String str);

        public abstract a i(d dVar);
    }

    /* compiled from: CrashlyticsReport.java */
    @AutoValue
    public static abstract class b {

        /* compiled from: CrashlyticsReport.java */
        @AutoValue.Builder
        public static abstract class a {
            public abstract b a();

            public abstract a b(String str);

            public abstract a c(String str);
        }

        public static a a() {
            return new c.b();
        }

        public abstract String b();

        public abstract String c();
    }

    /* compiled from: CrashlyticsReport.java */
    @AutoValue
    public static abstract class c {

        /* compiled from: CrashlyticsReport.java */
        @AutoValue.Builder
        public static abstract class a {
            public abstract c a();

            public abstract a b(w<b> wVar);

            public abstract a c(String str);
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        public static abstract class b {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            public static a a() {
                return new e.b();
            }

            public abstract byte[] b();

            public abstract String c();
        }

        public static a a() {
            return new d.b();
        }

        public abstract w<b> b();

        public abstract String c();
    }

    /* compiled from: CrashlyticsReport.java */
    @AutoValue
    public static abstract class d {

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        public static abstract class a {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0136a {
                public abstract a a();

                public abstract AbstractC0136a b(String str);

                public abstract AbstractC0136a c(String str);

                public abstract AbstractC0136a d(String str);

                public abstract AbstractC0136a e(String str);

                public abstract AbstractC0136a f(String str);

                public abstract AbstractC0136a g(String str);
            }

            /* compiled from: CrashlyticsReport.java */
            @AutoValue
            public static abstract class b {
                public abstract String a();
            }

            public static AbstractC0136a a() {
                return new g.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract String e();

            public abstract String f();

            public abstract b g();

            public abstract String h();
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue.Builder
        public static abstract class b {
            public abstract d a();

            public abstract b b(a aVar);

            public abstract b c(boolean z);

            public abstract b d(c cVar);

            public abstract b e(Long l2);

            public abstract b f(w<AbstractC0137d> wVar);

            public abstract b g(String str);

            public abstract b h(int i2);

            public abstract b i(String str);

            public b j(byte[] bArr) {
                return i(new String(bArr, v.a));
            }

            public abstract b k(e eVar);

            public abstract b l(long j2);

            public abstract b m(f fVar);
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        public static abstract class c {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            public static abstract class a {
                public abstract c a();

                public abstract a b(int i2);

                public abstract a c(int i2);

                public abstract a d(long j2);

                public abstract a e(String str);

                public abstract a f(String str);

                public abstract a g(String str);

                public abstract a h(long j2);

                public abstract a i(boolean z);

                public abstract a j(int i2);
            }

            public static a a() {
                return new i.b();
            }

            public abstract int b();

            public abstract int c();

            public abstract long d();

            public abstract String e();

            public abstract String f();

            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d, reason: collision with other inner class name */
        public static abstract class AbstractC0137d {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a */
            public static abstract class a {

                /* compiled from: CrashlyticsReport.java */
                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC0138a {
                    public abstract a a();

                    public abstract AbstractC0138a b(Boolean bool);

                    public abstract AbstractC0138a c(w<b> wVar);

                    public abstract AbstractC0138a d(b bVar);

                    public abstract AbstractC0138a e(int i2);
                }

                /* compiled from: CrashlyticsReport.java */
                @AutoValue
                /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b */
                public static abstract class b {

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC0139a {

                        /* compiled from: CrashlyticsReport.java */
                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0140a {
                            public abstract AbstractC0139a a();

                            public abstract AbstractC0140a b(long j2);

                            public abstract AbstractC0140a c(String str);

                            public abstract AbstractC0140a d(long j2);

                            public abstract AbstractC0140a e(String str);

                            public AbstractC0140a f(byte[] bArr) {
                                return e(new String(bArr, v.a));
                            }
                        }

                        public static AbstractC0140a a() {
                            return new m.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract long d();

                        public abstract String e();

                        public byte[] f() {
                            String strE = e();
                            if (strE != null) {
                                return strE.getBytes(v.a);
                            }
                            return null;
                        }
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue.Builder
                    /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$b, reason: collision with other inner class name */
                    public static abstract class AbstractC0141b {
                        public abstract b a();

                        public abstract AbstractC0141b b(w<AbstractC0139a> wVar);

                        public abstract AbstractC0141b c(c cVar);

                        public abstract AbstractC0141b d(AbstractC0143d abstractC0143d);

                        public abstract AbstractC0141b e(w<e> wVar);
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$c */
                    public static abstract class c {

                        /* compiled from: CrashlyticsReport.java */
                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$c$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0142a {
                            public abstract c a();

                            public abstract AbstractC0142a b(c cVar);

                            public abstract AbstractC0142a c(w<e.AbstractC0146b> wVar);

                            public abstract AbstractC0142a d(int i2);

                            public abstract AbstractC0142a e(String str);

                            public abstract AbstractC0142a f(String str);
                        }

                        public static AbstractC0142a a() {
                            return new n.b();
                        }

                        public abstract c b();

                        public abstract w<e.AbstractC0146b> c();

                        public abstract int d();

                        public abstract String e();

                        public abstract String f();
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$d, reason: collision with other inner class name */
                    public static abstract class AbstractC0143d {

                        /* compiled from: CrashlyticsReport.java */
                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$d$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0144a {
                            public abstract AbstractC0143d a();

                            public abstract AbstractC0144a b(long j2);

                            public abstract AbstractC0144a c(String str);

                            public abstract AbstractC0144a d(String str);
                        }

                        public static AbstractC0144a a() {
                            return new o.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract String d();
                    }

                    /* compiled from: CrashlyticsReport.java */
                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$e */
                    public static abstract class e {

                        /* compiled from: CrashlyticsReport.java */
                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$e$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0145a {
                            public abstract e a();

                            public abstract AbstractC0145a b(w<AbstractC0146b> wVar);

                            public abstract AbstractC0145a c(int i2);

                            public abstract AbstractC0145a d(String str);
                        }

                        /* compiled from: CrashlyticsReport.java */
                        @AutoValue
                        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$e$b, reason: collision with other inner class name */
                        public static abstract class AbstractC0146b {

                            /* compiled from: CrashlyticsReport.java */
                            @AutoValue.Builder
                            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$e$b$a, reason: collision with other inner class name */
                            public static abstract class AbstractC0147a {
                                public abstract AbstractC0146b a();

                                public abstract AbstractC0147a b(String str);

                                public abstract AbstractC0147a c(int i2);

                                public abstract AbstractC0147a d(long j2);

                                public abstract AbstractC0147a e(long j2);

                                public abstract AbstractC0147a f(String str);
                            }

                            public static AbstractC0147a a() {
                                return new q.b();
                            }

                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            public abstract String f();
                        }

                        public static AbstractC0145a a() {
                            return new p.b();
                        }

                        public abstract w<AbstractC0146b> b();

                        public abstract int c();

                        public abstract String d();
                    }

                    public static AbstractC0141b a() {
                        return new l.b();
                    }

                    public abstract w<AbstractC0139a> b();

                    public abstract c c();

                    public abstract AbstractC0143d d();

                    public abstract w<e> e();
                }

                public static AbstractC0138a a() {
                    return new k.b();
                }

                public abstract Boolean b();

                public abstract w<b> c();

                public abstract b d();

                public abstract int e();

                public abstract AbstractC0138a f();
            }

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$b */
            public static abstract class b {
                public abstract AbstractC0137d a();

                public abstract b b(a aVar);

                public abstract b c(c cVar);

                public abstract b d(AbstractC0148d abstractC0148d);

                public abstract b e(long j2);

                public abstract b f(String str);
            }

            /* compiled from: CrashlyticsReport.java */
            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$c */
            public static abstract class c {

                /* compiled from: CrashlyticsReport.java */
                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$c$a */
                public static abstract class a {
                    public abstract c a();

                    public abstract a b(Double d2);

                    public abstract a c(int i2);

                    public abstract a d(long j2);

                    public abstract a e(int i2);

                    public abstract a f(boolean z);

                    public abstract a g(long j2);
                }

                public static a a() {
                    return new r.b();
                }

                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            /* compiled from: CrashlyticsReport.java */
            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$d, reason: collision with other inner class name */
            public static abstract class AbstractC0148d {

                /* compiled from: CrashlyticsReport.java */
                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$d$a */
                public static abstract class a {
                    public abstract AbstractC0148d a();

                    public abstract a b(String str);
                }

                public static a a() {
                    return new s.b();
                }

                public abstract String b();
            }

            public static b a() {
                return new j.b();
            }

            public abstract a b();

            public abstract c c();

            public abstract AbstractC0148d d();

            public abstract long e();

            public abstract String f();

            public abstract b g();
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        public static abstract class e {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            public static abstract class a {
                public abstract e a();

                public abstract a b(String str);

                public abstract a c(boolean z);

                public abstract a d(int i2);

                public abstract a e(String str);
            }

            public static a a() {
                return new t.b();
            }

            public abstract String b();

            public abstract int c();

            public abstract String d();

            public abstract boolean e();
        }

        /* compiled from: CrashlyticsReport.java */
        @AutoValue
        public static abstract class f {

            /* compiled from: CrashlyticsReport.java */
            @AutoValue.Builder
            public static abstract class a {
                public abstract f a();

                public abstract a b(String str);
            }

            public static a a() {
                return new u.b();
            }

            public abstract String b();
        }

        public static b a() {
            return new f.b().c(false);
        }

        public abstract a b();

        public abstract c c();

        public abstract Long d();

        public abstract w<AbstractC0137d> e();

        public abstract String f();

        public abstract int g();

        public abstract String h();

        public byte[] i() {
            return h().getBytes(v.a);
        }

        public abstract e j();

        public abstract long k();

        public abstract f l();

        public abstract boolean m();

        public abstract b n();

        d o(w<AbstractC0137d> wVar) {
            return n().f(wVar).a();
        }

        d p(long j2, boolean z, String str) {
            b bVarN = n();
            bVarN.e(Long.valueOf(j2));
            bVarN.c(z);
            if (str != null) {
                bVarN.m(f.a().b(str).a()).a();
            }
            return bVarN.a();
        }
    }

    /* compiled from: CrashlyticsReport.java */
    public enum e {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    public static a b() {
        return new b.C0135b();
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract c g();

    public abstract int h();

    public abstract String i();

    public abstract d j();

    public e k() {
        return j() != null ? e.JAVA : g() != null ? e.NATIVE : e.INCOMPLETE;
    }

    protected abstract a l();

    public v m(w<d.AbstractC0137d> wVar) {
        if (j() != null) {
            return l().i(j().o(wVar)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    public v n(c cVar) {
        return l().i(null).f(cVar).a();
    }

    public v o(long j2, boolean z, String str) {
        a aVarL = l();
        if (j() != null) {
            aVarL.i(j().p(j2, z, str));
        }
        return aVarL.a();
    }
}