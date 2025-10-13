package e.c.a;

import androidx.annotation.RecentlyNonNull;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.ads.AdSize;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class c {

    @RecentlyNonNull
    public static final c a = new c(-1, -2, "mb");

    /* renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public static final c f14217b = new c(320, 50, "mb");

    /* renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    public static final c f14218c = new c(300, 250, "as");

    /* renamed from: d, reason: collision with root package name */
    @RecentlyNonNull
    public static final c f14219d = new c(468, 60, "as");

    /* renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public static final c f14220e = new c(728, 90, "as");

    /* renamed from: f, reason: collision with root package name */
    @RecentlyNonNull
    public static final c f14221f = new c(SyslogConstants.LOG_LOCAL4, 600, "as");

    /* renamed from: g, reason: collision with root package name */
    private final AdSize f14222g;

    private c(int i2, int i3, String str) {
        this(new AdSize(i2, i3));
    }

    public c(@RecentlyNonNull AdSize adSize) {
        this.f14222g = adSize;
    }

    public int a() {
        return this.f14222g.getHeight();
    }

    public int b() {
        return this.f14222g.getWidth();
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (obj instanceof c) {
            return this.f14222g.equals(((c) obj).f14222g);
        }
        return false;
    }

    public int hashCode() {
        return this.f14222g.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f14222g.toString();
    }
}