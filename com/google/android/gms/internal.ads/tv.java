package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(16)
/* loaded from: classes.dex */
public final class tv extends lv implements su {

    /* renamed from: h, reason: collision with root package name */
    private tu f9267h;

    /* renamed from: i, reason: collision with root package name */
    private String f9268i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9269j;

    /* renamed from: k, reason: collision with root package name */
    private Exception f9270k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9271l;

    public tv(lt ltVar, kt ktVar) {
        super(ltVar);
        tu tuVar = new tu(ltVar.getContext(), ktVar, this.f7328g.get());
        this.f9267h = tuVar;
        tuVar.C(this);
    }

    protected static final String w(String str) {
        String strValueOf = String.valueOf(xq.d(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }

    private final void x(String str) {
        synchronized (this) {
            this.f9269j = true;
            notify();
            a();
        }
        String str2 = this.f9268i;
        if (str2 != null) {
            String strW = w(str2);
            Exception exc = this.f9270k;
            if (exc != null) {
                t(this.f9268i, strW, "badUrl", y(str, exc));
            } else {
                t(this.f9268i, strW, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    private static String y(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.lv, com.google.android.gms.common.api.i
    public final void a() {
        tu tuVar = this.f9267h;
        if (tuVar != null) {
            tuVar.C(null);
            this.f9267h.G();
        }
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void b(String str, Exception exc) {
        er.zzj("Precache exception", exc);
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void c(String str, Exception exc) {
        String str2 = (String) c.c().b(w3.f9872l);
        if (str2 != null) {
            List listAsList = Arrays.asList(str2.split(","));
            if (listAsList.contains("all") || listAsList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.f9270k = exc;
        er.zzj("Precache error", exc);
        x(str);
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void d(final boolean z, final long j2) {
        final lt ltVar = this.f7328g.get();
        if (ltVar != null) {
            qr.f8450e.execute(new Runnable(ltVar, z, j2) { // from class: com.google.android.gms.internal.ads.sv

                /* renamed from: e, reason: collision with root package name */
                private final lt f8997e;

                /* renamed from: f, reason: collision with root package name */
                private final boolean f8998f;

                /* renamed from: g, reason: collision with root package name */
                private final long f8999g;

                {
                    this.f8997e = ltVar;
                    this.f8998f = z;
                    this.f8999g = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f8997e.B0(this.f8998f, this.f8999g);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void e(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void f(int i2, int i3) {
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final boolean h(String str) {
        return i(str, new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        r0 = r15.f9270k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        r6 = r13;
        r7 = r14;
        r5 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [long] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.lv] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.lv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.lang.String r46, java.lang.String[] r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tv.i(java.lang.String, java.lang.String[]):boolean");
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void j(int i2) {
        this.f9267h.D().h(i2);
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void l(int i2) {
        this.f9267h.D().g(i2);
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void m(int i2) {
        this.f9267h.D().i(i2);
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void n(int i2) {
        this.f9267h.D().j(i2);
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void o() {
        x(null);
    }

    public final tu v() {
        synchronized (this) {
            this.f9271l = true;
            notify();
        }
        this.f9267h.C(null);
        tu tuVar = this.f9267h;
        this.f9267h = null;
        return tuVar;
    }
}