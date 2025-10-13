package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final a Z;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (CheckBoxPreference.this.b(Boolean.valueOf(z))) {
                CheckBoxPreference.this.F0(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void L0(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.U);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.Z);
        }
    }

    private void M0(View view) {
        if (((AccessibilityManager) k().getSystemService("accessibility")).isEnabled()) {
            L0(view.findViewById(R.id.checkbox));
            J0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        super.R(lVar);
        L0(lVar.N(R.id.checkbox));
        K0(lVar);
    }

    @Override // androidx.preference.Preference
    protected void e0(View view) {
        super.e0(view);
        M0(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.Z = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.s, i2, i3);
        I0(androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.y, t.t));
        H0(androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.x, t.u));
        G0(androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, t.w, t.v, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.c.g.a(context, m.a, R.attr.checkBoxPreferenceStyle));
    }
}