package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ip2 {
    private static final String[] a = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: b, reason: collision with root package name */
    private final String f6564b = "ad.doubleclick.net";

    /* renamed from: c, reason: collision with root package name */
    private final String[] f6565c = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: d, reason: collision with root package name */
    private final zm2 f6566d;

    public ip2(zm2 zm2Var) {
        this.f6566d = zm2Var;
    }

    private final Uri g(Uri uri, String str) throws jp2 {
        Objects.requireNonNull(uri);
        try {
            try {
                if (uri.getHost().equals(this.f6564b)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new jp2("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i2 = iIndexOf + 1;
                        return Uri.parse(string.substring(0, i2) + "dc_ms=" + str + ";" + string.substring(i2));
                    }
                    String encodedPath = uri.getEncodedPath();
                    int iIndexOf2 = string.indexOf(encodedPath);
                    return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new jp2("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i3 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i3) + "ms=" + str + "&" + string2.substring(i3));
        } catch (UnsupportedOperationException unused2) {
            throw new jp2("Provided Uri is not in a valid state");
        }
    }

    public final boolean a(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f6565c;
            for (int i2 = 0; i2 < 3; i2++) {
                if (host.endsWith(strArr[i2])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final zm2 b() {
        return this.f6566d;
    }

    public final Uri c(Uri uri, Context context) {
        return g(uri, this.f6566d.zzl(context));
    }

    public final void d(MotionEvent motionEvent) {
        this.f6566d.zzf(motionEvent);
    }

    public final Uri e(Uri uri, Context context, View view, Activity activity) throws jp2 {
        try {
            return g(uri, this.f6566d.zzh(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new jp2("Provided Uri is not in a valid state");
        }
    }

    public final boolean f(Uri uri) {
        if (a(uri)) {
            String[] strArr = a;
            for (int i2 = 0; i2 < 3; i2++) {
                if (uri.getPath().endsWith(strArr[i2])) {
                    return true;
                }
            }
        }
        return false;
    }
}