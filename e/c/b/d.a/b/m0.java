package e.c.b.d.a.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 extends j0 implements o0 {
    m0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // e.c.b.d.a.b.o0
    public final void B1(String str, Bundle bundle, q0 q0Var) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        l0.b(parcelR, bundle);
        l0.c(parcelR, q0Var);
        U(10, parcelR);
    }

    @Override // e.c.b.d.a.b.o0
    public final void C1(String str, Bundle bundle, Bundle bundle2, q0 q0Var) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        l0.b(parcelR, bundle);
        l0.b(parcelR, bundle2);
        l0.c(parcelR, q0Var);
        U(11, parcelR);
    }

    @Override // e.c.b.d.a.b.o0
    public final void P0(String str, Bundle bundle, Bundle bundle2, q0 q0Var) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        l0.b(parcelR, bundle);
        l0.b(parcelR, bundle2);
        l0.c(parcelR, q0Var);
        U(9, parcelR);
    }

    @Override // e.c.b.d.a.b.o0
    public final void W3(String str, Bundle bundle, q0 q0Var) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        l0.b(parcelR, bundle);
        l0.c(parcelR, q0Var);
        U(5, parcelR);
    }

    @Override // e.c.b.d.a.b.o0
    public final void l4(String str, Bundle bundle, Bundle bundle2, q0 q0Var) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        l0.b(parcelR, bundle);
        l0.b(parcelR, bundle2);
        l0.c(parcelR, q0Var);
        U(6, parcelR);
    }

    @Override // e.c.b.d.a.b.o0
    public final void u0(String str, Bundle bundle, Bundle bundle2, q0 q0Var) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        l0.b(parcelR, bundle);
        l0.b(parcelR, bundle2);
        l0.c(parcelR, q0Var);
        U(7, parcelR);
    }

    @Override // e.c.b.d.a.b.o0
    public final void w0(String str, List<Bundle> list, Bundle bundle, q0 q0Var) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeTypedList(list);
        l0.b(parcelR, bundle);
        l0.c(parcelR, q0Var);
        U(14, parcelR);
    }
}