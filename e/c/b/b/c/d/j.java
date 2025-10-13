package e.c.b.b.c.d;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class j extends a implements l {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // e.c.b.b.c.d.l
    public final void D2(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        Y(5, parcelU);
    }

    @Override // e.c.b.b.c.d.l
    public final void F3(e.c.b.b.b.b bVar) {
        Parcel parcelU = U();
        c.e(parcelU, bVar);
        Y(18, parcelU);
    }

    @Override // e.c.b.b.c.d.l
    public final void M0(LatLng latLng) {
        Parcel parcelU = U();
        c.d(parcelU, latLng);
        Y(3, parcelU);
    }

    @Override // e.c.b.b.c.d.l
    public final void T3(String str) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        Y(7, parcelU);
    }

    @Override // e.c.b.b.c.d.l
    public final e.c.b.b.b.b q() {
        Parcel parcelR = R(30, U());
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }

    @Override // e.c.b.b.c.d.l
    public final void q1(e.c.b.b.b.b bVar) {
        Parcel parcelU = U();
        c.e(parcelU, bVar);
        Y(29, parcelU);
    }

    @Override // e.c.b.b.c.d.l
    public final void x0(float f2, float f3) {
        Parcel parcelU = U();
        parcelU.writeFloat(f2);
        parcelU.writeFloat(f3);
        Y(19, parcelU);
    }

    @Override // e.c.b.b.c.d.l
    public final boolean y0(l lVar) {
        Parcel parcelU = U();
        c.e(parcelU, lVar);
        Parcel parcelR = R(16, parcelU);
        boolean zA = c.a(parcelR);
        parcelR.recycle();
        return zA;
    }

    @Override // e.c.b.b.c.d.l
    public final void zzd() {
        Y(1, U());
    }

    @Override // e.c.b.b.c.d.l
    public final LatLng zzg() {
        Parcel parcelR = R(4, U());
        LatLng latLng = (LatLng) c.c(parcelR, LatLng.CREATOR);
        parcelR.recycle();
        return latLng;
    }

    @Override // e.c.b.b.c.d.l
    public final String zzi() {
        Parcel parcelR = R(6, U());
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // e.c.b.b.c.d.l
    public final String zzk() {
        Parcel parcelR = R(8, U());
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // e.c.b.b.c.d.l
    public final int zzt() {
        Parcel parcelR = R(17, U());
        int i2 = parcelR.readInt();
        parcelR.recycle();
        return i2;
    }
}