package e.c.b.b.d.b;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class h extends e.c.b.b.c.b.a implements g {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // e.c.b.b.d.b.g
    public final void I1(i iVar, e eVar) {
        Parcel parcelR = R();
        e.c.b.b.c.b.c.c(parcelR, iVar);
        e.c.b.b.c.b.c.b(parcelR, eVar);
        U(12, parcelR);
    }
}