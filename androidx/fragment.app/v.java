package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
class v {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    private static final x f1107b;

    /* renamed from: c, reason: collision with root package name */
    private static final x f1108c;

    /* compiled from: FragmentTransition.java */
    static class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f1109e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f1110f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.h.h.a f1111g;

        a(g gVar, Fragment fragment, c.h.h.a aVar) {
            this.f1109e = gVar;
            this.f1110f = fragment;
            this.f1111g = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1109e.a(this.f1110f, this.f1111g);
        }
    }

    /* compiled from: FragmentTransition.java */
    static class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f1112e;

        b(ArrayList arrayList) {
            this.f1112e = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.A(this.f1112e, 4);
        }
    }

    /* compiled from: FragmentTransition.java */
    static class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f1113e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f1114f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.h.h.a f1115g;

        c(g gVar, Fragment fragment, c.h.h.a aVar) {
            this.f1113e = gVar;
            this.f1114f = fragment;
            this.f1115g = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1113e.a(this.f1114f, this.f1115g);
        }
    }

    /* compiled from: FragmentTransition.java */
    static class d implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f1116e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x f1117f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f1118g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Fragment f1119h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ArrayList f1120i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f1121j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ArrayList f1122k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Object f1123l;

        d(Object obj, x xVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1116e = obj;
            this.f1117f = xVar;
            this.f1118g = view;
            this.f1119h = fragment;
            this.f1120i = arrayList;
            this.f1121j = arrayList2;
            this.f1122k = arrayList3;
            this.f1123l = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f1116e;
            if (obj != null) {
                this.f1117f.p(obj, this.f1118g);
                this.f1121j.addAll(v.k(this.f1117f, this.f1116e, this.f1119h, this.f1120i, this.f1118g));
            }
            if (this.f1122k != null) {
                if (this.f1123l != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f1118g);
                    this.f1117f.q(this.f1123l, this.f1122k, arrayList);
                }
                this.f1122k.clear();
                this.f1122k.add(this.f1118g);
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    static class e implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Fragment f1124e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f1125f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f1126g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c.e.a f1127h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ View f1128i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ x f1129j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Rect f1130k;

        e(Fragment fragment, Fragment fragment2, boolean z, c.e.a aVar, View view, x xVar, Rect rect) {
            this.f1124e = fragment;
            this.f1125f = fragment2;
            this.f1126g = z;
            this.f1127h = aVar;
            this.f1128i = view;
            this.f1129j = xVar;
            this.f1130k = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.f(this.f1124e, this.f1125f, this.f1126g, this.f1127h, false);
            View view = this.f1128i;
            if (view != null) {
                this.f1129j.k(view, this.f1130k);
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    static class f implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ x f1131e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.e.a f1132f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f1133g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f1134h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ArrayList f1135i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ View f1136j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Fragment f1137k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Fragment f1138l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f1139m;
        final /* synthetic */ ArrayList n;
        final /* synthetic */ Object o;
        final /* synthetic */ Rect p;

        f(x xVar, c.e.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1131e = xVar;
            this.f1132f = aVar;
            this.f1133g = obj;
            this.f1134h = hVar;
            this.f1135i = arrayList;
            this.f1136j = view;
            this.f1137k = fragment;
            this.f1138l = fragment2;
            this.f1139m = z;
            this.n = arrayList2;
            this.o = obj2;
            this.p = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.e.a<String, View> aVarH = v.h(this.f1131e, this.f1132f, this.f1133g, this.f1134h);
            if (aVarH != null) {
                this.f1135i.addAll(aVarH.values());
                this.f1135i.add(this.f1136j);
            }
            v.f(this.f1137k, this.f1138l, this.f1139m, aVarH, false);
            Object obj = this.f1133g;
            if (obj != null) {
                this.f1131e.A(obj, this.n, this.f1135i);
                View viewS = v.s(aVarH, this.f1134h, this.o, this.f1139m);
                if (viewS != null) {
                    this.f1131e.k(viewS, this.p);
                }
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    interface g {
        void a(Fragment fragment, c.h.h.a aVar);

        void b(Fragment fragment, c.h.h.a aVar);
    }

    /* compiled from: FragmentTransition.java */
    static class h {
        public Fragment a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1140b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f1141c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f1142d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1143e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f1144f;

        h() {
        }
    }

    static {
        f1107b = Build.VERSION.SDK_INT >= 21 ? new w() : null;
        f1108c = w();
    }

    static void A(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    static void B(m mVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z, g gVar) {
        if (mVar.o < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(mVar.p.e());
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = sparseArray.keyAt(i5);
                c.e.a<String, String> aVarD = d(iKeyAt, arrayList, arrayList2, i2, i3);
                h hVar = (h) sparseArray.valueAt(i5);
                if (z) {
                    o(mVar, iKeyAt, hVar, view, aVarD, gVar);
                } else {
                    n(mVar, iKeyAt, hVar, view, aVarD, gVar);
                }
            }
        }
    }

    static boolean C() {
        return (f1107b == null && f1108c == null) ? false : true;
    }

    private static void a(ArrayList<View> arrayList, c.e.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewM = aVar.m(size);
            if (collection.contains(c.h.l.t.I(viewM))) {
                arrayList.add(viewM);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.u.a r9, android.util.SparseArray<androidx.fragment.app.v.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.v.b(androidx.fragment.app.a, androidx.fragment.app.u$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.f1089c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(aVar, aVar.f1089c.get(i2), sparseArray, false, z);
        }
    }

    private static c.e.a<String, String> d(int i2, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        c.e.a<String, String> aVar = new c.e.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i5);
            if (aVar2.F(i2)) {
                boolean zBooleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = aVar2.p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.p;
                        arrayList4 = aVar2.q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.p;
                        arrayList3 = aVar2.q;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        if (aVar.t.q.c()) {
            for (int size = aVar.f1089c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f1089c.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, c.e.a<String, View> aVar, boolean z2) {
        if ((z ? fragment2.s0() : fragment.s0()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(aVar.i(i2));
                arrayList.add(aVar.m(i2));
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    private static boolean g(x xVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!xVar.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    static c.e.a<String, View> h(x xVar, c.e.a<String, String> aVar, Object obj, h hVar) {
        androidx.core.app.n nVarS0;
        ArrayList<String> arrayList;
        Fragment fragment = hVar.a;
        View viewQ0 = fragment.Q0();
        if (aVar.isEmpty() || obj == null || viewQ0 == null) {
            aVar.clear();
            return null;
        }
        c.e.a<String, View> aVar2 = new c.e.a<>();
        xVar.j(aVar2, viewQ0);
        androidx.fragment.app.a aVar3 = hVar.f1141c;
        if (hVar.f1140b) {
            nVarS0 = fragment.u0();
            arrayList = aVar3.p;
        } else {
            nVarS0 = fragment.s0();
            arrayList = aVar3.q;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
            aVar2.o(aVar.values());
        }
        if (nVarS0 != null) {
            throw null;
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static c.e.a<String, View> i(x xVar, c.e.a<String, String> aVar, Object obj, h hVar) {
        androidx.core.app.n nVarU0;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f1142d;
        c.e.a<String, View> aVar2 = new c.e.a<>();
        xVar.j(aVar2, fragment.n2());
        androidx.fragment.app.a aVar3 = hVar.f1144f;
        if (hVar.f1143e) {
            nVarU0 = fragment.s0();
            arrayList = aVar3.q;
        } else {
            nVarU0 = fragment.u0();
            arrayList = aVar3.p;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
        }
        if (nVarU0 != null) {
            throw null;
        }
        aVar.o(aVar2.keySet());
        return aVar2;
    }

    private static x j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object objT0 = fragment.t0();
            if (objT0 != null) {
                arrayList.add(objT0);
            }
            Object objH0 = fragment.H0();
            if (objH0 != null) {
                arrayList.add(objH0);
            }
            Object objJ0 = fragment.J0();
            if (objJ0 != null) {
                arrayList.add(objJ0);
            }
        }
        if (fragment2 != null) {
            Object objR0 = fragment2.r0();
            if (objR0 != null) {
                arrayList.add(objR0);
            }
            Object objE0 = fragment2.E0();
            if (objE0 != null) {
                arrayList.add(objE0);
            }
            Object objI0 = fragment2.I0();
            if (objI0 != null) {
                arrayList.add(objI0);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        x xVar = f1107b;
        if (xVar != null && g(xVar, arrayList)) {
            return xVar;
        }
        x xVar2 = f1108c;
        if (xVar2 != null && g(xVar2, arrayList)) {
            return xVar2;
        }
        if (xVar == null && xVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(x xVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewQ0 = fragment.Q0();
        if (viewQ0 != null) {
            xVar.f(arrayList2, viewQ0);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        xVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(x xVar, ViewGroup viewGroup, View view, c.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objT;
        c.e.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.f1142d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f1140b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            objT = null;
        } else {
            objT = t(xVar, fragment, fragment2, z);
            aVar2 = aVar;
        }
        c.e.a<String, View> aVarI = i(xVar, aVar2, objT, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            xVar.z(obj3, view, arrayList);
            z(xVar, obj3, obj2, aVarI, hVar.f1143e, hVar.f1144f);
            if (obj != null) {
                xVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        c.h.l.q.a(viewGroup, new f(xVar, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(x xVar, ViewGroup viewGroup, View view, c.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.f1142d;
        if (fragment != null) {
            fragment.n2().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f1140b;
        Object objT = aVar.isEmpty() ? null : t(xVar, fragment, fragment2, z);
        c.e.a<String, View> aVarI = i(xVar, aVar, objT, hVar);
        c.e.a<String, View> aVarH = h(xVar, aVar, objT, hVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            xVar.z(obj3, view, arrayList);
            z(xVar, obj3, obj2, aVarI, hVar.f1143e, hVar.f1144f);
            Rect rect2 = new Rect();
            View viewS = s(aVarH, hVar, obj, z);
            if (viewS != null) {
                xVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewS;
        } else {
            view2 = null;
            rect = null;
        }
        c.h.l.q.a(viewGroup, new e(fragment, fragment2, z, aVarH, view2, xVar, rect));
        return obj3;
    }

    private static void n(m mVar, int i2, h hVar, View view, c.e.a<String, String> aVar, g gVar) {
        Fragment fragment;
        Fragment fragment2;
        x xVarJ;
        Object obj;
        ViewGroup viewGroup = mVar.q.c() ? (ViewGroup) mVar.q.b(i2) : null;
        if (viewGroup == null || (xVarJ = j((fragment2 = hVar.f1142d), (fragment = hVar.a))) == null) {
            return;
        }
        boolean z = hVar.f1140b;
        boolean z2 = hVar.f1143e;
        Object objQ = q(xVarJ, fragment, z);
        Object objR = r(xVarJ, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objL = l(xVarJ, viewGroup, view, aVar, hVar, arrayList, arrayList2, objQ, objR);
        if (objQ == null && objL == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(xVarJ, obj, fragment2, arrayList, view);
        Object obj2 = (arrayListK == null || arrayListK.isEmpty()) ? null : obj;
        xVarJ.a(objQ, view);
        Object objU = u(xVarJ, objQ, obj2, objL, fragment, hVar.f1140b);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList.size() > 0)) {
            c.h.h.a aVar2 = new c.h.h.a();
            gVar.b(fragment2, aVar2);
            xVarJ.w(fragment2, objU, aVar2, new c(gVar, fragment2, aVar2));
        }
        if (objU != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            xVarJ.t(objU, objQ, arrayList3, obj2, arrayListK, objL, arrayList2);
            y(xVarJ, viewGroup, fragment, view, arrayList2, objQ, arrayList3, obj2, arrayListK);
            xVarJ.x(viewGroup, arrayList2, aVar);
            xVarJ.c(viewGroup, objU);
            xVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(m mVar, int i2, h hVar, View view, c.e.a<String, String> aVar, g gVar) {
        Fragment fragment;
        Fragment fragment2;
        x xVarJ;
        Object obj;
        ViewGroup viewGroup = mVar.q.c() ? (ViewGroup) mVar.q.b(i2) : null;
        if (viewGroup == null || (xVarJ = j((fragment2 = hVar.f1142d), (fragment = hVar.a))) == null) {
            return;
        }
        boolean z = hVar.f1140b;
        boolean z2 = hVar.f1143e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objQ = q(xVarJ, fragment, z);
        Object objR = r(xVarJ, fragment2, z2);
        Object objM = m(xVarJ, viewGroup, view, aVar, hVar, arrayList2, arrayList, objQ, objR);
        if (objQ == null && objM == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(xVarJ, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListK2 = k(xVarJ, objQ, fragment, arrayList, view);
        A(arrayListK2, 4);
        Object objU = u(xVarJ, objQ, obj, objM, fragment, z);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList2.size() > 0)) {
            c.h.h.a aVar2 = new c.h.h.a();
            gVar.b(fragment2, aVar2);
            xVarJ.w(fragment2, objU, aVar2, new a(gVar, fragment2, aVar2));
        }
        if (objU != null) {
            v(xVarJ, obj, fragment2, arrayListK);
            ArrayList<String> arrayListO = xVarJ.o(arrayList);
            xVarJ.t(objU, objQ, arrayListK2, obj, arrayListK, objM, arrayList);
            xVarJ.c(viewGroup, objU);
            xVarJ.y(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            A(arrayListK2, 0);
            xVarJ.A(objM, arrayList2, arrayList);
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i2) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i2, hVar2);
        return hVar2;
    }

    private static Object q(x xVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return xVar.g(z ? fragment.E0() : fragment.r0());
    }

    private static Object r(x xVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return xVar.g(z ? fragment.H0() : fragment.t0());
    }

    static View s(c.e.a<String, View> aVar, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = hVar.f1141c;
        if (obj == null || aVar == null || (arrayList = aVar2.p) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get(z ? aVar2.p.get(0) : aVar2.q.get(0));
    }

    private static Object t(x xVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return xVar.B(xVar.g(z ? fragment2.J0() : fragment.I0()));
    }

    private static Object u(x xVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.l0() : fragment.k0() ? xVar.n(obj2, obj, obj3) : xVar.m(obj2, obj, obj3);
    }

    private static void v(x xVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.p && fragment.D && fragment.R) {
            fragment.u2(true);
            xVar.r(obj, fragment.Q0(), arrayList);
            c.h.l.q.a(fragment.K, new b(arrayList));
        }
    }

    private static x w() {
        try {
            return (x) Class.forName("c.s.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void x(c.e.a<String, String> aVar, c.e.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void y(x xVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        c.h.l.q.a(viewGroup, new d(obj, xVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(x xVar, Object obj, Object obj2, c.e.a<String, View> aVar, boolean z, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get(z ? aVar2.q.get(0) : aVar2.p.get(0));
        xVar.v(obj, view);
        if (obj2 != null) {
            xVar.v(obj2, view);
        }
    }
}