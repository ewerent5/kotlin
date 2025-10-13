package com.parizene.netmonitor.ui.nps;

import android.os.Bundle;
import java.util.HashMap;

/* compiled from: NpsRateAppFragmentArgs.java */
/* loaded from: classes3.dex */
public class g {
    private final HashMap a;

    /* compiled from: NpsRateAppFragmentArgs.java */
    public static class b {
        private final HashMap a;

        public b(int i2) {
            HashMap map = new HashMap();
            this.a = map;
            map.put("score", Integer.valueOf(i2));
        }

        public g a() {
            return new g(this.a);
        }
    }

    public static g a(Bundle bundle) {
        g gVar = new g();
        bundle.setClassLoader(g.class.getClassLoader());
        if (!bundle.containsKey("score")) {
            throw new IllegalArgumentException("Required argument \"score\" is missing and does not have an android:defaultValue");
        }
        gVar.a.put("score", Integer.valueOf(bundle.getInt("score")));
        return gVar;
    }

    public int b() {
        return ((Integer) this.a.get("score")).intValue();
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        if (this.a.containsKey("score")) {
            bundle.putInt("score", ((Integer) this.a.get("score")).intValue());
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.containsKey("score") == gVar.a.containsKey("score") && b() == gVar.b();
    }

    public int hashCode() {
        return 31 + b();
    }

    public String toString() {
        return "NpsRateAppFragmentArgs{score=" + b() + "}";
    }

    private g() {
        this.a = new HashMap();
    }

    private g(HashMap map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }
}