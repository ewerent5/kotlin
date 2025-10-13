package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.a0;
import androidx.lifecycle.g;
import androidx.navigation.j;
import androidx.navigation.o;
import androidx.navigation.r;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class NavController {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f1244b;

    /* renamed from: c, reason: collision with root package name */
    private n f1245c;

    /* renamed from: d, reason: collision with root package name */
    k f1246d;

    /* renamed from: e, reason: collision with root package name */
    private Bundle f1247e;

    /* renamed from: f, reason: collision with root package name */
    private Parcelable[] f1248f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1249g;

    /* renamed from: i, reason: collision with root package name */
    private androidx.lifecycle.k f1251i;

    /* renamed from: j, reason: collision with root package name */
    private g f1252j;

    /* renamed from: h, reason: collision with root package name */
    final Deque<e> f1250h = new ArrayDeque();

    /* renamed from: k, reason: collision with root package name */
    private s f1253k = new s();

    /* renamed from: l, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f1254l = new CopyOnWriteArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    private final androidx.lifecycle.j f1255m = new androidx.lifecycle.i() { // from class: androidx.navigation.NavController.1
        @Override // androidx.lifecycle.i
        public void c(androidx.lifecycle.k kVar, g.b bVar) {
            NavController navController = NavController.this;
            if (navController.f1246d != null) {
                Iterator<e> it = navController.f1250h.iterator();
                while (it.hasNext()) {
                    it.next().e(bVar);
                }
            }
        }
    };
    private final androidx.activity.b n = new a(false);
    private boolean o = true;

    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            NavController.this.q();
        }
    }

    public interface b {
        void a(NavController navController, j jVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof Activity) {
                this.f1244b = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        s sVar = this.f1253k;
        sVar.a(new l(sVar));
        this.f1253k.a(new androidx.navigation.a(this.a));
    }

    private void C() {
        this.n.f(this.o && g() > 1);
    }

    private boolean a() {
        while (!this.f1250h.isEmpty() && (this.f1250h.peekLast().b() instanceof k) && s(this.f1250h.peekLast().b().n(), true)) {
        }
        if (this.f1250h.isEmpty()) {
            return false;
        }
        j jVarB = this.f1250h.peekLast().b();
        j jVarP = null;
        if (jVarB instanceof androidx.navigation.b) {
            Iterator<e> itDescendingIterator = this.f1250h.descendingIterator();
            while (true) {
                if (!itDescendingIterator.hasNext()) {
                    break;
                }
                j jVarB2 = itDescendingIterator.next().b();
                if (!(jVarB2 instanceof k) && !(jVarB2 instanceof androidx.navigation.b)) {
                    jVarP = jVarB2;
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        Iterator<e> itDescendingIterator2 = this.f1250h.descendingIterator();
        while (itDescendingIterator2.hasNext()) {
            e next = itDescendingIterator2.next();
            g.c cVarC = next.c();
            j jVarB3 = next.b();
            if (jVarB != null && jVarB3.n() == jVarB.n()) {
                g.c cVar = g.c.RESUMED;
                if (cVarC != cVar) {
                    map.put(next, cVar);
                }
                jVarB = jVarB.p();
            } else if (jVarP == null || jVarB3.n() != jVarP.n()) {
                next.h(g.c.CREATED);
            } else {
                if (cVarC == g.c.RESUMED) {
                    next.h(g.c.STARTED);
                } else {
                    g.c cVar2 = g.c.STARTED;
                    if (cVarC != cVar2) {
                        map.put(next, cVar2);
                    }
                }
                jVarP = jVarP.p();
            }
        }
        for (e eVar : this.f1250h) {
            g.c cVar3 = (g.c) map.get(eVar);
            if (cVar3 != null) {
                eVar.h(cVar3);
            } else {
                eVar.j();
            }
        }
        e eVarPeekLast = this.f1250h.peekLast();
        Iterator<b> it = this.f1254l.iterator();
        while (it.hasNext()) {
            it.next().a(this, eVarPeekLast.b(), eVarPeekLast.a());
        }
        return true;
    }

    private String d(int[] iArr) {
        k kVar;
        k kVar2 = this.f1246d;
        int i2 = 0;
        while (true) {
            j jVarF = null;
            if (i2 >= iArr.length) {
                return null;
            }
            int i3 = iArr[i2];
            if (i2 != 0) {
                jVarF = kVar2.F(i3);
            } else if (this.f1246d.n() == i3) {
                jVarF = this.f1246d;
            }
            if (jVarF == null) {
                return j.m(this.a, i3);
            }
            if (i2 != iArr.length - 1) {
                while (true) {
                    kVar = (k) jVarF;
                    if (!(kVar.F(kVar.I()) instanceof k)) {
                        break;
                    }
                    jVarF = kVar.F(kVar.I());
                }
                kVar2 = kVar;
            }
            i2++;
        }
    }

    private int g() {
        Iterator<e> it = this.f1250h.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (!(it.next().b() instanceof k)) {
                i2++;
            }
        }
        return i2;
    }

    private void o(j jVar, Bundle bundle, o oVar, r.a aVar) {
        boolean z = false;
        boolean zS = (oVar == null || oVar.e() == -1) ? false : s(oVar.e(), oVar.f());
        r rVarE = this.f1253k.e(jVar.o());
        Bundle bundleE = jVar.e(bundle);
        j jVarB = rVarE.b(jVar, bundleE, oVar, aVar);
        if (jVarB != null) {
            if (!(jVarB instanceof androidx.navigation.b)) {
                while (!this.f1250h.isEmpty() && (this.f1250h.peekLast().b() instanceof androidx.navigation.b) && s(this.f1250h.peekLast().b().n(), true)) {
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            if (jVar instanceof k) {
                j jVar2 = jVarB;
                while (true) {
                    k kVarP = jVar2.p();
                    if (kVarP != null) {
                        arrayDeque.addFirst(new e(this.a, kVarP, bundleE, this.f1251i, this.f1252j));
                        if (!this.f1250h.isEmpty() && this.f1250h.getLast().b() == kVarP) {
                            s(kVarP.n(), true);
                        }
                    }
                    if (kVarP == null || kVarP == jVar) {
                        break;
                    } else {
                        jVar2 = kVarP;
                    }
                }
            }
            j jVarB2 = arrayDeque.isEmpty() ? jVarB : ((e) arrayDeque.getFirst()).b();
            while (jVarB2 != null && c(jVarB2.n()) == null) {
                jVarB2 = jVarB2.p();
                if (jVarB2 != null) {
                    arrayDeque.addFirst(new e(this.a, jVarB2, bundleE, this.f1251i, this.f1252j));
                }
            }
            j jVarB3 = arrayDeque.isEmpty() ? jVarB : ((e) arrayDeque.getLast()).b();
            while (!this.f1250h.isEmpty() && (this.f1250h.getLast().b() instanceof k) && ((k) this.f1250h.getLast().b()).G(jVarB3.n(), false) == null && s(this.f1250h.getLast().b().n(), true)) {
            }
            this.f1250h.addAll(arrayDeque);
            if (this.f1250h.isEmpty() || this.f1250h.getFirst().b() != this.f1246d) {
                this.f1250h.addFirst(new e(this.a, this.f1246d, bundleE, this.f1251i, this.f1252j));
            }
            this.f1250h.add(new e(this.a, jVarB, jVarB.e(bundleE), this.f1251i, this.f1252j));
        } else if (oVar != null && oVar.g()) {
            e eVarPeekLast = this.f1250h.peekLast();
            if (eVarPeekLast != null) {
                eVarPeekLast.f(bundleE);
            }
            z = true;
        }
        C();
        if (zS || jVarB != null || z) {
            a();
        }
    }

    private void p(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f1247e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                r rVarE = this.f1253k.e(next);
                Bundle bundle3 = this.f1247e.getBundle(next);
                if (bundle3 != null) {
                    rVarE.c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f1248f;
        boolean z = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                f fVar = (f) parcelable;
                j jVarC = c(fVar.b());
                if (jVarC == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + j.m(this.a, fVar.b()) + " cannot be found from the current destination " + f());
                }
                Bundle bundleA = fVar.a();
                if (bundleA != null) {
                    bundleA.setClassLoader(this.a.getClassLoader());
                }
                this.f1250h.add(new e(this.a, jVarC, bundleA, this.f1251i, this.f1252j, fVar.d(), fVar.c()));
            }
            C();
            this.f1248f = null;
        }
        if (this.f1246d == null || !this.f1250h.isEmpty()) {
            a();
            return;
        }
        if (!this.f1249g && (activity = this.f1244b) != null && j(activity.getIntent())) {
            z = true;
        }
        if (z) {
            return;
        }
        o(this.f1246d, bundle, null, null);
    }

    void A(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.f1251i == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.n.d();
        onBackPressedDispatcher.a(this.f1251i, this.n);
        this.f1251i.i().c(this.f1255m);
        this.f1251i.i().a(this.f1255m);
    }

    void B(a0 a0Var) {
        if (this.f1252j == g.g(a0Var)) {
            return;
        }
        if (!this.f1250h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.f1252j = g.g(a0Var);
    }

    void b(boolean z) {
        this.o = z;
        C();
    }

    j c(int i2) {
        k kVar = this.f1246d;
        if (kVar == null) {
            return null;
        }
        if (kVar.n() == i2) {
            return this.f1246d;
        }
        k kVarB = this.f1250h.isEmpty() ? this.f1246d : this.f1250h.getLast().b();
        return (kVarB instanceof k ? kVarB : kVarB.p()).F(i2);
    }

    public e e() {
        if (this.f1250h.isEmpty()) {
            return null;
        }
        return this.f1250h.getLast();
    }

    public j f() {
        e eVarE = e();
        if (eVarE != null) {
            return eVarE.b();
        }
        return null;
    }

    public n h() {
        if (this.f1245c == null) {
            this.f1245c = new n(this.a, this.f1253k);
        }
        return this.f1245c;
    }

    public s i() {
        return this.f1253k;
    }

    public boolean j(Intent intent) {
        j.a aVarR;
        k kVar;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if ((intArray == null || intArray.length == 0) && intent.getData() != null && (aVarR = this.f1246d.r(new i(intent))) != null) {
            j jVarB = aVarR.b();
            int[] iArrF = jVarB.f();
            bundle.putAll(jVarB.e(aVarR.c()));
            intArray = iArrF;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strD = d(intArray);
        if (strD != null) {
            Log.i("NavController", "Could not find destination " + strD + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i2 = 268435456 & flags;
        if (i2 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            androidx.core.app.o.h(this.a).c(intent).k();
            Activity activity = this.f1244b;
            if (activity != null) {
                activity.finish();
                this.f1244b.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i2 != 0) {
            if (!this.f1250h.isEmpty()) {
                s(this.f1246d.n(), true);
            }
            int i3 = 0;
            while (i3 < intArray.length) {
                int i4 = i3 + 1;
                int i5 = intArray[i3];
                j jVarC = c(i5);
                if (jVarC == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + j.m(this.a, i5) + " cannot be found from the current destination " + f());
                }
                o(jVarC, bundle, new o.a().b(0).c(0).a(), null);
                i3 = i4;
            }
            return true;
        }
        k kVar2 = this.f1246d;
        int i6 = 0;
        while (i6 < intArray.length) {
            int i7 = intArray[i6];
            j jVarF = i6 == 0 ? this.f1246d : kVar2.F(i7);
            if (jVarF == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + j.m(this.a, i7) + " cannot be found in graph " + kVar2);
            }
            if (i6 != intArray.length - 1) {
                while (true) {
                    kVar = (k) jVarF;
                    if (!(kVar.F(kVar.I()) instanceof k)) {
                        break;
                    }
                    jVarF = kVar.F(kVar.I());
                }
                kVar2 = kVar;
            } else {
                o(jVarF, jVarF.e(bundle), new o.a().g(this.f1246d.n(), true).b(0).c(0).a(), null);
            }
            i6++;
        }
        this.f1249g = true;
        return true;
    }

    public void k(int i2) {
        l(i2, null);
    }

    public void l(int i2, Bundle bundle) {
        m(i2, bundle, null);
    }

    public void m(int i2, Bundle bundle, o oVar) {
        n(i2, bundle, oVar, null);
    }

    public void n(int i2, Bundle bundle, o oVar, r.a aVar) {
        int iB;
        j jVarB = this.f1250h.isEmpty() ? this.f1246d : this.f1250h.getLast().b();
        if (jVarB == null) {
            throw new IllegalStateException("no current navigation node");
        }
        c cVarH = jVarB.h(i2);
        Bundle bundle2 = null;
        if (cVarH != null) {
            if (oVar == null) {
                oVar = cVarH.c();
            }
            iB = cVarH.b();
            Bundle bundleA = cVarH.a();
            if (bundleA != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundleA);
            }
        } else {
            iB = i2;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (iB == 0 && oVar != null && oVar.e() != -1) {
            r(oVar.e(), oVar.f());
            return;
        }
        if (iB == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        j jVarC = c(iB);
        if (jVarC != null) {
            o(jVarC, bundle2, oVar, aVar);
            return;
        }
        String strM = j.m(this.a, iB);
        if (cVarH == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strM + " cannot be found from the current destination " + jVarB);
        }
        throw new IllegalArgumentException("Navigation destination " + strM + " referenced from action " + j.m(this.a, i2) + " cannot be found from the current destination " + jVarB);
    }

    public boolean q() {
        if (this.f1250h.isEmpty()) {
            return false;
        }
        return r(f().n(), true);
    }

    public boolean r(int i2, boolean z) {
        return s(i2, z) && a();
    }

    boolean s(int i2, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f1250h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<e> itDescendingIterator = this.f1250h.descendingIterator();
        while (true) {
            if (!itDescendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            j jVarB = itDescendingIterator.next().b();
            r rVarE = this.f1253k.e(jVarB.o());
            if (z || jVarB.n() != i2) {
                arrayList.add(rVarE);
            }
            if (jVarB.n() == i2) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            Log.i("NavController", "Ignoring popBackStack to destination " + j.m(this.a, i2) + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((r) it.next()).e()) {
            e eVarRemoveLast = this.f1250h.removeLast();
            if (eVarRemoveLast.i().b().a(g.c.CREATED)) {
                eVarRemoveLast.h(g.c.DESTROYED);
            }
            g gVar = this.f1252j;
            if (gVar != null) {
                gVar.f(eVarRemoveLast.f1273j);
            }
            z3 = true;
        }
        C();
        return z3;
    }

    public void t(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.a.getClassLoader());
        this.f1247e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f1248f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f1249g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle u() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, r<? extends j>> entry : this.f1253k.f().entrySet()) {
            String key = entry.getKey();
            Bundle bundleD = entry.getValue().d();
            if (bundleD != null) {
                arrayList.add(key);
                bundle2.putBundle(key, bundleD);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.f1250h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f1250h.size()];
            int i2 = 0;
            Iterator<e> it = this.f1250h.iterator();
            while (it.hasNext()) {
                parcelableArr[i2] = new f(it.next());
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.f1249g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f1249g);
        }
        return bundle;
    }

    public void v(int i2) {
        w(i2, null);
    }

    public void w(int i2, Bundle bundle) {
        y(h().c(i2), bundle);
    }

    public void x(k kVar) {
        y(kVar, null);
    }

    public void y(k kVar, Bundle bundle) {
        k kVar2 = this.f1246d;
        if (kVar2 != null) {
            s(kVar2.n(), true);
        }
        this.f1246d = kVar;
        p(bundle);
    }

    void z(androidx.lifecycle.k kVar) {
        if (kVar == this.f1251i) {
            return;
        }
        this.f1251i = kVar;
        kVar.i().a(this.f1255m);
    }
}