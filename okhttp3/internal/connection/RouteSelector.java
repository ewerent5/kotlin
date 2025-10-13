package okhttp3.internal.connection;

import ch.qos.logback.core.CoreConstants;
import i.t.k;
import i.t.q;
import i.y.c.a;
import i.y.d.g;
import i.y.d.l;
import i.y.d.m;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

/* compiled from: RouteSelector.kt */
/* loaded from: classes3.dex */
public final class RouteSelector {
    public static final Companion Companion = new Companion(null);
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    /* compiled from: RouteSelector.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            l.d(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                l.c(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            l.c(hostName, "hostName");
            return hostName;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: RouteSelector.kt */
    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> list) {
            l.d(list, "routes");
            this.routes = list;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final Route next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            List<Route> list = this.routes;
            int i2 = this.nextRouteIndex;
            this.nextRouteIndex = i2 + 1;
            return list.get(i2);
        }
    }

    /* compiled from: RouteSelector.kt */
    /* renamed from: okhttp3.internal.connection.RouteSelector$resetNextProxy$1, reason: invalid class name */
    static final class AnonymousClass1 extends m implements a<List<? extends Proxy>> {
        final /* synthetic */ Proxy $proxy;
        final /* synthetic */ HttpUrl $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Proxy proxy, HttpUrl httpUrl) {
            super(0);
            this.$proxy = proxy;
            this.$url = httpUrl;
        }

        @Override // i.y.c.a
        public final List<? extends Proxy> invoke() {
            Proxy proxy = this.$proxy;
            if (proxy != null) {
                return k.b(proxy);
            }
            URI uri = this.$url.uri();
            if (uri.getHost() == null) {
                return Util.immutableListOf(Proxy.NO_PROXY);
            }
            List<Proxy> listSelect = RouteSelector.this.address.proxySelector().select(uri);
            return listSelect == null || listSelect.isEmpty() ? Util.immutableListOf(Proxy.NO_PROXY) : Util.toImmutableList(listSelect);
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        l.d(address, "address");
        l.d(routeDatabase, "routeDatabase");
        l.d(call, "call");
        l.d(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        this.proxies = i.t.l.f();
        this.inetSocketAddresses = i.t.l.f();
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy nextProxy() throws SocketException, UnknownHostException {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i2 = this.nextProxyIndex;
            this.nextProxyIndex = i2 + 1;
            Proxy proxy = list.get(i2);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
    }

    private final void resetNextInetSocketAddress(Proxy proxy) throws SocketException, UnknownHostException {
        String strHost;
        int iPort;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strHost = this.address.url().host();
            iPort = this.address.url().port();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strHost = Companion.getSocketHost(inetSocketAddress);
            iPort = inetSocketAddress.getPort();
        }
        if (1 > iPort || 65535 < iPort) {
            throw new SocketException("No route to " + strHost + CoreConstants.COLON_CHAR + iPort + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strHost, iPort));
            return;
        }
        this.eventListener.dnsStart(this.call, strHost);
        List<InetAddress> listLookup = this.address.dns().lookup(strHost);
        if (listLookup.isEmpty()) {
            throw new UnknownHostException(this.address.dns() + " returned no addresses for " + strHost);
        }
        this.eventListener.dnsEnd(this.call, strHost, listLookup);
        Iterator<InetAddress> it = listLookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), iPort));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(proxy, httpUrl);
        this.eventListener.proxySelectStart(this.call, httpUrl);
        List<? extends Proxy> listInvoke = anonymousClass1.invoke();
        this.proxies = listInvoke;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, httpUrl, listInvoke);
    }

    public final boolean hasNext() {
        return hasNextProxy() || (this.postponedRoutes.isEmpty() ^ true);
    }

    public final Selection next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (hasNextProxy()) {
            Proxy proxyNextProxy = nextProxy();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                Route route = new Route(this.address, proxyNextProxy, it.next());
                if (this.routeDatabase.shouldPostpone(route)) {
                    this.postponedRoutes.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            q.q(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new Selection(arrayList);
    }
}