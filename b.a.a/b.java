package b.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: ICustomTabsService.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: ICustomTabsService.java */
    public static abstract class a extends Binder implements b {

        /* compiled from: ICustomTabsService.java */
        /* renamed from: b.a.a.b$a$a, reason: collision with other inner class name */
        private static class C0040a implements b {

            /* renamed from: e, reason: collision with root package name */
            private IBinder f2423e;

            C0040a(IBinder iBinder) {
                this.f2423e = iBinder;
            }

            @Override // b.a.a.b
            public boolean K1(long j2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(j2);
                    this.f2423e.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.a.a.b
            public boolean O2(b.a.a.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f2423e.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2423e;
            }
        }

        public static b R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0040a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    boolean K1(long j2);

    boolean O2(b.a.a.a aVar);
}