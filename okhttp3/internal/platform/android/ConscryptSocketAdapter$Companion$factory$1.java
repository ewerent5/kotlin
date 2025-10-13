package okhttp3.internal.platform.android;

import i.y.d.l;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

/* compiled from: ConscryptSocketAdapter.kt */
/* loaded from: classes3.dex */
public final class ConscryptSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    ConscryptSocketAdapter$Companion$factory$1() {
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public SocketAdapter create(SSLSocket sSLSocket) {
        l.d(sSLSocket, "sslSocket");
        return new ConscryptSocketAdapter();
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public boolean matchesSocket(SSLSocket sSLSocket) {
        l.d(sSLSocket, "sslSocket");
        return ConscryptPlatform.Companion.isSupported() && Conscrypt.isConscrypt(sSLSocket);
    }
}