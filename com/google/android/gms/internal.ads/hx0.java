package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum hx0 implements gj2 {
    DEBUGGER_STATE_UNSPECIFIED(0),
    DEBUGGER_STATE_NOT_INSTALLED(1),
    DEBUGGER_STATE_INSTALLED(2),
    DEBUGGER_STATE_ACTIVE(3),
    DEBUGGER_STATE_ENVVAR(4),
    DEBUGGER_STATE_MACHPORT(5),
    DEBUGGER_STATE_ENVVAR_MACHPORT(6);


    /* renamed from: l, reason: collision with root package name */
    private static final hj2<hx0> f6426l = new hj2<hx0>() { // from class: com.google.android.gms.internal.ads.fv0
    };
    private final int n;

    hx0(int i2) {
        this.n = i2;
    }

    public static hx0 a(int i2) {
        switch (i2) {
            case 0:
                return DEBUGGER_STATE_UNSPECIFIED;
            case 1:
                return DEBUGGER_STATE_NOT_INSTALLED;
            case 2:
                return DEBUGGER_STATE_INSTALLED;
            case 3:
                return DEBUGGER_STATE_ACTIVE;
            case 4:
                return DEBUGGER_STATE_ENVVAR;
            case 5:
                return DEBUGGER_STATE_MACHPORT;
            case 6:
                return DEBUGGER_STATE_ENVVAR_MACHPORT;
            default:
                return null;
        }
    }

    public static ij2 b() {
        return gw0.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + hx0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.n + " name=" + name() + '>';
    }
}