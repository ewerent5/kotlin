package e.c.b.d.a.b;

import java.io.File;

/* loaded from: classes.dex */
public final class r {
    public static String a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String str = "";
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (strReplaceFirst.equals("base-master")) {
            return "";
        }
        String str2 = "base-";
        if (strReplaceFirst.startsWith("base-")) {
            str = "config.";
        } else {
            strReplaceFirst = strReplaceFirst.replace("-", ".config.");
            str2 = ".config.master";
        }
        return strReplaceFirst.replace(str2, str);
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> void c(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }
}