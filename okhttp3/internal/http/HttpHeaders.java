package okhttp3.internal.http;

import i.d0.p;
import i.y.d.l;
import j.f;
import j.i;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* compiled from: HttpHeaders.kt */
/* loaded from: classes3.dex */
public final class HttpHeaders {
    private static final i QUOTED_STRING_DELIMITERS;
    private static final i TOKEN_DELIMITERS;

    static {
        i.a aVar = i.f16464f;
        QUOTED_STRING_DELIMITERS = aVar.d("\"\\");
        TOKEN_DELIMITERS = aVar.d("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        l.d(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        l.d(headers, "$this$parseChallenges");
        l.d(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (p.o(str, headers.name(i2), true)) {
                try {
                    readChallengeHeader(new f().Y(headers.value(i2)), arrayList);
                } catch (EOFException e2) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e2);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        l.d(response, "$this$promisesBody");
        if (l.a(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !p.o("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0085, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void readChallengeHeader(j.f r7, java.util.List<okhttp3.Challenge> r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.H()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = i.t.z.d()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L68
            if (r6 != 0) goto L41
            boolean r2 = r7.H()
            if (r2 == 0) goto L68
        L41:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = i.d0.g.t(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "Collections.singletonMap…ek + \"=\".repeat(eqCount))"
            i.y.d.l.c(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L68:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r5 = r5 + r6
        L72:
            if (r3 != 0) goto L83
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L7f
            goto L85
        L7f:
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
        L83:
            if (r5 != 0) goto L90
        L85:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L90:
            r6 = 1
            if (r5 <= r6) goto L94
            return
        L94:
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r6 == 0) goto L9b
            return
        L9b:
            r6 = 34
            byte r6 = (byte) r6
            boolean r6 = startsWith(r7, r6)
            if (r6 == 0) goto La9
            java.lang.String r6 = readQuotedString(r7)
            goto Lad
        La9:
            java.lang.String r6 = readToken(r7)
        Lad:
            if (r6 == 0) goto Lc7
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lc5
            boolean r3 = r7.H()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L72
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(j.f, java.util.List):void");
    }

    private static final String readQuotedString(f fVar) {
        byte b2 = (byte) 34;
        if (!(fVar.readByte() == b2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        f fVar2 = new f();
        while (true) {
            long jD = fVar.D(QUOTED_STRING_DELIMITERS);
            if (jD == -1) {
                return null;
            }
            if (fVar.v(jD) == b2) {
                fVar2.write(fVar, jD);
                fVar.readByte();
                return fVar2.l0();
            }
            if (fVar.y0() == jD + 1) {
                return null;
            }
            fVar2.write(fVar, jD);
            fVar.readByte();
            fVar2.write(fVar, 1L);
        }
    }

    private static final String readToken(f fVar) {
        long jD = fVar.D(TOKEN_DELIMITERS);
        if (jD == -1) {
            jD = fVar.y0();
        }
        if (jD != 0) {
            return fVar.q0(jD);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        l.d(cookieJar, "$this$receiveHeaders");
        l.d(httpUrl, "url");
        l.d(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.Companion.parseAll(httpUrl, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, all);
    }

    private static final boolean skipCommasAndWhitespace(f fVar) {
        boolean z = false;
        while (!fVar.H()) {
            byte bV = fVar.v(0L);
            if (bV == 9 || bV == 32) {
                fVar.readByte();
            } else {
                if (bV != 44) {
                    break;
                }
                fVar.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(f fVar, byte b2) {
        return !fVar.H() && fVar.v(0L) == b2;
    }
}