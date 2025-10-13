package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public abstract class q3 extends e.c.b.b.c.e.y0 implements n3 {
    public q3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // e.c.b.b.c.e.y0
    protected final boolean R(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                L3((r) e.c.b.b.c.e.x.a(parcel, r.CREATOR), (ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                i4((ca) e.c.b.b.c.e.x.a(parcel, ca.CREATOR), (ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                r2((ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                H0((r) e.c.b.b.c.e.x.a(parcel, r.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                Z2((ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<ca> listP2 = p2((ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR), e.c.b.b.c.e.x.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listP2);
                return true;
            case 9:
                byte[] bArrM0 = m0((r) e.c.b.b.c.e.x.a(parcel, r.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrM0);
                return true;
            case 10:
                H1(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String strH1 = h1((ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strH1);
                return true;
            case 12:
                q4((wa) e.c.b.b.c.e.x.a(parcel, wa.CREATOR), (ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                e2((wa) e.c.b.b.c.e.x.a(parcel, wa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<ca> listN2 = n2(parcel.readString(), parcel.readString(), e.c.b.b.c.e.x.e(parcel), (ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listN2);
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                List<ca> listI0 = I0(parcel.readString(), parcel.readString(), parcel.readString(), e.c.b.b.c.e.x.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listI0);
                return true;
            case 16:
                List<wa> listT1 = T1(parcel.readString(), parcel.readString(), (ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listT1);
                return true;
            case 17:
                List<wa> listN1 = N1(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(listN1);
                return true;
            case 18:
                M1((ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                P3((Bundle) e.c.b.b.c.e.x.a(parcel, Bundle.CREATOR), (ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                s0((ka) e.c.b.b.c.e.x.a(parcel, ka.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}