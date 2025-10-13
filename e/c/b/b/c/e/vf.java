package e.c.b.b.c.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class vf extends a implements tf {
    vf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // e.c.b.b.c.e.tf
    public final void beginAdUnitExposure(String str, long j2) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeLong(j2);
        Y(23, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        x.c(parcelR, bundle);
        Y(9, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void clearMeasurementEnabled(long j2) {
        Parcel parcelR = R();
        parcelR.writeLong(j2);
        Y(43, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void endAdUnitExposure(String str, long j2) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeLong(j2);
        Y(24, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void generateEventId(uf ufVar) {
        Parcel parcelR = R();
        x.b(parcelR, ufVar);
        Y(22, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void getCachedAppInstanceId(uf ufVar) {
        Parcel parcelR = R();
        x.b(parcelR, ufVar);
        Y(19, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void getConditionalUserProperties(String str, String str2, uf ufVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        x.b(parcelR, ufVar);
        Y(10, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void getCurrentScreenClass(uf ufVar) {
        Parcel parcelR = R();
        x.b(parcelR, ufVar);
        Y(17, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void getCurrentScreenName(uf ufVar) {
        Parcel parcelR = R();
        x.b(parcelR, ufVar);
        Y(16, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void getGmpAppId(uf ufVar) {
        Parcel parcelR = R();
        x.b(parcelR, ufVar);
        Y(21, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void getMaxUserProperties(String str, uf ufVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        x.b(parcelR, ufVar);
        Y(6, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void getUserProperties(String str, String str2, boolean z, uf ufVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        x.d(parcelR, z);
        x.b(parcelR, ufVar);
        Y(5, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void initialize(e.c.b.b.b.b bVar, f fVar, long j2) {
        Parcel parcelR = R();
        x.b(parcelR, bVar);
        x.c(parcelR, fVar);
        parcelR.writeLong(j2);
        Y(1, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        x.c(parcelR, bundle);
        x.d(parcelR, z);
        x.d(parcelR, z2);
        parcelR.writeLong(j2);
        Y(2, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void logHealthData(int i2, String str, e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2, e.c.b.b.b.b bVar3) {
        Parcel parcelR = R();
        parcelR.writeInt(i2);
        parcelR.writeString(str);
        x.b(parcelR, bVar);
        x.b(parcelR, bVar2);
        x.b(parcelR, bVar3);
        Y(33, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void onActivityCreated(e.c.b.b.b.b bVar, Bundle bundle, long j2) {
        Parcel parcelR = R();
        x.b(parcelR, bVar);
        x.c(parcelR, bundle);
        parcelR.writeLong(j2);
        Y(27, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void onActivityDestroyed(e.c.b.b.b.b bVar, long j2) {
        Parcel parcelR = R();
        x.b(parcelR, bVar);
        parcelR.writeLong(j2);
        Y(28, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void onActivityPaused(e.c.b.b.b.b bVar, long j2) {
        Parcel parcelR = R();
        x.b(parcelR, bVar);
        parcelR.writeLong(j2);
        Y(29, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void onActivityResumed(e.c.b.b.b.b bVar, long j2) {
        Parcel parcelR = R();
        x.b(parcelR, bVar);
        parcelR.writeLong(j2);
        Y(30, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void onActivitySaveInstanceState(e.c.b.b.b.b bVar, uf ufVar, long j2) {
        Parcel parcelR = R();
        x.b(parcelR, bVar);
        x.b(parcelR, ufVar);
        parcelR.writeLong(j2);
        Y(31, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void onActivityStarted(e.c.b.b.b.b bVar, long j2) {
        Parcel parcelR = R();
        x.b(parcelR, bVar);
        parcelR.writeLong(j2);
        Y(25, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void onActivityStopped(e.c.b.b.b.b bVar, long j2) {
        Parcel parcelR = R();
        x.b(parcelR, bVar);
        parcelR.writeLong(j2);
        Y(26, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void performAction(Bundle bundle, uf ufVar, long j2) {
        Parcel parcelR = R();
        x.c(parcelR, bundle);
        x.b(parcelR, ufVar);
        parcelR.writeLong(j2);
        Y(32, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void registerOnMeasurementEventListener(c cVar) {
        Parcel parcelR = R();
        x.b(parcelR, cVar);
        Y(35, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void setConditionalUserProperty(Bundle bundle, long j2) {
        Parcel parcelR = R();
        x.c(parcelR, bundle);
        parcelR.writeLong(j2);
        Y(8, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void setConsent(Bundle bundle, long j2) {
        Parcel parcelR = R();
        x.c(parcelR, bundle);
        parcelR.writeLong(j2);
        Y(44, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void setCurrentScreen(e.c.b.b.b.b bVar, String str, String str2, long j2) {
        Parcel parcelR = R();
        x.b(parcelR, bVar);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeLong(j2);
        Y(15, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelR = R();
        x.d(parcelR, z);
        Y(39, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void setMeasurementEnabled(boolean z, long j2) {
        Parcel parcelR = R();
        x.d(parcelR, z);
        parcelR.writeLong(j2);
        Y(11, parcelR);
    }

    @Override // e.c.b.b.c.e.tf
    public final void setUserProperty(String str, String str2, e.c.b.b.b.b bVar, boolean z, long j2) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        x.b(parcelR, bVar);
        x.d(parcelR, z);
        parcelR.writeLong(j2);
        Y(4, parcelR);
    }
}