package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.b;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class d extends f {
    CharSequence[] A0;
    Set<String> x0 = new HashSet();
    boolean y0;
    CharSequence[] z0;

    /* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i2, boolean z) {
            if (z) {
                d dVar = d.this;
                dVar.y0 = dVar.x0.add(dVar.A0[i2].toString()) | dVar.y0;
            } else {
                d dVar2 = d.this;
                dVar2.y0 = dVar2.x0.remove(dVar2.A0[i2].toString()) | dVar2.y0;
            }
        }
    }

    private MultiSelectListPreference a3() {
        return (MultiSelectListPreference) T2();
    }

    public static d b3(String str) {
        d dVar = new d();
        Bundle bundle = new Bundle(1);
        bundle.putString(Action.KEY_ATTRIBUTE, str);
        dVar.s2(bundle);
        return dVar;
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        super.H1(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.x0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.y0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.z0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.A0);
    }

    @Override // androidx.preference.f
    public void X2(boolean z) {
        if (z && this.y0) {
            MultiSelectListPreference multiSelectListPreferenceA3 = a3();
            if (multiSelectListPreferenceA3.b(this.x0)) {
                multiSelectListPreferenceA3.N0(this.x0);
            }
        }
        this.y0 = false;
    }

    @Override // androidx.preference.f
    protected void Y2(b.a aVar) {
        super.Y2(aVar);
        int length = this.A0.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.x0.contains(this.A0[i2].toString());
        }
        aVar.j(this.z0, zArr, new a());
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        if (bundle != null) {
            this.x0.clear();
            this.x0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.y0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.z0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.A0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceA3 = a3();
        if (multiSelectListPreferenceA3.K0() == null || multiSelectListPreferenceA3.L0() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.x0.clear();
        this.x0.addAll(multiSelectListPreferenceA3.M0());
        this.y0 = false;
        this.z0 = multiSelectListPreferenceA3.K0();
        this.A0 = multiSelectListPreferenceA3.L0();
    }
}