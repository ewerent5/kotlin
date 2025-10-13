package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes.dex */
class t extends RecyclerView.g<b> {

    /* renamed from: c */
    private final h<?> f11617c;

    /* compiled from: YearGridAdapter.java */
    class a implements View.OnClickListener {

        /* renamed from: e */
        final /* synthetic */ int f11618e;

        a(int i2) {
            this.f11618e = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f11617c.b3(t.this.f11617c.T2().g(l.b(this.f11618e, t.this.f11617c.V2().f11596f)));
            t.this.f11617c.c3(h.k.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    public static class b extends RecyclerView.d0 {
        final TextView x;

        b(TextView textView) {
            super(textView);
            this.x = textView;
        }
    }

    t(h<?> hVar) {
        this.f11617c = hVar;
    }

    private View.OnClickListener C(int i2) {
        return new a(i2);
    }

    int D(int i2) {
        return i2 - this.f11617c.T2().v().f11597g;
    }

    int E(int i2) {
        return this.f11617c.T2().v().f11597g + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: F */
    public void q(b bVar, int i2) {
        int iE = E(i2);
        String string = bVar.x.getContext().getString(e.c.b.c.j.o);
        bVar.x.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iE)));
        bVar.x.setContentDescription(String.format(string, Integer.valueOf(iE)));
        c cVarU2 = this.f11617c.U2();
        Calendar calendarI = s.i();
        com.google.android.material.datepicker.b bVar2 = calendarI.get(1) == iE ? cVarU2.f11568f : cVarU2.f11566d;
        Iterator<Long> it = this.f11617c.W2().x().iterator();
        while (it.hasNext()) {
            calendarI.setTimeInMillis(it.next().longValue());
            if (calendarI.get(1) == iE) {
                bVar2 = cVarU2.f11567e;
            }
        }
        bVar2.d(bVar.x);
        bVar.x.setOnClickListener(C(iE));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: G */
    public b s(ViewGroup viewGroup, int i2) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(e.c.b.c.h.s, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f11617c.T2().A();
    }
}