package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: classes.dex */
public interface f0 extends IInterface {

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    public static abstract class a extends Binder implements f0 {

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: androidx.room.f0$a$a, reason: collision with other inner class name */
        private static class C0026a implements f0 {

            /* renamed from: e, reason: collision with root package name */
            public static f0 f1834e;

            /* renamed from: f, reason: collision with root package name */
            private IBinder f1835f;

            C0026a(IBinder iBinder) {
                this.f1835f = iBinder;
            }

            @Override // androidx.room.f0
            public void L0(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    if (this.f1835f.transact(1, parcelObtain, null, 1) || a.U() == null) {
                        return;
                    }
                    a.U().L0(strArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1835f;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static f0 R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f0)) ? new C0026a(iBinder) : (f0) iInterfaceQueryLocalInterface;
        }

        public static f0 U() {
            return C0026a.f1834e;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                L0(parcel.createStringArray());
                return true;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }

    void L0(String[] strArr);
}