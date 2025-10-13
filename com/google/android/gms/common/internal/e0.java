package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final class e0 implements n {

    /* renamed from: e, reason: collision with root package name */
    private final IBinder f4689e;

    e0(IBinder iBinder) {
        this.f4689e = iBinder;
    }

    @Override // com.google.android.gms.common.internal.n
    public final void R0(m mVar, g gVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (gVar != null) {
                parcelObtain.writeInt(1);
                u0.a(gVar, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f4689e.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4689e;
    }
}