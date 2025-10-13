package e.c.b.d.a.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class j0 implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    private final IBinder f15343e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15344f;

    protected j0(IBinder iBinder, String str) {
        this.f15343e = iBinder;
        this.f15344f = str;
    }

    protected final Parcel R() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f15344f);
        return parcelObtain;
    }

    protected final void U(int i2, Parcel parcel) {
        try {
            this.f15343e.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15343e;
    }
}