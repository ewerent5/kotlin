package com.google.android.play.core.common;

import android.os.Bundle;
import e.c.b.d.a.b.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b {
    private static final Set<String> a = new HashSet(Arrays.asList("app_update", "review"));

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f12213b = new HashSet(Arrays.asList("native", "unity"));

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Map<String, Integer>> f12214c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final f f12215d = new f("PlayCoreVersion");

    public static synchronized Map<String, Integer> a(String str) {
        Map<String, Map<String, Integer>> map;
        map = f12214c;
        if (!map.containsKey(str)) {
            HashMap map2 = new HashMap();
            map2.put("java", 11000);
            map.put(str, map2);
        }
        return map.get(str);
    }

    public static Bundle b(String str) {
        Bundle bundle = new Bundle();
        Map<String, Integer> mapA = a(str);
        bundle.putInt("playcore_version_code", mapA.get("java").intValue());
        if (mapA.containsKey("native")) {
            bundle.putInt("playcore_native_version", mapA.get("native").intValue());
        }
        if (mapA.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", mapA.get("unity").intValue());
        }
        return bundle;
    }
}