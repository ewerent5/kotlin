package i.w;

import ch.qos.logback.core.CoreConstants;
import i.d0.q;
import i.y.d.l;

/* compiled from: PlatformImplementations.kt */
/* loaded from: classes3.dex */
public final class b {
    public static final a a;

    static {
        a aVar;
        int iA = a();
        if (iA >= 65544) {
            try {
                Object objNewInstance = Class.forName("i.w.e.a").newInstance();
                l.c(objNewInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    try {
                        if (objNewInstance == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        aVar = (a) objNewInstance;
                    } catch (ClassCastException e2) {
                        Throwable thInitCause = new ClassCastException("Instance classloader: " + objNewInstance.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e2);
                        l.c(thInitCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause;
                    }
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object objNewInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                l.c(objNewInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    if (objNewInstance2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) objNewInstance2;
                } catch (ClassCastException e3) {
                    Throwable thInitCause2 = new ClassCastException("Instance classloader: " + objNewInstance2.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e3);
                    l.c(thInitCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw thInitCause2;
                }
            }
        } else if (iA >= 65543) {
            try {
                try {
                    Object objNewInstance3 = Class.forName("i.w.d.a").newInstance();
                    l.c(objNewInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    try {
                        if (objNewInstance3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        aVar = (a) objNewInstance3;
                    } catch (ClassCastException e4) {
                        Throwable thInitCause3 = new ClassCastException("Instance classloader: " + objNewInstance3.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e4);
                        l.c(thInitCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause3;
                    }
                } catch (ClassNotFoundException unused3) {
                }
            } catch (ClassNotFoundException unused4) {
                Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                l.c(objNewInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    if (objNewInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) objNewInstance4;
                } catch (ClassCastException e5) {
                    Throwable thInitCause4 = new ClassCastException("Instance classloader: " + objNewInstance4.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e5);
                    l.c(thInitCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw thInitCause4;
                }
            }
        } else {
            aVar = new a();
        }
        a = aVar;
    }

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int iQ = q.Q(property, CoreConstants.DOT, 0, false, 6, null);
        if (iQ < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i2 = iQ + 1;
        int iQ2 = q.Q(property, CoreConstants.DOT, i2, false, 4, null);
        if (iQ2 < 0) {
            iQ2 = property.length();
        }
        String strSubstring = property.substring(0, iQ);
        l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String strSubstring2 = property.substring(i2, iQ2);
        l.c(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(strSubstring) * 65536) + Integer.parseInt(strSubstring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}