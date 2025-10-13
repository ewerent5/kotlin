package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.measurement.internal.h7;
import com.google.firebase.installations.f;
import e.c.b.b.c.e.h;
import e.c.b.b.e.k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics a;

    /* renamed from: b, reason: collision with root package name */
    private final h f12233b;

    private FirebaseAnalytics(h hVar) {
        p.j(hVar);
        this.f12233b = hVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (a == null) {
                    a = new FirebaseAnalytics(h.b(context));
                }
            }
        }
        return a;
    }

    @Keep
    public static h7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        h hVarC = h.c(context, null, null, null, bundle);
        if (hVarC == null) {
            return null;
        }
        return new b(hVarC);
    }

    public final void a(boolean z) {
        this.f12233b.o(Boolean.valueOf(z));
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) k.a(f.k().G(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        } catch (ExecutionException e3) {
            throw new IllegalStateException(e3.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f12233b.i(activity, str, str2);
    }
}