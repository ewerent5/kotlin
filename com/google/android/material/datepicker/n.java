package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes.dex */
class n extends RecyclerView.g<b> {

    /* renamed from: c */
    private final Context f11608c;

    /* renamed from: d */
    private final com.google.android.material.datepicker.a f11609d;

    /* renamed from: e */
    private final d<?> f11610e;

    /* renamed from: f */
    private final h.l f11611f;

    /* renamed from: g */
    private final int f11612g;

    /* compiled from: MonthsPagerAdapter.java */
    class a implements AdapterView.OnItemClickListener {

        /* renamed from: e */
        final /* synthetic */ MaterialCalendarGridView f11613e;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f11613e = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (this.f11613e.getAdapter().n(i2)) {
                n.this.f11611f.a(this.f11613e.getAdapter().getItem(i2).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    public static class b extends RecyclerView.d0 {
        final TextView x;
        final MaterialCalendarGridView y;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(e.c.b.c.f.s);
            this.x = textView;
            c.h.l.t.l0(textView, true);
            this.y = (MaterialCalendarGridView) linearLayout.findViewById(e.c.b.c.f.o);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    n(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, h.l lVar) {
        l lVarV = aVar.v();
        l lVarJ = aVar.j();
        l lVarS = aVar.s();
        if (lVarV.compareTo(lVarS) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (lVarS.compareTo(lVarJ) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int iX2 = m.f11602e * h.X2(context);
        int iX22 = i.i3(context) ? h.X2(context) : 0;
        this.f11608c = context;
        this.f11612g = iX2 + iX22;
        this.f11609d = aVar;
        this.f11610e = dVar;
        this.f11611f = lVar;
        z(true);
    }

    l C(int i2) {
        return this.f11609d.v().B(i2);
    }

    CharSequence D(int i2) {
        return C(i2).v(this.f11608c);
    }

    int E(l lVar) {
        return this.f11609d.v().C(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: F */
    public void q(b bVar, int i2) {
        l lVarB = this.f11609d.v().B(i2);
        bVar.x.setText(lVarB.v(bVar.f1546f.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.y.findViewById(e.c.b.c.f.o);
        if (materialCalendarGridView.getAdapter() == null || !lVarB.equals(materialCalendarGridView.getAdapter().f11603f)) {
            m mVar = new m(lVarB, this.f11610e, this.f11609d);
            materialCalendarGridView.setNumColumns(lVarB.f11598h);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: G */
    public b s(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(e.c.b.c.h.q, viewGroup, false);
        if (!i.i3(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f11612g));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f11609d.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long f(int i2) {
        return this.f11609d.v().B(i2).A();
    }
}