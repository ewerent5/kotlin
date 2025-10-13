package com.parizene.netmonitor.ui;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* compiled from: AppPermissionsChecker.kt */
/* loaded from: classes3.dex */
public final class n0 {
    public static final a a = new a(null);

    /* compiled from: AppPermissionsChecker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }

        public final boolean a(Context context) {
            i.y.d.l.d(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            return androidx.core.content.a.a(context, "android.permission.READ_PHONE_STATE") == 0 && androidx.core.content.a.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 && androidx.core.content.a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        }
    }
}