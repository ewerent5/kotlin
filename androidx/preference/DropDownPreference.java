package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context f0;
    private final ArrayAdapter g0;
    private Spinner h0;
    private final AdapterView.OnItemSelectedListener i0;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (i2 >= 0) {
                String string = DropDownPreference.this.N0()[i2].toString();
                if (string.equals(DropDownPreference.this.O0()) || !DropDownPreference.this.b(string)) {
                    return;
                }
                DropDownPreference.this.Q0(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.f1454d);
    }

    private int S0(String str) {
        CharSequence[] charSequenceArrN0 = N0();
        if (str == null || charSequenceArrN0 == null) {
            return -1;
        }
        for (int length = charSequenceArrN0.length - 1; length >= 0; length--) {
            if (charSequenceArrN0[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    private void T0() {
        this.g0.clear();
        if (L0() != null) {
            for (CharSequence charSequence : L0()) {
                this.g0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    protected void L() {
        super.L();
        ArrayAdapter arrayAdapter = this.g0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        Spinner spinner = (Spinner) lVar.f1546f.findViewById(p.f1467e);
        this.h0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.g0);
        this.h0.setOnItemSelectedListener(this.i0);
        this.h0.setSelection(S0(O0()));
        super.R(lVar);
    }

    protected ArrayAdapter R0() {
        return new ArrayAdapter(this.f0, R.layout.simple_spinner_dropdown_item);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void S() {
        this.h0.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.i0 = new a();
        this.f0 = context;
        this.g0 = R0();
        T0();
    }
}