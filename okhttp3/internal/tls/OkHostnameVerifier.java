package okhttp3.internal.tls;

import ch.qos.logback.core.CoreConstants;
import i.d0.p;
import i.d0.q;
import i.t.l;
import i.t.t;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import org.slf4j.Marker;

/* compiled from: OkHostnameVerifier.kt */
/* loaded from: classes3.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i2) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return l.f();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!i.y.d.l.a(list.get(0), Integer.valueOf(i2))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return l.f();
        }
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        Locale locale = Locale.US;
        i.y.d.l.c(locale, "Locale.US");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        i.y.d.l.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(lowerCase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (i.y.d.l.a(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        i.y.d.l.d(x509Certificate, "certificate");
        return t.D(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        i.y.d.l.d(str, "host");
        i.y.d.l.d(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return verify(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        i.y.d.l.d(str, "host");
        i.y.d.l.d(x509Certificate, "certificate");
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (!(str == null || str.length() == 0) && !p.B(str, ".", false, 2, null) && !p.n(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !p.B(str2, ".", false, 2, null) && !p.n(str2, "..", false, 2, null)) {
                if (!p.n(str, ".", false, 2, null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!p.n(str2, ".", false, 2, null)) {
                    str2 = str2 + ".";
                }
                Locale locale = Locale.US;
                i.y.d.l.c(locale, "Locale.US");
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = str2.toLowerCase(locale);
                i.y.d.l.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!q.G(lowerCase, Marker.ANY_MARKER, false, 2, null)) {
                    return i.y.d.l.a(str3, lowerCase);
                }
                if (!p.B(lowerCase, "*.", false, 2, null) || q.Q(lowerCase, '*', 1, false, 4, null) != -1 || str3.length() < lowerCase.length() || i.y.d.l.a("*.", lowerCase)) {
                    return false;
                }
                String strSubstring = lowerCase.substring(1);
                i.y.d.l.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
                if (!p.n(str3, strSubstring, false, 2, null)) {
                    return false;
                }
                int length = str3.length() - strSubstring.length();
                return length <= 0 || q.V(str3, CoreConstants.DOT, length + (-1), false, 4, null) == -1;
            }
        }
        return false;
    }
}