package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.j;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean d0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, androidx.core.content.c.g.a(context, m.f1458h, R.attr.preferenceScreenStyle));
        this.d0 = true;
    }

    @Override // androidx.preference.PreferenceGroup
    protected boolean L0() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected void S() {
        j.b bVarE;
        if (p() != null || n() != null || K0() == 0 || (bVarE = z().e()) == null) {
            return;
        }
        bVarE.V(this);
    }

    public boolean S0() {
        return this.d0;
    }
}