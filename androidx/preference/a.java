package androidx.preference;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import ch.qos.logback.core.joran.action.Action;

/* compiled from: EditTextPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class a extends f {
    private EditText x0;
    private CharSequence y0;

    private EditTextPreference a3() {
        return (EditTextPreference) T2();
    }

    public static a b3(String str) {
        a aVar = new a();
        Bundle bundle = new Bundle(1);
        bundle.putString(Action.KEY_ATTRIBUTE, str);
        aVar.s2(bundle);
        return aVar;
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        super.H1(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.y0);
    }

    @Override // androidx.preference.f
    protected boolean U2() {
        return true;
    }

    @Override // androidx.preference.f
    protected void V2(View view) {
        super.V2(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.x0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.x0.setText(this.y0);
        EditText editText2 = this.x0;
        editText2.setSelection(editText2.getText().length());
        if (a3().K0() != null) {
            a3().K0().a(this.x0);
        }
    }

    @Override // androidx.preference.f
    public void X2(boolean z) {
        if (z) {
            String string = this.x0.getText().toString();
            EditTextPreference editTextPreferenceA3 = a3();
            if (editTextPreferenceA3.b(string)) {
                editTextPreferenceA3.N0(string);
            }
        }
    }

    @Override // androidx.preference.f, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        if (bundle == null) {
            this.y0 = a3().L0();
        } else {
            this.y0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }
}