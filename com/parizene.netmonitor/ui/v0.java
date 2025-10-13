package com.parizene.netmonitor.ui;

import java.util.Arrays;

/* compiled from: HomeFragmentPermissionsDispatcher.kt */
/* loaded from: classes3.dex */
public final class v0 {
    private static final String[] a = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static final void a(HomeFragment homeFragment, int i2, int[] iArr) {
        i.y.d.l.d(homeFragment, "<this>");
        i.y.d.l.d(iArr, "grantResults");
        if (i2 == 0 && l.a.b.e(Arrays.copyOf(iArr, iArr.length))) {
            homeFragment.b3();
        }
    }

    public static final void b(HomeFragment homeFragment) {
        i.y.d.l.d(homeFragment, "<this>");
        androidx.fragment.app.d dVarK2 = homeFragment.k2();
        String[] strArr = a;
        if (l.a.b.b(dVarK2, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            homeFragment.b3();
        } else {
            homeFragment.j2(strArr, 0);
        }
    }
}