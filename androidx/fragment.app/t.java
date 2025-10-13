package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
class t {
    private final ArrayList<Fragment> a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, s> f1087b = new HashMap<>();

    t() {
    }

    void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.p = true;
    }

    void b() {
        this.f1087b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f1087b.containsKey(str);
    }

    void d(int i2) {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            s sVar = this.f1087b.get(it.next().f977j);
            if (sVar != null) {
                sVar.q(i2);
            }
        }
        for (s sVar2 : this.f1087b.values()) {
            if (sVar2 != null) {
                sVar2.q(i2);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f1087b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (s sVar : this.f1087b.values()) {
                printWriter.print(str);
                if (sVar != null) {
                    Fragment fragmentI = sVar.i();
                    printWriter.println(fragmentI);
                    fragmentI.g0(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.a.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        s sVar = this.f1087b.get(str);
        if (sVar != null) {
            return sVar.i();
        }
        return null;
    }

    Fragment g(int i2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.A == i2) {
                return fragment;
            }
        }
        for (s sVar : this.f1087b.values()) {
            if (sVar != null) {
                Fragment fragmentI = sVar.i();
                if (fragmentI.A == i2) {
                    return fragmentI;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.C)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (s sVar : this.f1087b.values()) {
            if (sVar != null) {
                Fragment fragmentI = sVar.i();
                if (str.equals(fragmentI.C)) {
                    return fragmentI;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentI0;
        for (s sVar : this.f1087b.values()) {
            if (sVar != null && (fragmentI0 = sVar.i().i0(str)) != null) {
                return fragmentI0;
            }
        }
        return null;
    }

    Fragment j(Fragment fragment) {
        ViewGroup viewGroup = fragment.K;
        View view = fragment.L;
        if (viewGroup != null && view != null) {
            for (int iIndexOf = this.a.indexOf(fragment) - 1; iIndexOf >= 0; iIndexOf--) {
                Fragment fragment2 = this.a.get(iIndexOf);
                if (fragment2.K == viewGroup && fragment2.L != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    List<Fragment> k() {
        ArrayList arrayList = new ArrayList();
        for (s sVar : this.f1087b.values()) {
            if (sVar != null) {
                arrayList.add(sVar.i());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    s l(String str) {
        return this.f1087b.get(str);
    }

    List<Fragment> m() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    void n(s sVar) {
        this.f1087b.put(sVar.i().f977j, sVar);
    }

    void o(s sVar) {
        Fragment fragmentI = sVar.i();
        for (s sVar2 : this.f1087b.values()) {
            if (sVar2 != null) {
                Fragment fragmentI2 = sVar2.i();
                if (fragmentI.f977j.equals(fragmentI2.f980m)) {
                    fragmentI2.f979l = fragmentI;
                    fragmentI2.f980m = null;
                }
            }
        }
        this.f1087b.put(fragmentI.f977j, null);
        String str = fragmentI.f980m;
        if (str != null) {
            fragmentI.f979l = f(str);
        }
    }

    void p(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.p = false;
    }

    void q() {
        this.f1087b.clear();
    }

    void r(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (m.p0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    ArrayList<r> s() {
        ArrayList<r> arrayList = new ArrayList<>(this.f1087b.size());
        for (s sVar : this.f1087b.values()) {
            if (sVar != null) {
                Fragment fragmentI = sVar.i();
                r rVarO = sVar.o();
                arrayList.add(rVarO);
                if (m.p0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentI + ": " + rVarO.q);
                }
            }
        }
        return arrayList;
    }

    ArrayList<String> t() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.a.size());
            Iterator<Fragment> it = this.a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f977j);
                if (m.p0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f977j + "): " + next);
                }
            }
            return arrayList;
        }
    }
}