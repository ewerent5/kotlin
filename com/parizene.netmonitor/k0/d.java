package com.parizene.netmonitor.k0;

/* compiled from: AnalyticsEvents.java */
/* loaded from: classes.dex */
public class d {

    /* compiled from: AnalyticsEvents.java */
    public static class a {
        private static com.parizene.netmonitor.k0.c a(String str) {
            return new com.parizene.netmonitor.k0.c("cell - " + str);
        }

        public static com.parizene.netmonitor.k0.c b(boolean z) {
            return a("show neighboring cells changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c c(boolean z) {
            return a("show signal plot changed").c("value", Boolean.valueOf(z));
        }
    }

    /* compiled from: AnalyticsEvents.java */
    public static class b {
        public static final com.parizene.netmonitor.k0.c a = a("remove ads clicked");

        /* renamed from: b, reason: collision with root package name */
        public static final com.parizene.netmonitor.k0.c f13203b = a("phone info clicked");

        /* renamed from: c, reason: collision with root package name */
        public static final com.parizene.netmonitor.k0.c f13204c = a("fieldtest clicked");

        private static com.parizene.netmonitor.k0.c a(String str) {
            return new com.parizene.netmonitor.k0.c("home - " + str);
        }

        public static com.parizene.netmonitor.k0.c b(boolean z) {
            return a("keep screen on changed").c("value", Boolean.valueOf(z));
        }
    }

    /* compiled from: AnalyticsEvents.java */
    public static class c {
        private static com.parizene.netmonitor.k0.c a(String str) {
            return new com.parizene.netmonitor.k0.c("intro - " + str);
        }

        public static com.parizene.netmonitor.k0.c b(String str) {
            return a("launched").c("source", str);
        }

        public static com.parizene.netmonitor.k0.c c(boolean z) {
            return a("permissions granted").c("navigate purchase", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c d(String str) {
            return a("purchase completed").c("source", str);
        }

        public static com.parizene.netmonitor.k0.c e(String str) {
            return a("purchase started").c("source", str);
        }
    }

    /* compiled from: AnalyticsEvents.java */
    /* renamed from: com.parizene.netmonitor.k0.d$d, reason: collision with other inner class name */
    public static class C0159d {
        public static final com.parizene.netmonitor.k0.c a = a("show operators filter clicked");

        /* renamed from: b, reason: collision with root package name */
        public static final com.parizene.netmonitor.k0.c f13205b = a("gif banner clicked");

        private static com.parizene.netmonitor.k0.c a(String str) {
            return new com.parizene.netmonitor.k0.c("log - " + str);
        }

        public static com.parizene.netmonitor.k0.c b(boolean z) {
            return a("show date changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c c(boolean z) {
            return a("show operator changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c d(String str) {
            return a("sort order changed").c("order", str);
        }
    }

    /* compiled from: AnalyticsEvents.java */
    public static class e {
        public static final com.parizene.netmonitor.k0.c a = a("export kml started");

        /* renamed from: b, reason: collision with root package name */
        public static final com.parizene.netmonitor.k0.c f13206b = a("view kml clicked");

        /* renamed from: c, reason: collision with root package name */
        public static final com.parizene.netmonitor.k0.c f13207c = a("clf db cleared");

        /* renamed from: d, reason: collision with root package name */
        public static final com.parizene.netmonitor.k0.c f13208d = a("geolocation db cleared");

        private static com.parizene.netmonitor.k0.c a(String str) {
            return new com.parizene.netmonitor.k0.c("manage db - " + str);
        }

        public static com.parizene.netmonitor.k0.c b(String str) {
            return a("export clf started").c("type", str);
        }

        public static com.parizene.netmonitor.k0.c c(String str) {
            return a("import clf started").c("type", str);
        }

        public static com.parizene.netmonitor.k0.c d(boolean z) {
            return a("clear cell db on start changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c e(boolean z) {
            return a("mark search without lac changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c f(boolean z) {
            return a("save log changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c g(boolean z) {
            return a("search without lac changed").c("value", Boolean.valueOf(z));
        }
    }

    /* compiled from: AnalyticsEvents.java */
    public static class f {
        private static com.parizene.netmonitor.k0.c a(String str) {
            return new com.parizene.netmonitor.k0.c("map - " + str);
        }

        public static com.parizene.netmonitor.k0.c b(boolean z) {
            return a("autocenter changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c c(String str) {
            return a("combine by sector type changed").c("type", str);
        }
    }

    /* compiled from: AnalyticsEvents.java */
    public static class g {
        private static com.parizene.netmonitor.k0.c a(String str) {
            return new com.parizene.netmonitor.k0.c("nps - " + str);
        }

        public static com.parizene.netmonitor.k0.c b(int i2) {
            return a("open play store clicked").c("score", Integer.valueOf(i2));
        }

        public static com.parizene.netmonitor.k0.c c() {
            return a("opened");
        }

        public static com.parizene.netmonitor.k0.c d(int i2) {
            return a("score submit clicked").c("score", Integer.valueOf(i2));
        }

        public static com.parizene.netmonitor.k0.c e(int i2) {
            return a("send email clicked").c("score", Integer.valueOf(i2));
        }
    }

    /* compiled from: AnalyticsEvents.java */
    public static class h {
        public static final com.parizene.netmonitor.k0.c a = a("rate it clicked");

        /* renamed from: b, reason: collision with root package name */
        public static final com.parizene.netmonitor.k0.c f13209b = a("cell config clicked");

        /* renamed from: c, reason: collision with root package name */
        public static final com.parizene.netmonitor.k0.c f13210c = a("privacy policy clicked");

        /* renamed from: d, reason: collision with root package name */
        public static final com.parizene.netmonitor.k0.c f13211d = a("about clicked");

        private static com.parizene.netmonitor.k0.c a(String str) {
            return new com.parizene.netmonitor.k0.c("settings - " + str);
        }

        public static com.parizene.netmonitor.k0.c b(boolean z) {
            return a("new cell api changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c c(boolean z) {
            return a("request geolocation changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c d(boolean z) {
            return a("scan location changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c e(boolean z) {
            return a("scan wifi changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c f(boolean z) {
            return a("show lte enodeb sector changed").c("value", Boolean.valueOf(z));
        }

        public static com.parizene.netmonitor.k0.c g(String str) {
            return a("theme changed").c("theme", str);
        }

        public static com.parizene.netmonitor.k0.c h(boolean z) {
            return a("use dbm range colors changed").c("value", Boolean.valueOf(z));
        }
    }

    public static com.parizene.netmonitor.k0.c a(String str, String str2) {
        return new com.parizene.netmonitor.k0.c("billing - purchase finished").c("sku", str).c("item type", str2);
    }
}