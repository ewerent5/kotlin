package com.parizene.netmonitor.ui;

import java.util.Arrays;

/* compiled from: PermissionsFragmentPermissionsDispatcher.kt */
/* loaded from: classes3.dex */
public final class g1 {
    private static final String[] a = {"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    public static final void a(PermissionsFragment permissionsFragment) {
        i.y.d.l.d(permissionsFragment, "<this>");
        androidx.fragment.app.d dVarK2 = permissionsFragment.k2();
        String[] strArr = a;
        if (l.a.b.b(dVarK2, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            permissionsFragment.K2();
        } else {
            permissionsFragment.j2(strArr, 9);
        }
    }

    public static final void b(PermissionsFragment permissionsFragment, int i2, int[] iArr) {
        i.y.d.l.d(permissionsFragment, "<this>");
        i.y.d.l.d(iArr, "grantResults");
        if (i2 == 9) {
            if (l.a.b.e(Arrays.copyOf(iArr, iArr.length))) {
                permissionsFragment.K2();
                return;
            }
            String[] strArr = a;
            if (l.a.b.d(permissionsFragment, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                permissionsFragment.N2();
            } else {
                permissionsFragment.O2();
            }
        }
    }
}