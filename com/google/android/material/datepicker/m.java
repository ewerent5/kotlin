package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MonthAdapter.java */
/* loaded from: classes.dex */
class m extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    static final int f11602e = s.k().getMaximum(4);

    /* renamed from: f, reason: collision with root package name */
    final l f11603f;

    /* renamed from: g, reason: collision with root package name */
    final d<?> f11604g;

    /* renamed from: h, reason: collision with root package name */
    private Collection<Long> f11605h;

    /* renamed from: i, reason: collision with root package name */
    c f11606i;

    /* renamed from: j, reason: collision with root package name */
    final a f11607j;

    m(l lVar, d<?> dVar, a aVar) {
        this.f11603f = lVar;
        this.f11604g = dVar;
        this.f11607j = aVar;
        this.f11605h = dVar.x();
    }

    private void e(Context context) {
        if (this.f11606i == null) {
            this.f11606i = new c(context);
        }
    }

    private boolean h(long j2) {
        Iterator<Long> it = this.f11604g.x().iterator();
        while (it.hasNext()) {
            if (s.a(j2) == s.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(TextView textView, long j2) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.f11607j.i().t(j2)) {
            textView.setEnabled(true);
            bVar = h(j2) ? this.f11606i.f11564b : s.i().getTimeInMillis() == j2 ? this.f11606i.f11565c : this.f11606i.a;
        } else {
            textView.setEnabled(false);
            bVar = this.f11606i.f11569g;
        }
        bVar.d(textView);
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (l.c(j2).equals(this.f11603f)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f11603f.s(j2)) - materialCalendarGridView.getFirstVisiblePosition()), j2);
        }
    }

    int a(int i2) {
        return b() + (i2 - 1);
    }

    int b() {
        return this.f11603f.j();
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i2) {
        if (i2 < this.f11603f.j() || i2 > i()) {
            return null;
        }
        return Long.valueOf(this.f11603f.q(j(i2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = e.c.b.c.h.n
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.l r8 = r5.f11603f
            int r2 = r8.f11599i
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.l r8 = r5.f11603f
            long r7 = r8.q(r7)
            com.google.android.material.datepicker.l r3 = r5.f11603f
            int r3 = r3.f11597g
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.l.d()
            int r4 = r4.f11597g
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.e.d(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean f(int i2) {
        return i2 % this.f11603f.f11598h == 0;
    }

    boolean g(int i2) {
        return (i2 + 1) % this.f11603f.f11598h == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f11603f.f11599i + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.f11603f.f11598h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    int i() {
        return (this.f11603f.j() + this.f11603f.f11599i) - 1;
    }

    int j(int i2) {
        return (i2 - this.f11603f.j()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f11605h.iterator();
        while (it.hasNext()) {
            l(materialCalendarGridView, it.next().longValue());
        }
        d<?> dVar = this.f11604g;
        if (dVar != null) {
            Iterator<Long> it2 = dVar.x().iterator();
            while (it2.hasNext()) {
                l(materialCalendarGridView, it2.next().longValue());
            }
            this.f11605h = this.f11604g.x();
        }
    }

    boolean n(int i2) {
        return i2 >= b() && i2 <= i();
    }
}