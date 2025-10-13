package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class d {

    @GuardedBy("sCache")
    private static final c.e.g<String, String> a = new c.e.g<>();

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return com.google.android.gms.common.p.c.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(e.c.b.b.a.b.f14341g);
    }

    public static String c(Context context, int i2) {
        Resources resources = context.getResources();
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(R.string.ok) : resources.getString(e.c.b.b.a.b.a) : resources.getString(e.c.b.b.a.b.f14344j) : resources.getString(e.c.b.b.a.b.f14338d);
    }

    public static String d(Context context, int i2) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i2 == 1) {
            return resources.getString(e.c.b.b.a.b.f14339e, strA);
        }
        if (i2 == 2) {
            return com.google.android.gms.common.util.j.f(context) ? resources.getString(e.c.b.b.a.b.n) : resources.getString(e.c.b.b.a.b.f14345k, strA);
        }
        if (i2 == 3) {
            return resources.getString(e.c.b.b.a.b.f14336b, strA);
        }
        if (i2 == 5) {
            return i(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i2 == 7) {
            return i(context, "common_google_play_services_network_error_text", strA);
        }
        if (i2 == 9) {
            return resources.getString(e.c.b.b.a.b.f14343i, strA);
        }
        if (i2 == 20) {
            return i(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i2) {
            case 16:
                return i(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return i(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(e.c.b.b.a.b.f14347m, strA);
            default:
                return resources.getString(com.google.android.gms.common.l.a, strA);
        }
    }

    public static String e(Context context, int i2) {
        return i2 == 6 ? i(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i2);
    }

    public static String f(Context context, int i2) {
        String strH = i2 == 6 ? h(context, "common_google_play_services_resolution_required_title") : g(context, i2);
        return strH == null ? context.getResources().getString(e.c.b.b.a.b.f14342h) : strH;
    }

    public static String g(Context context, int i2) {
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(e.c.b.b.a.b.f14340f);
            case 2:
                return resources.getString(e.c.b.b.a.b.f14346l);
            case 3:
                return resources.getString(e.c.b.b.a.b.f14337c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i2);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String h(Context context, String str) {
        c.e.g<String, String> gVar = a;
        synchronized (gVar) {
            String str2 = gVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources resourcesD = com.google.android.gms.common.i.d(context);
            if (resourcesD == null) {
                return null;
            }
            int identifier = resourcesD.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String strValueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", strValueOf.length() != 0 ? "Missing resource: ".concat(strValueOf) : new String("Missing resource: "));
                return null;
            }
            String string = resourcesD.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                gVar.put(str, string);
                return string;
            }
            String strValueOf2 = String.valueOf(str);
            Log.w("GoogleApiAvailability", strValueOf2.length() != 0 ? "Got empty resource: ".concat(strValueOf2) : new String("Got empty resource: "));
            return null;
        }
    }

    private static String i(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(com.google.android.gms.common.l.a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }
}