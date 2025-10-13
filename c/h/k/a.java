package c.h.k;

import ch.qos.logback.core.CoreConstants;

/* compiled from: DebugUtils.java */
/* loaded from: classes.dex */
public class a {
    public static void a(Object obj, StringBuilder sb) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append(CoreConstants.CURLY_LEFT);
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}