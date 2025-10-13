package k.c.e.m;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ArchiveFileFactory.java */
/* loaded from: classes3.dex */
public class a {
    static Map<String, Class<? extends f>> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("zip", v.class);
        if (Build.VERSION.SDK_INT >= 10) {
            a.put("sqlite", d.class);
            a.put("mbtiles", i.class);
            a.put("gemf", e.class);
        }
    }

    public static f a(File file) throws IllegalAccessException, InstantiationException {
        String name = file.getName();
        if (name.contains(".")) {
            try {
                name = name.substring(name.lastIndexOf(".") + 1);
            } catch (Exception unused) {
            }
        }
        Class<? extends f> cls = a.get(name.toLowerCase());
        if (cls == null) {
            return null;
        }
        try {
            f fVarNewInstance = cls.newInstance();
            fVarNewInstance.a(file);
            return fVarNewInstance;
        } catch (IllegalAccessException e2) {
            Log.e("OsmDroid", "Error initializing archive file provider " + file.getAbsolutePath(), e2);
            return null;
        } catch (InstantiationException e3) {
            Log.e("OsmDroid", "Error initializing archive file provider " + file.getAbsolutePath(), e3);
            return null;
        } catch (Exception e4) {
            Log.e("OsmDroid", "Error opening archive file " + file.getAbsolutePath(), e4);
            return null;
        }
    }
}