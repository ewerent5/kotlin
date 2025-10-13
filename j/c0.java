package j;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
final class c0 extends d {
    private final Socket a;

    public c0(Socket socket) {
        i.y.d.l.d(socket, "socket");
        this.a = socket;
    }

    @Override // j.d
    protected IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // j.d
    protected void timedOut() throws IOException {
        try {
            this.a.close();
        } catch (AssertionError e2) {
            if (!q.e(e2)) {
                throw e2;
            }
            r.a.log(Level.WARNING, "Failed to close timed out socket " + this.a, (Throwable) e2);
        } catch (Exception e3) {
            r.a.log(Level.WARNING, "Failed to close timed out socket " + this.a, (Throwable) e3);
        }
    }
}