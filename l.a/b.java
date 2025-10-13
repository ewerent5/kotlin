package l.a;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.Fragment;
import c.e.g;

/* compiled from: PermissionUtils.java */
/* loaded from: classes3.dex */
public final class b {
    private static final g<String, Integer> a;

    static {
        g<String, Integer> gVar = new g<>(13);
        a = gVar;
        gVar.put("com.android.voicemail.permission.ADD_VOICEMAIL", 14);
        gVar.put("android.permission.READ_CALL_LOG", 16);
        gVar.put("android.permission.READ_EXTERNAL_STORAGE", 16);
        gVar.put("android.permission.WRITE_CALL_LOG", 16);
        gVar.put("android.permission.BODY_SENSORS", 20);
        gVar.put("android.permission.SYSTEM_ALERT_WINDOW", 23);
        gVar.put("android.permission.WRITE_SETTINGS", 23);
        gVar.put("android.permission.READ_PHONE_NUMBERS", 26);
        gVar.put("android.permission.ANSWER_PHONE_CALLS", 26);
        gVar.put("android.permission.ACCEPT_HANDOVER", 28);
        gVar.put("android.permission.ACTIVITY_RECOGNITION", 29);
        gVar.put("android.permission.ACCESS_MEDIA_LOCATION", 29);
        gVar.put("android.permission.ACCESS_BACKGROUND_LOCATION", 29);
    }

    private static boolean a(Context context, String str) {
        try {
            return androidx.core.content.b.b(context, str) == 0;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static boolean b(Context context, String... strArr) {
        for (String str : strArr) {
            if (c(str) && !a(context, str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(String str) {
        Integer num = a.get(str);
        return num == null || Build.VERSION.SDK_INT >= num.intValue();
    }

    public static boolean d(Fragment fragment, String... strArr) {
        for (String str : strArr) {
            if (fragment.C2(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(int... iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 != 0) {
                return false;
            }
        }
        return true;
    }
}