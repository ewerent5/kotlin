package i.a0;

import ch.qos.logback.core.CoreConstants;
import i.y.d.l;

/* compiled from: Ranges.kt */
/* loaded from: classes3.dex */
class e {
    public static final void a(boolean z, Number number) {
        l.d(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + CoreConstants.DOT);
    }
}