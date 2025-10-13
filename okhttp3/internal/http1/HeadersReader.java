package okhttp3.internal.http1;

import i.y.d.g;
import i.y.d.l;
import j.h;
import okhttp3.Headers;

/* compiled from: HeadersReader.kt */
/* loaded from: classes3.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final h source;

    /* compiled from: HeadersReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public HeadersReader(h hVar) {
        l.d(hVar, "source");
        this.source = hVar;
        this.headerLimit = HEADER_LIMIT;
    }

    public final h getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(line);
        }
    }

    public final String readLine() {
        String strQ = this.source.Q(this.headerLimit);
        this.headerLimit -= strQ.length();
        return strQ;
    }
}