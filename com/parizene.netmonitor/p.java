package com.parizene.netmonitor;

import android.os.Build;

/* compiled from: Device.java */
/* loaded from: classes.dex */
public class p {

    /* compiled from: Device.java */
    public static class a {
        public static boolean a() {
            return Build.DEVICE.equals("cp2dug");
        }

        public static boolean b() {
            return Build.DEVICE.equals("htc_mecdug");
        }
    }

    /* compiled from: Device.java */
    public static class b {
        public static boolean a() {
            return Build.DEVICE.equals("a3xelte");
        }

        public static boolean b() {
            return Build.DEVICE.equals("a3y17lte");
        }

        public static boolean c() {
            return Build.DEVICE.equals("a5xelte");
        }

        public static boolean d() {
            return Build.DEVICE.equals("grandpplte");
        }

        public static boolean e() {
            return Build.DEVICE.equals("j7maxlte");
        }

        public static boolean f() {
            return Build.DEVICE.equals("dreamlte");
        }

        public static boolean g() {
            return Build.DEVICE.equals("chagalllte");
        }
    }

    public static boolean a() {
        return Build.MANUFACTURER.equalsIgnoreCase("rim");
    }
}