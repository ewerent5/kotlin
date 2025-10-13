package e.c.b.b.c.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    private final IBinder f14358e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14359f;

    protected a(IBinder iBinder, String str) {
        this.f14358e = iBinder;
        this.f14359f = str;
    }

    protected final Parcel R() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f14359f);
        return parcelObtain;
    }

    protected final void U(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f14358e.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f14358e;
    }
}