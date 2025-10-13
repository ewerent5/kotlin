package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class la {
    private final z4 a;

    public la(z4 z4Var) {
        this.a = z4Var;
    }

    private final boolean d() {
        return e() && this.a.zzl().a() - this.a.s().C.a() > this.a.a().l(null, t.G0);
    }

    private final boolean e() {
        return this.a.s().C.a() > 0;
    }

    final void a() {
        this.a.zzp().d();
        if (e()) {
            if (d()) {
                this.a.s().B.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.a.A().R("auto", "_cmpx", bundle);
            } else {
                String strA = this.a.s().B.a();
                if (TextUtils.isEmpty(strA)) {
                    this.a.zzq().B().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.a.s().C.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jA);
                    this.a.A().R((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.a.s().B.b(null);
            }
            this.a.s().C.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String string;
        this.a.zzp().d();
        if (this.a.k()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            string = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.a.s().B.b(string);
        this.a.s().C.b(this.a.zzl().a());
    }

    final void c() {
        if (e() && d()) {
            this.a.s().B.b(null);
        }
    }
}