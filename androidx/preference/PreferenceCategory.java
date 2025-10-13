package androidx.preference;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import c.h.l.c0.c;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.preference.Preference
    public boolean H() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        TextView textView;
        super.R(lVar);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            lVar.f1546f.setAccessibilityHeading(true);
            return;
        }
        if (i2 < 21) {
            TypedValue typedValue = new TypedValue();
            if (k().getTheme().resolveAttribute(m.f1452b, typedValue, true) && (textView = (TextView) lVar.N(R.id.title)) != null) {
                if (textView.getCurrentTextColor() != androidx.core.content.a.c(k(), n.a)) {
                    return;
                }
                textView.setTextColor(typedValue.data);
            }
        }
    }

    @Override // androidx.preference.Preference
    @Deprecated
    public void W(c.h.l.c0.c cVar) {
        c.C0058c c0058cQ;
        super.W(cVar);
        if (Build.VERSION.SDK_INT >= 28 || (c0058cQ = cVar.q()) == null) {
            return;
        }
        cVar.b0(c.C0058c.f(c0058cQ.c(), c0058cQ.d(), c0058cQ.a(), c0058cQ.b(), true, c0058cQ.e()));
    }

    @Override // androidx.preference.Preference
    public boolean z0() {
        return !super.H();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.c.g.a(context, m.f1456f, R.attr.preferenceCategoryStyle));
    }
}