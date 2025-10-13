package com.parizene.netmonitor.ui;

import android.os.Bundle;
import java.util.HashMap;

/* compiled from: IntroActivityArgs.java */
/* loaded from: classes3.dex */
public class z0 {
    private final HashMap a;

    /* compiled from: IntroActivityArgs.java */
    public static class b {
        private final HashMap a;

        public b(String str) {
            HashMap map = new HashMap();
            this.a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.");
            }
            map.put("source", str);
        }

        public z0 a() {
            return new z0(this.a);
        }

        public b b(boolean z) {
            this.a.put("show_only_purchase_screen", Boolean.valueOf(z));
            return this;
        }
    }

    public static z0 a(Bundle bundle) {
        z0 z0Var = new z0();
        bundle.setClassLoader(z0.class.getClassLoader());
        if (!bundle.containsKey("source")) {
            throw new IllegalArgumentException("Required argument \"source\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("source");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.");
        }
        z0Var.a.put("source", string);
        if (bundle.containsKey("show_only_purchase_screen")) {
            z0Var.a.put("show_only_purchase_screen", Boolean.valueOf(bundle.getBoolean("show_only_purchase_screen")));
        } else {
            z0Var.a.put("show_only_purchase_screen", Boolean.FALSE);
        }
        return z0Var;
    }

    public boolean b() {
        return ((Boolean) this.a.get("show_only_purchase_screen")).booleanValue();
    }

    public String c() {
        return (String) this.a.get("source");
    }

    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.a.containsKey("source")) {
            bundle.putString("source", (String) this.a.get("source"));
        }
        if (this.a.containsKey("show_only_purchase_screen")) {
            bundle.putBoolean("show_only_purchase_screen", ((Boolean) this.a.get("show_only_purchase_screen")).booleanValue());
        } else {
            bundle.putBoolean("show_only_purchase_screen", false);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.a.containsKey("source") != z0Var.a.containsKey("source")) {
            return false;
        }
        if (c() == null ? z0Var.c() == null : c().equals(z0Var.c())) {
            return this.a.containsKey("show_only_purchase_screen") == z0Var.a.containsKey("show_only_purchase_screen") && b() == z0Var.b();
        }
        return false;
    }

    public int hashCode() {
        return (((c() != null ? c().hashCode() : 0) + 31) * 31) + (b() ? 1 : 0);
    }

    public String toString() {
        return "IntroActivityArgs{source=" + c() + ", showOnlyPurchaseScreen=" + b() + "}";
    }

    private z0() {
        this.a = new HashMap();
    }

    private z0(HashMap map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }
}