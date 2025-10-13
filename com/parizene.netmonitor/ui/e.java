package com.parizene.netmonitor.ui;

import android.content.SharedPreferences;

/* compiled from: lambda */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements SharedPreferences.OnSharedPreferenceChangeListener {
    public /* synthetic */ e() {
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        HomeFragment.W2(this.f13829e, sharedPreferences, str);
    }
}