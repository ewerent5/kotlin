package e.c.b.d.a.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public abstract class p0 extends k0 implements q0 {
    public p0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // e.c.b.d.a.b.k0
    protected final boolean R(int i2, Parcel parcel) {
        switch (i2) {
            case 2:
                z2(parcel.readInt(), (Bundle) l0.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int i3 = parcel.readInt();
                d1(i3);
                return true;
            case 4:
                int i4 = parcel.readInt();
                j2(i4);
                return true;
            case 5:
                Z3(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) l0.a(parcel, creator);
                a1(bundle);
                return true;
            case 7:
                N3((Bundle) l0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) l0.a(parcel, creator2);
                d3(bundle2);
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) l0.a(parcel, creator3);
                t2(bundle3);
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                m3((Bundle) l0.a(parcel, creator4), (Bundle) l0.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                O3((Bundle) l0.a(parcel, creator5), (Bundle) l0.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                n4((Bundle) l0.a(parcel, creator6), (Bundle) l0.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                F2();
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                E4();
                return true;
        }
    }
}