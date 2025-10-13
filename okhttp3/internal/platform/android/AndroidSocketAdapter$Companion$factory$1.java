package okhttp3.internal.platform.android;

import ch.qos.logback.core.CoreConstants;
import i.d0.p;
import i.y.d.l;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

/* compiled from: AndroidSocketAdapter.kt */
/* loaded from: classes3.dex */
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    final /* synthetic */ String $packageName;

    AndroidSocketAdapter$Companion$factory$1(String str) {
        str = str;
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public SocketAdapter create(SSLSocket sSLSocket) {
        l.d(sSLSocket, "sslSocket");
        return AndroidSocketAdapter.Companion.build(sSLSocket.getClass());
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public boolean matchesSocket(SSLSocket sSLSocket) {
        l.d(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        l.c(name, "sslSocket.javaClass.name");
        return p.B(name, str + CoreConstants.DOT, false, 2, null);
    }
}