package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public enum p1 implements u7 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);


    /* renamed from: k, reason: collision with root package name */
    private static final t7<p1> f14769k = new t7<p1>() { // from class: e.c.b.b.c.e.s1
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f14771m;

    p1(int i2) {
        this.f14771m = i2;
    }

    public static p1 a(int i2) {
        if (i2 == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i2 == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i2 == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i2 == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i2 == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i2 != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }

    public static w7 b() {
        return r1.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + p1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14771m + " name=" + name() + '>';
    }

    @Override // e.c.b.b.c.e.u7
    public final int zza() {
        return this.f14771m;
    }
}