package okhttp3;

import i.t.h;
import i.y.d.g;
import i.y.d.l;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* compiled from: Dns.kt */
/* loaded from: classes3.dex */
public interface Dns {
    public static final Companion Companion = new Companion(null);
    public static final Dns SYSTEM = new Companion.DnsSystem();

    /* compiled from: Dns.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: Dns.kt */
        private static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(String str) throws UnknownHostException {
                l.d(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    l.c(allByName, "InetAddress.getAllByName(hostname)");
                    return h.w(allByName);
                } catch (NullPointerException e2) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e2);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    List<InetAddress> lookup(String str);
}