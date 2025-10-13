package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpandButton.java */
/* loaded from: classes.dex */
final class b extends Preference {
    private long U;

    b(Context context, List<Preference> list, long j2) {
        super(context);
        E0();
        F0(list);
        this.U = j2 + 1000000;
    }

    private void E0() {
        r0(q.a);
        o0(o.a);
        x0(r.f1472b);
        u0(999);
    }

    private void F0(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence string = null;
        for (Preference preference : list) {
            CharSequence charSequenceD = preference.D();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequenceD)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.t())) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequenceD)) {
                string = string == null ? charSequenceD : k().getString(r.f1475e, string, charSequenceD);
            }
        }
        v0(string);
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        super.R(lVar);
        lVar.Q(false);
    }

    @Override // androidx.preference.Preference
    long o() {
        return this.U;
    }
}