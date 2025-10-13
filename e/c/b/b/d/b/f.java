package e.c.b.b.d.b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class f extends e.c.b.b.c.b.b implements e {
    public f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // e.c.b.b.c.b.b
    protected boolean m4(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 3) {
            j3((com.google.android.gms.common.b) e.c.b.b.c.b.c.a(parcel, com.google.android.gms.common.b.CREATOR), (b) e.c.b.b.c.b.c.a(parcel, b.CREATOR));
        } else if (i2 == 4) {
            d2((Status) e.c.b.b.c.b.c.a(parcel, Status.CREATOR));
        } else if (i2 == 6) {
            v2((Status) e.c.b.b.c.b.c.a(parcel, Status.CREATOR));
        } else if (i2 == 7) {
            l0((Status) e.c.b.b.c.b.c.a(parcel, Status.CREATOR), (GoogleSignInAccount) e.c.b.b.c.b.c.a(parcel, GoogleSignInAccount.CREATOR));
        } else {
            if (i2 != 8) {
                return false;
            }
            A0((k) e.c.b.b.c.b.c.a(parcel, k.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}