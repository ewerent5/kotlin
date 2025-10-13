package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class eo2 {
    public static eo2 b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new yn2(cls.getSimpleName()) : new bo2(cls.getSimpleName());
    }

    public abstract void a(String str);
}