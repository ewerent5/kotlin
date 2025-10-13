package e.c.b.b.c.e;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public class d2 {

    /* renamed from: f, reason: collision with root package name */
    private static HashMap<String, String> f14447f;

    /* renamed from: k, reason: collision with root package name */
    private static Object f14452k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f14453l;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f14443b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f14444c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14445d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f14446e = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap<String, Boolean> f14448g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static final HashMap<String, Integer> f14449h = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap<String, Long> f14450i = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static final HashMap<String, Float> f14451j = new HashMap<>();

    /* renamed from: m, reason: collision with root package name */
    private static String[] f14454m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (d2.class) {
            if (f14447f == null) {
                f14446e.set(false);
                f14447f = new HashMap<>();
                f14452k = new Object();
                f14453l = false;
                contentResolver.registerContentObserver(a, true, new c2(null));
            } else if (f14446e.getAndSet(false)) {
                f14447f.clear();
                f14448g.clear();
                f14449h.clear();
                f14450i.clear();
                f14451j.clear();
                f14452k = new Object();
                f14453l = false;
            }
            Object obj = f14452k;
            if (f14447f.containsKey(str)) {
                String str3 = f14447f.get(str);
                return str3 != null ? str3 : null;
            }
            for (String str4 : f14454m) {
                if (str.startsWith(str4)) {
                    if (!f14453l || f14447f.isEmpty()) {
                        f14447f.putAll(b(contentResolver, f14454m));
                        f14453l = true;
                        if (f14447f.containsKey(str)) {
                            String str5 = f14447f.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            Cursor cursorQuery = contentResolver.query(a, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                if (cursorQuery != null) {
                }
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    d(obj, str, null);
                    return null;
                }
                String string = cursorQuery.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                d(obj, str, string);
                return string != null ? string : null;
            } finally {
                cursorQuery.close();
            }
        }
    }

    private static Map<String, String> b(ContentResolver contentResolver, String... strArr) {
        Cursor cursorQuery = contentResolver.query(f14443b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (cursorQuery == null) {
            return treeMap;
        }
        while (cursorQuery.moveToNext()) {
            try {
                treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } finally {
                cursorQuery.close();
            }
        }
        return treeMap;
    }

    private static void d(Object obj, String str, String str2) {
        synchronized (d2.class) {
            if (obj == f14452k) {
                f14447f.put(str, str2);
            }
        }
    }
}