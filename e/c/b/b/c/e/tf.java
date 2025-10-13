package e.c.b.b.c.e;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public interface tf extends IInterface {
    void beginAdUnitExposure(String str, long j2);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j2);

    void endAdUnitExposure(String str, long j2);

    void generateEventId(uf ufVar);

    void getAppInstanceId(uf ufVar);

    void getCachedAppInstanceId(uf ufVar);

    void getConditionalUserProperties(String str, String str2, uf ufVar);

    void getCurrentScreenClass(uf ufVar);

    void getCurrentScreenName(uf ufVar);

    void getGmpAppId(uf ufVar);

    void getMaxUserProperties(String str, uf ufVar);

    void getTestFlag(uf ufVar, int i2);

    void getUserProperties(String str, String str2, boolean z, uf ufVar);

    void initForTests(Map map);

    void initialize(e.c.b.b.b.b bVar, f fVar, long j2);

    void isDataCollectionEnabled(uf ufVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2);

    void logEventAndBundle(String str, String str2, Bundle bundle, uf ufVar, long j2);

    void logHealthData(int i2, String str, e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2, e.c.b.b.b.b bVar3);

    void onActivityCreated(e.c.b.b.b.b bVar, Bundle bundle, long j2);

    void onActivityDestroyed(e.c.b.b.b.b bVar, long j2);

    void onActivityPaused(e.c.b.b.b.b bVar, long j2);

    void onActivityResumed(e.c.b.b.b.b bVar, long j2);

    void onActivitySaveInstanceState(e.c.b.b.b.b bVar, uf ufVar, long j2);

    void onActivityStarted(e.c.b.b.b.b bVar, long j2);

    void onActivityStopped(e.c.b.b.b.b bVar, long j2);

    void performAction(Bundle bundle, uf ufVar, long j2);

    void registerOnMeasurementEventListener(c cVar);

    void resetAnalyticsData(long j2);

    void setConditionalUserProperty(Bundle bundle, long j2);

    void setConsent(Bundle bundle, long j2);

    void setConsentThirdParty(Bundle bundle, long j2);

    void setCurrentScreen(e.c.b.b.b.b bVar, String str, String str2, long j2);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(c cVar);

    void setInstanceIdProvider(d dVar);

    void setMeasurementEnabled(boolean z, long j2);

    void setMinimumSessionDuration(long j2);

    void setSessionTimeoutDuration(long j2);

    void setUserId(String str, long j2);

    void setUserProperty(String str, String str2, e.c.b.b.b.b bVar, boolean z, long j2);

    void unregisterOnMeasurementEventListener(c cVar);
}