package com.google.firebase.crashlytics.d.n;

import com.google.firebase.crashlytics.d.h.t;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ReportUploader.java */
/* loaded from: classes.dex */
public class b {
    private static final short[] a = {10, 20, 30, 60, 120, 300};

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.n.d.b f12694b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12695c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12696d;

    /* renamed from: e, reason: collision with root package name */
    private final t f12697e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.n.a f12698f;

    /* renamed from: g, reason: collision with root package name */
    private final a f12699g;

    /* renamed from: h, reason: collision with root package name */
    private Thread f12700h;

    /* compiled from: ReportUploader.java */
    public interface a {
        boolean a();
    }

    /* compiled from: ReportUploader.java */
    /* renamed from: com.google.firebase.crashlytics.d.n.b$b, reason: collision with other inner class name */
    public interface InterfaceC0149b {
        b a(com.google.firebase.crashlytics.d.p.i.b bVar);
    }

    /* compiled from: ReportUploader.java */
    public interface c {
        File[] a();

        File[] b();
    }

    /* compiled from: ReportUploader.java */
    private class d extends com.google.firebase.crashlytics.d.h.d {

        /* renamed from: e, reason: collision with root package name */
        private final List<com.google.firebase.crashlytics.d.n.c.c> f12701e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f12702f;

        /* renamed from: g, reason: collision with root package name */
        private final float f12703g;

        d(List<com.google.firebase.crashlytics.d.n.c.c> list, boolean z, float f2) {
            this.f12701e = list;
            this.f12702f = z;
            this.f12703g = f2;
        }

        private void b(List<com.google.firebase.crashlytics.d.n.c.c> list, boolean z) throws InterruptedException {
            com.google.firebase.crashlytics.d.b.f().b("Starting report processing in " + this.f12703g + " second(s)...");
            float f2 = this.f12703g;
            if (f2 > 0.0f) {
                try {
                    Thread.sleep((long) (f2 * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (b.this.f12699g.a()) {
                return;
            }
            int i2 = 0;
            while (list.size() > 0 && !b.this.f12699g.a()) {
                com.google.firebase.crashlytics.d.b.f().b("Attempting to send " + list.size() + " report(s)");
                ArrayList arrayList = new ArrayList();
                for (com.google.firebase.crashlytics.d.n.c.c cVar : list) {
                    if (!b.this.d(cVar, z)) {
                        arrayList.add(cVar);
                    }
                }
                if (arrayList.size() > 0) {
                    int i3 = i2 + 1;
                    long j2 = b.a[Math.min(i2, b.a.length - 1)];
                    com.google.firebase.crashlytics.d.b.f().b("Report submission: scheduling delayed retry in " + j2 + " seconds");
                    try {
                        Thread.sleep(j2 * 1000);
                        i2 = i3;
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                list = arrayList;
            }
        }

        @Override // com.google.firebase.crashlytics.d.h.d
        public void a() {
            try {
                b(this.f12701e, this.f12702f);
            } catch (Exception e2) {
                com.google.firebase.crashlytics.d.b.f().e("An unexpected error occurred while attempting to upload crash reports.", e2);
            }
            b.this.f12700h = null;
        }
    }

    public b(String str, String str2, t tVar, com.google.firebase.crashlytics.d.n.a aVar, com.google.firebase.crashlytics.d.n.d.b bVar, a aVar2) {
        if (bVar == null) {
            throw new IllegalArgumentException("createReportCall must not be null.");
        }
        this.f12694b = bVar;
        this.f12695c = str;
        this.f12696d = str2;
        this.f12697e = tVar;
        this.f12698f = aVar;
        this.f12699g = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[Catch: Exception -> 0x0065, TRY_LEAVE, TryCatch #0 {Exception -> 0x0065, blocks: (B:3:0x0001, B:6:0x0013, B:19:0x005e, B:7:0x001b, B:9:0x001f, B:11:0x0027, B:13:0x0030, B:17:0x004b), top: B:24:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(com.google.firebase.crashlytics.d.n.c.c r7, boolean r8) {
        /*
            r6 = this;
            r0 = 0
            com.google.firebase.crashlytics.d.n.c.a r1 = new com.google.firebase.crashlytics.d.n.c.a     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = r6.f12695c     // Catch: java.lang.Exception -> L65
            java.lang.String r3 = r6.f12696d     // Catch: java.lang.Exception -> L65
            r1.<init>(r2, r3, r7)     // Catch: java.lang.Exception -> L65
            com.google.firebase.crashlytics.d.h.t r2 = r6.f12697e     // Catch: java.lang.Exception -> L65
            com.google.firebase.crashlytics.d.h.t r3 = com.google.firebase.crashlytics.d.h.t.ALL     // Catch: java.lang.Exception -> L65
            java.lang.String r4 = "Report configured to be sent via DataTransport."
            r5 = 1
            if (r2 != r3) goto L1b
            com.google.firebase.crashlytics.d.b r8 = com.google.firebase.crashlytics.d.b.f()     // Catch: java.lang.Exception -> L65
            r8.b(r4)     // Catch: java.lang.Exception -> L65
            goto L2e
        L1b:
            com.google.firebase.crashlytics.d.h.t r3 = com.google.firebase.crashlytics.d.h.t.JAVA_ONLY     // Catch: java.lang.Exception -> L65
            if (r2 != r3) goto L30
            com.google.firebase.crashlytics.d.n.c.c$a r2 = r7.getType()     // Catch: java.lang.Exception -> L65
            com.google.firebase.crashlytics.d.n.c.c$a r3 = com.google.firebase.crashlytics.d.n.c.c.a.JAVA     // Catch: java.lang.Exception -> L65
            if (r2 != r3) goto L30
            com.google.firebase.crashlytics.d.b r8 = com.google.firebase.crashlytics.d.b.f()     // Catch: java.lang.Exception -> L65
            r8.b(r4)     // Catch: java.lang.Exception -> L65
        L2e:
            r8 = 1
            goto L5c
        L30:
            com.google.firebase.crashlytics.d.n.d.b r2 = r6.f12694b     // Catch: java.lang.Exception -> L65
            boolean r8 = r2.b(r1, r8)     // Catch: java.lang.Exception -> L65
            com.google.firebase.crashlytics.d.b r1 = com.google.firebase.crashlytics.d.b.f()     // Catch: java.lang.Exception -> L65
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65
            r2.<init>()     // Catch: java.lang.Exception -> L65
            java.lang.String r3 = "Crashlytics Reports Endpoint upload "
            r2.append(r3)     // Catch: java.lang.Exception -> L65
            if (r8 == 0) goto L49
            java.lang.String r3 = "complete: "
            goto L4b
        L49:
            java.lang.String r3 = "FAILED: "
        L4b:
            r2.append(r3)     // Catch: java.lang.Exception -> L65
            java.lang.String r3 = r7.b()     // Catch: java.lang.Exception -> L65
            r2.append(r3)     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L65
            r1.g(r2)     // Catch: java.lang.Exception -> L65
        L5c:
            if (r8 == 0) goto L7e
            com.google.firebase.crashlytics.d.n.a r8 = r6.f12698f     // Catch: java.lang.Exception -> L65
            r8.b(r7)     // Catch: java.lang.Exception -> L65
            r0 = 1
            goto L7e
        L65:
            r8 = move-exception
            com.google.firebase.crashlytics.d.b r1 = com.google.firebase.crashlytics.d.b.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error occurred sending report "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.e(r7, r8)
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.d.n.b.d(com.google.firebase.crashlytics.d.n.c.c, boolean):boolean");
    }

    public synchronized void e(List<com.google.firebase.crashlytics.d.n.c.c> list, boolean z, float f2) {
        if (this.f12700h != null) {
            com.google.firebase.crashlytics.d.b.f().b("Report upload has already been started.");
            return;
        }
        Thread thread = new Thread(new d(list, z, f2), "Crashlytics Report Uploader");
        this.f12700h = thread;
        thread.start();
    }
}