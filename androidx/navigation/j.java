package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: NavDestination.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap<String, Class<?>> f1319e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final String f1320f;

    /* renamed from: g, reason: collision with root package name */
    private k f1321g;

    /* renamed from: h, reason: collision with root package name */
    private int f1322h;

    /* renamed from: i, reason: collision with root package name */
    private String f1323i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f1324j;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<h> f1325k;

    /* renamed from: l, reason: collision with root package name */
    private c.e.h<c> f1326l;

    /* renamed from: m, reason: collision with root package name */
    private HashMap<String, d> f1327m;

    /* compiled from: NavDestination.java */
    static class a implements Comparable<a> {

        /* renamed from: e, reason: collision with root package name */
        private final j f1328e;

        /* renamed from: f, reason: collision with root package name */
        private final Bundle f1329f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1330g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f1331h;

        /* renamed from: i, reason: collision with root package name */
        private final int f1332i;

        a(j jVar, Bundle bundle, boolean z, boolean z2, int i2) {
            this.f1328e = jVar;
            this.f1329f = bundle;
            this.f1330g = z;
            this.f1331h = z2;
            this.f1332i = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            boolean z = this.f1330g;
            if (z && !aVar.f1330g) {
                return 1;
            }
            if (!z && aVar.f1330g) {
                return -1;
            }
            Bundle bundle = this.f1329f;
            if (bundle != null && aVar.f1329f == null) {
                return 1;
            }
            if (bundle == null && aVar.f1329f != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f1329f.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f1331h;
            if (z2 && !aVar.f1331h) {
                return 1;
            }
            if (z2 || !aVar.f1331h) {
                return this.f1332i - aVar.f1332i;
            }
            return -1;
        }

        j b() {
            return this.f1328e;
        }

        Bundle c() {
            return this.f1329f;
        }
    }

    public j(r<? extends j> rVar) {
        this(s.c(rVar.getClass()));
    }

    static String m(Context context, int i2) {
        if (i2 <= 16777215) {
            return Integer.toString(i2);
        }
        try {
            return context.getResources().getResourceName(i2);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i2);
        }
    }

    public final void a(String str, d dVar) {
        if (this.f1327m == null) {
            this.f1327m = new HashMap<>();
        }
        this.f1327m.put(str, dVar);
    }

    public final void c(h hVar) {
        if (this.f1325k == null) {
            this.f1325k = new ArrayList<>();
        }
        this.f1325k.add(hVar);
    }

    Bundle e(Bundle bundle) {
        HashMap<String, d> map;
        if (bundle == null && ((map = this.f1327m) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, d> map2 = this.f1327m;
        if (map2 != null) {
            for (Map.Entry<String, d> entry : map2.entrySet()) {
                entry.getValue().c(entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, d> map3 = this.f1327m;
            if (map3 != null) {
                for (Map.Entry<String, d> entry2 : map3.entrySet()) {
                    if (!entry2.getValue().d(entry2.getKey(), bundle2)) {
                        throw new IllegalArgumentException("Wrong argument type for '" + entry2.getKey() + "' in argument bundle. " + entry2.getValue().a().c() + " expected.");
                    }
                }
            }
        }
        return bundle2;
    }

    int[] f() {
        ArrayDeque arrayDeque = new ArrayDeque();
        j jVar = this;
        while (true) {
            k kVarP = jVar.p();
            if (kVarP == null || kVarP.I() != jVar.n()) {
                arrayDeque.addFirst(jVar);
            }
            if (kVarP == null) {
                break;
            }
            jVar = kVarP;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i2 = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i2] = ((j) it.next()).n();
            i2++;
        }
        return iArr;
    }

    public final c h(int i2) {
        c.e.h<c> hVar = this.f1326l;
        c cVarF = hVar == null ? null : hVar.f(i2);
        if (cVarF != null) {
            return cVarF;
        }
        if (p() != null) {
            return p().h(i2);
        }
        return null;
    }

    public final Map<String, d> k() {
        HashMap<String, d> map = this.f1327m;
        return map == null ? Collections.emptyMap() : Collections.unmodifiableMap(map);
    }

    public String l() {
        if (this.f1323i == null) {
            this.f1323i = Integer.toString(this.f1322h);
        }
        return this.f1323i;
    }

    public final int n() {
        return this.f1322h;
    }

    public final String o() {
        return this.f1320f;
    }

    public final k p() {
        return this.f1321g;
    }

    a r(i iVar) {
        ArrayList<h> arrayList = this.f1325k;
        if (arrayList == null) {
            return null;
        }
        Iterator<h> it = arrayList.iterator();
        a aVar = null;
        while (it.hasNext()) {
            h next = it.next();
            Uri uriC = iVar.c();
            Bundle bundleC = uriC != null ? next.c(uriC, k()) : null;
            String strA = iVar.a();
            boolean z = strA != null && strA.equals(next.b());
            String strB = iVar.b();
            int iD = strB != null ? next.d(strB) : -1;
            if (bundleC != null || z || iD > -1) {
                a aVar2 = new a(this, bundleC, next.e(), z, iD);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    public void t(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.v.a.A);
        w(typedArrayObtainAttributes.getResourceId(androidx.navigation.v.a.C, 0));
        this.f1323i = m(context, this.f1322h);
        x(typedArrayObtainAttributes.getText(androidx.navigation.v.a.B));
        typedArrayObtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f1323i;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f1322h));
        } else {
            sb.append(str);
        }
        sb.append(")");
        if (this.f1324j != null) {
            sb.append(" label=");
            sb.append(this.f1324j);
        }
        return sb.toString();
    }

    public final void u(int i2, c cVar) {
        if (z()) {
            if (i2 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            if (this.f1326l == null) {
                this.f1326l = new c.e.h<>();
            }
            this.f1326l.k(i2, cVar);
            return;
        }
        throw new UnsupportedOperationException("Cannot add action " + i2 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void w(int i2) {
        this.f1322h = i2;
        this.f1323i = null;
    }

    public final void x(CharSequence charSequence) {
        this.f1324j = charSequence;
    }

    final void y(k kVar) {
        this.f1321g = kVar;
    }

    boolean z() {
        return true;
    }

    public j(String str) {
        this.f1320f = str;
    }
}