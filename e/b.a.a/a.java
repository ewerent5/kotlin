package e.b.a.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* compiled from: IInAppBillingService.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IInAppBillingService.java */
    /* renamed from: e.b.a.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0171a extends Binder implements a {

        /* compiled from: IInAppBillingService.java */
        /* renamed from: e.b.a.a.a$a$a, reason: collision with other inner class name */
        private static class C0172a implements a {

            /* renamed from: e, reason: collision with root package name */
            public static a f14205e;

            /* renamed from: f, reason: collision with root package name */
            private IBinder f14206f;

            C0172a(IBinder iBinder) {
                this.f14206f = iBinder;
            }

            @Override // e.b.a.a.a
            public int Y3(int i2, String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.f14206f.transact(1, parcelObtain, parcelObtain2, 0) && AbstractBinderC0171a.U() != null) {
                        return AbstractBinderC0171a.U().Y3(i2, str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // e.b.a.a.a
            public Bundle Z1(int i2, String str, String str2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f14206f.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC0171a.U() != null) {
                        return AbstractBinderC0171a.U().Z1(i2, str, str2, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14206f;
            }

            @Override // e.b.a.a.a
            public Bundle f2(int i2, String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (!this.f14206f.transact(4, parcelObtain, parcelObtain2, 0) && AbstractBinderC0171a.U() != null) {
                        return AbstractBinderC0171a.U().f2(i2, str, str2, str3);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // e.b.a.a.a
            public Bundle u1(int i2, String str, String str2, String str3, String str4) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    if (!this.f14206f.transact(3, parcelObtain, parcelObtain2, 0) && AbstractBinderC0171a.U() != null) {
                        return AbstractBinderC0171a.U().u1(i2, str, str2, str3, str4);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // e.b.a.a.a
            public Bundle x3(int i2, String str, List<String> list, String str2, String str3, String str4) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.f14206f.transact(7, parcelObtain, parcelObtain2, 0) && AbstractBinderC0171a.U() != null) {
                        Bundle bundleX3 = AbstractBinderC0171a.U().x3(i2, str, list, str2, str3, str4);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return bundleX3;
                    }
                    parcelObtain2.readException();
                    Bundle bundle = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return bundle;
                } catch (Throwable th2) {
                    th = th2;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public static a R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0172a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static a U() {
            return C0172a.f14205e;
        }
    }

    int Y3(int i2, String str, String str2);

    Bundle Z1(int i2, String str, String str2, Bundle bundle);

    Bundle f2(int i2, String str, String str2, String str3);

    Bundle u1(int i2, String str, String str2, String str3, String str4);

    Bundle x3(int i2, String str, List<String> list, String str2, String str3, String str4);
}