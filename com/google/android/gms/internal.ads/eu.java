package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class eu implements yz2 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f5694b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference<byte[]> f5695c = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    private final int f5697e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5698f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5699g;

    /* renamed from: h, reason: collision with root package name */
    private final xz2 f5700h;

    /* renamed from: i, reason: collision with root package name */
    private final e03<? super eu> f5701i;

    /* renamed from: j, reason: collision with root package name */
    private rz2 f5702j;

    /* renamed from: k, reason: collision with root package name */
    private HttpURLConnection f5703k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f5704l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5705m;
    private long n;
    private long o;
    private long p;
    private long q;
    private int r;

    /* renamed from: d, reason: collision with root package name */
    private final SSLSocketFactory f5696d = new du(this);
    private final Set<Socket> s = new HashSet();

    eu(String str, e03<? super eu> e03Var, int i2, int i3, int i4) {
        f03.f(str);
        this.f5699g = str;
        this.f5701i = e03Var;
        this.f5700h = new xz2();
        this.f5697e = i2;
        this.f5698f = i3;
        this.r = i4;
    }

    private final void f() {
        HttpURLConnection httpURLConnection = this.f5703k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                er.zzg("Unexpected error while disconnecting", e2);
            }
            this.f5703k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e6  */
    @Override // com.google.android.gms.internal.ads.pz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.rz2 r24) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eu.a(com.google.android.gms.internal.ads.rz2):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: IOException -> 0x009a, TryCatch #0 {IOException -> 0x009a, blocks: (B:2:0x0000, B:23:0x005c, B:25:0x0064, B:28:0x006f, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0089, B:36:0x008a, B:38:0x0094, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0048, B:17:0x004d, B:18:0x004e, B:19:0x0053, B:20:0x0054), top: B:43:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[Catch: IOException -> 0x009a, TryCatch #0 {IOException -> 0x009a, blocks: (B:2:0x0000, B:23:0x005c, B:25:0x0064, B:28:0x006f, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0089, B:36:0x008a, B:38:0x0094, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0048, B:17:0x004d, B:18:0x004e, B:19:0x0053, B:20:0x0054), top: B:43:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.pz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(byte[] r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r8.p     // Catch: java.io.IOException -> L9a
            long r2 = r8.n     // Catch: java.io.IOException -> L9a
            r4 = 0
            r5 = -1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Lb
            goto L59
        Lb:
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = com.google.android.gms.internal.ads.eu.f5695c     // Catch: java.io.IOException -> L9a
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)     // Catch: java.io.IOException -> L9a
            byte[] r0 = (byte[]) r0     // Catch: java.io.IOException -> L9a
            if (r0 != 0) goto L1a
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L9a
        L1a:
            long r1 = r8.p     // Catch: java.io.IOException -> L9a
            long r6 = r8.n     // Catch: java.io.IOException -> L9a
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L54
            long r6 = r6 - r1
            int r1 = r0.length     // Catch: java.io.IOException -> L9a
            long r1 = (long) r1     // Catch: java.io.IOException -> L9a
            long r1 = java.lang.Math.min(r6, r1)     // Catch: java.io.IOException -> L9a
            int r2 = (int) r1     // Catch: java.io.IOException -> L9a
            java.io.InputStream r1 = r8.f5704l     // Catch: java.io.IOException -> L9a
            int r1 = r1.read(r0, r4, r2)     // Catch: java.io.IOException -> L9a
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.io.IOException -> L9a
            if (r2 != 0) goto L4e
            if (r1 == r5) goto L48
            long r2 = r8.p     // Catch: java.io.IOException -> L9a
            long r6 = (long) r1     // Catch: java.io.IOException -> L9a
            long r2 = r2 + r6
            r8.p = r2     // Catch: java.io.IOException -> L9a
            com.google.android.gms.internal.ads.e03<? super com.google.android.gms.internal.ads.eu> r2 = r8.f5701i     // Catch: java.io.IOException -> L9a
            if (r2 == 0) goto L1a
            com.google.android.gms.internal.ads.tu r2 = (com.google.android.gms.internal.ads.tu) r2     // Catch: java.io.IOException -> L9a
            r2.o(r8, r1)     // Catch: java.io.IOException -> L9a
            goto L1a
        L48:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L9a
            r9.<init>()     // Catch: java.io.IOException -> L9a
            throw r9     // Catch: java.io.IOException -> L9a
        L4e:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L9a
            r9.<init>()     // Catch: java.io.IOException -> L9a
            throw r9     // Catch: java.io.IOException -> L9a
        L54:
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = com.google.android.gms.internal.ads.eu.f5695c     // Catch: java.io.IOException -> L9a
            r1.set(r0)     // Catch: java.io.IOException -> L9a
        L59:
            if (r11 != 0) goto L5c
            goto L99
        L5c:
            long r0 = r8.o     // Catch: java.io.IOException -> L9a
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L75
            long r6 = r8.q     // Catch: java.io.IOException -> L9a
            long r0 = r0 - r6
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L6f
        L6d:
            r4 = -1
            goto L99
        L6f:
            long r6 = (long) r11     // Catch: java.io.IOException -> L9a
            long r0 = java.lang.Math.min(r6, r0)     // Catch: java.io.IOException -> L9a
            int r11 = (int) r0     // Catch: java.io.IOException -> L9a
        L75:
            java.io.InputStream r0 = r8.f5704l     // Catch: java.io.IOException -> L9a
            int r4 = r0.read(r9, r10, r11)     // Catch: java.io.IOException -> L9a
            if (r4 != r5) goto L8a
            long r9 = r8.o     // Catch: java.io.IOException -> L9a
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 != 0) goto L84
            goto L6d
        L84:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L9a
            r9.<init>()     // Catch: java.io.IOException -> L9a
            throw r9     // Catch: java.io.IOException -> L9a
        L8a:
            long r9 = r8.q     // Catch: java.io.IOException -> L9a
            long r0 = (long) r4     // Catch: java.io.IOException -> L9a
            long r9 = r9 + r0
            r8.q = r9     // Catch: java.io.IOException -> L9a
            com.google.android.gms.internal.ads.e03<? super com.google.android.gms.internal.ads.eu> r9 = r8.f5701i     // Catch: java.io.IOException -> L9a
            if (r9 == 0) goto L99
            com.google.android.gms.internal.ads.tu r9 = (com.google.android.gms.internal.ads.tu) r9     // Catch: java.io.IOException -> L9a
            r9.o(r8, r4)     // Catch: java.io.IOException -> L9a
        L99:
            return r4
        L9a:
            r9 = move-exception
            com.google.android.gms.internal.ads.vz2 r10 = new com.google.android.gms.internal.ads.vz2
            com.google.android.gms.internal.ads.rz2 r11 = r8.f5702j
            r0 = 2
            r10.<init>(r9, r11, r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eu.b(byte[], int, int):int");
    }

    final void c(int i2) {
        this.r = i2;
        for (Socket socket : this.s) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.r);
                } catch (SocketException e2) {
                    er.zzj("Failed to update receive buffer size.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f5703k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[Catch: Exception -> 0x0067, all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:3:0x0002, B:5:0x0006, B:9:0x0014, B:28:0x0067, B:31:0x006e, B:32:0x0076, B:15:0x001f, B:17:0x0027, B:23:0x0036, B:25:0x0046, B:27:0x004e, B:8:0x0011), top: B:45:0x0002, inners: #2 }] */
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
            java.io.InputStream r2 = r9.f5704l     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L77
            java.net.HttpURLConnection r2 = r9.f5703k     // Catch: java.lang.Throwable -> L88
            long r3 = r9.o     // Catch: java.lang.Throwable -> L88
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.q     // Catch: java.lang.Throwable -> L88
            long r3 = r3 - r7
        L14:
            int r7 = com.google.android.gms.internal.ads.v03.a     // Catch: java.lang.Throwable -> L88
            r8 = 19
            if (r7 == r8) goto L1f
            r8 = 20
            if (r7 == r8) goto L1f
            goto L67
        L1f:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2f
            int r3 = r2.read()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            r4 = -1
            if (r3 == r4) goto L67
            goto L36
        L2f:
            r5 = 2048(0x800, double:1.012E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L36
            goto L67
        L36:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            if (r4 != 0) goto L4e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            if (r3 == 0) goto L67
        L4e:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L88
        L67:
            java.io.InputStream r2 = r9.f5704l     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L88
            r2.close()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L88
            goto L77
        L6d:
            r2 = move-exception
            com.google.android.gms.internal.ads.vz2 r3 = new com.google.android.gms.internal.ads.vz2     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.rz2 r4 = r9.f5702j     // Catch: java.lang.Throwable -> L88
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L88
            throw r3     // Catch: java.lang.Throwable -> L88
        L77:
            r9.f5704l = r0
            r9.f()
            boolean r0 = r9.f5705m
            if (r0 == 0) goto L82
            r9.f5705m = r1
        L82:
            java.util.Set<java.net.Socket> r0 = r9.s
            r0.clear()
            return
        L88:
            r2 = move-exception
            r9.f5704l = r0
            r9.f()
            boolean r0 = r9.f5705m
            if (r0 == 0) goto L94
            r9.f5705m = r1
        L94:
            java.util.Set<java.net.Socket> r0 = r9.s
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eu.zzd():void");
    }

    @Override // com.google.android.gms.internal.ads.yz2
    public final Map<String, List<String>> zze() {
        HttpURLConnection httpURLConnection = this.f5703k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}