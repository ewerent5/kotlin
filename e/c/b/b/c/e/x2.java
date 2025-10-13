package e.c.b.b.c.e;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class x2 extends w2<Long> {
    x2(b3 b3Var, String str, Long l2, boolean z) {
        super(b3Var, str, l2, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // e.c.b.b.c.e.w2
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final Long e(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strN = super.n();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strN).length() + 25 + strValueOf.length());
        sb.append("Invalid long value for ");
        sb.append(strN);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}