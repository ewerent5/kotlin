package j$.util;

import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements PrivilegedAction {
    public static final /* synthetic */ i a = ;

    private /* synthetic */ i() {
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        boolean z = w.a;
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}