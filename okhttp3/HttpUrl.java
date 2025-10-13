package okhttp3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import i.a0.f;
import i.d0.p;
import i.d0.q;
import i.t.g0;
import i.t.m;
import i.y.d.g;
import i.y.d.l;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: HttpUrl.kt */
/* loaded from: classes3.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: HttpUrl.kt */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        /* compiled from: HttpUrl.kt */
        public static final class Companion {
            private Companion() {
            }

            public final int parsePort(String str, int i2, int i3) throws NumberFormatException {
                try {
                    int i4 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i2, i3, "", false, false, false, false, null, 248, null));
                    if (1 <= i4 && 65535 >= i4) {
                        return i4;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int portColonOffset(String str, int i2, int i3) {
                while (i2 < i3) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == ':') {
                        return i2;
                    }
                    if (cCharAt == '[') {
                        do {
                            i2++;
                            if (i2 < i3) {
                            }
                        } while (str.charAt(i2) != ']');
                    }
                    i2++;
                }
                return i3;
            }

            public final int schemeDelimiterOffset(String str, int i2, int i3) {
                if (i3 - i2 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i2);
                if ((l.e(cCharAt, 97) < 0 || l.e(cCharAt, 122) > 0) && (l.e(cCharAt, 65) < 0 || l.e(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i2);
                    if ('a' > cCharAt2 || 'z' < cCharAt2) {
                        if ('A' > cCharAt2 || 'Z' < cCharAt2) {
                            if ('0' > cCharAt2 || '9' < cCharAt2) {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i2;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public final int slashCount(String str, int i2, int i3) {
                int i4 = 0;
                while (i2 < i3) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i4++;
                    i2++;
                }
                return i4;
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i2 = this.port;
            if (i2 != -1) {
                return i2;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            l.b(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return l.a(str, ".") || p.o(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return l.a(str, "..") || p.o(str, "%2e.", true) || p.o(str, ".%2e", true) || p.o(str, "%2e%2e", true);
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void push(String str, int i2, int i3, boolean z, boolean z2) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i2, i3, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (z) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            l.b(list);
            i.a0.a aVarH = f.h(f.g(list.size() - 2, 0), 2);
            int iA = aVarH.a();
            int iC = aVarH.c();
            int iE = aVarH.e();
            if (iE >= 0) {
                if (iA > iC) {
                    return;
                }
            } else if (iA < iC) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                l.b(list2);
                if (l.a(str, list2.get(iA))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    l.b(list3);
                    list3.remove(iA + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    l.b(list4);
                    list4.remove(iA);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    l.b(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (iA == iC) {
                    return;
                } else {
                    iA += iE;
                }
            }
        }

        private final void resolvePath(String str, int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i2++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i4 = i2;
                if (i4 >= i3) {
                    return;
                }
                i2 = Util.delimiterOffset(str, "/\\", i4, i3);
                boolean z = i2 < i3;
                push(str, i4, i2, z, true);
                if (z) {
                    i2++;
                }
            }
        }

        public final Builder addEncodedPathSegment(String str) {
            l.d(str, "encodedPathSegment");
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            l.d(str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            l.d(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l.b(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            l.b(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final Builder addPathSegment(String str) {
            l.d(str, "pathSegment");
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            l.d(str, "pathSegments");
            return addPathSegments(str, false);
        }

        public final Builder addQueryParameter(String str, String str2) {
            l.d(str, Action.NAME_ATTRIBUTE);
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l.b(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            l.b(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.Companion;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(m.o(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                arrayList = new ArrayList(m.o(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final Builder encodedPassword(String str) {
            l.d(str, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String str) {
            l.d(str, "encodedPath");
            if (p.B(str, "/", false, 2, null)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + str).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.HttpUrl.Builder encodedQuery(java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.Companion
                r2 = 0
                r3 = 0
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.encodedQuery(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        public final Builder encodedUsername(String str) {
            l.d(str, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            l.d(str, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) throws NumberFormatException {
            int iDelimiterOffset;
            int i2;
            int i3;
            String str2;
            int i4;
            String str3;
            int i5;
            boolean z;
            boolean z2;
            l.d(str, "input");
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(str, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            String str4 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c2 = 65535;
            if (iSchemeDelimiterOffset != -1) {
                if (p.y(str, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!p.y(str, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = str.substring(0, iSchemeDelimiterOffset);
                        l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.scheme = httpUrl.scheme();
            }
            int iSlashCount = companion.slashCount(str, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            char c3 = '?';
            char c4 = '#';
            if (iSlashCount >= 2 || httpUrl == null || (!l.a(httpUrl.scheme(), this.scheme))) {
                int i6 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(str, "@/\\?#", i6, iIndexOfLastNonAsciiWhitespace$default);
                    char cCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? str.charAt(iDelimiterOffset) : (char) 65535;
                    if (cCharAt == c2 || cCharAt == c4 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c3) {
                        break;
                    }
                    if (cCharAt != '@') {
                        str3 = str4;
                        i4 = iIndexOfLastNonAsciiWhitespace$default;
                    } else {
                        if (z3) {
                            i4 = iIndexOfLastNonAsciiWhitespace$default;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            str3 = str4;
                            i5 = iDelimiterOffset;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i6, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                            z = z4;
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(str, CoreConstants.COLON_CHAR, i6, iDelimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            i4 = iIndexOfLastNonAsciiWhitespace$default;
                            String str5 = str4;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str, i6, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z4) {
                                strCanonicalize$okhttp$default = this.encodedUsername + "%40" + strCanonicalize$okhttp$default;
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, iDelimiterOffset2 + 1, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z2 = true;
                            } else {
                                z2 = z3;
                            }
                            z3 = z2;
                            str3 = str5;
                            z = true;
                            i5 = iDelimiterOffset;
                        }
                        i6 = i5 + 1;
                        z4 = z;
                    }
                    str4 = str3;
                    iIndexOfLastNonAsciiWhitespace$default = i4;
                    c4 = '#';
                    c3 = '?';
                    c2 = 65535;
                }
                String str6 = str4;
                i2 = iIndexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int iPortColonOffset = companion3.portColonOffset(str, i6, iDelimiterOffset);
                int i7 = iPortColonOffset + 1;
                if (i7 < iDelimiterOffset) {
                    i3 = i6;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i6, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(str, i7, iDelimiterOffset);
                    this.port = port;
                    if (!(port != -1)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = str.substring(i7, iDelimiterOffset);
                        l.c(strSubstring2, str6);
                        sb3.append(strSubstring2);
                        sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str2 = str6;
                } else {
                    i3 = i6;
                    str2 = str6;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i3, iPortColonOffset, false, 4, null));
                    String str7 = this.scheme;
                    l.b(str7);
                    this.port = companion4.defaultPort(str7);
                }
                if (!(this.host != null)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = str.substring(i3, iPortColonOffset);
                    l.c(strSubstring3, str2);
                    sb4.append(strSubstring3);
                    sb4.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || str.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i2 = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i8 = i2;
            int iDelimiterOffset3 = Util.delimiterOffset(str, "?#", iIndexOfFirstNonAsciiWhitespace$default, i8);
            resolvePath(str, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 < i8 && str.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = Util.delimiterOffset(str, '#', iDelimiterOffset3, i8);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < i8 && str.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, iDelimiterOffset3 + 1, i8, "", true, false, false, true, null, SyslogConstants.LOG_LOCAL6, null);
            }
            return this;
        }

        public final Builder password(String str) {
            l.d(str, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int i2) {
            if (1 <= i2 && 65535 >= i2) {
                this.port = i2;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i2).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.HttpUrl.Builder query(java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.Companion
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 219(0xdb, float:3.07E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.query(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new i.d0.f("[\"<>^`{|}]").b(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<String> list = this.encodedPathSegments;
                list.set(i2, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i2), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str2 = list2.get(i3);
                    list2.set(i3, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            l.d(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            l.d(str, Action.NAME_ATTRIBUTE);
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i2) {
            this.encodedPathSegments.remove(i2);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String str) {
            l.d(str, "scheme");
            if (p.o(str, "http", true)) {
                this.scheme = "http";
            } else {
                if (!p.o(str, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.scheme = "https";
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            l.d(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i2, String str) {
            l.d(str, "encodedPathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i2, strCanonicalize$okhttp$default);
            if ((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            l.d(str, "encodedName");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            l.d(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i2, String str) {
            l.d(str, "pathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if ((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true) {
                this.encodedPathSegments.set(i2, strCanonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setPort$okhttp(int i2) {
            this.port = i2;
        }

        public final Builder setQueryParameter(String str, String str2) {
            l.d(str, Action.NAME_ATTRIBUTE);
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0093  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = 1
                goto L24
            L23:
                r1 = 0
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = 1
                goto L33
            L32:
                r1 = 0
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = 0
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L77
                i.y.d.l.b(r1)
                r2 = 2
                r5 = 0
                boolean r1 = i.d0.g.F(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L72
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L77
            L72:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L77:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L80
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L99
            L80:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L93
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                i.y.d.l.b(r2)
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto Lb1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                i.y.d.l.b(r2)
                r1.toQueryString$okhttp(r2, r0)
            Lb1:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lbf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lbf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                i.y.d.l.c(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String str) {
            l.d(str, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z) {
            int i2 = 0;
            do {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i2, str.length());
                push(str, i2, iDelimiterOffset, iDelimiterOffset < str.length(), z);
                i2 = iDelimiterOffset + 1;
            } while (i2 <= str.length());
            return this;
        }
    }

    /* compiled from: HttpUrl.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i4, Object obj) {
            return companion.canonicalize$okhttp(str, (i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? str.length() : i3, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i2, int i3) {
            int i4 = i2 + 2;
            return i4 < i3 && str.charAt(i2) == '%' && Util.parseHexDigit(str.charAt(i2 + 1)) != -1 && Util.parseHexDigit(str.charAt(i4)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i2, int i3, boolean z, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i2, i3, z);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0096 A[LOOP:1: B:111:0x0090->B:113:0x0096, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0068  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void writeCanonicalized(j.f r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lbf
                java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r1, r7)
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L2e
                r8 = 9
                if (r7 == r8) goto L29
                r8 = 10
                if (r7 == r8) goto L29
                r8 = 12
                if (r7 == r8) goto L29
                r8 = 13
                if (r7 == r8) goto L29
                goto L2e
            L29:
                r8 = r14
                r12 = r19
                goto Lb8
            L2e:
                r8 = 43
                if (r7 != r8) goto L3f
                if (r22 == 0) goto L3f
                if (r20 == 0) goto L39
                java.lang.String r8 = "+"
                goto L3b
            L39:
                java.lang.String r8 = "%2B"
            L3b:
                r15.Y(r8)
                goto L29
            L3f:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L6f
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L6f
                r8 = 128(0x80, float:1.8E-43)
                if (r7 < r8) goto L4f
                if (r23 == 0) goto L6f
            L4f:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = i.d0.g.F(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L6d
                if (r7 != r9) goto L68
                if (r20 == 0) goto L6d
                if (r21 == 0) goto L68
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L69
                goto L72
            L68:
                r8 = r14
            L69:
                r15.g1(r7)
                goto Lb8
            L6d:
                r8 = r14
                goto L72
            L6f:
                r8 = r14
                r12 = r19
            L72:
                if (r6 != 0) goto L79
                j.f r6 = new j.f
                r6.<init>()
            L79:
                if (r3 == 0) goto L8d
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = i.y.d.l.a(r3, r10)
                if (r10 == 0) goto L84
                goto L8d
            L84:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.c1(r1, r5, r10, r3)
                goto L90
            L8d:
                r6.g1(r7)
            L90:
                boolean r10 = r6.H()
                if (r10 != 0) goto Lb8
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.I(r9)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.I(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.I(r10)
                goto L90
            Lb8:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbf:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(j.f, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(j.f fVar, String str, int i2, int i3, boolean z) {
            int i4;
            while (i2 < i3) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int iCodePointAt = str.codePointAt(i2);
                if (iCodePointAt == 37 && (i4 = i2 + 2) < i3) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i2 + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i4));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        fVar.g1(iCodePointAt);
                        i2 += Character.charCount(iCodePointAt);
                    } else {
                        fVar.I((hexDigit << 4) + hexDigit2);
                        i2 = Character.charCount(iCodePointAt) + i4;
                    }
                } else if (iCodePointAt == 43 && z) {
                    fVar.I(32);
                    i2++;
                } else {
                    fVar.g1(iCodePointAt);
                    i2 += Character.charCount(iCodePointAt);
                }
            }
        }

        /* renamed from: -deprecated_get */
        public final HttpUrl m83deprecated_get(String str) {
            l.d(str, "url");
            return get(str);
        }

        /* renamed from: -deprecated_parse */
        public final HttpUrl m86deprecated_parse(String str) {
            l.d(str, "url");
            return parse(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String canonicalize$okhttp(java.lang.String r14, int r15, int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, java.nio.charset.Charset r22) {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "$this$canonicalize"
                i.y.d.l.d(r14, r0)
                java.lang.String r0 = "encodeSet"
                i.y.d.l.d(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L6f
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L4c
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L4c
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L24
                if (r21 == 0) goto L4c
            L24:
                char r1 = (char) r0
                r6 = 0
                r7 = 2
                r8 = 0
                boolean r1 = i.d0.g.F(r5, r1, r6, r7, r8)
                if (r1 != 0) goto L4c
                r1 = 37
                if (r0 != r1) goto L3e
                if (r18 == 0) goto L4c
                if (r19 == 0) goto L3e
                r11 = r13
                boolean r1 = r13.isPercentEncoded(r14, r3, r4)
                if (r1 == 0) goto L4d
                goto L3f
            L3e:
                r11 = r13
            L3f:
                r1 = 43
                if (r0 != r1) goto L46
                if (r20 == 0) goto L46
                goto L4d
            L46:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L4c:
                r11 = r13
            L4d:
                j.f r12 = new j.f
                r12.<init>()
                r0 = r15
                r12.f1(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.writeCanonicalized(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.l0()
                return r0
            L6f:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                i.y.d.l.c(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.canonicalize$okhttp(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        public final int defaultPort(String str) {
            l.d(str, "scheme");
            int iHashCode = str.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            l.d(str, "$this$toHttpUrl");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            l.d(str, "$this$toHttpUrlOrNull");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i2, int i3, boolean z) {
            l.d(str, "$this$percentDecode");
            for (int i4 = i2; i4 < i3; i4++) {
                char cCharAt = str.charAt(i4);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    j.f fVar = new j.f();
                    fVar.f1(str, i2, i4);
                    writePercentDecoded(fVar, str, i4, i3, z);
                    return fVar.l0();
                }
            }
            String strSubstring = str.substring(i2, i3);
            l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            l.d(list, "$this$toPathString");
            l.d(sb, "out");
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append(list.get(i2));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            l.d(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                int iQ = q.Q(str, '&', i2, false, 4, null);
                if (iQ == -1) {
                    iQ = str.length();
                }
                int i3 = iQ;
                int iQ2 = q.Q(str, '=', i2, false, 4, null);
                if (iQ2 == -1 || iQ2 > i3) {
                    String strSubstring = str.substring(i2, i3);
                    l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i2, iQ2);
                    l.c(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iQ2 + 1, i3);
                    l.c(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i2 = i3 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            l.d(list, "$this$toQueryString");
            l.d(sb, "out");
            i.a0.a aVarH = f.h(f.i(0, list.size()), 2);
            int iA = aVarH.a();
            int iC = aVarH.c();
            int iE = aVarH.e();
            if (iE >= 0) {
                if (iA > iC) {
                    return;
                }
            } else if (iA < iC) {
                return;
            }
            while (true) {
                String str = list.get(iA);
                String str2 = list.get(iA + 1);
                if (iA > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (iA == iC) {
                    return;
                } else {
                    iA += iE;
                }
            }
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* renamed from: -deprecated_get */
        public final HttpUrl m85deprecated_get(URL url) {
            l.d(url, "url");
            return get(url);
        }

        public final HttpUrl get(URL url) {
            l.d(url, "$this$toHttpUrlOrNull");
            String string = url.toString();
            l.c(string, "toString()");
            return parse(string);
        }

        /* renamed from: -deprecated_get */
        public final HttpUrl m84deprecated_get(URI uri) {
            l.d(uri, "uri");
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            l.d(uri, "$this$toHttpUrlOrNull");
            String string = uri.toString();
            l.c(string, "toString()");
            return parse(string);
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i2, List<String> list, List<String> list2, String str5, String str6) {
        l.d(str, "scheme");
        l.d(str2, "username");
        l.d(str3, "password");
        l.d(str4, "host");
        l.d(list, "pathSegments");
        l.d(str6, "url");
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i2;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = l.a(str, "https");
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment */
    public final String m64deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword */
    public final String m65deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath */
    public final String m66deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments */
    public final List<String> m67deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery */
    public final String m68deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername */
    public final String m69deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment */
    public final String m70deprecated_fragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host */
    public final String m71deprecated_host() {
        return this.host;
    }

    /* renamed from: -deprecated_password */
    public final String m72deprecated_password() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments */
    public final List<String> m73deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize */
    public final int m74deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port */
    public final int m75deprecated_port() {
        return this.port;
    }

    /* renamed from: -deprecated_query */
    public final String m76deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames */
    public final Set<String> m77deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize */
    public final int m78deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme */
    public final String m79deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri */
    public final URI m80deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url */
    public final URL m81deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username */
    public final String m82deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        int iQ = q.Q(this.url, '#', 0, false, 6, null) + 1;
        String str = this.url;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(iQ);
        l.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int iQ = q.Q(this.url, CoreConstants.COLON_CHAR, this.scheme.length() + 3, false, 4, null) + 1;
        int iQ2 = q.Q(this.url, '@', 0, false, 6, null);
        String str = this.url;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(iQ, iQ2);
        l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedPath() {
        int iQ = q.Q(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iQ, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str2.substring(iQ, iDelimiterOffset);
        l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iQ = q.Q(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iQ, str.length());
        ArrayList arrayList = new ArrayList();
        while (iQ < iDelimiterOffset) {
            int i2 = iQ + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i2, iDelimiterOffset);
            String str2 = this.url;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = str2.substring(i2, iDelimiterOffset2);
            l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iQ = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iQ = q.Q(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, '#', iQ, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str2.substring(iQ, iDelimiterOffset);
        l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, ":@", length, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str2.substring(length, iDelimiterOffset);
        l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && l.a(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String str) {
        l.d(str, Action.NAME_ATTRIBUTE);
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        i.a0.a aVarH = f.h(f.i(0, list.size()), 2);
        int iA = aVarH.a();
        int iC = aVarH.c();
        int iE = aVarH.e();
        if (iE < 0 ? iA >= iC : iA <= iC) {
            while (!l.a(str, this.queryNamesAndValues.get(iA))) {
                if (iA != iC) {
                    iA += iE;
                }
            }
            return this.queryNamesAndValues.get(iA + 1);
        }
        return null;
    }

    public final String queryParameterName(int i2) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i2 * 2);
        l.b(str);
        return str;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return g0.b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i.a0.a aVarH = f.h(f.i(0, this.queryNamesAndValues.size()), 2);
        int iA = aVarH.a();
        int iC = aVarH.c();
        int iE = aVarH.e();
        if (iE < 0 ? iA >= iC : iA <= iC) {
            while (true) {
                String str = this.queryNamesAndValues.get(iA);
                l.b(str);
                linkedHashSet.add(str);
                if (iA == iC) {
                    break;
                }
                iA += iE;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        l.c(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int i2) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i2 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        l.d(str, Action.NAME_ATTRIBUTE);
        if (this.queryNamesAndValues == null) {
            return i.t.l.f();
        }
        ArrayList arrayList = new ArrayList();
        i.a0.a aVarH = f.h(f.i(0, this.queryNamesAndValues.size()), 2);
        int iA = aVarH.a();
        int iC = aVarH.c();
        int iE = aVarH.e();
        if (iE < 0 ? iA >= iC : iA <= iC) {
            while (true) {
                if (l.a(str, this.queryNamesAndValues.get(iA))) {
                    arrayList.add(this.queryNamesAndValues.get(iA + 1));
                }
                if (iA == iC) {
                    break;
                }
                iA += iE;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        l.c(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        l.b(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String str) {
        l.d(str, "link");
        Builder builderNewBuilder = newBuilder(str);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                URI uriCreate = URI.create(new i.d0.f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string, ""));
                l.c(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String username() {
        return this.username;
    }

    public final Builder newBuilder(String str) {
        l.d(str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}