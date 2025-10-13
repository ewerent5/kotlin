package e.c.b.d.a.b;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class d extends k0 implements e {
    public d() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // e.c.b.d.a.b.k0
    protected final boolean R(int i2, Parcel parcel) {
        if (i2 != 2) {
            return false;
        }
        V1((Bundle) l0.a(parcel, Bundle.CREATOR));
        return true;
    }
}