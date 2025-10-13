package okhttp3.internal.tls;

import i.y.d.g;
import i.y.d.l;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.Platform;

/* compiled from: CertificateChainCleaner.kt */
/* loaded from: classes3.dex */
public abstract class CertificateChainCleaner {
    public static final Companion Companion = new Companion(null);

    /* compiled from: CertificateChainCleaner.kt */
    public static final class Companion {
        private Companion() {
        }

        public final CertificateChainCleaner get(X509TrustManager x509TrustManager) {
            l.d(x509TrustManager, "trustManager");
            return Platform.Companion.get().buildCertificateChainCleaner(x509TrustManager);
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final CertificateChainCleaner get(X509Certificate... x509CertificateArr) {
            l.d(x509CertificateArr, "caCerts");
            return new BasicCertificateChainCleaner(new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)));
        }
    }

    public abstract List<Certificate> clean(List<? extends Certificate> list, String str);
}