package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransitionImpl.java */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class x {

    /* compiled from: FragmentTransitionImpl.java */
    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1156e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f1157f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f1158g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ArrayList f1159h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ArrayList f1160i;

        a(int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1156e = i2;
            this.f1157f = arrayList;
            this.f1158g = arrayList2;
            this.f1159h = arrayList3;
            this.f1160i = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i2 = 0; i2 < this.f1156e; i2++) {
                c.h.l.t.A0((View) this.f1157f.get(i2), (String) this.f1158g.get(i2));
                c.h.l.t.A0((View) this.f1159h.get(i2), (String) this.f1160i.get(i2));
            }
        }
    }

    /* compiled from: FragmentTransitionImpl.java */
    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f1162e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f1163f;

        b(ArrayList arrayList, Map map) {
            this.f1162e = arrayList;
            this.f1163f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1162e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f1162e.get(i2);
                String strI = c.h.l.t.I(view);
                if (strI != null) {
                    c.h.l.t.A0(view, x.i(this.f1163f, strI));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionImpl.java */
    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f1165e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f1166f;

        c(ArrayList arrayList, Map map) {
            this.f1165e = arrayList;
            this.f1166f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1165e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f1165e.get(i2);
                c.h.l.t.A0(view, (String) this.f1166f.get(c.h.l.t.I(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (c.h.l.v.a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                f(arrayList, viewGroup.getChildAt(i2));
            }
        }
    }

    public abstract Object g(Object obj);

    void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String strI = c.h.l.t.I(view);
            if (strI != null) {
                map.put(strI, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    j(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(c.h.l.t.I(view));
            c.h.l.t.A0(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        c.h.l.q.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(Fragment fragment, Object obj, c.h.h.a aVar, Runnable runnable) {
        runnable.run();
    }

    void x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        c.h.l.q.a(view, new b(arrayList, map));
    }

    void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String strI = c.h.l.t.I(view2);
            arrayList4.add(strI);
            if (strI != null) {
                c.h.l.t.A0(view2, null);
                String str = map.get(strI);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i3))) {
                        c.h.l.t.A0(arrayList2.get(i3), strI);
                        break;
                    }
                    i3++;
                }
            }
        }
        c.h.l.q.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}