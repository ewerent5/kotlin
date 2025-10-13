package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fe1 implements ah1<ee1> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final h52 f5859b;

    fe1(Context context, h52 h52Var) {
        this.a = context;
        this.f5859b = h52Var;
    }

    final /* synthetic */ ee1 a() {
        Bundle bundle;
        zzs.zzc();
        String string = !((Boolean) c.c().b(w3.h4)).booleanValue() ? "" : this.a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) c.c().b(w3.j4)).booleanValue() ? this.a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        zzs.zzc();
        Context context = this.a;
        if (((Boolean) c.c().b(w3.i4)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i2 = 0; i2 < 4; i2++) {
                String str = strArr[i2];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new ee1(string, string2, bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<ee1> zza() {
        return this.f5859b.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.ce1
            private final fe1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}