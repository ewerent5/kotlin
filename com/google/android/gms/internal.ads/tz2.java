package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tz2 implements yz2 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f9315b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference<byte[]> f9316c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    private final int f9317d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9318e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9319f;

    /* renamed from: g, reason: collision with root package name */
    private final xz2 f9320g;

    /* renamed from: h, reason: collision with root package name */
    private final e03<? super tz2> f9321h;

    /* renamed from: i, reason: collision with root package name */
    private rz2 f9322i;

    /* renamed from: j, reason: collision with root package name */
    private HttpURLConnection f9323j;

    /* renamed from: k, reason: collision with root package name */
    private InputStream f9324k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9325l;

    /* renamed from: m, reason: collision with root package name */
    private long f9326m;
    private long n;
    private long o;
    private long p;

    public tz2(String str, q03<String> q03Var, e03<? super tz2> e03Var, int i2, int i3, boolean z, xz2 xz2Var) {
        f03.f(str);
        this.f9319f = str;
        this.f9321h = e03Var;
        this.f9320g = new xz2();
        this.f9317d = i2;
        this.f9318e = i3;
    }

    private final void c() {
        HttpURLConnection httpURLConnection = this.f9323j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f9323j = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01de  */
    @Override // com.google.android.gms.internal.ads.pz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.rz2 r21) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tz2.a(com.google.android.gms.internal.ads.rz2):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: IOException -> 0x0096, TryCatch #0 {IOException -> 0x0096, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:38:0x0092, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:43:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[Catch: IOException -> 0x0096, TryCatch #0 {IOException -> 0x0096, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:38:0x0092, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:43:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.pz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(byte[] r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r8.o     // Catch: java.io.IOException -> L96
            long r2 = r8.f9326m     // Catch: java.io.IOException -> L96
            r4 = 0
            r5 = -1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Lb
            goto L57
        Lb:
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = com.google.android.gms.internal.ads.tz2.f9316c     // Catch: java.io.IOException -> L96
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)     // Catch: java.io.IOException -> L96
            byte[] r0 = (byte[]) r0     // Catch: java.io.IOException -> L96
            if (r0 != 0) goto L1a
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L96
        L1a:
            long r1 = r8.o     // Catch: java.io.IOException -> L96
            long r6 = r8.f9326m     // Catch: java.io.IOException -> L96
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L52
            long r6 = r6 - r1
            int r1 = r0.length     // Catch: java.io.IOException -> L96
            long r1 = (long) r1     // Catch: java.io.IOException -> L96
            long r1 = java.lang.Math.min(r6, r1)     // Catch: java.io.IOException -> L96
            int r2 = (int) r1     // Catch: java.io.IOException -> L96
            java.io.InputStream r1 = r8.f9324k     // Catch: java.io.IOException -> L96
            int r1 = r1.read(r0, r4, r2)     // Catch: java.io.IOException -> L96
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.io.IOException -> L96
            if (r2 != 0) goto L4c
            if (r1 == r5) goto L46
            long r2 = r8.o     // Catch: java.io.IOException -> L96
            long r6 = (long) r1     // Catch: java.io.IOException -> L96
            long r2 = r2 + r6
            r8.o = r2     // Catch: java.io.IOException -> L96
            com.google.android.gms.internal.ads.e03<? super com.google.android.gms.internal.ads.tz2> r2 = r8.f9321h     // Catch: java.io.IOException -> L96
            if (r2 == 0) goto L1a
            r2.k(r8, r1)     // Catch: java.io.IOException -> L96
            goto L1a
        L46:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L96
            r9.<init>()     // Catch: java.io.IOException -> L96
            throw r9     // Catch: java.io.IOException -> L96
        L4c:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L96
            r9.<init>()     // Catch: java.io.IOException -> L96
            throw r9     // Catch: java.io.IOException -> L96
        L52:
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = com.google.android.gms.internal.ads.tz2.f9316c     // Catch: java.io.IOException -> L96
            r1.set(r0)     // Catch: java.io.IOException -> L96
        L57:
            if (r11 != 0) goto L5a
            goto L95
        L5a:
            long r0 = r8.n     // Catch: java.io.IOException -> L96
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L73
            long r6 = r8.p     // Catch: java.io.IOException -> L96
            long r0 = r0 - r6
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L6d
        L6b:
            r4 = -1
            goto L95
        L6d:
            long r6 = (long) r11     // Catch: java.io.IOException -> L96
            long r0 = java.lang.Math.min(r6, r0)     // Catch: java.io.IOException -> L96
            int r11 = (int) r0     // Catch: java.io.IOException -> L96
        L73:
            java.io.InputStream r0 = r8.f9324k     // Catch: java.io.IOException -> L96
            int r4 = r0.read(r9, r10, r11)     // Catch: java.io.IOException -> L96
            if (r4 != r5) goto L88
            long r9 = r8.n     // Catch: java.io.IOException -> L96
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 != 0) goto L82
            goto L6b
        L82:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L96
            r9.<init>()     // Catch: java.io.IOException -> L96
            throw r9     // Catch: java.io.IOException -> L96
        L88:
            long r9 = r8.p     // Catch: java.io.IOException -> L96
            long r0 = (long) r4     // Catch: java.io.IOException -> L96
            long r9 = r9 + r0
            r8.p = r9     // Catch: java.io.IOException -> L96
            com.google.android.gms.internal.ads.e03<? super com.google.android.gms.internal.ads.tz2> r9 = r8.f9321h     // Catch: java.io.IOException -> L96
            if (r9 == 0) goto L95
            r9.k(r8, r4)     // Catch: java.io.IOException -> L96
        L95:
            return r4
        L96:
            r9 = move-exception
            com.google.android.gms.internal.ads.vz2 r10 = new com.google.android.gms.internal.ads.vz2
            com.google.android.gms.internal.ads.rz2 r11 = r8.f9322i
            r0 = 2
            r10.<init>(r9, r11, r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tz2.b(byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f9323j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[Catch: Exception -> 0x0067, all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:3:0x0002, B:5:0x0006, B:9:0x0014, B:28:0x0067, B:31:0x006e, B:32:0x0076, B:15:0x001f, B:17:0x0027, B:23:0x0036, B:25:0x0046, B:27:0x004e, B:8:0x0011), top: B:43:0x0002, inners: #2 }] */
    @Override // com.google.android.gms.internal.ads.pz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f9324k     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L77
            java.net.HttpURLConnection r2 = r9.f9323j     // Catch: java.lang.Throwable -> L83
            long r3 = r9.n     // Catch: java.lang.Throwable -> L83
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.p     // Catch: java.lang.Throwable -> L83
            long r3 = r3 - r7
        L14:
            int r7 = com.google.android.gms.internal.ads.v03.a     // Catch: java.lang.Throwable -> L83
            r8 = 19
            if (r7 == r8) goto L1f
            r8 = 20
            if (r7 == r8) goto L1f
            goto L67
        L1f:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2f
            int r3 = r2.read()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            r4 = -1
            if (r3 == r4) goto L67
            goto L36
        L2f:
            r5 = 2048(0x800, double:1.012E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L36
            goto L67
        L36:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            if (r4 != 0) goto L4e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            if (r3 == 0) goto L67
        L4e:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L83
        L67:
            java.io.InputStream r2 = r9.f9324k     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L83
            r2.close()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L83
            goto L77
        L6d:
            r2 = move-exception
            com.google.android.gms.internal.ads.vz2 r3 = new com.google.android.gms.internal.ads.vz2     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.internal.ads.rz2 r4 = r9.f9322i     // Catch: java.lang.Throwable -> L83
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L83
            throw r3     // Catch: java.lang.Throwable -> L83
        L77:
            r9.f9324k = r0
            r9.c()
            boolean r0 = r9.f9325l
            if (r0 == 0) goto L82
            r9.f9325l = r1
        L82:
            return
        L83:
            r2 = move-exception
            r9.f9324k = r0
            r9.c()
            boolean r0 = r9.f9325l
            if (r0 == 0) goto L8f
            r9.f9325l = r1
        L8f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tz2.zzd():void");
    }

    @Override // com.google.android.gms.internal.ads.yz2
    public final Map<String, List<String>> zze() {
        HttpURLConnection httpURLConnection = this.f9323j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}