package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    Context f221e;

    /* renamed from: f, reason: collision with root package name */
    LayoutInflater f222f;

    /* renamed from: g, reason: collision with root package name */
    g f223g;

    /* renamed from: h, reason: collision with root package name */
    ExpandedMenuView f224h;

    /* renamed from: i, reason: collision with root package name */
    int f225i;

    /* renamed from: j, reason: collision with root package name */
    int f226j;

    /* renamed from: k, reason: collision with root package name */
    int f227k;

    /* renamed from: l, reason: collision with root package name */
    private m.a f228l;

    /* renamed from: m, reason: collision with root package name */
    a f229m;

    /* compiled from: ListMenuPresenter.java */
    private class a extends BaseAdapter {

        /* renamed from: e, reason: collision with root package name */
        private int f230e = -1;

        public a() {
            a();
        }

        void a() {
            i iVarV = e.this.f223g.v();
            if (iVarV != null) {
                ArrayList<i> arrayListZ = e.this.f223g.z();
                int size = arrayListZ.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayListZ.get(i2) == iVarV) {
                        this.f230e = i2;
                        return;
                    }
                }
            }
            this.f230e = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i getItem(int i2) {
            ArrayList<i> arrayListZ = e.this.f223g.z();
            int i3 = i2 + e.this.f225i;
            int i4 = this.f230e;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayListZ.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f223g.z().size() - e.this.f225i;
            return this.f230e < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f222f.inflate(eVar.f227k, viewGroup, false);
            }
            ((n.a) view).e(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i2) {
        this(i2, 0);
        this.f221e = context;
        this.f222f = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f229m == null) {
            this.f229m = new a();
        }
        return this.f229m;
    }

    public n b(ViewGroup viewGroup) {
        if (this.f224h == null) {
            this.f224h = (ExpandedMenuView) this.f222f.inflate(c.a.g.f2500g, viewGroup, false);
            if (this.f229m == null) {
                this.f229m = new a();
            }
            this.f224h.setAdapter((ListAdapter) this.f229m);
            this.f224h.setOnItemClickListener(this);
        }
        return this.f224h;
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z) {
        m.a aVar = this.f228l;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z) {
        a aVar = this.f229m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f228l = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(Context context, g gVar) {
        if (this.f226j != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f226j);
            this.f221e = contextThemeWrapper;
            this.f222f = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f221e != null) {
            this.f221e = context;
            if (this.f222f == null) {
                this.f222f = LayoutInflater.from(context);
            }
        }
        this.f223g = gVar;
        a aVar = this.f229m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).b(null);
        m.a aVar = this.f228l;
        if (aVar == null) {
            return true;
        }
        aVar.d(rVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f223g.M(this.f229m.getItem(i2), this, 0);
    }

    public e(int i2, int i3) {
        this.f227k = i2;
        this.f226j = i3;
    }
}