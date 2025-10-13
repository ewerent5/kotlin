package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c {
    public static c a(long j2, Map<String, AssetPackState> map) {
        return new b0(j2, map);
    }

    public static c b(Bundle bundle, o0 o0Var) {
        return c(bundle, o0Var, new ArrayList());
    }

    public static c c(Bundle bundle, o0 o0Var, List<String> list) {
        return d(bundle, o0Var, list, u.a);
    }

    private static c d(Bundle bundle, o0 o0Var, List<String> list, t tVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap map = new HashMap();
        int size = stringArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = stringArrayList.get(i2);
            map.put(str, AssetPackState.e(bundle, str, o0Var, tVar));
        }
        for (String str2 : list) {
            map.put(str2, AssetPackState.d(str2, 4, 0, 0L, 0L, 0.0d, 1, ""));
        }
        return a(bundle.getLong("total_bytes_to_download"), map);
    }

    public abstract Map<String, AssetPackState> e();

    public abstract long f();
}