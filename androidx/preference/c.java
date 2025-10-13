package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.b;
import ch.qos.logback.core.joran.action.Action;

/* compiled from: ListPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class c extends f {
    int x0;
    private CharSequence[] y0;
    private CharSequence[] z0;

    /* compiled from: ListPreferenceDialogFragmentCompat.java */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c cVar = c.this;
            cVar.x0 = i2;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference a3() {
        return (ListPreference) T2();
    }

    public static c b3(String str) {
        c cVar = new c();
        Bundle bundle = new Bundle(1);
        bundle.putString(Action.KEY_ATTRIBUTE, str);
        cVar.s2(bundle);
        return cVar;
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        super.H1(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.x0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.y0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.z0);
    }

    @Override // androidx.preference.f
    public void X2(boolean z) {
        int i2;
        if (!z || (i2 = this.x0) < 0) {
            return;
        }
        String string = this.z0[i2].toString();
        ListPreference listPreferenceA3 = a3();
        if (listPreferenceA3.b(string)) {
            listPreferenceA3.Q0(string);
        }
    }

    @Override // androidx.preference.f
    protected void Y2(b.a aVar) {
        super.Y2(aVar);
        aVar.s(this.y0, this.x0, new a());
        aVar.p(null, null);
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        if (bundle != null) {
            this.x0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.y0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.z0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceA3 = a3();
        if (listPreferenceA3.L0() == null || listPreferenceA3.N0() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.x0 = listPreferenceA3.K0(listPreferenceA3.O0());
        this.y0 = listPreferenceA3.L0();
        this.z0 = listPreferenceA3.N0();
    }
}