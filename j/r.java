package j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class r {
    private static final Logger a = Logger.getLogger("okio.Okio");

    public static final b0 b(File file) {
        i.y.d.l.d(file, "$this$appendingSink");
        return q.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        i.y.d.l.d(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? i.d0.q.G(message, "getsockname failed", false, 2, null) : false;
    }

    public static final b0 d(File file, boolean z) {
        i.y.d.l.d(file, "$this$sink");
        return q.g(new FileOutputStream(file, z));
    }

    public static final b0 e(OutputStream outputStream) {
        i.y.d.l.d(outputStream, "$this$sink");
        return new u(outputStream, new e0());
    }

    public static final b0 f(Socket socket) throws IOException {
        i.y.d.l.d(socket, "$this$sink");
        c0 c0Var = new c0(socket);
        OutputStream outputStream = socket.getOutputStream();
        i.y.d.l.c(outputStream, "getOutputStream()");
        return c0Var.sink(new u(outputStream, c0Var));
    }

    public static /* synthetic */ b0 g(File file, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return q.f(file, z);
    }

    public static final d0 h(File file) {
        i.y.d.l.d(file, "$this$source");
        return q.k(new FileInputStream(file));
    }

    public static final d0 i(InputStream inputStream) {
        i.y.d.l.d(inputStream, "$this$source");
        return new p(inputStream, new e0());
    }

    public static final d0 j(Socket socket) throws IOException {
        i.y.d.l.d(socket, "$this$source");
        c0 c0Var = new c0(socket);
        InputStream inputStream = socket.getInputStream();
        i.y.d.l.c(inputStream, "getInputStream()");
        return c0Var.source(new p(inputStream, c0Var));
    }
}