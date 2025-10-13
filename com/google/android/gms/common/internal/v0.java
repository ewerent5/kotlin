package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class v0 {
    private static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: b, reason: collision with root package name */
    private final String f4738b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4739c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f4740d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4741e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4742f;

    public v0(String str, String str2, int i2, boolean z) {
        p.f(str);
        this.f4738b = str;
        p.f(str2);
        this.f4739c = str2;
        this.f4740d = null;
        this.f4741e = i2;
        this.f4742f = z;
    }

    public final String a() {
        return this.f4739c;
    }

    public final ComponentName b() {
        return this.f4740d;
    }

    public final int c() {
        return this.f4741e;
    }

    public final Intent d(Context context) {
        Bundle bundleCall;
        if (this.f4738b == null) {
            return new Intent().setComponent(this.f4740d);
        }
        if (this.f4742f) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f4738b);
            try {
                bundleCall = context.getContentResolver().call(a, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Dynamic intent resolution failed: ");
                sb.append(strValueOf);
                Log.w("ConnectionStatusConfig", sb.toString());
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                String strValueOf2 = String.valueOf(this.f4738b);
                Log.w("ConnectionStatusConfig", strValueOf2.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(strValueOf2) : new String("Dynamic lookup for intent failed for action: "));
            }
        }
        return intent != null ? intent : new Intent(this.f4738b).setPackage(this.f4739c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return o.a(this.f4738b, v0Var.f4738b) && o.a(this.f4739c, v0Var.f4739c) && o.a(this.f4740d, v0Var.f4740d) && this.f4741e == v0Var.f4741e && this.f4742f == v0Var.f4742f;
    }

    public final int hashCode() {
        return o.b(this.f4738b, this.f4739c, this.f4740d, Integer.valueOf(this.f4741e), Boolean.valueOf(this.f4742f));
    }

    public final String toString() {
        String str = this.f4738b;
        if (str != null) {
            return str;
        }
        p.j(this.f4740d);
        return this.f4740d.flattenToString();
    }
}