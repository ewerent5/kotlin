package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.f0;

/* compiled from: IMultiInstanceInvalidationService.java */
/* loaded from: classes.dex */
public interface g0 extends IInterface {

    /* compiled from: IMultiInstanceInvalidationService.java */
    public static abstract class a extends Binder implements g0 {

        /* compiled from: IMultiInstanceInvalidationService.java */
        /* renamed from: androidx.room.g0$a$a, reason: collision with other inner class name */
        private static class C0027a implements g0 {

            /* renamed from: e, reason: collision with root package name */
            public static g0 f1837e;

            /* renamed from: f, reason: collision with root package name */
            private IBinder f1838f;

            C0027a(IBinder iBinder) {
                this.f1838f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1838f;
            }

            @Override // androidx.room.g0
            public int e1(f0 f0Var, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongBinder(f0Var != null ? f0Var.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (!this.f1838f.transact(1, parcelObtain, parcelObtain2, 0) && a.U() != null) {
                        return a.U().e1(f0Var, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.g0
            public void e4(int i2, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStringArray(strArr);
                    if (this.f1838f.transact(3, parcelObtain, null, 1) || a.U() == null) {
                        return;
                    }
                    a.U().e4(i2, strArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.g0
            public void x4(f0 f0Var, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongBinder(f0Var != null ? f0Var.asBinder() : null);
                    parcelObtain.writeInt(i2);
                    if (this.f1838f.transact(2, parcelObtain, parcelObtain2, 0) || a.U() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.U().x4(f0Var, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static g0 R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g0)) ? new C0027a(iBinder) : (g0) iInterfaceQueryLocalInterface;
        }

        public static g0 U() {
            return C0027a.f1837e;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int iE1 = e1(f0.a.R(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iE1);
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                x4(f0.a.R(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i2 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                e4(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    int e1(f0 f0Var, String str);

    void e4(int i2, String[] strArr);

    void x4(f0 f0Var, int i2);
}