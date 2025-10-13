package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class io implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: e, reason: collision with root package name */
    private final Context f6555e;

    /* renamed from: f, reason: collision with root package name */
    private final SharedPreferences f6556f;

    /* renamed from: g, reason: collision with root package name */
    private final zzg f6557g;

    /* renamed from: h, reason: collision with root package name */
    private final kp f6558h;

    /* renamed from: i, reason: collision with root package name */
    private String f6559i = "";

    io(Context context, zzg zzgVar, kp kpVar) {
        this.f6556f = PreferenceManager.getDefaultSharedPreferences(context);
        this.f6557g = zzgVar;
        this.f6555e = context;
        this.f6558h = kpVar;
    }

    final void a() {
        this.f6556f.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f6556f, "IABTCF_PurposeConsents");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Context context;
        if ("IABTCF_PurposeConsents".equals(str)) {
            String string = sharedPreferences.getString("IABTCF_PurposeConsents", "");
            if (string.isEmpty() || this.f6559i.equals(string)) {
                return;
            }
            this.f6559i = string;
            boolean z = string.charAt(0) != '1';
            if (((Boolean) c.c().b(w3.o0)).booleanValue()) {
                this.f6557g.zzA(z);
                if (((Boolean) c.c().b(w3.o4)).booleanValue() && z && (context = this.f6555e) != null) {
                    context.deleteDatabase("OfflineUpload.db");
                }
            }
            if (((Boolean) c.c().b(w3.j0)).booleanValue()) {
                this.f6558h.f();
            }
        }
    }
}