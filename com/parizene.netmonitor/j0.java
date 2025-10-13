package com.parizene.netmonitor;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public class j0 {
    public static float a(Context context, float f2) {
        return TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
    }

    public static void b(File file, File file2) throws IOException {
        FileChannel channel = new FileInputStream(file).getChannel();
        FileChannel channel2 = new FileOutputStream(file2).getChannel();
        channel2.transferFrom(channel, 0L, channel.size());
        channel.close();
        channel2.close();
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static Intent d(String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", str3);
        return intent;
    }

    public static int e(float f2) {
        return Color.HSVToColor(new float[]{f2 * 120.0f, 1.0f, 1.0f});
    }

    public static final byte[] f(int i2) {
        return new byte[]{(byte) (i2 >>> 24), (byte) (i2 >>> 16), (byte) (i2 >>> 8), (byte) i2};
    }

    public static boolean g(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo.exported && activityInfo.permission == null) {
                return true;
            }
        }
        return false;
    }

    public static String h(List<?> list) {
        String string = "[";
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            while (i2 < list.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append("\n");
                int i3 = i2 + 1;
                sb.append(i3);
                sb.append(": {");
                sb.append(list.get(i2));
                sb.append("}");
                i2 = i3;
                string = sb.toString();
            }
        }
        return string + "\n]";
    }
}