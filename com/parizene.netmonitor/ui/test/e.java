package com.parizene.netmonitor.ui.test;

/* compiled from: TestFragmentPermissionsDispatcher.java */
/* loaded from: classes3.dex */
final class e {
    private static final String[] a = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    static void a(d dVar, int i2, int[] iArr) {
        if (i2 == 10 && l.a.b.e(iArr)) {
            dVar.N2();
        }
    }

    static void b(d dVar) {
        androidx.fragment.app.d dVarK2 = dVar.k2();
        String[] strArr = a;
        if (l.a.b.b(dVarK2, strArr)) {
            dVar.N2();
        } else {
            dVar.j2(strArr, 10);
        }
    }
}