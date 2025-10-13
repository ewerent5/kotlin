package e.c.b.b.c.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.net.SyslogConstants;
import e.c.b.b.b.b;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public abstract class sf extends y0 implements tf {
    public sf() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static tf asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof tf ? (tf) iInterfaceQueryLocalInterface : new vf(iBinder);
    }

    @Override // e.c.b.b.c.e.y0
    protected final boolean R(int i2, Parcel parcel, Parcel parcel2, int i3) {
        uf wfVar;
        uf wfVar2 = null;
        uf wfVar3 = null;
        uf wfVar4 = null;
        c eVar = null;
        c eVar2 = null;
        c eVar3 = null;
        uf wfVar5 = null;
        uf wfVar6 = null;
        uf wfVar7 = null;
        uf wfVar8 = null;
        uf wfVar9 = null;
        uf wfVar10 = null;
        d gVar = null;
        uf wfVar11 = null;
        uf wfVar12 = null;
        uf wfVar13 = null;
        uf wfVar14 = null;
        switch (i2) {
            case 1:
                initialize(b.a.U(parcel.readStrongBinder()), (f) x.a(parcel, f.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) x.a(parcel, Bundle.CREATOR), x.e(parcel), x.e(parcel), parcel.readLong());
                break;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) x.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    wfVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar = iInterfaceQueryLocalInterface instanceof uf ? (uf) iInterfaceQueryLocalInterface : new wf(strongBinder);
                }
                logEventAndBundle(string, string2, bundle, wfVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), b.a.U(parcel.readStrongBinder()), x.e(parcel), parcel.readLong());
                break;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean zE = x.e(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar2 = iInterfaceQueryLocalInterface2 instanceof uf ? (uf) iInterfaceQueryLocalInterface2 : new wf(strongBinder2);
                }
                getUserProperties(string3, string4, zE, wfVar2);
                break;
            case 6:
                String string5 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar14 = iInterfaceQueryLocalInterface3 instanceof uf ? (uf) iInterfaceQueryLocalInterface3 : new wf(strongBinder3);
                }
                getMaxUserProperties(string5, wfVar14);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) x.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) x.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar13 = iInterfaceQueryLocalInterface4 instanceof uf ? (uf) iInterfaceQueryLocalInterface4 : new wf(strongBinder4);
                }
                getConditionalUserProperties(string6, string7, wfVar13);
                break;
            case 11:
                setMeasurementEnabled(x.e(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                setCurrentScreen(b.a.U(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar12 = iInterfaceQueryLocalInterface5 instanceof uf ? (uf) iInterfaceQueryLocalInterface5 : new wf(strongBinder5);
                }
                getCurrentScreenName(wfVar12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar11 = iInterfaceQueryLocalInterface6 instanceof uf ? (uf) iInterfaceQueryLocalInterface6 : new wf(strongBinder6);
                }
                getCurrentScreenClass(wfVar11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    gVar = iInterfaceQueryLocalInterface7 instanceof d ? (d) iInterfaceQueryLocalInterface7 : new g(strongBinder7);
                }
                setInstanceIdProvider(gVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar10 = iInterfaceQueryLocalInterface8 instanceof uf ? (uf) iInterfaceQueryLocalInterface8 : new wf(strongBinder8);
                }
                getCachedAppInstanceId(wfVar10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar9 = iInterfaceQueryLocalInterface9 instanceof uf ? (uf) iInterfaceQueryLocalInterface9 : new wf(strongBinder9);
                }
                getAppInstanceId(wfVar9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar8 = iInterfaceQueryLocalInterface10 instanceof uf ? (uf) iInterfaceQueryLocalInterface10 : new wf(strongBinder10);
                }
                getGmpAppId(wfVar8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar7 = iInterfaceQueryLocalInterface11 instanceof uf ? (uf) iInterfaceQueryLocalInterface11 : new wf(strongBinder11);
                }
                generateEventId(wfVar7);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case SyslogConstants.LOG_DAEMON /* 24 */:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(b.a.U(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(b.a.U(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(b.a.U(parcel.readStrongBinder()), (Bundle) x.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(b.a.U(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(b.a.U(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(b.a.U(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                e.c.b.b.b.b bVarU = b.a.U(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar6 = iInterfaceQueryLocalInterface12 instanceof uf ? (uf) iInterfaceQueryLocalInterface12 : new wf(strongBinder12);
                }
                onActivitySaveInstanceState(bVarU, wfVar6, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) x.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar5 = iInterfaceQueryLocalInterface13 instanceof uf ? (uf) iInterfaceQueryLocalInterface13 : new wf(strongBinder13);
                }
                performAction(bundle2, wfVar5, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), b.a.U(parcel.readStrongBinder()), b.a.U(parcel.readStrongBinder()), b.a.U(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    eVar3 = iInterfaceQueryLocalInterface14 instanceof c ? (c) iInterfaceQueryLocalInterface14 : new e(strongBinder14);
                }
                setEventInterceptor(eVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    eVar2 = iInterfaceQueryLocalInterface15 instanceof c ? (c) iInterfaceQueryLocalInterface15 : new e(strongBinder15);
                }
                registerOnMeasurementEventListener(eVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    eVar = iInterfaceQueryLocalInterface16 instanceof c ? (c) iInterfaceQueryLocalInterface16 : new e(strongBinder16);
                }
                unregisterOnMeasurementEventListener(eVar);
                break;
            case 37:
                initForTests(x.f(parcel));
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar4 = iInterfaceQueryLocalInterface17 instanceof uf ? (uf) iInterfaceQueryLocalInterface17 : new wf(strongBinder17);
                }
                getTestFlag(wfVar4, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(x.e(parcel));
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    wfVar3 = iInterfaceQueryLocalInterface18 instanceof uf ? (uf) iInterfaceQueryLocalInterface18 : new wf(strongBinder18);
                }
                isDataCollectionEnabled(wfVar3);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) x.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) x.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) x.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}