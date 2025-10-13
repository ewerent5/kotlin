package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class o12 {
    public static String a(@NullableDecl String str) {
        return g12.b(str);
    }

    @NullableDecl
    public static String b(@NullableDecl String str) {
        if (g12.a(str)) {
            return null;
        }
        return str;
    }

    public static boolean c(@NullableDecl String str) {
        return g12.a(str);
    }

    public static String d(@NullableDecl String str, @NullableDecl Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 9 + name2.length());
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i3] = string;
            i3++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (iIndexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i4, iIndexOf);
            sb3.append(objArr[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb3.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb3.append(", ");
                sb3.append(objArr[i5]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}