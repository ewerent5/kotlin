package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final a Z;
    private CharSequence a0;
    private CharSequence b0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreference.this.b(Boolean.valueOf(z))) {
                SwitchPreference.this.F0(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.Z = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.E1, i2, i3);
        I0(androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.M1, t.F1));
        H0(androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.L1, t.G1));
        M0(androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.O1, t.I1));
        L0(androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.N1, t.J1));
        G0(androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, t.K1, t.H1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N0(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.U);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.a0);
            r4.setTextOff(this.b0);
            r4.setOnCheckedChangeListener(this.Z);
        }
    }

    private void O0(View view) {
        if (((AccessibilityManager) k().getSystemService("accessibility")).isEnabled()) {
            N0(view.findViewById(R.id.switch_widget));
            J0(view.findViewById(R.id.summary));
        }
    }

    public void L0(CharSequence charSequence) {
        this.b0 = charSequence;
        L();
    }

    public void M0(CharSequence charSequence) {
        this.a0 = charSequence;
        L();
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        super.R(lVar);
        N0(lVar.N(R.id.switch_widget));
        K0(lVar);
    }

    @Override // androidx.preference.Preference
    protected void e0(View view) {
        super.e0(view);
        O0(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.c.g.a(context, m.f1463m, R.attr.switchPreferenceStyle));
    }
}