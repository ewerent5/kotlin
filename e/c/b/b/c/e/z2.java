package e.c.b.b.c.e;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class z2 extends w2<Double> {
    z2(b3 b3Var, String str, Double d2, boolean z) {
        super(b3Var, str, d2, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // e.c.b.b.c.e.w2
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final Double e(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strN = super.n();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strN).length() + 27 + strValueOf.length());
        sb.append("Invalid double value for ");
        sb.append(strN);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}