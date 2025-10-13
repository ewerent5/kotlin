package j$.util.stream;

import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class J0 implements PrivilegedAction {
    public static final /* synthetic */ J0 a = ;

    private /* synthetic */ J0() {
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        boolean z = i3.a;
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}