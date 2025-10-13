package e.c.b.d.a.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class a extends j0 implements c {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // e.c.b.d.a.b.c
    public final void k3(String str, Bundle bundle, e eVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        l0.b(parcelR, bundle);
        l0.c(parcelR, eVar);
        U(2, parcelR);
    }
}