package com.parizene.netmonitor.ui.nps;

import android.os.Bundle;
import java.util.HashMap;

/* compiled from: NpsSendFeedbackFragmentArgs.java */
/* loaded from: classes3.dex */
public class h {
    private final HashMap a;

    /* compiled from: NpsSendFeedbackFragmentArgs.java */
    public static class b {
        private final HashMap a;

        public b(int i2) {
            HashMap map = new HashMap();
            this.a = map;
            map.put("score", Integer.valueOf(i2));
        }

        public h a() {
            return new h(this.a);
        }
    }

    public static h a(Bundle bundle) {
        h hVar = new h();
        bundle.setClassLoader(h.class.getClassLoader());
        if (!bundle.containsKey("score")) {
            throw new IllegalArgumentException("Required argument \"score\" is missing and does not have an android:defaultValue");
        }
        hVar.a.put("score", Integer.valueOf(bundle.getInt("score")));
        return hVar;
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
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.containsKey("score") == hVar.a.containsKey("score") && b() == hVar.b();
    }

    public int hashCode() {
        return 31 + b();
    }

    public String toString() {
        return "NpsSendFeedbackFragmentArgs{score=" + b() + "}";
    }

    private h() {
        this.a = new HashMap();
    }

    private h(HashMap map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }
}