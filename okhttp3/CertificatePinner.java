package okhttp3;

import ch.qos.logback.core.CoreConstants;
import i.d0.p;
import i.d0.q;
import i.t.h;
import i.t.t;
import i.y.d.g;
import i.y.d.l;
import i.y.d.m;
import i.y.d.y;
import j.i;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.slf4j.Marker;

/* compiled from: CertificatePinner.kt */
/* loaded from: classes3.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* compiled from: CertificatePinner.kt */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            l.d(str, "pattern");
            l.d(strArr, "pins");
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(t.M(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* compiled from: CertificatePinner.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String pin(Certificate certificate) {
            l.d(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).a();
        }

        public final i sha1Hash(X509Certificate x509Certificate) {
            l.d(x509Certificate, "$this$sha1Hash");
            i.a aVar = i.f16464f;
            PublicKey publicKey = x509Certificate.getPublicKey();
            l.c(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            l.c(encoded, "publicKey.encoded");
            return i.a.f(aVar, encoded, 0, 0, 3, null).s();
        }

        public final i sha256Hash(X509Certificate x509Certificate) {
            l.d(x509Certificate, "$this$sha256Hash");
            i.a aVar = i.f16464f;
            PublicKey publicKey = x509Certificate.getPublicKey();
            l.c(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            l.c(encoded, "publicKey.encoded");
            return i.a.f(aVar, encoded, 0, 0, 3, null).t();
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: CertificatePinner.kt */
    public static final class Pin {
        private final i hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            l.d(str, "pattern");
            l.d(str2, "pin");
            if (!((p.B(str, "*.", false, 2, null) && q.R(str, Marker.ANY_MARKER, 1, false, 4, null) == -1) || (p.B(str, "**.", false, 2, null) && q.R(str, Marker.ANY_MARKER, 2, false, 4, null) == -1) || q.R(str, Marker.ANY_MARKER, 0, false, 6, null) == -1)) {
                throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("Invalid pattern: " + str);
            }
            this.pattern = canonicalHost;
            if (p.B(str2, "sha1/", false, 2, null)) {
                this.hashAlgorithm = "sha1";
                i.a aVar = i.f16464f;
                String strSubstring = str2.substring(5);
                l.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
                i iVarA = aVar.a(strSubstring);
                if (iVarA != null) {
                    this.hash = iVarA;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + str2);
            }
            if (!p.B(str2, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
            }
            this.hashAlgorithm = "sha256";
            i.a aVar2 = i.f16464f;
            String strSubstring2 = str2.substring(7);
            l.c(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            i iVarA2 = aVar2.a(strSubstring2);
            if (iVarA2 != null) {
                this.hash = iVarA2;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return ((l.a(this.pattern, pin.pattern) ^ true) || (l.a(this.hashAlgorithm, pin.hashAlgorithm) ^ true) || (l.a(this.hash, pin.hash) ^ true)) ? false : true;
        }

        public final i getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            l.d(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            int iHashCode = str.hashCode();
            if (iHashCode != -903629273) {
                if (iHashCode == 3528965 && str.equals("sha1")) {
                    return l.a(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
                }
            } else if (str.equals("sha256")) {
                return l.a(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            return false;
        }

        /* JADX WARN: Failed to inline method: i.d0.g.s(java.lang.String, int, java.lang.String, int, int, boolean, int, java.lang.Object):boolean */
        /* JADX WARN: Unknown register number '(r12v0 java.lang.String)' in method call: i.d0.g.s(java.lang.String, int, java.lang.String, int, int, boolean, int, java.lang.Object):boolean */
        public final boolean matchesHostname(String str) {
            l.d(str, "hostname");
            if (p.B(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (!p.r(str, str.length() - length, this.pattern, 3, length, (str & 16) != 0 ? false : false)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!p.B(this.pattern, "*.", false, 2, null)) {
                    return l.a(str, this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = str.length() - length3;
                if (!i.d0.g.s(str, str.length() - length3, this.pattern, 1, length3, false, 16, null) || q.V(str, CoreConstants.DOT, length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.a();
        }
    }

    /* compiled from: CertificatePinner.kt */
    /* renamed from: okhttp3.CertificatePinner$check$1, reason: invalid class name */
    static final class AnonymousClass1 extends m implements i.y.c.a<List<? extends X509Certificate>> {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List $peerCertificates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        @Override // i.y.c.a
        public final List<? extends X509Certificate> invoke() {
            List<Certificate> listClean;
            CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
            if (certificateChainCleaner$okhttp == null || (listClean = certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname)) == null) {
                listClean = this.$peerCertificates;
            }
            ArrayList arrayList = new ArrayList(i.t.m.o(listClean, 10));
            for (Certificate certificate : listClean) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        l.d(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final i sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final i sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) {
        l.d(str, "hostname");
        l.d(list, "peerCertificates");
        check$okhttp(str, new AnonymousClass1(list, str));
    }

    public final void check$okhttp(String str, i.y.c.a<? extends List<? extends X509Certificate>> aVar) throws SSLPeerUnverifiedException {
        l.d(str, "hostname");
        l.d(aVar, "cleanedPeerCertificatesFn");
        List<Pin> listFindMatchingPins = findMatchingPins(str);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = aVar.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            i iVarSha256Hash = null;
            i iVarSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                int iHashCode = hashAlgorithm.hashCode();
                if (iHashCode != -903629273) {
                    if (iHashCode != 3528965 || !hashAlgorithm.equals("sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (iVarSha1Hash == null) {
                        iVarSha1Hash = Companion.sha1Hash(x509Certificate);
                    }
                    if (l.a(pin.getHash(), iVarSha1Hash)) {
                        return;
                    }
                } else {
                    if (!hashAlgorithm.equals("sha256")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (iVarSha256Hash == null) {
                        iVarSha256Hash = Companion.sha256Hash(x509Certificate);
                    }
                    if (l.a(pin.getHash(), iVarSha256Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            l.c(subjectDN, "element.subjectDN");
            sb.append(subjectDN.getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (Pin pin2 : listFindMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String string = sb.toString();
        l.c(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (l.a(certificatePinner.pins, this.pins) && l.a(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String str) {
        l.d(str, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> listF = i.t.l.f();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(str)) {
                if (listF.isEmpty()) {
                    listF = new ArrayList<>();
                }
                y.a(listF).add(obj);
            }
        }
        return listF;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        l.d(certificateChainCleaner, "certificateChainCleaner");
        return l.a(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i2, g gVar) {
        this(set, (i2 & 2) != 0 ? null : certificateChainCleaner);
    }

    public final void check(String str, Certificate... certificateArr) {
        l.d(str, "hostname");
        l.d(certificateArr, "peerCertificates");
        check(str, h.w(certificateArr));
    }
}