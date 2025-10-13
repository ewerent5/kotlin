package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes.dex */
public final class k<S> extends p<S> {
    private int c0;
    private d<S> d0;
    private com.google.android.material.datepicker.a e0;

    /* compiled from: MaterialTextInputPicker.java */
    class a extends o<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s) {
            Iterator<o<S>> it = k.this.b0.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    static <T> k<T> K2(d<T> dVar, int i2, com.google.android.material.datepicker.a aVar) {
        k<T> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.s2(bundle);
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        super.H1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.c0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.d0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.e0);
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        if (bundle == null) {
            bundle = o0();
        }
        this.c0 = bundle.getInt("THEME_RES_ID_KEY");
        this.d0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.e0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.d0.n(layoutInflater.cloneInContext(new ContextThemeWrapper(q0(), this.c0)), viewGroup, bundle, this.e0, new a());
    }
}