package okhttp3.internal.platform.android;

import i.y.d.l;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: BouncyCastleSocketAdapter.kt */
/* loaded from: classes3.dex */
public final class BouncyCastleSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    BouncyCastleSocketAdapter$Companion$factory$1() {
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public SocketAdapter create(SSLSocket sSLSocket) {
        l.d(sSLSocket, "sslSocket");
        return new BouncyCastleSocketAdapter();
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public boolean matchesSocket(SSLSocket sSLSocket) {
        l.d(sSLSocket, "sslSocket");
        return BouncyCastlePlatform.Companion.isSupported() && (sSLSocket instanceof BCSSLSocket);
    }
}