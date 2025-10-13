package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment.java */
/* loaded from: classes.dex */
abstract class p<S> extends Fragment {
    protected final LinkedHashSet<o<S>> b0 = new LinkedHashSet<>();

    p() {
    }

    boolean I2(o<S> oVar) {
        return this.b0.add(oVar);
    }

    void J2() {
        this.b0.clear();
    }
}