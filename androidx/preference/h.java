package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PreferenceGroupAdapter.java */
/* loaded from: classes.dex */
public class h extends RecyclerView.g<l> implements Preference.c {

    /* renamed from: c, reason: collision with root package name */
    private PreferenceGroup f1417c;

    /* renamed from: d, reason: collision with root package name */
    private List<Preference> f1418d;

    /* renamed from: e, reason: collision with root package name */
    private List<Preference> f1419e;

    /* renamed from: f, reason: collision with root package name */
    private List<d> f1420f;

    /* renamed from: h, reason: collision with root package name */
    private Runnable f1422h = new a();

    /* renamed from: g, reason: collision with root package name */
    private Handler f1421g = new Handler();

    /* compiled from: PreferenceGroupAdapter.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.I();
        }
    }

    /* compiled from: PreferenceGroupAdapter.java */
    class b extends h.b {
        final /* synthetic */ List a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f1424b;

        b(List list, List list2, j.d dVar) {
            this.a = list;
            this.f1424b = list2;
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean a(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean b(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.h.b
        public int d() {
            return this.f1424b.size();
        }

        @Override // androidx.recyclerview.widget.h.b
        public int e() {
            return this.a.size();
        }
    }

    /* compiled from: PreferenceGroupAdapter.java */
    class c implements Preference.e {
        final /* synthetic */ PreferenceGroup a;

        c(PreferenceGroup preferenceGroup) {
            this.a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            this.a.P0(Integer.MAX_VALUE);
            h.this.a(preference);
            PreferenceGroup.b bVarI0 = this.a.I0();
            if (bVarI0 == null) {
                return true;
            }
            bVarI0.a();
            return true;
        }
    }

    /* compiled from: PreferenceGroupAdapter.java */
    private static class d {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1427b;

        /* renamed from: c, reason: collision with root package name */
        String f1428c;

        d(Preference preference) {
            this.f1428c = preference.getClass().getName();
            this.a = preference.r();
            this.f1427b = preference.E();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.f1427b == dVar.f1427b && TextUtils.equals(this.f1428c, dVar.f1428c);
        }

        public int hashCode() {
            return ((((527 + this.a) * 31) + this.f1427b) * 31) + this.f1428c.hashCode();
        }
    }

    public h(PreferenceGroup preferenceGroup) {
        this.f1417c = preferenceGroup;
        this.f1417c.s0(this);
        this.f1418d = new ArrayList();
        this.f1419e = new ArrayList();
        this.f1420f = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f1417c;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            z(((PreferenceScreen) preferenceGroup2).S0());
        } else {
            z(true);
        }
        I();
    }

    private androidx.preference.b B(PreferenceGroup preferenceGroup, List<Preference> list) {
        androidx.preference.b bVar = new androidx.preference.b(preferenceGroup.k(), list, preferenceGroup.o());
        bVar.t0(new c(preferenceGroup));
        return bVar;
    }

    private List<Preference> C(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iK0 = preferenceGroup.K0();
        int i2 = 0;
        for (int i3 = 0; i3 < iK0; i3++) {
            Preference preferenceJ0 = preferenceGroup.J0(i3);
            if (preferenceJ0.K()) {
                if (!F(preferenceGroup) || i2 < preferenceGroup.H0()) {
                    arrayList.add(preferenceJ0);
                } else {
                    arrayList2.add(preferenceJ0);
                }
                if (preferenceJ0 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceJ0;
                    if (!preferenceGroup2.L0()) {
                        continue;
                    } else {
                        if (F(preferenceGroup) && F(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : C(preferenceGroup2)) {
                            if (!F(preferenceGroup) || i2 < preferenceGroup.H0()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        if (F(preferenceGroup) && i2 > preferenceGroup.H0()) {
            arrayList.add(B(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void D(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.R0();
        int iK0 = preferenceGroup.K0();
        for (int i2 = 0; i2 < iK0; i2++) {
            Preference preferenceJ0 = preferenceGroup.J0(i2);
            list.add(preferenceJ0);
            d dVar = new d(preferenceJ0);
            if (!this.f1420f.contains(dVar)) {
                this.f1420f.add(dVar);
            }
            if (preferenceJ0 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceJ0;
                if (preferenceGroup2.L0()) {
                    D(list, preferenceGroup2);
                }
            }
            preferenceJ0.s0(this);
        }
    }

    private boolean F(PreferenceGroup preferenceGroup) {
        return preferenceGroup.H0() != Integer.MAX_VALUE;
    }

    public Preference E(int i2) {
        if (i2 < 0 || i2 >= e()) {
            return null;
        }
        return this.f1419e.get(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void q(l lVar, int i2) {
        E(i2).R(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public l s(ViewGroup viewGroup, int i2) {
        d dVar = this.f1420f.get(i2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, t.p);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(t.q);
        if (drawable == null) {
            drawable = c.a.k.a.a.d(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(dVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            c.h.l.t.n0(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i3 = dVar.f1427b;
            if (i3 != 0) {
                layoutInflaterFrom.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new l(viewInflate);
    }

    void I() {
        Iterator<Preference> it = this.f1418d.iterator();
        while (it.hasNext()) {
            it.next().s0(null);
        }
        ArrayList arrayList = new ArrayList(this.f1418d.size());
        this.f1418d = arrayList;
        D(arrayList, this.f1417c);
        List<Preference> list = this.f1419e;
        List<Preference> listC = C(this.f1417c);
        this.f1419e = listC;
        j jVarZ = this.f1417c.z();
        if (jVarZ == null || jVarZ.g() == null) {
            j();
        } else {
            androidx.recyclerview.widget.h.a(new b(list, listC, jVarZ.g())).e(this);
        }
        Iterator<Preference> it2 = this.f1418d.iterator();
        while (it2.hasNext()) {
            it2.next().c();
        }
    }

    @Override // androidx.preference.Preference.c
    public void a(Preference preference) {
        this.f1421g.removeCallbacks(this.f1422h);
        this.f1421g.post(this.f1422h);
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference) {
        int iIndexOf = this.f1419e.indexOf(preference);
        if (iIndexOf != -1) {
            k(iIndexOf, preference);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f1419e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long f(int i2) {
        if (i()) {
            return E(i2).o();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int g(int i2) {
        d dVar = new d(E(i2));
        int iIndexOf = this.f1420f.indexOf(dVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.f1420f.size();
        this.f1420f.add(dVar);
        return size;
    }
}