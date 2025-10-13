package e.c.b.b.c.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    private final IBinder f14364e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14365f;

    protected a(IBinder iBinder, String str) {
        this.f14364e = iBinder;
        this.f14365f = str;
    }

    protected final Parcel R() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f14365f);
        return parcelObtain;
    }

    protected final Parcel U(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14364e.transact(i2, parcel, parcelObtain, 0);
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

    protected final void Y(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f14364e.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f14364e;
    }
}