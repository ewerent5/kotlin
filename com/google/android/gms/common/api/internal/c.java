package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
@Deprecated
/* loaded from: classes.dex */
public final class c {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("sLock")
    private static c f4587b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4588c;

    /* renamed from: d, reason: collision with root package name */
    private final Status f4589d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4590e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4591f;

    c(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(com.google.android.gms.common.l.a));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z = integer == 0;
            z = integer != 0;
            this.f4591f = z;
        } else {
            this.f4591f = false;
        }
        this.f4590e = z;
        String strA = i0.a(context);
        strA = strA == null ? new com.google.android.gms.common.internal.v(context).a("google_app_id") : strA;
        if (TextUtils.isEmpty(strA)) {
            this.f4589d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f4588c = null;
        } else {
            this.f4588c = strA;
            this.f4589d = Status.f4527e;
        }
    }

    private static c a(String str) {
        c cVar;
        synchronized (a) {
            cVar = f4587b;
            if (cVar == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return cVar;
    }

    @RecentlyNullable
    public static String b() {
        return a("getGoogleAppId").f4588c;
    }

    @RecentlyNonNull
    public static Status c(@RecentlyNonNull Context context) {
        Status status;
        com.google.android.gms.common.internal.p.k(context, "Context must not be null.");
        synchronized (a) {
            if (f4587b == null) {
                f4587b = new c(context);
            }
            status = f4587b.f4589d;
        }
        return status;
    }

    public static boolean d() {
        return a("isMeasurementExplicitlyDisabled").f4591f;
    }
}