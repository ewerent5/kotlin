package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher.java */
/* loaded from: classes.dex */
class h {
    private static AtomicBoolean a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.java */
    static class a extends d {
        a() {
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            u.g(activity);
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Context context) {
        if (a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
    }
}