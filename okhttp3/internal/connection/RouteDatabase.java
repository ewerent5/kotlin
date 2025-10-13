package okhttp3.internal.connection;

import i.y.d.l;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;

/* compiled from: RouteDatabase.kt */
/* loaded from: classes3.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        l.d(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        l.d(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        l.d(route, "route");
        return this.failedRoutes.contains(route);
    }
}