package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PackageManagerHelper.java */
/* loaded from: classes.dex */
public class d {
    private static final String a = androidx.work.h.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            androidx.work.h hVarC = androidx.work.h.c();
            String str = a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : "disabled";
            hVarC.a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e2) {
            androidx.work.h hVarC2 = androidx.work.h.c();
            String str2 = a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : "disabled";
            hVarC2.a(str2, String.format("%s could not be %s", objArr2), e2);
        }
    }
}