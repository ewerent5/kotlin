package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.measurement.internal.h7;
import com.google.android.gms.measurement.internal.y5;
import com.google.android.gms.measurement.internal.z4;
import e.c.b.b.c.e.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {
    private static volatile AppMeasurement a;

    /* renamed from: b, reason: collision with root package name */
    private final z4 f10730b;

    /* renamed from: c, reason: collision with root package name */
    private final h7 f10731c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10732d;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString(Action.NAME_ATTRIBUTE, str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                y5.b(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        ConditionalUserProperty(Bundle bundle) {
            p.j(bundle);
            this.mAppId = (String) y5.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) y5.a(bundle, "origin", String.class, null);
            this.mName = (String) y5.a(bundle, Action.NAME_ATTRIBUTE, String.class, null);
            this.mValue = y5.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) y5.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) y5.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) y5.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) y5.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) y5.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) y5.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) y5.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) y5.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) y5.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) y5.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) y5.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) y5.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    private AppMeasurement(z4 z4Var) {
        p.j(z4Var);
        this.f10730b = z4Var;
        this.f10731c = null;
        this.f10732d = false;
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (a == null) {
            synchronized (AppMeasurement.class) {
                if (a == null) {
                    h7 h7VarB = b(context, null);
                    if (h7VarB != null) {
                        a = new AppMeasurement(h7VarB);
                    } else {
                        a = new AppMeasurement(z4.b(context, new f(0L, 0L, true, null, null, null, null), null));
                    }
                }
            }
        }
        return a;
    }

    private static h7 b(Context context, Bundle bundle) {
        try {
            return (h7) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
        } catch (ClassNotFoundException | Exception unused) {
            return null;
        }
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f10732d) {
            this.f10731c.zza(str);
        } else {
            this.f10730b.N().u(str, this.f10730b.zzl().c());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f10732d) {
            this.f10731c.e(str, str2, bundle);
        } else {
            this.f10730b.A().p0(str, str2, bundle);
        }
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f10732d) {
            this.f10731c.c(str);
        } else {
            this.f10730b.N().y(str, this.f10730b.zzl().c());
        }
    }

    @Keep
    public long generateEventId() {
        return this.f10732d ? this.f10731c.zze() : this.f10730b.B().z0();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f10732d ? this.f10731c.zzc() : this.f10730b.A().d0();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listA = this.f10732d ? this.f10731c.a(str, str2) : this.f10730b.A().w(str, str2);
        ArrayList arrayList = new ArrayList(listA == null ? 0 : listA.size());
        Iterator<Bundle> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f10732d ? this.f10731c.zzb() : this.f10730b.A().g0();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f10732d ? this.f10731c.zza() : this.f10730b.A().f0();
    }

    @Keep
    public String getGmpAppId() {
        return this.f10732d ? this.f10731c.zzd() : this.f10730b.A().h0();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f10732d) {
            return this.f10731c.d(str);
        }
        this.f10730b.A();
        p.f(str);
        return 25;
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f10732d ? this.f10731c.b(str, str2, z) : this.f10730b.A().x(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f10732d) {
            this.f10731c.f(str, str2, bundle);
        } else {
            this.f10730b.A().R(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        p.j(conditionalUserProperty);
        if (this.f10732d) {
            this.f10731c.w(conditionalUserProperty.a());
        } else {
            this.f10730b.A().z(conditionalUserProperty.a());
        }
    }

    private AppMeasurement(h7 h7Var) {
        p.j(h7Var);
        this.f10731c = h7Var;
        this.f10730b = null;
        this.f10732d = true;
    }
}