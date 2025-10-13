package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a Z;
    private CharSequence a0;
    private CharSequence b0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreferenceCompat.this.b(Boolean.valueOf(z))) {
                SwitchPreferenceCompat.this.F0(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.Z = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.P1, i2, i3);
        I0(androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.X1, t.Q1));
        H0(androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.W1, t.R1));
        M0(androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.Z1, t.T1));
        L0(androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.Y1, t.U1));
        G0(androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, t.V1, t.S1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N0(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.U);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.a0);
            switchCompat.setTextOff(this.b0);
            switchCompat.setOnCheckedChangeListener(this.Z);
        }
    }

    private void O0(View view) {
        if (((AccessibilityManager) k().getSystemService("accessibility")).isEnabled()) {
            N0(view.findViewById(p.f1468f));
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
        N0(lVar.N(p.f1468f));
        K0(lVar);
    }

    @Override // androidx.preference.Preference
    protected void e0(View view) {
        super.e0(view);
        O0(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.f1462l);
    }
}