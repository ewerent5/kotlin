package e.c.b.b.c.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    private final IBinder f14362e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14363f;

    protected a(IBinder iBinder, String str) {
        this.f14362e = iBinder;
        this.f14363f = str;
    }

    protected final Parcel R(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14362e.transact(i2, parcel, parcelObtain, 0);
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

    protected final Parcel U() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f14363f);
        return parcelObtain;
    }

    protected final void Y(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f14362e.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14362e;
    }
}