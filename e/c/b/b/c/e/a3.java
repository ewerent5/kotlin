package e.c.b.b.c.e;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class a3 extends w2<Boolean> {
    a3(b3 b3Var, String str, Boolean bool, boolean z) {
        super(b3Var, str, bool, true, null);
    }

    @Override // e.c.b.b.c.e.w2
    final /* synthetic */ Boolean e(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (d2.f14444c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (d2.f14445d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String strN = super.n();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strN).length() + 28 + strValueOf.length());
        sb.append("Invalid boolean value for ");
        sb.append(strN);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}