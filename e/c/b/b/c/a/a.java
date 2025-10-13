package e.c.b.b.c.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    private final IBinder f14356e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14357f;

    protected a(IBinder iBinder, String str) {
        this.f14356e = iBinder;
        this.f14357f = str;
    }

    protected final Parcel R() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f14357f);
        return parcelObtain;
    }

    protected final Parcel U(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14356e.transact(i2, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f14356e;
    }
}