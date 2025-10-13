package okhttp3;

import ch.qos.logback.core.joran.action.Action;
import com.parizene.netmonitor.m0.c0.e;
import i.d0.f;
import i.d0.p;
import i.d0.q;
import i.y.d.g;
import i.y.d.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Cookie.kt */
/* loaded from: classes3.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* compiled from: Cookie.kt */
    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        public final Cookie build() {
            String str = this.name;
            Objects.requireNonNull(str, "builder.name == null");
            String str2 = this.value;
            Objects.requireNonNull(str2, "builder.value == null");
            long j2 = this.expiresAt;
            String str3 = this.domain;
            Objects.requireNonNull(str3, "builder.domain == null");
            return new Cookie(str, str2, j2, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
        }

        public final Builder domain(String str) {
            l.d(str, "domain");
            return domain(str, false);
        }

        public final Builder expiresAt(long j2) {
            if (j2 <= 0) {
                j2 = Long.MIN_VALUE;
            }
            if (j2 > DatesKt.MAX_DATE) {
                j2 = 253402300799999L;
            }
            this.expiresAt = j2;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String str) {
            l.d(str, "domain");
            return domain(str, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String str) {
            l.d(str, Action.NAME_ATTRIBUTE);
            if (!l.a(q.B0(str).toString(), str)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.name = str;
            return this;
        }

        public final Builder path(String str) {
            l.d(str, "path");
            if (!p.B(str, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'".toString());
            }
            this.path = str;
            return this;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String str) {
            l.d(str, "value");
            if (!l.a(q.B0(str).toString(), str)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.value = str;
            return this;
        }

        private final Builder domain(String str, boolean z) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }
    }

    /* compiled from: Cookie.kt */
    public static final class Companion {
        private Companion() {
        }

        private final int dateCharacterOffset(String str, int i2, int i3, boolean z) {
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z)) {
                    return i2;
                }
                i2++;
            }
            return i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (l.a(str, str2)) {
                return true;
            }
            return p.n(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str);
        }

        private final String parseDomain(String str) {
            if (!(!p.n(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(q.f0(str, "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        private final long parseExpires(String str, int i2, int i3) throws NumberFormatException {
            int iDateCharacterOffset = dateCharacterOffset(str, i2, i3, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int iR = -1;
            int i7 = -1;
            int i8 = -1;
            while (iDateCharacterOffset < i3) {
                int iDateCharacterOffset2 = dateCharacterOffset(str, iDateCharacterOffset + 1, i3, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i5 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    l.c(strGroup, "matcher.group(1)");
                    i5 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    l.c(strGroup2, "matcher.group(2)");
                    i7 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    l.c(strGroup3, "matcher.group(3)");
                    i8 = Integer.parseInt(strGroup3);
                } else if (i6 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    l.c(strGroup4, "matcher.group(1)");
                    i6 = Integer.parseInt(strGroup4);
                } else if (iR == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    l.c(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    l.c(locale, "Locale.US");
                    Objects.requireNonNull(strGroup5, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    l.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String strPattern = Cookie.MONTH_PATTERN.pattern();
                    l.c(strPattern, "MONTH_PATTERN.pattern()");
                    iR = q.R(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i4 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    l.c(strGroup6, "matcher.group(1)");
                    i4 = Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(str, iDateCharacterOffset2 + 1, i3, false);
            }
            if (70 <= i4 && 99 >= i4) {
                i4 += 1900;
            }
            if (i4 >= 0 && 69 >= i4) {
                i4 += 2000;
            }
            if (!(i4 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iR != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i6 && 31 >= i6)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i5 >= 0 && 23 >= i5)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i7 >= 0 && 59 >= i7)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i8 >= 0 && 59 >= i8)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, iR - 1);
            gregorianCalendar.set(5, i6);
            gregorianCalendar.set(11, i5);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long parseMaxAge(String str) throws NumberFormatException {
            try {
                long j2 = Long.parseLong(str);
                if (j2 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j2;
            } catch (NumberFormatException e2) {
                if (new f("-?\\d+").a(str)) {
                    return p.B(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String strEncodedPath = httpUrl.encodedPath();
            if (l.a(strEncodedPath, str)) {
                return true;
            }
            return p.B(strEncodedPath, str, false, 2, null) && (p.n(str, "/", false, 2, null) || strEncodedPath.charAt(str.length()) == '/');
        }

        public final Cookie parse(HttpUrl httpUrl, String str) {
            l.d(httpUrl, "url");
            l.d(str, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[PHI: r1
  0x00dc: PHI (r1v24 long) = (r1v8 long), (r1v11 long) binds: [B:45:0x00da, B:56:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.Cookie parse$okhttp(long r26, okhttp3.HttpUrl r28, java.lang.String r29) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 374
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.parse$okhttp(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        public final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
            l.d(httpUrl, "url");
            l.d(headers, "headers");
            List<String> listValues = headers.values("Set-Cookie");
            int size = listValues.size();
            ArrayList arrayList = null;
            for (int i2 = 0; i2 < size; i2++) {
                Cookie cookie = parse(httpUrl, listValues.get(i2));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
            }
            if (arrayList == null) {
                return i.t.l.f();
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            l.c(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j2;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m43deprecated_domain() {
        return this.domain;
    }

    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m44deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m45deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m46deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m47deprecated_name() {
        return this.name;
    }

    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m48deprecated_path() {
        return this.path;
    }

    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m49deprecated_persistent() {
        return this.persistent;
    }

    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m50deprecated_secure() {
        return this.secure;
    }

    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m51deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (l.a(cookie.name, this.name) && l.a(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && l.a(cookie.domain, this.domain) && l.a(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + e.a(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + a.a(this.secure)) * 31) + a.a(this.httpOnly)) * 31) + a.a(this.persistent)) * 31) + a.a(this.hostOnly);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl httpUrl) {
        l.d(httpUrl, "url");
        if ((this.hostOnly ? l.a(httpUrl.host(), this.domain) : Companion.domainMatch(httpUrl.host(), this.domain)) && Companion.pathMatch(httpUrl, this.path)) {
            return !this.secure || httpUrl.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        l.c(string, "toString()");
        return string;
    }

    public final String value() {
        return this.value;
    }

    public /* synthetic */ Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, g gVar) {
        this(str, str2, j2, str3, str4, z, z2, z3, z4);
    }
}